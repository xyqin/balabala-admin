package com.newhead.balabala.modules.balabalaclass.base;

import com.newhead.rudderframework.core.web.component.pagination.Page;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.core.web.component.tree.ExtNode;
import com.newhead.rudderframework.core.web.component.tree.Node;
import com.newhead.rudderframework.core.web.component.tree.TransitionTree;
import com.newhead.rudderframework.core.services.BaseService;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.balabala.modules.balabalaclass.base.repository.dao.BalabalaClassMapper;
import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClass;
import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClassExample;
import com.newhead.balabala.modules.balabalaclass.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampus;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampusExample;

import com.newhead.balabala.modules.balabalacampus.base.repository.dao.BalabalaCampusMapper;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategory;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategoryExample;

import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.dao.BalabalaTextbookCategoryMapper;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacher;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacherExample;

import com.newhead.balabala.modules.balabalateacher.base.repository.dao.BalabalaTeacherMapper;
import com.newhead.balabala.modules.balabalacourse.base.repository.entity.BalabalaCourse;
import com.newhead.balabala.modules.balabalacourse.base.repository.entity.BalabalaCourseExample;

import com.newhead.balabala.modules.balabalacourse.base.repository.dao.BalabalaCourseMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBalabalaClassService extends BaseService {
    protected abstract BalabalaClassMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaClass entity);

    @Autowired
    protected BalabalaCampusMapper balabalacampusMapper;
    @Autowired
    protected BalabalaTextbookCategoryMapper balabalatextbookcategoryMapper;
    @Autowired
    protected BalabalaTeacherMapper balabalateacherMapper;
    @Autowired
    protected BalabalaCourseMapper balabalacourseMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaClass create(SimpleBalabalaClassCreateRequest request) {
        BalabalaClass entity = new BalabalaClass();
        BeanUtils.copyProperties(request,entity);
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

    /**
     * 修改
     * @param request
     * @return
     */
    @Transactional
    public BalabalaClass update(SimpleBalabalaClassUpdateRequest request) {
        BalabalaClass entity = new BalabalaClass();
        BeanUtils.copyProperties(request,entity);
        entity.setUpdatedAt(new Date());
        entity.setDeleted(false);
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().updateByPrimaryKeySelective(entity);

        return entity;
    }

    /**
     * 查看菜单详情
     * @param id
     * @return
     */
    public SimpleBalabalaClassGetDetailResponse getDetail(Long id) {
        BalabalaClass entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaClassGetDetailResponse response = new SimpleBalabalaClassGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaCourse  courseIdEntity = balabalacourseMapper.selectByPrimaryKey(Long.valueOf(entity.getCourseId()));
        if (courseIdEntity!=null) {
            LabelValueItem courseIdObject = response.getCourseIdObject();
            courseIdObject.setName("courseId");
            courseIdObject.setLabel(courseIdEntity.getCourseName());
            courseIdObject.setValue(String.valueOf(entity.getCourseId()));
            courseIdObject.setChecked(false);
        }
        BalabalaTextbookCategory  categoryIdEntity = balabalatextbookcategoryMapper.selectByPrimaryKey(Long.valueOf(entity.getCategoryId()));
        if (categoryIdEntity!=null) {
            LabelValueItem categoryIdObject = response.getCategoryIdObject();
            categoryIdObject.setName("categoryId");
            categoryIdObject.setLabel(categoryIdEntity.getCategoryName());
            categoryIdObject.setValue(String.valueOf(entity.getCategoryId()));
            categoryIdObject.setChecked(false);
        }
        BalabalaTeacher  teacherIdEntity = balabalateacherMapper.selectByPrimaryKey(Long.valueOf(entity.getTeacherId()));
        if (teacherIdEntity!=null) {
            LabelValueItem teacherIdObject = response.getTeacherIdObject();
            teacherIdObject.setName("teacherId");
            teacherIdObject.setLabel(teacherIdEntity.getFullName());
            teacherIdObject.setValue(String.valueOf(entity.getTeacherId()));
            teacherIdObject.setChecked(false);
        }
        BalabalaCampus  campusIdEntity = balabalacampusMapper.selectByPrimaryKey(Long.valueOf(entity.getCampusId()));
        if (campusIdEntity!=null) {
            LabelValueItem campusIdObject = response.getCampusIdObject();
            campusIdObject.setName("campusId");
            campusIdObject.setLabel(campusIdEntity.getCampusName());
            campusIdObject.setValue(String.valueOf(entity.getCampusId()));
            campusIdObject.setChecked(false);
        }
        BalabalaTeacher  englishTeacherIdEntity = balabalateacherMapper.selectByPrimaryKey(Long.valueOf(entity.getEnglishTeacherId()));
        if (englishTeacherIdEntity!=null) {
            LabelValueItem englishTeacherIdObject = response.getEnglishTeacherIdObject();
            englishTeacherIdObject.setName("englishTeacherId");
            englishTeacherIdObject.setLabel(englishTeacherIdEntity.getFullName());
            englishTeacherIdObject.setValue(String.valueOf(entity.getEnglishTeacherId()));
            englishTeacherIdObject.setChecked(false);
        }
        LabelValueItem statusEnum = response.getStatusEnum();
        statusEnum.setName("status");
        statusEnum.setLabel(com.newhead.balabala.modules.balabalaclass.BalabalaClassStatusEnum.getLabel(entity.getStatus()));
        statusEnum.setValue(entity.getStatus());
        statusEnum.setChecked(true);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BalabalaClass entity = new BalabalaClass();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaClassQueryResponse> queryList(SimpleBalabalaClassQueryListRequest request) {
        List<SimpleBalabalaClassQueryResponse> results = new ArrayList<SimpleBalabalaClassQueryResponse>();

        //构造查询对象
        BalabalaClassExample example = new BalabalaClassExample();
        BalabalaClassExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getClassName()!=null) {
            c.andClassNameLike("%"+request.getClassName()+"%");
        }

        if (request.getMonitor()!=null) {
            c.andMonitorLike("%"+request.getMonitor()+"%");
        }

        if (request.getMonitorPhoneNumber()!=null) {
            c.andMonitorPhoneNumberLike("%"+request.getMonitorPhoneNumber()+"%");
        }

        if (request.getStatus()!=null) {
            c.andStatusEqualTo(request.getStatus());
         }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBalabalaClassQueryResponse> queryPage(SimpleBalabalaClassQueryPageRequest request) {
        //结果
        List<SimpleBalabalaClassQueryResponse> results = new ArrayList<SimpleBalabalaClassQueryResponse>();

        //构造查询对象
        BalabalaClassExample example = new BalabalaClassExample();
        BalabalaClassExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getClassName()!=null) {
            c.andClassNameLike("%"+request.getClassName()+"%");
        }

        if (request.getMonitor()!=null) {
            c.andMonitorLike("%"+request.getMonitor()+"%");
        }

        if (request.getMonitorPhoneNumber()!=null) {
            c.andMonitorPhoneNumberLike("%"+request.getMonitorPhoneNumber()+"%");
        }

        if (request.getStatus()!=null) {
            c.andStatusEqualTo(request.getStatus());
         }

        example.setPageSize(request.getSize());
        example.setStartRow(request.getOffset());

        long count = getMapper().countByExample(example);

        convertEntityToResponse(getMapper().selectByExample(example),results);

        Page page = new Page();
        page.setNumber(request.getPage());
        page.setSize(request.getSize());
        page.setContent(results);
        page.setTotalElements(count);
        return page;
    }

    /**
     * 对象转换
     * @param entitys
     * @param results
     */
    private void convertEntityToResponse(List<BalabalaClass> entitys,List<SimpleBalabalaClassQueryResponse> results) {
        Map<Long,Long> courseIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> courseIdResultMap = Maps.newHashMap();

        Map<Long,Long> categoryIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> categoryIdResultMap = Maps.newHashMap();

        Map<Long,Long> teacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> teacherIdResultMap = Maps.newHashMap();

        Map<Long,Long> campusIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> campusIdResultMap = Maps.newHashMap();

        Map<Long,Long> englishTeacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> englishTeacherIdResultMap = Maps.newHashMap();

       for(BalabalaClass entity:entitys) {
            courseIdMap.put(entity.getId(),entity.getCourseId());
            categoryIdMap.put(entity.getId(),entity.getCategoryId());
            teacherIdMap.put(entity.getId(),entity.getTeacherId());
            campusIdMap.put(entity.getId(),entity.getCampusId());
            englishTeacherIdMap.put(entity.getId(),entity.getEnglishTeacherId());
        }
        BalabalaCourseExample courseIdExample = new BalabalaCourseExample();

        List<Long> courseIds = new ArrayList<>();
        courseIds.addAll(courseIdMap.values());
        if (courseIds.size()>0) {
            courseIdExample.createCriteria().andIdIn(courseIds);
        }
        List<BalabalaCourse>  courseIdList = balabalacourseMapper.selectByExample(courseIdExample);
        for(BalabalaCourse item:courseIdList) {
           LabelValueItem courseIdItem = new LabelValueItem();
           courseIdItem.setName("courseId");
           courseIdItem.setValue(String.valueOf(item.getId()));
           courseIdItem.setLabel(item.getCourseName());
           courseIdResultMap.put(item.getId(),courseIdItem);
        }
        BalabalaTextbookCategoryExample categoryIdExample = new BalabalaTextbookCategoryExample();

        List<Long> categoryIds = new ArrayList<>();
        categoryIds.addAll(categoryIdMap.values());
        if (categoryIds.size()>0) {
            categoryIdExample.createCriteria().andIdIn(categoryIds);
        }
        List<BalabalaTextbookCategory>  categoryIdList = balabalatextbookcategoryMapper.selectByExample(categoryIdExample);
        for(BalabalaTextbookCategory item:categoryIdList) {
           LabelValueItem categoryIdItem = new LabelValueItem();
           categoryIdItem.setName("categoryId");
           categoryIdItem.setValue(String.valueOf(item.getId()));
           categoryIdItem.setLabel(item.getCategoryName());
           categoryIdResultMap.put(item.getId(),categoryIdItem);
        }
        BalabalaTeacherExample teacherIdExample = new BalabalaTeacherExample();

        List<Long> teacherIds = new ArrayList<>();
        teacherIds.addAll(teacherIdMap.values());
        if (teacherIds.size()>0) {
            teacherIdExample.createCriteria().andIdIn(teacherIds);
        }
        List<BalabalaTeacher>  teacherIdList = balabalateacherMapper.selectByExample(teacherIdExample);
        for(BalabalaTeacher item:teacherIdList) {
           LabelValueItem teacherIdItem = new LabelValueItem();
           teacherIdItem.setName("teacherId");
           teacherIdItem.setValue(String.valueOf(item.getId()));
           teacherIdItem.setLabel(item.getFullName());
           teacherIdResultMap.put(item.getId(),teacherIdItem);
        }
        BalabalaCampusExample campusIdExample = new BalabalaCampusExample();

        List<Long> campusIds = new ArrayList<>();
        campusIds.addAll(campusIdMap.values());
        if (campusIds.size()>0) {
            campusIdExample.createCriteria().andIdIn(campusIds);
        }
        List<BalabalaCampus>  campusIdList = balabalacampusMapper.selectByExample(campusIdExample);
        for(BalabalaCampus item:campusIdList) {
           LabelValueItem campusIdItem = new LabelValueItem();
           campusIdItem.setName("campusId");
           campusIdItem.setValue(String.valueOf(item.getId()));
           campusIdItem.setLabel(item.getCampusName());
           campusIdResultMap.put(item.getId(),campusIdItem);
        }
        BalabalaTeacherExample englishTeacherIdExample = new BalabalaTeacherExample();

        List<Long> englishTeacherIds = new ArrayList<>();
        englishTeacherIds.addAll(englishTeacherIdMap.values());
        if (englishTeacherIds.size()>0) {
            englishTeacherIdExample.createCriteria().andIdIn(englishTeacherIds);
        }
        List<BalabalaTeacher>  englishTeacherIdList = balabalateacherMapper.selectByExample(englishTeacherIdExample);
        for(BalabalaTeacher item:englishTeacherIdList) {
           LabelValueItem englishTeacherIdItem = new LabelValueItem();
           englishTeacherIdItem.setName("englishTeacherId");
           englishTeacherIdItem.setValue(String.valueOf(item.getId()));
           englishTeacherIdItem.setLabel(item.getFullName());
           englishTeacherIdResultMap.put(item.getId(),englishTeacherIdItem);
        }
        //第一组
        for(BalabalaClass entity:entitys) {
            SimpleBalabalaClassQueryResponse response = new SimpleBalabalaClassQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long courseId = courseIdMap.get(entity.getId());

            LabelValueItem courseIdlvi = null;
            if (courseId!=null && courseIdResultMap.get(courseId)!=null) {
                courseIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(courseIdResultMap.get(courseId),courseIdlvi);
            }
            response.setCourseIdObject(courseIdlvi);
            Long categoryId = categoryIdMap.get(entity.getId());

            LabelValueItem categoryIdlvi = null;
            if (categoryId!=null && categoryIdResultMap.get(categoryId)!=null) {
                categoryIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(categoryIdResultMap.get(categoryId),categoryIdlvi);
            }
            response.setCategoryIdObject(categoryIdlvi);
            Long teacherId = teacherIdMap.get(entity.getId());

            LabelValueItem teacherIdlvi = null;
            if (teacherId!=null && teacherIdResultMap.get(teacherId)!=null) {
                teacherIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(teacherIdResultMap.get(teacherId),teacherIdlvi);
            }
            response.setTeacherIdObject(teacherIdlvi);
            Long campusId = campusIdMap.get(entity.getId());

            LabelValueItem campusIdlvi = null;
            if (campusId!=null && campusIdResultMap.get(campusId)!=null) {
                campusIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(campusIdResultMap.get(campusId),campusIdlvi);
            }
            response.setCampusIdObject(campusIdlvi);
            Long englishTeacherId = englishTeacherIdMap.get(entity.getId());

            LabelValueItem englishTeacherIdlvi = null;
            if (englishTeacherId!=null && englishTeacherIdResultMap.get(englishTeacherId)!=null) {
                englishTeacherIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(englishTeacherIdResultMap.get(englishTeacherId),englishTeacherIdlvi);
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

    /**
     *
     * @param node
     * @param selectMap
     */
    private void traversalTree(Node node,Map<Long,Boolean> selectMap) {
        if (node.getValue()!=null && org.apache.commons.lang3.math.NumberUtils.isNumber(node.getValue())) {
            if (selectMap.containsKey(Long.valueOf(node.getValue()))) {
                node.setSelected(true);
            }
        }
        if (node.getChildren()!=null) {
            for(Node child:node.getChildren()) {
                traversalTree(child,selectMap);
            }
        }
    }






}
