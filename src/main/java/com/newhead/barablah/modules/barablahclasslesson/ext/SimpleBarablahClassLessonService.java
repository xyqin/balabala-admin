package com.newhead.barablah.modules.barablahclasslesson.ext;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahclass.ext.SimpleBarablahClassService;
import com.newhead.barablah.modules.barablahclasslesson.BarablahClassLessonStatusEnum;
import com.newhead.barablah.modules.barablahclasslesson.base.AbstractBarablahClassLessonService;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLessonExample;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonPostponeBatchRequest;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonQueryPageRequest;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonQueryResponse;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonUpdateBatchRequest;
import com.newhead.barablah.modules.barablahcourse.base.repository.dao.BarablahCourseMapper;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.dao.BarablahMemberLessonMapper;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLesson;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLessonExample;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import com.newhead.rudderframework.core.web.api.ApiException;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.modules.LabelValueItem;
import io.swagger.annotations.Api;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    private SimpleBarablahClassService barablahClassService;
    @Autowired
    private BarablahClassMapper classMapper;

    @Autowired
    private BarablahCourseMapper courseMapper;
    @Override
    protected BarablahClassLessonMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahClassLesson entity) {
        if (entity.getId()!=null && entity.getId()>0) {
            BarablahClassLesson olde = getMapper().selectByPrimaryKey(entity.getId());
            if (olde.getStartAt().before(new Date())) {
                throw new ApiException(ApiStatus.STATUS_400.getCode(), "课时正在进行或者已经结束,不允许调整。");
            }
        } else {
            entity.setStatus(BarablahClassLessonStatusEnum.待开课.getValue());
        }
        allow(entity.getClassId(),entity.getStartAt(),entity.getEndAt(),entity.getType());
    }

    /**
     * 设定的课时安排是否合理
     * @param classid
     */
    public void allow(long classid,Date startTime,Date endTime,String type) {

        Date curDate = new Date();
        if(startTime.before(curDate)) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "课时安排要大于或等于当前时间!");
        }
        if (DateUtils.isSameDay(startTime,endTime)) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "课时安排不能跨天");
        }
        int minute = (int) ((endTime.getTime() - startTime.getTime())/1000/60);
        BarablahClass myclass = classMapper.selectByPrimaryKey(classid);
        BarablahCourse course = courseMapper.selectByPrimaryKey(myclass.getCourseId());

        if (minute>course.getOnlineMaxDuration()) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "设定的每节课的课时时间不能超过"+course.getOnlineMaxDuration()+"分钟");
        }

        //判断时间不能重叠
        BarablahClassLessonExample clee = new BarablahClassLessonExample();

        //查找老师的所有课程
        BarablahClassExample ce = new BarablahClassExample();
        ce.createCriteria().andTeacherIdEqualTo(myclass.getTeacherId()).andDeletedEqualTo(false);
        List<BarablahClass> classes = classMapper.selectByExample(ce);
        List<Long> classids = new ArrayList<>();
        for(BarablahClass c:classes) {
            classids.add(c.getId());
        }

        clee.createCriteria().
                andStartAtLessThanOrEqualTo(startTime).
                andEndAtGreaterThanOrEqualTo(startTime).
                andDeletedEqualTo(false)
                .andClassIdIn(classids).
                andTypeEqualTo(type);

        clee.or().andStartAtLessThanOrEqualTo(endTime)
                .andEndAtGreaterThanOrEqualTo(endTime)
                .andDeletedEqualTo(false)
                .andClassIdIn(classids)
                .andTypeEqualTo(type);

        long lesson = getMapper().countByExample(clee);
        if (lesson>0) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "当前选择的课程时间和老师的其他课程时间有冲突!!!");
        }
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
        boolean b =  classlesson.getStartAt().before(DateUtils.addHours(new Date(),1));
        if (b) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(), "离开课只有不到1小时，不允许删除");
        }
        //是否要删除生成的成员ID
        this.getMapper().deleteByPrimaryKey(id);
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahClassLessonQueryResponse> queryPage(SimpleBarablahClassLessonQueryPageRequest request) {
        //结果
        List<SimpleBarablahClassLessonQueryResponse> results = new ArrayList<SimpleBarablahClassLessonQueryResponse>();

        //构造查询对象
        BarablahClassLessonExample example = new BarablahClassLessonExample();
        BarablahClassLessonExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "start_at desc";
        example.setOrderByClause(ordersrc);
        if (request.getClassId()!=null) {
            c.andClassIdEqualTo(request.getClassId());
        }

        if (request.getLessonName()!=null) {
            c.andLessonNameLike("%"+request.getLessonName()+"%");
        }

        if (request.getType()!=null) {
            c.andTypeEqualTo(request.getType());
        }

        example.setPageSize(request.getSize());
        example.setStartRow(request.getOffset());

        long count = getMapper().countByExample(example);

        convertEntityToResponse(getMapper().selectByExample(example),results);

         for (SimpleBarablahClassLessonQueryResponse response:results) {

             response.setWeek(dateToWeek(response.getStartAt()));
             long minute=(response.getEndAt().getTime()-response.getStartAt().getTime())/(1000*60);//转化minute搜索
             response.setDuring(minute+"分钟");
         }
        Page page = new Page();
        page.setNumber(request.getPage());
        page.setSize(request.getSize());
        page.setContent(results);
        page.setTotalElements(count);
        return page;
    }

    /**
     * 日期转星期
     *
     * @param curdate
     * @return
     */
    public static String dateToWeek(Date curdate) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        Calendar cal = Calendar.getInstance(); // 获得一个日历
        cal.setTime(curdate);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
    /**
     * 对象转换
     * @param entitys
     * @param results
     */
    private void convertEntityToResponse(List<BarablahClassLesson> entitys,List<SimpleBarablahClassLessonQueryResponse> results) {
        Map<Long,Long> classIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> classIdResultMap = Maps.newHashMap();

        Map<Long,Long> categoryIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> categoryIdResultMap = Maps.newHashMap();

        for(BarablahClassLesson entity:entitys) {
            classIdMap.put(entity.getId(),entity.getClassId());
            categoryIdMap.put(entity.getId(),entity.getCategoryId());
        }
        BarablahClassExample classIdExample = new BarablahClassExample();

        List<Long> classIds = new ArrayList<>();
        classIds.addAll(classIdMap.values());
        if (classIds.size()>0) {
            classIdExample.createCriteria().andIdIn(classIds);
        }
        List<BarablahClass>  classIdList = barablahclassMapper.selectByExample(classIdExample);
        for(BarablahClass item:classIdList) {
            LabelValueItem classIdItem = new LabelValueItem();
            classIdItem.setName("classId");
            classIdItem.setValue(String.valueOf(item.getId()));
            classIdItem.setLabel(item.getClassName());
            classIdResultMap.put(item.getId(),classIdItem);
        }
        BarablahTextbookCategoryExample categoryIdExample = new BarablahTextbookCategoryExample();

        List<Long> categoryIds = new ArrayList<>();
        categoryIds.addAll(categoryIdMap.values());
        if (categoryIds.size()>0) {
            categoryIdExample.createCriteria().andIdIn(categoryIds);
        }
        List<BarablahTextbookCategory>  categoryIdList = barablahtextbookcategoryMapper.selectByExample(categoryIdExample);
        for(BarablahTextbookCategory item:categoryIdList) {
            LabelValueItem categoryIdItem = new LabelValueItem();
            categoryIdItem.setName("categoryId");
            categoryIdItem.setValue(String.valueOf(item.getId()));
            categoryIdItem.setLabel(item.getCategoryName());
            categoryIdResultMap.put(item.getId(),categoryIdItem);
        }
        //第一组
        for(BarablahClassLesson entity:entitys) {
            SimpleBarablahClassLessonQueryResponse response = new SimpleBarablahClassLessonQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long classId = classIdMap.get(entity.getId());

            LabelValueItem classIdlvi = null;
            if (classId!=null && classIdResultMap.get(classId)!=null) {
                classIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(classIdResultMap.get(classId),classIdlvi);
            }
            response.setClassIdObject(classIdlvi);
            Long categoryId = categoryIdMap.get(entity.getId());

            LabelValueItem categoryIdlvi = null;
            if (categoryId!=null && categoryIdResultMap.get(categoryId)!=null) {
                categoryIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(categoryIdResultMap.get(categoryId),categoryIdlvi);
            }
            response.setCategoryIdObject(categoryIdlvi);
            LabelValueItem typeEnum = response.getTypeEnum();
            typeEnum.setName("type");
            typeEnum.setLabel(com.newhead.barablah.modules.barablahclasslesson.BarablahClassLessonTypeEnum.getLabel(entity.getType()));
            typeEnum.setValue(entity.getType());
            typeEnum.setChecked(true);
            results.add(response);
        }
    }

}
