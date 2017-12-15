package com.newhead.rudderframework.modules.rudderuser2role.base;

import com.newhead.rudderframework.core.services.BaseService;
import com.newhead.rudderframework.core.web.component.pagination.Page;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.core.web.component.tree.ExtNode;
import com.newhead.rudderframework.core.web.component.tree.Node;
import com.newhead.rudderframework.core.web.component.tree.TransitionTree;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.dao.RudderUser2roleMapper;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity.RudderUser2role;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity.RudderUser2roleExample;
import com.newhead.rudderframework.modules.rudderuser2role.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUserExample;

import com.newhead.rudderframework.modules.rudderuser.base.repository.dao.RudderUserMapper;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRole;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRoleExample;

import com.newhead.rudderframework.modules.rudderrole.base.repository.dao.RudderRoleMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractRudderUser2roleService  extends BaseService {
    protected abstract RudderUser2roleMapper getMapper();

    protected abstract void saveOrUpdate(RudderUser2role entity);

    @Autowired
    protected RudderUserMapper rudderuserMapper;
    @Autowired
    protected RudderRoleMapper rudderroleMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public RudderUser2role create(SimpleRudderUser2roleCreateRequest request) {
        RudderUser2role entity = new RudderUser2role();
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
    public RudderUser2role update(SimpleRudderUser2roleUpdateRequest request) {
        RudderUser2role entity = new RudderUser2role();
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
    public SimpleRudderUser2roleGetDetailResponse getDetail(Long id) {
        RudderUser2role entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleRudderUser2roleGetDetailResponse response = new SimpleRudderUser2roleGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        RudderRole  rudderroleIdEntity = rudderroleMapper.selectByPrimaryKey(Long.valueOf(entity.getRudderroleId()));
        if (rudderroleIdEntity!=null) {
            LabelValueItem rudderroleIdObject = response.getRudderroleIdObject();
            rudderroleIdObject.setName("rudderroleId");
            rudderroleIdObject.setLabel(rudderroleIdEntity.getRudderroleName());
            rudderroleIdObject.setValue(String.valueOf(entity.getRudderroleId()));
            rudderroleIdObject.setChecked(false);
        }
        RudderUser  rudderuserIdEntity = rudderuserMapper.selectByPrimaryKey(Long.valueOf(entity.getRudderuserId()));
        if (rudderuserIdEntity!=null) {
            LabelValueItem rudderuserIdObject = response.getRudderuserIdObject();
            rudderuserIdObject.setName("rudderuserId");
            rudderuserIdObject.setLabel(rudderuserIdEntity.getRudderuserName());
            rudderuserIdObject.setValue(String.valueOf(entity.getRudderuserId()));
            rudderuserIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        RudderUser2role entity = new RudderUser2role();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleRudderUser2roleQueryResponse> queryList(SimpleRudderUser2roleQueryListRequest request) {
        List<SimpleRudderUser2roleQueryResponse> results = new ArrayList<SimpleRudderUser2roleQueryResponse>();

        //构造查询对象
        RudderUser2roleExample example = new RudderUser2roleExample();
        RudderUser2roleExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        example.setOrderByClause("id desc");
        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<List<SimpleRudderUser2roleQueryResponse>> queryPage(SimpleRudderUser2roleQueryPageRequest request) {
        //结果
        List<SimpleRudderUser2roleQueryResponse> results = new ArrayList<SimpleRudderUser2roleQueryResponse>();

        //构造查询对象
        RudderUser2roleExample example = new RudderUser2roleExample();
        RudderUser2roleExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        example.setPageSize(request.getSize());
        example.setStartRow(request.getOffset());
        example.setOrderByClause("id desc");
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
    private void convertEntityToResponse(List<RudderUser2role> entitys,List<SimpleRudderUser2roleQueryResponse> results) {
        Map<Long,Long> rudderroleIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> rudderroleIdResultMap = Maps.newHashMap();

        Map<Long,Long> rudderuserIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> rudderuserIdResultMap = Maps.newHashMap();

       for(RudderUser2role entity:entitys) {
            rudderroleIdMap.put(entity.getId(),entity.getRudderroleId());
            rudderuserIdMap.put(entity.getId(),entity.getRudderuserId());
        }
        RudderRoleExample rudderroleIdExample = new RudderRoleExample();

        List<Long> rudderroleIds = new ArrayList<>();
        rudderroleIds.addAll(rudderroleIdMap.values());
        if (rudderroleIds.size()>0) {
            rudderroleIdExample.createCriteria().andIdIn(rudderroleIds);
        }
        List<RudderRole>  rudderroleIdList = rudderroleMapper.selectByExample(rudderroleIdExample);
        for(RudderRole item:rudderroleIdList) {
           LabelValueItem rudderroleIdItem = new LabelValueItem();
           rudderroleIdItem.setName("rudderroleId");
           rudderroleIdItem.setValue(String.valueOf(item.getId()));
           rudderroleIdItem.setLabel(item.getRudderroleName());
           rudderroleIdResultMap.put(item.getId(),rudderroleIdItem);
        }
        RudderUserExample rudderuserIdExample = new RudderUserExample();

        List<Long> rudderuserIds = new ArrayList<>();
        rudderuserIds.addAll(rudderuserIdMap.values());
        if (rudderuserIds.size()>0) {
            rudderuserIdExample.createCriteria().andIdIn(rudderuserIds);
        }
        List<RudderUser>  rudderuserIdList = rudderuserMapper.selectByExample(rudderuserIdExample);
        for(RudderUser item:rudderuserIdList) {
           LabelValueItem rudderuserIdItem = new LabelValueItem();
           rudderuserIdItem.setName("rudderuserId");
           rudderuserIdItem.setValue(String.valueOf(item.getId()));
           rudderuserIdItem.setLabel(item.getRudderuserName());
           rudderuserIdResultMap.put(item.getId(),rudderuserIdItem);
        }
        //第一组
        for(RudderUser2role entity:entitys) {
            SimpleRudderUser2roleQueryResponse response = new SimpleRudderUser2roleQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long rudderroleId = rudderroleIdMap.get(entity.getId());

            LabelValueItem rudderroleIdlvi = null;
            if (rudderroleId!=null && rudderroleIdResultMap.get(rudderroleId)!=null) {
                rudderroleIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(rudderroleIdResultMap.get(rudderroleId),rudderroleIdlvi);
            }
            response.setRudderroleIdObject(rudderroleIdlvi);
            Long rudderuserId = rudderuserIdMap.get(entity.getId());

            LabelValueItem rudderuserIdlvi = null;
            if (rudderuserId!=null && rudderuserIdResultMap.get(rudderuserId)!=null) {
                rudderuserIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(rudderuserIdResultMap.get(rudderuserId),rudderuserIdlvi);
            }
            response.setRudderuserIdObject(rudderuserIdlvi);
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
