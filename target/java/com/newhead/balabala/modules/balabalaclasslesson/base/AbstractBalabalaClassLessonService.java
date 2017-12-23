package com.newhead.balabala.modules.balabalaclasslesson.base;

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
import com.newhead.balabala.modules.balabalaclasslesson.base.repository.dao.BalabalaClassLessonMapper;
import com.newhead.balabala.modules.balabalaclasslesson.base.repository.entity.BalabalaClassLesson;
import com.newhead.balabala.modules.balabalaclasslesson.base.repository.entity.BalabalaClassLessonExample;
import com.newhead.balabala.modules.balabalaclasslesson.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClass;
import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClassExample;

import com.newhead.balabala.modules.balabalaclass.base.repository.dao.BalabalaClassMapper;
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
public abstract class AbstractBalabalaClassLessonService extends BaseService {
    protected abstract BalabalaClassLessonMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaClassLesson entity);

    @Autowired
    protected BalabalaClassMapper balabalaclassMapper;
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
    public BalabalaClassLesson create(SimpleBalabalaClassLessonCreateRequest request) {
        BalabalaClassLesson entity = new BalabalaClassLesson();
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
    public BalabalaClassLesson update(SimpleBalabalaClassLessonUpdateRequest request) {
        BalabalaClassLesson entity = new BalabalaClassLesson();
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
    public SimpleBalabalaClassLessonGetDetailResponse getDetail(Long id) {
        BalabalaClassLesson entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaClassLessonGetDetailResponse response = new SimpleBalabalaClassLessonGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaClass  classIdEntity = balabalaclassMapper.selectByPrimaryKey(Long.valueOf(entity.getClassId()));
        if (classIdEntity!=null) {
            LabelValueItem classIdObject = response.getClassIdObject();
            classIdObject.setName("classId");
            classIdObject.setLabel(classIdEntity.getClassName());
            classIdObject.setValue(String.valueOf(entity.getClassId()));
            classIdObject.setChecked(false);
        }
        BalabalaCourse  courseIdEntity = balabalacourseMapper.selectByPrimaryKey(Long.valueOf(entity.getCourseId()));
        if (courseIdEntity!=null) {
            LabelValueItem courseIdObject = response.getCourseIdObject();
            courseIdObject.setName("courseId");
            courseIdObject.setLabel(courseIdEntity.getCourseName());
            courseIdObject.setValue(String.valueOf(entity.getCourseId()));
            courseIdObject.setChecked(false);
        }
        BalabalaTeacher  teacherIdEntity = balabalateacherMapper.selectByPrimaryKey(Long.valueOf(entity.getTeacherId()));
        if (teacherIdEntity!=null) {
            LabelValueItem teacherIdObject = response.getTeacherIdObject();
            teacherIdObject.setName("teacherId");
            teacherIdObject.setLabel(teacherIdEntity.getFullName());
            teacherIdObject.setValue(String.valueOf(entity.getTeacherId()));
            teacherIdObject.setChecked(false);
        }
        BalabalaTeacher  englishTeacherIdEntity = balabalateacherMapper.selectByPrimaryKey(Long.valueOf(entity.getEnglishTeacherId()));
        if (englishTeacherIdEntity!=null) {
            LabelValueItem englishTeacherIdObject = response.getEnglishTeacherIdObject();
            englishTeacherIdObject.setName("englishTeacherId");
            englishTeacherIdObject.setLabel(englishTeacherIdEntity.getFullName());
            englishTeacherIdObject.setValue(String.valueOf(entity.getEnglishTeacherId()));
            englishTeacherIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BalabalaClassLesson entity = new BalabalaClassLesson();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaClassLessonQueryResponse> queryList(SimpleBalabalaClassLessonQueryListRequest request) {
        List<SimpleBalabalaClassLessonQueryResponse> results = new ArrayList<SimpleBalabalaClassLessonQueryResponse>();

        //构造查询对象
        BalabalaClassLessonExample example = new BalabalaClassLessonExample();
        BalabalaClassLessonExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getLessonName()!=null) {
            c.andLessonNameLike("%"+request.getLessonName()+"%");
        }

        if (request.getThumbnail()!=null) {
            c.andThumbnailLike("%"+request.getThumbnail()+"%");
        }

        if (request.getVideo()!=null) {
            c.andVideoLike("%"+request.getVideo()+"%");
        }

        if (request.getRoom()!=null) {
            c.andRoomLike("%"+request.getRoom()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBalabalaClassLessonQueryResponse> queryPage(SimpleBalabalaClassLessonQueryPageRequest request) {
        //结果
        List<SimpleBalabalaClassLessonQueryResponse> results = new ArrayList<SimpleBalabalaClassLessonQueryResponse>();

        //构造查询对象
        BalabalaClassLessonExample example = new BalabalaClassLessonExample();
        BalabalaClassLessonExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getLessonName()!=null) {
            c.andLessonNameLike("%"+request.getLessonName()+"%");
        }

        if (request.getThumbnail()!=null) {
            c.andThumbnailLike("%"+request.getThumbnail()+"%");
        }

        if (request.getVideo()!=null) {
            c.andVideoLike("%"+request.getVideo()+"%");
        }

        if (request.getRoom()!=null) {
            c.andRoomLike("%"+request.getRoom()+"%");
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
    private void convertEntityToResponse(List<BalabalaClassLesson> entitys,List<SimpleBalabalaClassLessonQueryResponse> results) {
        Map<Long,Long> classIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> classIdResultMap = Maps.newHashMap();

        Map<Long,Long> courseIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> courseIdResultMap = Maps.newHashMap();

        Map<Long,Long> teacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> teacherIdResultMap = Maps.newHashMap();

        Map<Long,Long> englishTeacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> englishTeacherIdResultMap = Maps.newHashMap();

       for(BalabalaClassLesson entity:entitys) {
            classIdMap.put(entity.getId(),entity.getClassId());
            courseIdMap.put(entity.getId(),entity.getCourseId());
            teacherIdMap.put(entity.getId(),entity.getTeacherId());
            englishTeacherIdMap.put(entity.getId(),entity.getEnglishTeacherId());
        }
        BalabalaClassExample classIdExample = new BalabalaClassExample();

        List<Long> classIds = new ArrayList<>();
        classIds.addAll(classIdMap.values());
        if (classIds.size()>0) {
            classIdExample.createCriteria().andIdIn(classIds);
        }
        List<BalabalaClass>  classIdList = balabalaclassMapper.selectByExample(classIdExample);
        for(BalabalaClass item:classIdList) {
           LabelValueItem classIdItem = new LabelValueItem();
           classIdItem.setName("classId");
           classIdItem.setValue(String.valueOf(item.getId()));
           classIdItem.setLabel(item.getClassName());
           classIdResultMap.put(item.getId(),classIdItem);
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
        for(BalabalaClassLesson entity:entitys) {
            SimpleBalabalaClassLessonQueryResponse response = new SimpleBalabalaClassLessonQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long classId = classIdMap.get(entity.getId());

            LabelValueItem classIdlvi = null;
            if (classId!=null && classIdResultMap.get(classId)!=null) {
                classIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(classIdResultMap.get(classId),classIdlvi);
            }
            response.setClassIdObject(classIdlvi);
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
            Long englishTeacherId = englishTeacherIdMap.get(entity.getId());

            LabelValueItem englishTeacherIdlvi = null;
            if (englishTeacherId!=null && englishTeacherIdResultMap.get(englishTeacherId)!=null) {
                englishTeacherIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(englishTeacherIdResultMap.get(englishTeacherId),englishTeacherIdlvi);
            }
            response.setEnglishTeacherIdObject(englishTeacherIdlvi);
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
