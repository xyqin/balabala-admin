package com.newhead.rudderframework.modules.ruddermenu.base;

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
import com.newhead.rudderframework.modules.ruddermenu.base.repository.dao.RudderMenuMapper;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenu;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenuExample;
import com.newhead.rudderframework.modules.ruddermenu.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermission;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermissionExample;

import com.newhead.rudderframework.modules.rudderpermission.base.repository.dao.RudderPermissionMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractRudderMenuService extends SimpleTreeService {
    protected abstract RudderMenuMapper getMapper();

    protected abstract void saveOrUpdate(RudderMenu entity);

    @Autowired
    protected RudderPermissionMapper rudderpermissionMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public RudderMenu create(SimpleRudderMenuCreateRequest request) {
        RudderMenu entity = new RudderMenu();
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
    public RudderMenu update(SimpleRudderMenuUpdateRequest request) {
        RudderMenu entity = new RudderMenu();
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
    public SimpleRudderMenuGetDetailResponse getDetail(Long id) {
        RudderMenu entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleRudderMenuGetDetailResponse response = new SimpleRudderMenuGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        RudderMenu  parentIdEntity = getMapper().selectByPrimaryKey(Long.valueOf(entity.getParentId()));
        if (parentIdEntity!=null) {
            LabelValueItem parentIdObject = response.getParentIdObject();
            parentIdObject.setName("parentId");
            parentIdObject.setLabel(parentIdEntity.getRuddermenuName());
            parentIdObject.setValue(String.valueOf(entity.getParentId()));
            parentIdObject.setChecked(false);
        }
        RudderPermission  resourceIdEntity = rudderpermissionMapper.selectByPrimaryKey(Long.valueOf(entity.getResourceId()));
        if (resourceIdEntity!=null) {
            LabelValueItem resourceIdObject = response.getResourceIdObject();
            resourceIdObject.setName("resourceId");
            resourceIdObject.setLabel(resourceIdEntity.getRudderpermissionName());
            resourceIdObject.setValue(String.valueOf(entity.getResourceId()));
            resourceIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        RudderMenu entity = new RudderMenu();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleRudderMenuQueryResponse> queryList(SimpleRudderMenuQueryListRequest request) {
        List<SimpleRudderMenuQueryResponse> results = new ArrayList<SimpleRudderMenuQueryResponse>();

        //构造查询对象
        RudderMenuExample example = new RudderMenuExample();
        RudderMenuExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getRuddermenuName()!=null) {
            c.andRuddermenuNameLike("%"+request.getRuddermenuName()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleRudderMenuQueryResponse> queryPage(SimpleRudderMenuQueryPageRequest request) {
        //结果
        List<SimpleRudderMenuQueryResponse> results = new ArrayList<SimpleRudderMenuQueryResponse>();

        //构造查询对象
        RudderMenuExample example = new RudderMenuExample();
        RudderMenuExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getRuddermenuName()!=null) {
            c.andRuddermenuNameLike("%"+request.getRuddermenuName()+"%");
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
    private void convertEntityToResponse(List<RudderMenu> entitys,List<SimpleRudderMenuQueryResponse> results) {
        Map<Long,Long> parentIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> parentIdResultMap = Maps.newHashMap();

        Map<Long,Long> resourceIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> resourceIdResultMap = Maps.newHashMap();

       for(RudderMenu entity:entitys) {
            parentIdMap.put(entity.getId(),entity.getParentId());
            resourceIdMap.put(entity.getId(),entity.getResourceId());
        }
        RudderMenuExample parentIdExample = new RudderMenuExample();

        List<Long> parentIds = new ArrayList<>();
        parentIds.addAll(parentIdMap.values());
        if (parentIds.size()>0) {
            parentIdExample.createCriteria().andIdIn(parentIds);
        }
        List<RudderMenu> parentIdList = getMapper().selectByExample(parentIdExample);
        for(RudderMenu item:parentIdList) {
           LabelValueItem parentIdItem = new LabelValueItem();
           parentIdItem.setName("parentId");
           parentIdItem.setValue(String.valueOf(item.getId()));
           parentIdItem.setLabel(item.getRuddermenuName());
           parentIdResultMap.put(item.getId(),parentIdItem);
        }
        RudderPermissionExample resourceIdExample = new RudderPermissionExample();

        List<Long> resourceIds = new ArrayList<>();
        resourceIds.addAll(resourceIdMap.values());
        if (resourceIds.size()>0) {
            resourceIdExample.createCriteria().andIdIn(resourceIds);
        }
        List<RudderPermission>  resourceIdList = rudderpermissionMapper.selectByExample(resourceIdExample);
        for(RudderPermission item:resourceIdList) {
           LabelValueItem resourceIdItem = new LabelValueItem();
           resourceIdItem.setName("resourceId");
           resourceIdItem.setValue(String.valueOf(item.getId()));
           resourceIdItem.setLabel(item.getRudderpermissionName());
           resourceIdResultMap.put(item.getId(),resourceIdItem);
        }
        //第一组
        for(RudderMenu entity:entitys) {
            SimpleRudderMenuQueryResponse response = new SimpleRudderMenuQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long parentId = parentIdMap.get(entity.getId());

            LabelValueItem parentIdlvi = null;
            if (parentId!=null && parentIdResultMap.get(parentId)!=null) {
                parentIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(parentIdResultMap.get(parentId),parentIdlvi);
            }
            response.setParentIdObject(parentIdlvi);
            Long resourceId = resourceIdMap.get(entity.getId());

            LabelValueItem resourceIdlvi = null;
            if (resourceId!=null && resourceIdResultMap.get(resourceId)!=null) {
                resourceIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(resourceIdResultMap.get(resourceId),resourceIdlvi);
            }
            response.setResourceIdObject(resourceIdlvi);
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
     * @param ruddermenuName
     * @return
     */
    public RudderMenu existByRuddermenuName(String ruddermenuName) {
        //构造查询对象
        RudderMenuExample example = new RudderMenuExample();
        RudderMenuExample.Criteria c = example.createCriteria();
        c.andRuddermenuNameEqualTo(ruddermenuName);
        List<RudderMenu> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    protected TransitionTree getTransitionTree() {
        TransitionTree tree = new TransitionTree();
        tree.setUrl("/ruddermenu/gettree");

        SimpleRudderMenuQueryListRequest request = new SimpleRudderMenuQueryListRequest();
        List<SimpleRudderMenuQueryResponse> sources = queryList(request);

        for(SimpleRudderMenuQueryResponse response:sources) {
            ExtNode node = new ExtNode();
            node.setId(response.getId());
            node.getNode().setUrl(response.getUrl());
            node.getNode().setLeaf(true);
            node.getNode().setLabel(response.getRuddermenuName());
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
