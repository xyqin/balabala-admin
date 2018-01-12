package com.newhead.balabala.modules.balabalaclass.ext;

import com.google.common.collect.Maps;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampus;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampusExample;
import com.newhead.balabala.modules.balabalaclass.base.AbstractBalabalaClassService;
import com.newhead.balabala.modules.balabalaclass.base.repository.dao.BalabalaClassMapper;
import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClass;
import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClassExample;
import com.newhead.balabala.modules.balabalaclass.ext.protocol.SimpleBalabalaClassQueryPageRequest;
import com.newhead.balabala.modules.balabalaclass.ext.protocol.SimpleBalabalaClassQueryResponse;
import com.newhead.balabala.modules.balabalacourse.base.repository.entity.BalabalaCourse;
import com.newhead.balabala.modules.balabalacourse.base.repository.entity.BalabalaCourseExample;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacher;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacherExample;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategory;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategoryExample;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.modules.rudderuser.base.repository.dao.RudderUserMapper;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * RudderFramework 自动生成
 * 开班服务
 * 2018年01月12日 04:41:37
 */
@Api(tags = "开班", description = "相关的API")
@Service
public class SimpleBalabalaClassService extends AbstractBalabalaClassService {

    @Autowired
    private BalabalaClassMapper mapper;

    @Autowired
    private RudderUserMapper userMapper;

    @Override
    protected BalabalaClassMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaClass entity) {

    }

    @Override
    public Page<SimpleBalabalaClassQueryResponse> queryPage(SimpleBalabalaClassQueryPageRequest request) {
        RudderUser user = userMapper.selectByPrimaryKey(getCurrentUser().getId());

        //结果
        List<SimpleBalabalaClassQueryResponse> results = new ArrayList<SimpleBalabalaClassQueryResponse>();

        //构造查询对象
        BalabalaClassExample example = new BalabalaClassExample();
        BalabalaClassExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getClassName() != null) {
            c.andClassNameLike("%" + request.getClassName() + "%");
        }

        if (request.getMonitor() != null) {
            c.andMonitorLike("%" + request.getMonitor() + "%");
        }

        if (request.getMonitorPhoneNumber() != null) {
            c.andMonitorPhoneNumberLike("%" + request.getMonitorPhoneNumber() + "%");
        }

        if (request.getStatus() != null) {
            c.andStatusEqualTo(request.getStatus());
        }

        if (Objects.nonNull(user.getCampusId()) && user.getCampusId() > 0L) {
            c.andCampusIdEqualTo(user.getCampusId());
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

    private void convertEntityToResponse(List<BalabalaClass> entitys, List<SimpleBalabalaClassQueryResponse> results) {
        Map<Long, Long> courseIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> courseIdResultMap = Maps.newHashMap();

        Map<Long, Long> categoryIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> categoryIdResultMap = Maps.newHashMap();

        Map<Long, Long> teacherIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> teacherIdResultMap = Maps.newHashMap();

        Map<Long, Long> campusIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> campusIdResultMap = Maps.newHashMap();

        Map<Long, Long> englishTeacherIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> englishTeacherIdResultMap = Maps.newHashMap();

        for (BalabalaClass entity : entitys) {
            courseIdMap.put(entity.getId(), entity.getCourseId());
            categoryIdMap.put(entity.getId(), entity.getCategoryId());
            teacherIdMap.put(entity.getId(), entity.getTeacherId());
            campusIdMap.put(entity.getId(), entity.getCampusId());
            englishTeacherIdMap.put(entity.getId(), entity.getEnglishTeacherId());
        }
        BalabalaCourseExample courseIdExample = new BalabalaCourseExample();

        List<Long> courseIds = new ArrayList<>();
        courseIds.addAll(courseIdMap.values());
        if (courseIds.size() > 0) {
            courseIdExample.createCriteria().andIdIn(courseIds);
        }
        List<BalabalaCourse> courseIdList = balabalacourseMapper.selectByExample(courseIdExample);
        for (BalabalaCourse item : courseIdList) {
            LabelValueItem courseIdItem = new LabelValueItem();
            courseIdItem.setName("courseId");
            courseIdItem.setValue(String.valueOf(item.getId()));
            courseIdItem.setLabel(item.getCourseName());
            courseIdResultMap.put(item.getId(), courseIdItem);
        }
        BalabalaTextbookCategoryExample categoryIdExample = new BalabalaTextbookCategoryExample();

        List<Long> categoryIds = new ArrayList<>();
        categoryIds.addAll(categoryIdMap.values());
        if (categoryIds.size() > 0) {
            categoryIdExample.createCriteria().andIdIn(categoryIds);
        }
        List<BalabalaTextbookCategory> categoryIdList = balabalatextbookcategoryMapper.selectByExample(categoryIdExample);
        for (BalabalaTextbookCategory item : categoryIdList) {
            LabelValueItem categoryIdItem = new LabelValueItem();
            categoryIdItem.setName("categoryId");
            categoryIdItem.setValue(String.valueOf(item.getId()));
            categoryIdItem.setLabel(item.getCategoryName());
            categoryIdResultMap.put(item.getId(), categoryIdItem);
        }
        BalabalaTeacherExample teacherIdExample = new BalabalaTeacherExample();

        List<Long> teacherIds = new ArrayList<>();
        teacherIds.addAll(teacherIdMap.values());
        if (teacherIds.size() > 0) {
            teacherIdExample.createCriteria().andIdIn(teacherIds);
        }
        List<BalabalaTeacher> teacherIdList = balabalateacherMapper.selectByExample(teacherIdExample);
        for (BalabalaTeacher item : teacherIdList) {
            LabelValueItem teacherIdItem = new LabelValueItem();
            teacherIdItem.setName("teacherId");
            teacherIdItem.setValue(String.valueOf(item.getId()));
            teacherIdItem.setLabel(item.getFullName());
            teacherIdResultMap.put(item.getId(), teacherIdItem);
        }
        BalabalaCampusExample campusIdExample = new BalabalaCampusExample();

        List<Long> campusIds = new ArrayList<>();
        campusIds.addAll(campusIdMap.values());
        if (campusIds.size() > 0) {
            campusIdExample.createCriteria().andIdIn(campusIds);
        }
        List<BalabalaCampus> campusIdList = balabalacampusMapper.selectByExample(campusIdExample);
        for (BalabalaCampus item : campusIdList) {
            LabelValueItem campusIdItem = new LabelValueItem();
            campusIdItem.setName("campusId");
            campusIdItem.setValue(String.valueOf(item.getId()));
            campusIdItem.setLabel(item.getCampusName());
            campusIdResultMap.put(item.getId(), campusIdItem);
        }
        BalabalaTeacherExample englishTeacherIdExample = new BalabalaTeacherExample();

        List<Long> englishTeacherIds = new ArrayList<>();
        englishTeacherIds.addAll(englishTeacherIdMap.values());
        if (englishTeacherIds.size() > 0) {
            englishTeacherIdExample.createCriteria().andIdIn(englishTeacherIds);
        }
        List<BalabalaTeacher> englishTeacherIdList = balabalateacherMapper.selectByExample(englishTeacherIdExample);
        for (BalabalaTeacher item : englishTeacherIdList) {
            LabelValueItem englishTeacherIdItem = new LabelValueItem();
            englishTeacherIdItem.setName("englishTeacherId");
            englishTeacherIdItem.setValue(String.valueOf(item.getId()));
            englishTeacherIdItem.setLabel(item.getFullName());
            englishTeacherIdResultMap.put(item.getId(), englishTeacherIdItem);
        }
        //第一组
        for (BalabalaClass entity : entitys) {
            SimpleBalabalaClassQueryResponse response = new SimpleBalabalaClassQueryResponse();
            BeanUtils.copyProperties(entity, response);
            Long courseId = courseIdMap.get(entity.getId());

            LabelValueItem courseIdlvi = null;
            if (courseId != null && courseIdResultMap.get(courseId) != null) {
                courseIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(courseIdResultMap.get(courseId), courseIdlvi);
            }
            response.setCourseIdObject(courseIdlvi);
            Long categoryId = categoryIdMap.get(entity.getId());

            LabelValueItem categoryIdlvi = null;
            if (categoryId != null && categoryIdResultMap.get(categoryId) != null) {
                categoryIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(categoryIdResultMap.get(categoryId), categoryIdlvi);
            }
            response.setCategoryIdObject(categoryIdlvi);
            Long teacherId = teacherIdMap.get(entity.getId());

            LabelValueItem teacherIdlvi = null;
            if (teacherId != null && teacherIdResultMap.get(teacherId) != null) {
                teacherIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(teacherIdResultMap.get(teacherId), teacherIdlvi);
            }
            response.setTeacherIdObject(teacherIdlvi);
            Long campusId = campusIdMap.get(entity.getId());

            LabelValueItem campusIdlvi = null;
            if (campusId != null && campusIdResultMap.get(campusId) != null) {
                campusIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(campusIdResultMap.get(campusId), campusIdlvi);
            }
            response.setCampusIdObject(campusIdlvi);
            Long englishTeacherId = englishTeacherIdMap.get(entity.getId());

            LabelValueItem englishTeacherIdlvi = null;
            if (englishTeacherId != null && englishTeacherIdResultMap.get(englishTeacherId) != null) {
                englishTeacherIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(englishTeacherIdResultMap.get(englishTeacherId), englishTeacherIdlvi);
            }
            response.setEnglishTeacherIdObject(englishTeacherIdlvi);
            LabelValueItem statusEnum = response.getStatusEnum();
            statusEnum.setName("status");
            statusEnum.setLabel(com.newhead.balabala.modules.balabalaclass.BalabalaClassStatusEnum.getLabel(entity.getStatus()));
            statusEnum.setValue(entity.getStatus());
            statusEnum.setChecked(true);
            results.add(response);
        }
    }

}
