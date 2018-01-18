package com.newhead.barablah.modules.barablahteacherhomework.base;

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
import com.newhead.barablah.modules.barablahteacherhomework.base.repository.dao.BarablahTeacherHomeworkMapper;
import com.newhead.barablah.modules.barablahteacherhomework.base.repository.entity.BarablahTeacherHomework;
import com.newhead.barablah.modules.barablahteacherhomework.base.repository.entity.BarablahTeacherHomeworkExample;
import com.newhead.barablah.modules.barablahteacherhomework.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


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
public abstract class AbstractBarablahTeacherHomeworkService extends BaseService {
    protected abstract BarablahTeacherHomeworkMapper getMapper();

    protected abstract void saveOrUpdate(BarablahTeacherHomework entity);

    @Autowired
    protected BarablahTeacherMapper barablahteacherMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahTeacherHomework create(SimpleBarablahTeacherHomeworkCreateRequest request) {
        BarablahTeacherHomework entity = new BarablahTeacherHomework();
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
    public BarablahTeacherHomework update(SimpleBarablahTeacherHomeworkUpdateRequest request) {
        BarablahTeacherHomework entity = new BarablahTeacherHomework();
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
    public SimpleBarablahTeacherHomeworkGetDetailResponse getDetail(Long id) {
        BarablahTeacherHomework entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahTeacherHomeworkGetDetailResponse response = new SimpleBarablahTeacherHomeworkGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahTeacher  teacherIdEntity = barablahteacherMapper.selectByPrimaryKey(Long.valueOf(entity.getTeacherId()));
        if (teacherIdEntity!=null) {
            LabelValueItem teacherIdObject = response.getTeacherIdObject();
            teacherIdObject.setName("teacherId");
            teacherIdObject.setLabel(teacherIdEntity.getFullName());
            teacherIdObject.setValue(String.valueOf(entity.getTeacherId()));
            teacherIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahTeacherHomework entity = new BarablahTeacherHomework();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahTeacherHomeworkQueryResponse> queryList(SimpleBarablahTeacherHomeworkQueryListRequest request) {
        List<SimpleBarablahTeacherHomeworkQueryResponse> results = new ArrayList<SimpleBarablahTeacherHomeworkQueryResponse>();

        //构造查询对象
        BarablahTeacherHomeworkExample example = new BarablahTeacherHomeworkExample();
        BarablahTeacherHomeworkExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahTeacherHomeworkQueryResponse> queryPage(SimpleBarablahTeacherHomeworkQueryPageRequest request) {
        //结果
        List<SimpleBarablahTeacherHomeworkQueryResponse> results = new ArrayList<SimpleBarablahTeacherHomeworkQueryResponse>();

        //构造查询对象
        BarablahTeacherHomeworkExample example = new BarablahTeacherHomeworkExample();
        BarablahTeacherHomeworkExample.Criteria c = example.createCriteria();
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
    private void convertEntityToResponse(List<BarablahTeacherHomework> entitys,List<SimpleBarablahTeacherHomeworkQueryResponse> results) {
        Map<Long,Long> teacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> teacherIdResultMap = Maps.newHashMap();

       for(BarablahTeacherHomework entity:entitys) {
            teacherIdMap.put(entity.getId(),entity.getTeacherId());
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
        //第一组
        for(BarablahTeacherHomework entity:entitys) {
            SimpleBarablahTeacherHomeworkQueryResponse response = new SimpleBarablahTeacherHomeworkQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long teacherId = teacherIdMap.get(entity.getId());

            LabelValueItem teacherIdlvi = null;
            if (teacherId!=null && teacherIdResultMap.get(teacherId)!=null) {
                teacherIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(teacherIdResultMap.get(teacherId),teacherIdlvi);
            }
            response.setTeacherIdObject(teacherIdlvi);
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

    /**
     * 是否存在同名数据
     * @param homeworkName
     * @return
     */
    public BarablahTeacherHomework existByHomeworkName(String homeworkName) {
        //构造查询对象
        BarablahTeacherHomeworkExample example = new BarablahTeacherHomeworkExample();
        BarablahTeacherHomeworkExample.Criteria c = example.createCriteria();
        c.andHomeworkNameEqualTo(homeworkName);
        List<BarablahTeacherHomework> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }





}
