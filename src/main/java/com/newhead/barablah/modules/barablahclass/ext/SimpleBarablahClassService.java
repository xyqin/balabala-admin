package com.newhead.barablah.modules.barablahclass.ext;

import com.newhead.barablah.modules.barablahclass.base.AbstractBarablahClassService;
import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassOpenRequest;
import com.newhead.barablah.modules.barablahclasslesson.BarablahClassLessonTypeEnum;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
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
import io.swagger.annotations.Api;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

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

        BarablahTextbookCategoryExample textbookCategoryExample = new BarablahTextbookCategoryExample();
        textbookCategoryExample.createCriteria()
                .andParentIdEqualTo(course.getTextbookCategoryId())
                .andDeletedEqualTo(Boolean.FALSE);
        textbookCategoryExample.setOrderByClause("position DESC");
        List<BarablahTextbookCategory> textbookCategories = textbookCategoryMapper.selectByExample(textbookCategoryExample);

        // 获取班级所有成员
        BarablahClassMemberExample example = new BarablahClassMemberExample();
        example.createCriteria()
                .andClassIdEqualTo(aClass.getId())
                .andDeletedEqualTo(Boolean.FALSE);
        List<BarablahClassMember> classMembers = classMemberMapper.selectByExample(example);

        // 自动生成在线课时
        int onlineLessons = request.getOnlineLessons(); // 总课时次数
        int onlineLessonsPerTime = request.getOnlineLessonsPerTime() > 0 ? request.getOnlineLessonsPerTime() : course.getOnlineLessons(); // 每次几节
        int onlineDuration = course.getOnlineDuration();

        if (request.getOnlineLessons() > 0 && request.getOnlineDuration() > 0) {
            onlineLessons = request.getOnlineLessons();
            onlineDuration = request.getOnlineDuration();
        }

        int countOnline = 0;
        Date startAtOnline = null;
        Date endAtOnline = null;

        try {
            startAtOnline = DateUtils.parseDate(request.getStartAtOnline(), "yyyyMMddHHmmss");
            endAtOnline = DateUtils.addMinutes(startAtOnline, onlineDuration * onlineLessonsPerTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        for (BarablahTextbookCategory category : textbookCategories) {
            if (countOnline < onlineLessons) {
                BarablahClassLesson onlineLesson = new BarablahClassLesson();
                onlineLesson.setClassId(aClass.getId());
                onlineLesson.setCourseId(aClass.getCourseId());
                onlineLesson.setTeacherId(aClass.getTeacherId());
                onlineLesson.setEnglishTeacherId(aClass.getEnglishTeacherId());
                onlineLesson.setCategoryId(category.getId());
                onlineLesson.setLessonName(category.getCategoryName());
                onlineLesson.setStartAt(startAtOnline);
                onlineLesson.setEndAt(endAtOnline);
                onlineLesson.setType(BarablahClassLessonTypeEnum.线上.getValue());
                classLessonMapper.insertSelective(onlineLesson);

                startAtOnline = DateUtils.addWeeks(startAtOnline, 1);
                endAtOnline = DateUtils.addWeeks(endAtOnline, 1);
                countOnline = countOnline + onlineLessonsPerTime;

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
        }

        // 自动生成离线课时
        int offlineLessons = request.getOfflineLessons(); // 总课时次数
        int offlineLessonsPerTime = request.getOfflineLessonsPerTime() > 0 ? request.getOfflineLessonsPerTime() : course.getOnlineLessons(); // 每次几节
        int offlineDuration = course.getOfflineDuration();

        if (request.getOfflineLessons() > 0 && request.getOfflineDuration() > 0) {
            offlineLessons = request.getOfflineLessons();
            offlineDuration = request.getOfflineDuration();
        }

        Date startAtOffline = null;
        Date endAtOffline = null;

        try {
            startAtOffline = DateUtils.parseDate(request.getStartAtOffline(), "yyyyMMddHHmmss");
            endAtOffline = DateUtils.addMinutes(startAtOffline, offlineDuration * offlineLessonsPerTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < offlineLessons; i = i + offlineLessonsPerTime) {
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
}
