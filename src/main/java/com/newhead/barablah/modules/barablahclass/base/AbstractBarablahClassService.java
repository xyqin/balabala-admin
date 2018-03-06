package com.newhead.barablah.modules.barablahclass.base;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahcampus.base.repository.dao.BarablahCampusMapper;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampus;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampusExample;
import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahclass.ext.protocol.*;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.dao.BarablahClassCategoryMapper;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategory;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategoryExample;
import com.newhead.barablah.modules.barablahcourse.base.repository.dao.BarablahCourseMapper;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourseExample;
import com.newhead.barablah.modules.barablahteacher.base.repository.dao.BarablahTeacherMapper;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacher;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacherExample;
import com.newhead.rudderframework.core.services.BaseService;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Node;
import com.newhead.rudderframework.modules.LabelValueItem;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBarablahClassService extends BaseService {
    protected abstract BarablahClassMapper getMapper();

    protected abstract void saveOrUpdate(BarablahClass entity);

    @Autowired
    protected BarablahClassCategoryMapper barablahclasscategoryMapper;
    @Autowired
    protected BarablahCampusMapper barablahcampusMapper;
    @Autowired
    protected BarablahTeacherMapper barablahteacherMapper;
    @Autowired
    protected BarablahCourseMapper barablahcourseMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahClass create(SimpleBarablahClassCreateRequest request) {
        BarablahClass entity = new BarablahClass();
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
    public BarablahClass update(SimpleBarablahClassUpdateRequest request) {
        BarablahClass entity = new BarablahClass();
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
    public SimpleBarablahClassGetDetailResponse getDetail(Long id) {
        BarablahClass entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahClassGetDetailResponse response = new SimpleBarablahClassGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahClassCategory  categoryIdEntity = barablahclasscategoryMapper.selectByPrimaryKey(Long.valueOf(entity.getCategoryId()));
        if (categoryIdEntity!=null) {
            LabelValueItem categoryIdObject = response.getCategoryIdObject();
            categoryIdObject.setName("categoryId");
            categoryIdObject.setLabel(categoryIdEntity.getCategoryName());
            categoryIdObject.setValue(String.valueOf(entity.getCategoryId()));
            categoryIdObject.setChecked(false);
        }
        BarablahCourse  courseIdEntity = barablahcourseMapper.selectByPrimaryKey(Long.valueOf(entity.getCourseId()));
        if (courseIdEntity!=null) {
            LabelValueItem courseIdObject = response.getCourseIdObject();
            courseIdObject.setName("courseId");
            courseIdObject.setLabel(courseIdEntity.getCourseName());
            courseIdObject.setValue(String.valueOf(entity.getCourseId()));
            courseIdObject.setChecked(false);
        }
        BarablahTeacher  teacherIdEntity = barablahteacherMapper.selectByPrimaryKey(Long.valueOf(entity.getTeacherId()));
        if (teacherIdEntity!=null) {
            LabelValueItem teacherIdObject = response.getTeacherIdObject();
            teacherIdObject.setName("teacherId");
            teacherIdObject.setLabel(teacherIdEntity.getFullName());
            teacherIdObject.setValue(String.valueOf(entity.getTeacherId()));
            teacherIdObject.setChecked(false);
        }
        BarablahCampus  campusIdEntity = barablahcampusMapper.selectByPrimaryKey(Long.valueOf(entity.getCampusId()));
        if (campusIdEntity!=null) {
            LabelValueItem campusIdObject = response.getCampusIdObject();
            campusIdObject.setName("campusId");
            campusIdObject.setLabel(campusIdEntity.getCampusName());
            campusIdObject.setValue(String.valueOf(entity.getCampusId()));
            campusIdObject.setChecked(false);
        }
        BarablahTeacher  englishTeacherIdEntity = barablahteacherMapper.selectByPrimaryKey(Long.valueOf(entity.getEnglishTeacherId()));
        if (englishTeacherIdEntity!=null) {
            LabelValueItem englishTeacherIdObject = response.getEnglishTeacherIdObject();
            englishTeacherIdObject.setName("englishTeacherId");
            englishTeacherIdObject.setLabel(englishTeacherIdEntity.getFullName());
            englishTeacherIdObject.setValue(String.valueOf(entity.getEnglishTeacherId()));
            englishTeacherIdObject.setChecked(false);
        }
        LabelValueItem statusEnum = response.getStatusEnum();
        statusEnum.setName("status");
        statusEnum.setLabel(com.newhead.barablah.modules.barablahclass.BarablahClassStatusEnum.getLabel(entity.getStatus()));
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
        BarablahClass entity = new BarablahClass();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahClassQueryResponse> queryList(SimpleBarablahClassQueryListRequest request) {
        List<SimpleBarablahClassQueryResponse> results = new ArrayList<SimpleBarablahClassQueryResponse>();

        //构造查询对象
        BarablahClassExample example = new BarablahClassExample();
        BarablahClassExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        if (request.getCategoryId()!=null) {
            c.andCategoryIdEqualTo(request.getCategoryId());
         }

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
    public Page<SimpleBarablahClassQueryResponse> queryPage(SimpleBarablahClassQueryPageRequest request) {
        //结果
        List<SimpleBarablahClassQueryResponse> results = new ArrayList<SimpleBarablahClassQueryResponse>();

        //构造查询对象
        BarablahClassExample example = new BarablahClassExample();
        BarablahClassExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getCategoryId()!=null) {
            c.andCategoryIdEqualTo(request.getCategoryId());
         }

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
    private void convertEntityToResponse(List<BarablahClass> entitys,List<SimpleBarablahClassQueryResponse> results) {
        Map<Long,Long> categoryIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> categoryIdResultMap = Maps.newHashMap();

        Map<Long,Long> courseIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> courseIdResultMap = Maps.newHashMap();

        Map<Long,Long> teacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> teacherIdResultMap = Maps.newHashMap();

        Map<Long,Long> campusIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> campusIdResultMap = Maps.newHashMap();

        Map<Long,Long> englishTeacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> englishTeacherIdResultMap = Maps.newHashMap();

       for(BarablahClass entity:entitys) {
            categoryIdMap.put(entity.getId(),entity.getCategoryId());
            courseIdMap.put(entity.getId(),entity.getCourseId());
            teacherIdMap.put(entity.getId(),entity.getTeacherId());
            campusIdMap.put(entity.getId(),entity.getCampusId());
            englishTeacherIdMap.put(entity.getId(),entity.getEnglishTeacherId());
        }
        BarablahClassCategoryExample categoryIdExample = new BarablahClassCategoryExample();

        List<Long> categoryIds = new ArrayList<>();
        categoryIds.addAll(categoryIdMap.values());
        if (categoryIds.size()>0) {
            categoryIdExample.createCriteria().andIdIn(categoryIds);
        }
        List<BarablahClassCategory>  categoryIdList = barablahclasscategoryMapper.selectByExample(categoryIdExample);
        for(BarablahClassCategory item:categoryIdList) {
           LabelValueItem categoryIdItem = new LabelValueItem();
           categoryIdItem.setName("categoryId");
           categoryIdItem.setValue(String.valueOf(item.getId()));
           categoryIdItem.setLabel(item.getCategoryName());
           categoryIdResultMap.put(item.getId(),categoryIdItem);
        }
        BarablahCourseExample courseIdExample = new BarablahCourseExample();

        List<Long> courseIds = new ArrayList<>();
        courseIds.addAll(courseIdMap.values());
        if (courseIds.size()>0) {
            courseIdExample.createCriteria().andIdIn(courseIds);
        }
        List<BarablahCourse>  courseIdList = barablahcourseMapper.selectByExample(courseIdExample);
        for(BarablahCourse item:courseIdList) {
           LabelValueItem courseIdItem = new LabelValueItem();
           courseIdItem.setName("courseId");
           courseIdItem.setValue(String.valueOf(item.getId()));
           courseIdItem.setLabel(item.getCourseName());
           courseIdResultMap.put(item.getId(),courseIdItem);
        }
        BarablahTeacherExample teacherIdExample = new BarablahTeacherExample();

        List<Long> teacherIds = new ArrayList<>();
        teacherIds.addAll(teacherIdMap.values());
        if (teacherIds.size()>0) {
            teacherIdExample.createCriteria().andIdIn(teacherIds);
        }
        List<BarablahTeacher>  teacherIdList = barablahteacherMapper.selectByExample(teacherIdExample);
        for(BarablahTeacher item:teacherIdList) {
           LabelValueItem teacherIdItem = new LabelValueItem();
           teacherIdItem.setName("teacherId");
           teacherIdItem.setValue(String.valueOf(item.getId()));
           teacherIdItem.setLabel(item.getFullName());
           teacherIdResultMap.put(item.getId(),teacherIdItem);
        }
        BarablahCampusExample campusIdExample = new BarablahCampusExample();

        List<Long> campusIds = new ArrayList<>();
        campusIds.addAll(campusIdMap.values());
        if (campusIds.size()>0) {
            campusIdExample.createCriteria().andIdIn(campusIds);
        }
        List<BarablahCampus>  campusIdList = barablahcampusMapper.selectByExample(campusIdExample);
        for(BarablahCampus item:campusIdList) {
           LabelValueItem campusIdItem = new LabelValueItem();
           campusIdItem.setName("campusId");
           campusIdItem.setValue(String.valueOf(item.getId()));
           campusIdItem.setLabel(item.getCampusName());
           campusIdResultMap.put(item.getId(),campusIdItem);
        }
        BarablahTeacherExample englishTeacherIdExample = new BarablahTeacherExample();

        List<Long> englishTeacherIds = new ArrayList<>();
        englishTeacherIds.addAll(englishTeacherIdMap.values());
        if (englishTeacherIds.size()>0) {
            englishTeacherIdExample.createCriteria().andIdIn(englishTeacherIds);
        }
        List<BarablahTeacher>  englishTeacherIdList = barablahteacherMapper.selectByExample(englishTeacherIdExample);
        for(BarablahTeacher item:englishTeacherIdList) {
           LabelValueItem englishTeacherIdItem = new LabelValueItem();
           englishTeacherIdItem.setName("englishTeacherId");
           englishTeacherIdItem.setValue(String.valueOf(item.getId()));
           englishTeacherIdItem.setLabel(item.getFullName());
           englishTeacherIdResultMap.put(item.getId(),englishTeacherIdItem);
        }
        //第一组
        for(BarablahClass entity:entitys) {
            SimpleBarablahClassQueryResponse response = new SimpleBarablahClassQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long categoryId = categoryIdMap.get(entity.getId());

            LabelValueItem categoryIdlvi = null;
            if (categoryId!=null && categoryIdResultMap.get(categoryId)!=null) {
                categoryIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(categoryIdResultMap.get(categoryId),categoryIdlvi);
            }
            response.setCategoryIdObject(categoryIdlvi);
            Long courseId = courseIdMap.get(entity.getId());

            LabelValueItem courseIdlvi = null;
            if (courseId!=null && courseIdResultMap.get(courseId)!=null) {
                courseIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(courseIdResultMap.get(courseId),courseIdlvi);
            }
            response.setCourseIdObject(courseIdlvi);
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
            statusEnum.setLabel(com.newhead.barablah.modules.barablahclass.BarablahClassStatusEnum.getLabel(entity.getStatus()));
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
