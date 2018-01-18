package com.newhead.barablah.modules.barablahteacherhomeworkitem.base;

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
import com.newhead.barablah.modules.barablahteacherhomeworkitem.base.repository.dao.BarablahTeacherHomeworkItemMapper;
import com.newhead.barablah.modules.barablahteacherhomeworkitem.base.repository.entity.BarablahTeacherHomeworkItem;
import com.newhead.barablah.modules.barablahteacherhomeworkitem.base.repository.entity.BarablahTeacherHomeworkItemExample;
import com.newhead.barablah.modules.barablahteacherhomeworkitem.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbook;
import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbookExample;

import com.newhead.barablah.modules.barablahtextbook.base.repository.dao.BarablahTextbookMapper;
import com.newhead.barablah.modules.barablahteacherhomework.base.repository.entity.BarablahTeacherHomework;
import com.newhead.barablah.modules.barablahteacherhomework.base.repository.entity.BarablahTeacherHomeworkExample;

import com.newhead.barablah.modules.barablahteacherhomework.base.repository.dao.BarablahTeacherHomeworkMapper;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacher;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacherExample;

import com.newhead.barablah.modules.barablahteacher.base.repository.dao.BarablahTeacherMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBarablahTeacherHomeworkItemService extends BaseService {
    protected abstract BarablahTeacherHomeworkItemMapper getMapper();

    protected abstract void saveOrUpdate(BarablahTeacherHomeworkItem entity);

    @Autowired
    protected BarablahTextbookMapper barablahtextbookMapper;
    @Autowired
    protected BarablahTeacherHomeworkMapper barablahteacherhomeworkMapper;
    @Autowired
    protected BarablahTeacherMapper barablahteacherMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahTeacherHomeworkItem create(SimpleBarablahTeacherHomeworkItemCreateRequest request) {
        BarablahTeacherHomeworkItem entity = new BarablahTeacherHomeworkItem();
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
    public BarablahTeacherHomeworkItem update(SimpleBarablahTeacherHomeworkItemUpdateRequest request) {
        BarablahTeacherHomeworkItem entity = new BarablahTeacherHomeworkItem();
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
    public SimpleBarablahTeacherHomeworkItemGetDetailResponse getDetail(Long id) {
        BarablahTeacherHomeworkItem entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahTeacherHomeworkItemGetDetailResponse response = new SimpleBarablahTeacherHomeworkItemGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahTeacher  teacherIdEntity = barablahteacherMapper.selectByPrimaryKey(Long.valueOf(entity.getTeacherId()));
        if (teacherIdEntity!=null) {
            LabelValueItem teacherIdObject = response.getTeacherIdObject();
            teacherIdObject.setName("teacherId");
            teacherIdObject.setLabel(teacherIdEntity.getFullName());
            teacherIdObject.setValue(String.valueOf(entity.getTeacherId()));
            teacherIdObject.setChecked(false);
        }
        BarablahTeacherHomework  homeworkIdEntity = barablahteacherhomeworkMapper.selectByPrimaryKey(Long.valueOf(entity.getHomeworkId()));
        if (homeworkIdEntity!=null) {
            LabelValueItem homeworkIdObject = response.getHomeworkIdObject();
            homeworkIdObject.setName("homeworkId");
            homeworkIdObject.setLabel(homeworkIdEntity.getHomeworkName());
            homeworkIdObject.setValue(String.valueOf(entity.getHomeworkId()));
            homeworkIdObject.setChecked(false);
        }
        BarablahTextbook  textbookIdEntity = barablahtextbookMapper.selectByPrimaryKey(Long.valueOf(entity.getTextbookId()));
        if (textbookIdEntity!=null) {
            LabelValueItem textbookIdObject = response.getTextbookIdObject();
            textbookIdObject.setName("textbookId");
            textbookIdObject.setLabel(textbookIdEntity.getTextbookName());
            textbookIdObject.setValue(String.valueOf(entity.getTextbookId()));
            textbookIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahTeacherHomeworkItem entity = new BarablahTeacherHomeworkItem();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahTeacherHomeworkItemQueryResponse> queryList(SimpleBarablahTeacherHomeworkItemQueryListRequest request) {
        List<SimpleBarablahTeacherHomeworkItemQueryResponse> results = new ArrayList<SimpleBarablahTeacherHomeworkItemQueryResponse>();

        //构造查询对象
        BarablahTeacherHomeworkItemExample example = new BarablahTeacherHomeworkItemExample();
        BarablahTeacherHomeworkItemExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahTeacherHomeworkItemQueryResponse> queryPage(SimpleBarablahTeacherHomeworkItemQueryPageRequest request) {
        //结果
        List<SimpleBarablahTeacherHomeworkItemQueryResponse> results = new ArrayList<SimpleBarablahTeacherHomeworkItemQueryResponse>();

        //构造查询对象
        BarablahTeacherHomeworkItemExample example = new BarablahTeacherHomeworkItemExample();
        BarablahTeacherHomeworkItemExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

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
    private void convertEntityToResponse(List<BarablahTeacherHomeworkItem> entitys,List<SimpleBarablahTeacherHomeworkItemQueryResponse> results) {
        Map<Long,Long> teacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> teacherIdResultMap = Maps.newHashMap();

        Map<Long,Long> homeworkIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> homeworkIdResultMap = Maps.newHashMap();

        Map<Long,Long> textbookIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> textbookIdResultMap = Maps.newHashMap();

       for(BarablahTeacherHomeworkItem entity:entitys) {
            teacherIdMap.put(entity.getId(),entity.getTeacherId());
            homeworkIdMap.put(entity.getId(),entity.getHomeworkId());
            textbookIdMap.put(entity.getId(),entity.getTextbookId());
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
        BarablahTeacherHomeworkExample homeworkIdExample = new BarablahTeacherHomeworkExample();

        List<Long> homeworkIds = new ArrayList<>();
        homeworkIds.addAll(homeworkIdMap.values());
        if (homeworkIds.size()>0) {
            homeworkIdExample.createCriteria().andIdIn(homeworkIds);
        }
        List<BarablahTeacherHomework>  homeworkIdList = barablahteacherhomeworkMapper.selectByExample(homeworkIdExample);
        for(BarablahTeacherHomework item:homeworkIdList) {
           LabelValueItem homeworkIdItem = new LabelValueItem();
           homeworkIdItem.setName("homeworkId");
           homeworkIdItem.setValue(String.valueOf(item.getId()));
           homeworkIdItem.setLabel(item.getHomeworkName());
           homeworkIdResultMap.put(item.getId(),homeworkIdItem);
        }
        BarablahTextbookExample textbookIdExample = new BarablahTextbookExample();

        List<Long> textbookIds = new ArrayList<>();
        textbookIds.addAll(textbookIdMap.values());
        if (textbookIds.size()>0) {
            textbookIdExample.createCriteria().andIdIn(textbookIds);
        }
        List<BarablahTextbook>  textbookIdList = barablahtextbookMapper.selectByExample(textbookIdExample);
        for(BarablahTextbook item:textbookIdList) {
           LabelValueItem textbookIdItem = new LabelValueItem();
           textbookIdItem.setName("textbookId");
           textbookIdItem.setValue(String.valueOf(item.getId()));
           textbookIdItem.setLabel(item.getTextbookName());
           textbookIdResultMap.put(item.getId(),textbookIdItem);
        }
        //第一组
        for(BarablahTeacherHomeworkItem entity:entitys) {
            SimpleBarablahTeacherHomeworkItemQueryResponse response = new SimpleBarablahTeacherHomeworkItemQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long teacherId = teacherIdMap.get(entity.getId());

            LabelValueItem teacherIdlvi = null;
            if (teacherId!=null && teacherIdResultMap.get(teacherId)!=null) {
                teacherIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(teacherIdResultMap.get(teacherId),teacherIdlvi);
            }
            response.setTeacherIdObject(teacherIdlvi);
            Long homeworkId = homeworkIdMap.get(entity.getId());

            LabelValueItem homeworkIdlvi = null;
            if (homeworkId!=null && homeworkIdResultMap.get(homeworkId)!=null) {
                homeworkIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(homeworkIdResultMap.get(homeworkId),homeworkIdlvi);
            }
            response.setHomeworkIdObject(homeworkIdlvi);
            Long textbookId = textbookIdMap.get(entity.getId());

            LabelValueItem textbookIdlvi = null;
            if (textbookId!=null && textbookIdResultMap.get(textbookId)!=null) {
                textbookIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(textbookIdResultMap.get(textbookId),textbookIdlvi);
            }
            response.setTextbookIdObject(textbookIdlvi);
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
