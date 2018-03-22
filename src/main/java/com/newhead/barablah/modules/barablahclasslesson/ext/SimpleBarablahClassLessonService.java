package com.newhead.barablah.modules.barablahclasslesson.ext;

import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclasslesson.base.AbstractBarablahClassLessonService;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLessonExample;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonCreateRequest;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonPostponeBatchRequest;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonUpdateBatchRequest;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.dao.BarablahMemberLessonMapper;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLesson;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLessonExample;
import com.newhead.rudderframework.core.web.api.ApiException;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import io.swagger.annotations.Api;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * RudderFramework 自动生成
 * 开班课时服务
 * 2018年01月18日 06:52:58
 */
@Api(tags = "开班课时", description = "相关的API")
@Service
public class SimpleBarablahClassLessonService extends AbstractBarablahClassLessonService {

    @Autowired
    private BarablahClassLessonMapper mapper;

    @Autowired
    private BarablahMemberLessonMapper memberLessonMapper;

    @Autowired
    private BarablahClassMapper classMapper;

    @Override
    protected BarablahClassLessonMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahClassLesson entity) {

    }

    @Override
    public BarablahClassLesson create(SimpleBarablahClassLessonCreateRequest request) {
        BarablahClass aClass = classMapper.selectByPrimaryKey(request.getClassId());

        if ("ONGOING".equals(aClass.getStatus()) || "FINISHED".equals(aClass.getStatus())) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "当前班级已开始上课，不允许新增开班课时");
        }

        //TODO 当天已经安排课时,不允许添加。

        BarablahClassLesson entity = new BarablahClassLesson();
        BeanUtils.copyProperties(request, entity);
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());
        entity.setDeleted(false);
        entity.setCreator(getCurrentUser().getId());
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().insert(entity);

        //添加关系
        return entity;
    }

    @Transactional
    public void postponebatch(SimpleBarablahClassLessonPostponeBatchRequest request) {
        BarablahClassLesson lesson = mapper.selectByPrimaryKey(request.getId());

        if (DateUtils.addHours(new Date(), 4).after(lesson.getStartAt())) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "离开课只有不到4小时，不允许延迟");
        }

        BarablahClassLessonExample example = new BarablahClassLessonExample();
        example.createCriteria()
                .andClassIdEqualTo(lesson.getClassId())
                .andStartAtGreaterThan(lesson.getStartAt())
                .andTypeEqualTo(lesson.getType())
                .andDeletedEqualTo(Boolean.FALSE);
        example.setOrderByClause("start_at ASC");
        List<BarablahClassLesson> lessonsByOrder = mapper.selectByExample(example);
        lessonsByOrder.add(0, lesson);

        for (int i = 0; i < lessonsByOrder.size(); i++) {
            BarablahClassLesson lessonCurrent = lessonsByOrder.get(i);
            BarablahClassLesson lessonNext = null;

            try {
                lessonNext = lessonsByOrder.get(i + 1);
            } catch (IndexOutOfBoundsException ex) {
                lessonNext = null;
            }

            postpone(lessonCurrent, lessonNext);
        }
    }

    @Transactional
    public void updatebatch(SimpleBarablahClassLessonUpdateBatchRequest request) {
        Date startAt = null;
        Date endAt = null;

        if (CollectionUtils.isNotEmpty(request.getLessonIds())) {
            try {
                if (StringUtils.isNotBlank(request.getStartAt())) {
                    startAt = DateUtils.parseDate(request.getStartAt(), "yyyyMMddHHmmss");
                }

                if (StringUtils.isNotBlank(request.getEndAt())) {
                    endAt = DateUtils.parseDate(request.getEndAt(), "yyyyMMddHHmmss");
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }

            for (Long lessonId : request.getLessonIds()) {
                BarablahClassLesson lessonToBeUpdated = new BarablahClassLesson();
                lessonToBeUpdated.setId(lessonId);
                lessonToBeUpdated.setStartAt(startAt);
                lessonToBeUpdated.setEndAt(endAt);
                mapper.updateByPrimaryKeySelective(lessonToBeUpdated);

                BarablahMemberLessonExample example = new BarablahMemberLessonExample();
                example.createCriteria()
                        .andLessonIdEqualTo(lessonId)
                        .andDeletedEqualTo(Boolean.FALSE);
                BarablahMemberLesson memberLessonToBeUpdated = new BarablahMemberLesson();
                memberLessonToBeUpdated.setStartAt(startAt);
                memberLessonToBeUpdated.setEndAt(endAt);
                memberLessonMapper.updateByExampleSelective(memberLessonToBeUpdated, example);
            }
        }
    }

    private void postpone(BarablahClassLesson lesson, BarablahClassLesson next) {
        BarablahClassLesson lessonToBeUpdated = new BarablahClassLesson();
        lessonToBeUpdated.setId(lesson.getId());

        if (Objects.nonNull(next)) {
            lessonToBeUpdated.setStartAt(next.getStartAt());
            lessonToBeUpdated.setEndAt(next.getEndAt());
        } else {
            lessonToBeUpdated.setStartAt(DateUtils.addWeeks(lesson.getStartAt(), 1));
            lessonToBeUpdated.setEndAt(DateUtils.addWeeks(lesson.getEndAt(), 1));
        }

        mapper.updateByPrimaryKeySelective(lessonToBeUpdated);

        BarablahMemberLessonExample example = new BarablahMemberLessonExample();
        example.createCriteria()
                .andLessonIdEqualTo(lesson.getId())
                .andDeletedEqualTo(Boolean.FALSE);
        BarablahMemberLesson memberLessonToBeUpdated = new BarablahMemberLesson();
        memberLessonToBeUpdated.setStartAt(lessonToBeUpdated.getStartAt());
        memberLessonToBeUpdated.setEndAt(lessonToBeUpdated.getEndAt());
        memberLessonMapper.updateByExampleSelective(memberLessonToBeUpdated, example);
    }

    @Override
    public void delete(Long id) {

        BarablahClassLesson classlesson = getMapper().selectByPrimaryKey(id);
        boolean b =  classlesson.getStartAt().before(DateUtils.addHours(new Date(),4));
        if (b) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "离开课只有不到4小时，不允许删除");
        }

        //是否要删除生成的成员ID
        this.getMapper().deleteByPrimaryKey(id);
    }
}
