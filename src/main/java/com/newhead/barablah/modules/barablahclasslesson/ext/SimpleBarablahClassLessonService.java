package com.newhead.barablah.modules.barablahclasslesson.ext;

import com.newhead.barablah.modules.barablahclasslesson.base.AbstractBarablahClassLessonService;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonPostponeBatchRequest;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonUpdateBatchRequest;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.dao.BarablahMemberLessonMapper;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLesson;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLessonExample;
import io.swagger.annotations.Api;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.Date;

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

    @Override
    protected BarablahClassLessonMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahClassLesson entity) {

    }

    @Transactional
    public void postponebatch(SimpleBarablahClassLessonPostponeBatchRequest request) {
        if (CollectionUtils.isNotEmpty(request.getLessonIds())) {
            for (Long lessonId : request.getLessonIds()) {
                BarablahClassLesson lesson = mapper.selectByPrimaryKey(lessonId);
                BarablahClassLesson lessonToBeUpdated = new BarablahClassLesson();
                lessonToBeUpdated.setId(lesson.getId());
                lessonToBeUpdated.setStartAt(DateUtils.addWeeks(lesson.getStartAt(), 1));
                lessonToBeUpdated.setEndAt(DateUtils.addWeeks(lesson.getEndAt(), 1));
                mapper.updateByPrimaryKeySelective(lessonToBeUpdated);

                BarablahMemberLessonExample example = new BarablahMemberLessonExample();
                example.createCriteria()
                        .andLessonIdEqualTo(lessonId)
                        .andDeletedEqualTo(Boolean.FALSE);
                BarablahMemberLesson memberLessonToBeUpdated = new BarablahMemberLesson();
                memberLessonToBeUpdated.setStartAt(DateUtils.addWeeks(lesson.getStartAt(), 1));
                memberLessonToBeUpdated.setEndAt(DateUtils.addWeeks(lesson.getEndAt(), 1));
                memberLessonMapper.updateByExampleSelective(memberLessonToBeUpdated, example);
            }
        }
    }

    @Transactional
    public void updatebatch(SimpleBarablahClassLessonUpdateBatchRequest request) {
        Date startAt = null;
        Date endAt = null;

        if (CollectionUtils.isNotEmpty(request.getLessonIds())) {
            try {
                startAt = DateUtils.parseDate(request.getStartAt(), "yyyyMMddHHmmss");
                endAt = DateUtils.parseDate(request.getEndAt(), "yyyyMMddHHmmss");
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
}
