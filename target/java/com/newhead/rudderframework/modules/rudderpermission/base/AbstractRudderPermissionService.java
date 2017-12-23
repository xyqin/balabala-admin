package com.newhead.rudderframework.modules.rudderpermission.base;

import com.newhead.rudderframework.core.services.SimpleTreeService;
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
import com.newhead.rudderframework.modules.rudderpermission.base.repository.dao.RudderPermissionMapper;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermission;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermissionExample;
import com.newhead.rudderframework.modules.rudderpermission.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractRudderPermissionService extends SimpleTreeService {
    protected abstract RudderPermissionMapper getMapper();

    protected abstract void saveOrUpdate(RudderPermission entity);


    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public RudderPermission create(SimpleRudderPermissionCreateRequest request) {
        RudderPermission entity = new RudderPermission();
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
    public RudderPermission update(SimpleRudderPermissionUpdateRequest request) {
        RudderPermission entity = new RudderPermission();
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
    public SimpleRudderPermissionGetDetailResponse getDetail(Long id) {
        RudderPermission entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleRudderPermissionGetDetailResponse response = new SimpleRudderPermissionGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        RudderPermission  parentIdEntity = getMapper().selectByPrimaryKey(Long.valueOf(entity.getParentId()));
        if (parentIdEntity!=null) {
            LabelValueItem parentIdObject = response.getParentIdObject();
            parentIdObject.setName("parentId");
            parentIdObject.setLabel(parentIdEntity.getRudderpermissionName());
            parentIdObject.setValue(String.valueOf(entity.getParentId()));
            parentIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        RudderPermission entity = new RudderPermission();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleRudderPermissionQueryResponse> queryList(SimpleRudderPermissionQueryListRequest request) {
        List<SimpleRudderPermissionQueryResponse> results = new ArrayList<SimpleRudderPermissionQueryResponse>();

        //构造查询对象
        RudderPermissionExample example = new RudderPermissionExample();
        RudderPermissionExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getRudderpermissionName()!=null) {
            c.andRudderpermissionNameLike("%"+request.getRudderpermissionName()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleRudderPermissionQueryResponse> queryPage(SimpleRudderPermissionQueryPageRequest request) {
        //结果
        List<SimpleRudderPermissionQueryResponse> results = new ArrayList<SimpleRudderPermissionQueryResponse>();

        //构造查询对象
        RudderPermissionExample example = new RudderPermissionExample();
        RudderPermissionExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getRudderpermissionName()!=null) {
            c.andRudderpermissionNameLike("%"+request.getRudderpermissionName()+"%");
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
    private void convertEntityToResponse(List<RudderPermission> entitys,List<SimpleRudderPermissionQueryResponse> results) {
        Map<Long,Long> parentIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> parentIdResultMap = Maps.newHashMap();

       for(RudderPermission entity:entitys) {
            parentIdMap.put(entity.getId(),entity.getParentId());
        }
        RudderPermissionExample parentIdExample = new RudderPermissionExample();

        List<Long> parentIds = new ArrayList<>();
        parentIds.addAll(parentIdMap.values());
        if (parentIds.size()>0) {
            parentIdExample.createCriteria().andIdIn(parentIds);
        }
        List<RudderPermission> parentIdList = getMapper().selectByExample(parentIdExample);
        for(RudderPermission item:parentIdList) {
           LabelValueItem parentIdItem = new LabelValueItem();
           parentIdItem.setName("parentId");
           parentIdItem.setValue(String.valueOf(item.getId()));
           parentIdItem.setLabel(item.getRudderpermissionName());
           parentIdResultMap.put(item.getId(),parentIdItem);
        }
        //第一组
        for(RudderPermission entity:entitys) {
            SimpleRudderPermissionQueryResponse response = new SimpleRudderPermissionQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long parentId = parentIdMap.get(entity.getId());

            LabelValueItem parentIdlvi = null;
            if (parentId!=null && parentIdResultMap.get(parentId)!=null) {
                parentIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(parentIdResultMap.get(parentId),parentIdlvi);
            }
            response.setParentIdObject(parentIdlvi);
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
     * @param rudderpermissionName
     * @return
     */
    public RudderPermission existByRudderpermissionName(String rudderpermissionName) {
        //构造查询对象
        RudderPermissionExample example = new RudderPermissionExample();
        RudderPermissionExample.Criteria c = example.createCriteria();
        c.andRudderpermissionNameEqualTo(rudderpermissionName);
        List<RudderPermission> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    protected TransitionTree getTransitionTree() {
        TransitionTree tree = new TransitionTree();
        tree.setUrl("/rudderpermission/gettree");

        SimpleRudderPermissionQueryListRequest request = new SimpleRudderPermissionQueryListRequest();
        List<SimpleRudderPermissionQueryResponse> sources = queryList(request);

        for(SimpleRudderPermissionQueryResponse response:sources) {
            ExtNode node = new ExtNode();
            node.setId(response.getId());
            node.getNode().setUrl(response.getUrl());
            node.getNode().setLeaf(true);
            node.getNode().setLabel(response.getRudderpermissionName());
            node.getNode().setValue(String.valueOf(response.getId()));
            node.getNode().setSelected(false);
            if (response.getParentIdObject()!=null) {
                node.getNode().setParentId(response.getParentIdObject().getValue());
            } else {
                node.getNode().setParentId("0");
            }
            tree.getNdoes().add(node);
        }
        return tree;
    }




}
