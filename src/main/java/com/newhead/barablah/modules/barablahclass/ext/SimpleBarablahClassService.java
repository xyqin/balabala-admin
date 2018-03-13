package com.newhead.barablah.modules.barablahclass.ext;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahclass.base.AbstractBarablahClassService;
import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassOpenRequest;
import com.newhead.barablah.modules.barablahclasslesson.BarablahClassLessonTypeEnum;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLessonExample;
import com.newhead.barablah.modules.barablahclassmember.base.repository.dao.BarablahClassMemberMapper;
import com.newhead.barablah.modules.barablahclassmember.base.repository.entity.BarablahClassMember;
import com.newhead.barablah.modules.barablahclassmember.base.repository.entity.BarablahClassMemberExample;
import com.newhead.barablah.modules.barablahcourse.base.repository.dao.BarablahCourseMapper;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.dao.BarablahMemberLessonMapper;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLesson;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao.BarablahTextbookCategoryMapper;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import com.newhead.rudderframework.core.web.api.ApiException;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 开班服务
 * 2018年01月18日 06:52:58
 */
@Api(tags = "开班", description = "相关的API")
@Service
public class SimpleBarablahClassService extends AbstractBarablahClassService {

    @Autowired
    private BarablahClassMapper mapper;

    @Autowired
    private BarablahClassLessonMapper classLessonMapper;

    @Autowired
    private BarablahCourseMapper courseMapper;

    @Autowired
    private BarablahTextbookCategoryMapper textbookCategoryMapper;

    @Autowired
    private BarablahClassMemberMapper classMemberMapper;

    @Autowired
    private BarablahMemberLessonMapper memberLessonMapper;

    @Override
    protected BarablahClassMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahClass entity) {

    }

    @Transactional
    public void open(SimpleBarablahClassOpenRequest request) {
        BarablahClass aClass = mapper.selectByPrimaryKey(request.getId());
        BarablahCourse course = courseMapper.selectByPrimaryKey(aClass.getCourseId());

        // 获取教材3级分类，用于和课时关联
        BarablahTextbookCategoryExample textbookCategoryExample = new BarablahTextbookCategoryExample();
        textbookCategoryExample.createCriteria()
                .andParentIdEqualTo(course.getTextbookCategoryId())
                .andDeletedEqualTo(Boolean.FALSE);
        textbookCategoryExample.setOrderByClause("position DESC");
        List<BarablahTextbookCategory> textbookCategories = textbookCategoryMapper.selectByExample(textbookCategoryExample);

        // 当前需要生成的课时数，取教材3级分类数量和输入值的小值
        int onlineLessons = (textbookCategories.size() < request.getOnlineLessons()) ? textbookCategories.size() : request.getOnlineLessons();

        // 获取当前班级已开课时
        BarablahClassLessonExample classLessonExample = new BarablahClassLessonExample();
        classLessonExample.createCriteria()
                .andClassIdEqualTo(aClass.getId())
                .andTypeEqualTo(BarablahClassLessonTypeEnum.线上.getValue())
                .andDeletedEqualTo(Boolean.FALSE);
        classLessonExample.setOrderByClause("start_at ASC");
        List<BarablahClassLesson> currentLessons = classLessonMapper.selectByExample(classLessonExample);

        if (currentLessons.size() > 0 && currentLessons.get(0).getStartAt().before(new Date())) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "当前班级已开始上课，不允许调整开班课时");
        }

        int leftLessons = textbookCategories.size() - currentLessons.size();

        if (leftLessons <= 0) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "当前班级课时已满");
        }

        // 取课时数和剩余课时数的小值
        onlineLessons = (onlineLessons > leftLessons) ? leftLessons : onlineLessons;

        // 获取班级所有成员
        BarablahClassMemberExample example = new BarablahClassMemberExample();
        example.createCriteria()
                .andClassIdEqualTo(aClass.getId())
                .andDeletedEqualTo(Boolean.FALSE);
        List<BarablahClassMember> classMembers = classMemberMapper.selectByExample(example);

        // 节数只参与计算上课时间，不参与课时次数计算
        int onlineLessonsPerTime = request.getOnlineLessonsPerTime() > 0 ? request.getOnlineLessonsPerTime() : course.getOnlineLessons(); // 每次几节
        int onlineDuration = request.getOnlineDuration() > 0 ? request.getOnlineDuration() : course.getOnlineDuration();

        // 技术开始时间和结束时间
        Date startAtOnline = null;
        Date endAtOnline = null;

        try {
            startAtOnline = DateUtils.parseDate(request.getStartAtOnline(), "yyyyMMddHHmmss");
            endAtOnline = DateUtils.addMinutes(startAtOnline, onlineDuration * onlineLessonsPerTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 自动生成在线课时
        for (int i = 0; i < onlineLessons; i++) {
            BarablahClassLesson onlineLesson = new BarablahClassLesson();
            onlineLesson.setClassId(aClass.getId());
            onlineLesson.setCourseId(aClass.getCourseId());
            onlineLesson.setTeacherId(aClass.getTeacherId());
            onlineLesson.setEnglishTeacherId(aClass.getEnglishTeacherId());
            onlineLesson.setCategoryId(0L);
            onlineLesson.setLessonName("");
            onlineLesson.setStartAt(startAtOnline);
            onlineLesson.setEndAt(endAtOnline);
            onlineLesson.setType(BarablahClassLessonTypeEnum.线上.getValue());
            classLessonMapper.insertSelective(onlineLesson);

            startAtOnline = DateUtils.addWeeks(startAtOnline, 1);
            endAtOnline = DateUtils.addWeeks(endAtOnline, 1);

            // 创建学员课时
            for (BarablahClassMember classMember : classMembers) {
                BarablahMemberLesson memberLesson = new BarablahMemberLesson();
                memberLesson.setClassId(onlineLesson.getClassId());
                memberLesson.setLessonId(onlineLesson.getId());
                memberLesson.setMemberId(classMember.getMemberId());
                memberLesson.setType(onlineLesson.getType());
                memberLesson.setStartAt(onlineLesson.getStartAt());
                memberLesson.setEndAt(onlineLesson.getEndAt());
                memberLesson.setProbational(Boolean.FALSE);
                memberLessonMapper.insertSelective(memberLesson);
            }
        }

        // 重新排列当前课时的教材3级分类关联
        classLessonExample.clear();
        classLessonExample.createCriteria()
                .andClassIdEqualTo(aClass.getId())
                .andTypeEqualTo(BarablahClassLessonTypeEnum.线上.getValue())
                .andDeletedEqualTo(Boolean.FALSE);
        classLessonExample.setOrderByClause("start_at ASC");
        currentLessons = classLessonMapper.selectByExample(classLessonExample);

        for (int i = 0; i < currentLessons.size(); i++) {
            BarablahClassLesson onlineLesson = currentLessons.get(i);
            BarablahTextbookCategory textbookCategory = textbookCategories.get(i);

            BarablahClassLesson lessonToBeUpdated = new BarablahClassLesson();
            lessonToBeUpdated.setId(onlineLesson.getId());
            lessonToBeUpdated.setCategoryId(textbookCategory.getId());
            lessonToBeUpdated.setLessonName(textbookCategory.getCategoryName());
            classLessonMapper.updateByPrimaryKeySelective(lessonToBeUpdated);
        }

        // 自动生成离线课时
        int offlineLessons = request.getOfflineLessons(); // 当前生成课时次数
        // 每次几节，节数只参与计算上课时间，不参与课时次数计算
        int offlineLessonsPerTime = request.getOfflineLessonsPerTime() > 0 ? request.getOfflineLessonsPerTime() : course.getOfflineLessons();
        int offlineDuration = request.getOfflineDuration() > 0 ? request.getOfflineDuration() : course.getOfflineDuration();

        Date startAtOffline = null;
        Date endAtOffline = null;

        try {
            startAtOffline = DateUtils.parseDate(request.getStartAtOffline(), "yyyyMMddHHmmss");
            endAtOffline = DateUtils.addMinutes(startAtOffline, offlineDuration * offlineLessonsPerTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < offlineLessons; i++) {
            BarablahClassLesson offlineLesson = new BarablahClassLesson();
            offlineLesson.setClassId(aClass.getId());
            offlineLesson.setCourseId(aClass.getCourseId());
            offlineLesson.setTeacherId(aClass.getTeacherId());
            offlineLesson.setEnglishTeacherId(aClass.getEnglishTeacherId());
            offlineLesson.setLessonName("线下课时" + (i + 1));
            offlineLesson.setStartAt(startAtOffline);
            offlineLesson.setEndAt(endAtOffline);
            offlineLesson.setType(BarablahClassLessonTypeEnum.线下.getValue());
            classLessonMapper.insertSelective(offlineLesson);

            startAtOffline = DateUtils.addWeeks(startAtOffline, 1);
            endAtOffline = DateUtils.addWeeks(endAtOffline, 1);

            // 创建学员课时
            for (BarablahClassMember classMember : classMembers) {
                BarablahMemberLesson memberLesson = new BarablahMemberLesson();
                memberLesson.setClassId(offlineLesson.getClassId());
                memberLesson.setLessonId(offlineLesson.getId());
                memberLesson.setMemberId(classMember.getMemberId());
                memberLesson.setType(offlineLesson.getType());
                memberLesson.setStartAt(offlineLesson.getStartAt());
                memberLesson.setEndAt(offlineLesson.getEndAt());
                memberLesson.setProbational(Boolean.FALSE);
                memberLessonMapper.insertSelective(memberLesson);
            }
        }
    }

    public Map<String, Integer> getLessons(Long id) {
        Map<String, Integer> result = Maps.newHashMap();
        BarablahClass aClass = mapper.selectByPrimaryKey(id);
        BarablahCourse course = courseMapper.selectByPrimaryKey(aClass.getCourseId());

        // 获取教材3级分类
        BarablahTextbookCategoryExample textbookCategoryExample = new BarablahTextbookCategoryExample();
        textbookCategoryExample.createCriteria()
                .andParentIdEqualTo(course.getTextbookCategoryId())
                .andDeletedEqualTo(Boolean.FALSE);
        List<BarablahTextbookCategory> textbookCategories = textbookCategoryMapper.selectByExample(textbookCategoryExample);

        result.put("totalOnline", textbookCategories.size());

        BarablahClassLessonExample classLessonExample = new BarablahClassLessonExample();
        classLessonExample.createCriteria()
                .andClassIdEqualTo(aClass.getId())
                .andTypeEqualTo(BarablahClassLessonTypeEnum.线上.getValue())
                .andDeletedEqualTo(Boolean.FALSE);
        List<BarablahClassLesson> currentLessons = classLessonMapper.selectByExample(classLessonExample);
        result.put("scheduledOnline", currentLessons.size());
        return result;
    }
}
