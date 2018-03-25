package com.newhead.barablah.modules.barablahclass.ext;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahclass.BarablahClassStatusEnum;
import com.newhead.barablah.modules.barablahclass.base.AbstractBarablahClassService;
import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassOpenRequest;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassQueryListRequest;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassQueryPageRequest;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassQueryResponse;
import com.newhead.barablah.modules.barablahclasslesson.BarablahClassLessonStatusEnum;
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
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao.BarablahTextbookCategoryMapper;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import com.newhead.rudderframework.core.security.ShiroAuthorizingRealm;
import com.newhead.rudderframework.core.web.api.ApiException;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.modules.rudderuser.base.repository.dao.RudderUserMapper;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.*;

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

    @Autowired
    private RudderUserMapper rudderUserMapper;

    @Override
    protected BarablahClassMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahClass entity) {

    }

    /**
     * 课时安排跨天检查,不允许跨天课时。
     * @param startTime
     * @param duration
     */
    public void allowStartTime(long classid,String startTime,int duration,int times,String type) {
        Date startAtOnline = null;
        try {
            startAtOnline = DateUtils.parseDate(startTime, "yyyyMMddHHmmss");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date nextDate = DateUtils.addMinutes(startAtOnline,duration);
        if (!DateUtils.isSameDay(startAtOnline,nextDate)) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "课时安排不允许跨天!");
        }

        Date curDate = new Date();
        //课时安排必须大于或等于当前时间
        if(startAtOnline.before(curDate)) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "课时安排要大于或等于当前时间!");
        }
        //判断时间不能重叠
        //读取已经安排的课时
        BarablahClassLessonExample clee = new BarablahClassLessonExample();
        BarablahClass myclass = getMapper().selectByPrimaryKey(classid);
        BarablahClassExample ce = new BarablahClassExample();
        ce.createCriteria().andTeacherIdEqualTo(myclass.getTeacherId()).andDeletedEqualTo(false);
        List<BarablahClass> classes = getMapper().selectByExample(ce);

        List<Long> classids = new ArrayList<>();
        for(BarablahClass c:classes) {
            classids.add(c.getId());
        }

        clee.createCriteria().
                andStartAtLessThanOrEqualTo(startAtOnline).
                andEndAtGreaterThanOrEqualTo(startAtOnline).
                andDeletedEqualTo(false)
                .andClassIdIn(classids).
                andTypeEqualTo(type);

        clee.or().andStartAtLessThanOrEqualTo(nextDate)
                .andEndAtGreaterThanOrEqualTo(nextDate)
                .andDeletedEqualTo(false)
                .andClassIdIn(classids)
                .andTypeEqualTo(type);

        for (int i=0;i< times-1;i++) {
            startAtOnline = DateUtils.addWeeks(startAtOnline,1);
            nextDate = DateUtils.addWeeks(nextDate,1);
            clee.or().
                    andStartAtLessThanOrEqualTo(startAtOnline)
                    .andEndAtGreaterThanOrEqualTo(startAtOnline)
                    .andDeletedEqualTo(false)
                    .andClassIdIn(classids);

            clee.or().andStartAtLessThanOrEqualTo(nextDate)
                    .andEndAtGreaterThanOrEqualTo(nextDate)
                    .andDeletedEqualTo(false)
                    .andClassIdIn(classids);
        }

        long lesson = classLessonMapper.countByExample(clee);
        if (lesson>0) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "当前选择的课程时间和其他课程时间有冲突!!!");
        }
    }

    /**
     * 设定的课时安排是否合理
     * @param classid
     * @param times
     */
    public void allowLessonTimes(long classid,int times,int duration) {
        BarablahClass myclass = getMapper().selectByPrimaryKey(classid);

        BarablahCourse course = courseMapper.selectByPrimaryKey(myclass.getCourseId());
        BarablahClassLessonExample clee = new BarablahClassLessonExample();
        clee.createCriteria().
                andDeletedEqualTo(false).
                andClassIdEqualTo(classid).
                andTypeEqualTo(BarablahClassLessonTypeEnum.线上.getValue());
        long hasTimes = classLessonMapper.countByExample(clee);
        long r = course.getOnlineLessons()-hasTimes;
        if (r<times) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "还可以再设置"+r+"节课!!!");
        }
        if (duration>course.getOnlineMaxDuration()) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "设定的每节课的课时时间不能超过"+course.getOnlineMaxDuration()+"分钟!!!");
        }
    }

    @Transactional
    public void open(SimpleBarablahClassOpenRequest request) {
        BarablahClass aClass = mapper.selectByPrimaryKey(request.getId());
        if ( BarablahClassStatusEnum.已结束.getValue().equals(aClass.getStatus())) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "当前班级已经结束，不允许调整开班课时");
        }
        //线上课时时间安排和课时按时是否合理
        if(request.getOnlineLessons()>0) {
            allowStartTime(request.getId(),request.getStartAtOnline(),request.getOnlineDuration(),request.getOnlineLessons(),BarablahClassLessonTypeEnum.线上.getValue());
            allowLessonTimes(request.getId(),request.getOnlineLessons(),request.getOnlineDuration());
        }
        //线下课时时间安排是否合理
        if(request.getOfflineLessons()>0) {
            allowStartTime(request.getId(),request.getStartAtOffline(),request.getOfflineDuration(),request.getOfflineLessons(),BarablahClassLessonTypeEnum.线下.getValue());
        }

        //获取教材3级分类，用于和课时关联
        BarablahCourse course = courseMapper.selectByPrimaryKey(aClass.getCourseId());
        BarablahTextbookCategoryExample textbookCategoryExample = new BarablahTextbookCategoryExample();
        textbookCategoryExample.createCriteria()
                .andParentIdEqualTo(course.getTextbookCategoryId())
                .andDeletedEqualTo(Boolean.FALSE);
        textbookCategoryExample.setOrderByClause("position DESC");
        List<BarablahTextbookCategory> textbookCategories = textbookCategoryMapper.selectByExample(textbookCategoryExample);


        if (request.getOnlineLessons()>0) {
            Date curDate = new Date();
            Date startAtOnline = null;
            try {
                startAtOnline = DateUtils.parseDate(request.getStartAtOnline(), "yyyyMMddHHmmss");
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Date endAtOnline = DateUtils.addMinutes(startAtOnline,request.getOnlineDuration());
            // 自动生成在线课时
            for (int i = 0; i < request.getOnlineLessons(); i++) {
                BarablahClassLesson onlineLesson = new BarablahClassLesson();
                onlineLesson.setClassId(aClass.getId());
                onlineLesson.setCategoryId(0L);
                onlineLesson.setLessonName("");
                onlineLesson.setStartAt(startAtOnline);
                onlineLesson.setStatus(BarablahClassLessonStatusEnum.待开课.getValue());
                onlineLesson.setEndAt(endAtOnline);
                onlineLesson.setType(BarablahClassLessonTypeEnum.线上.getValue());
                classLessonMapper.insertSelective(onlineLesson);
                startAtOnline = DateUtils.addWeeks(startAtOnline, 1);
                endAtOnline = DateUtils.addWeeks(endAtOnline, 1);
            }

            //课时合并调整
            BarablahClassLessonExample lessonExample = new BarablahClassLessonExample();
            lessonExample.createCriteria().
                    andClassIdEqualTo(aClass.getId())
                    .andTypeEqualTo(BarablahClassLessonTypeEnum.线上.getValue())
                    .andDeletedEqualTo(false);
            lessonExample.setOrderByClause("start_at asc");
            List<BarablahClassLesson> lessons = classLessonMapper.selectByExample(lessonExample);
            for(int i=0;i<lessons.size();i++) {
                BarablahClassLesson lesson = lessons.get(i);

//                if (lesson.getStartAt().before(startAtOnline)) {
//                    continue;
//                }
                lesson.setLessonName(textbookCategories.get(i).getCategoryName());
                lesson.setCategoryId(textbookCategories.get(i).getId());
                classLessonMapper.updateByPrimaryKeySelective(lesson);
            }
        }




        if(request.getOfflineLessons()>0) {
            Date startAtOffline = null;
            try {
                startAtOffline = DateUtils.parseDate(request.getStartAtOffline(), "yyyyMMddHHmmss");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Date endAtOffline = DateUtils.addMinutes(startAtOffline,request.getOnlineDuration());
            // 自动生成离线课时
            int offlineLessons = request.getOfflineLessons(); // 当前生成课时次数
            for (int i = 0; i < offlineLessons; i++) {
                BarablahClassLesson offlineLesson = new BarablahClassLesson();
                offlineLesson.setClassId(aClass.getId());
                offlineLesson.setLessonName("线下课时" + (i + 1));
                offlineLesson.setStartAt(startAtOffline);
                offlineLesson.setEndAt(endAtOffline);
                offlineLesson.setType(BarablahClassLessonTypeEnum.线下.getValue());
                classLessonMapper.insertSelective(offlineLesson);

                startAtOffline = DateUtils.addWeeks(startAtOffline, 1);
                endAtOffline = DateUtils.addWeeks(endAtOffline, 1);
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

    @Override
    public List<SimpleBarablahClassQueryResponse> queryList(SimpleBarablahClassQueryListRequest request) {
        List<SimpleBarablahClassQueryResponse> results = new ArrayList<SimpleBarablahClassQueryResponse>();

        //构造查询对象
        BarablahClassExample example = new BarablahClassExample();
        BarablahClassExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc = "";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        if (request.getCategoryId() != null) {
            c.andCategoryIdEqualTo(request.getCategoryId());
        }

        if (request.getClassName() != null) {
            c.andClassNameLike("%" + request.getClassName() + "%");
        }


        if (request.getStatus() != null) {
            c.andStatusEqualTo(request.getStatus());
        }

        // 处理校区筛选
        ShiroAuthorizingRealm.ShiroUser user = getCurrentUser();
        RudderUser rudderUser = rudderUserMapper.selectByPrimaryKey(user.getId());

        if (Objects.nonNull(rudderUser.getCampusId()) && rudderUser.getCampusId() > 0L) {
            c.andCampusIdEqualTo(rudderUser.getCampusId());
        }

        convertEntityToResponse(getMapper().selectByExample(example), results);
        return results;
    }

    @Override
    public Page<SimpleBarablahClassQueryResponse> queryPage(SimpleBarablahClassQueryPageRequest request) {
        //结果
        List<SimpleBarablahClassQueryResponse> results = new ArrayList<SimpleBarablahClassQueryResponse>();

        //构造查询对象
        BarablahClassExample example = new BarablahClassExample();
        BarablahClassExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc = "";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getCategoryId() != null) {
            c.andCategoryIdEqualTo(request.getCategoryId());
        }

        if (request.getClassName() != null) {
            c.andClassNameLike("%" + request.getClassName() + "%");
        }


        if (request.getStatus() != null) {
            c.andStatusEqualTo(request.getStatus());
        }

        // 处理校区筛选
        ShiroAuthorizingRealm.ShiroUser user = getCurrentUser();
        RudderUser rudderUser = rudderUserMapper.selectByPrimaryKey(user.getId());

        if (Objects.nonNull(rudderUser.getCampusId()) && rudderUser.getCampusId() > 0L) {
            c.andCampusIdEqualTo(rudderUser.getCampusId());
        }

        example.setPageSize(request.getSize());
        example.setStartRow(request.getOffset());

        long count = getMapper().countByExample(example);

        convertEntityToResponse(getMapper().selectByExample(example), results);

        Page page = new Page();
        page.setNumber(request.getPage());
        page.setSize(request.getSize());
        page.setContent(results);
        page.setTotalElements(count);
        return page;
    }


    @Override
    public void delete(Long id) {
        BarablahClass entity = new BarablahClass();

        BarablahClassLessonExample bcls = new BarablahClassLessonExample();
        bcls.createCriteria().andClassIdEqualTo(id);

        List<BarablahClassLesson> lessons = classLessonMapper.selectByExample(bcls);
        if (lessons!=null && lessons.size()>0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(), "该班已经开课,不允许删除!");
        }

        BarablahClassMemberExample bcm = new BarablahClassMemberExample();
        List<BarablahClassMember> members = classMemberMapper.selectByExample(bcm);
        if (members!=null && members.size()>0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(), "该班已经有学员报名,不允许删除!");
        }

        getMapper().deleteByPrimaryKey(id);
    }
}
