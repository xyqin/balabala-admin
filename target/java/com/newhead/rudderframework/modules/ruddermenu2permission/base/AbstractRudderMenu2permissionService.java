package com.newhead.rudderframework.modules.ruddermenu2permission.base;

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
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.dao.RudderMenu2permissionMapper;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permission;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permissionExample;
import com.newhead.rudderframework.modules.ruddermenu2permission.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermission;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermissionExample;

import com.newhead.rudderframework.modules.rudderpermission.base.repository.dao.RudderPermissionMapper;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenu;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenuExample;

import com.newhead.rudderframework.modules.ruddermenu.base.repository.dao.RudderMenuMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractRudderMenu2permissionService extends BaseService {
    protected abstract RudderMenu2permissionMapper getMapper();

    protected abstract void saveOrUpdate(RudderMenu2permission entity);

    @Autowired
    protected RudderPermissionMapper rudderpermissionMapper;
    @Autowired
    protected RudderMenuMapper ruddermenuMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public RudderMenu2permission create(SimpleRudderMenu2permissionCreateRequest request) {
        RudderMenu2permission entity = new RudderMenu2permission();
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
    public RudderMenu2permission update(SimpleRudderMenu2permissionUpdateRequest request) {
        RudderMenu2permission entity = new RudderMenu2permission();
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
    public SimpleRudderMenu2permissionGetDetailResponse getDetail(Long id) {
        RudderMenu2permission entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleRudderMenu2permissionGetDetailResponse response = new SimpleRudderMenu2permissionGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        RudderMenu  ruddermenuIdEntity = ruddermenuMapper.selectByPrimaryKey(Long.valueOf(entity.getRuddermenuId()));
        if (ruddermenuIdEntity!=null) {
            LabelValueItem ruddermenuIdObject = response.getRuddermenuIdObject();
            ruddermenuIdObject.setName("ruddermenuId");
            ruddermenuIdObject.setLabel(ruddermenuIdEntity.getRudderMenuName());
            ruddermenuIdObject.setValue(String.valueOf(entity.getRuddermenuId()));
            ruddermenuIdObject.setChecked(false);
        }
        RudderPermission  rudderpermissionIdEntity = rudderpermissionMapper.selectByPrimaryKey(Long.valueOf(entity.getRudderpermissionId()));
        if (rudderpermissionIdEntity!=null) {
            LabelValueItem rudderpermissionIdObject = response.getRudderpermissionIdObject();
            rudderpermissionIdObject.setName("rudderpermissionId");
            rudderpermissionIdObject.setLabel(rudderpermissionIdEntity.getRudderpermissionName());
            rudderpermissionIdObject.setValue(String.valueOf(entity.getRudderpermissionId()));
            rudderpermissionIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        RudderMenu2permission entity = new RudderMenu2permission();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleRudderMenu2permissionQueryResponse> queryList(SimpleRudderMenu2permissionQueryListRequest request) {
        List<SimpleRudderMenu2permissionQueryResponse> results = new ArrayList<SimpleRudderMenu2permissionQueryResponse>();

        //构造查询对象
        RudderMenu2permissionExample example = new RudderMenu2permissionExample();
        RudderMenu2permissionExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleRudderMenu2permissionQueryResponse> queryPage(SimpleRudderMenu2permissionQueryPageRequest request) {
        //结果
        List<SimpleRudderMenu2permissionQueryResponse> results = new ArrayList<SimpleRudderMenu2permissionQueryResponse>();

        //构造查询对象
        RudderMenu2permissionExample example = new RudderMenu2permissionExample();
        RudderMenu2permissionExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
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
    private void convertEntityToResponse(List<RudderMenu2permission> entitys,List<SimpleRudderMenu2permissionQueryResponse> results) {
        Map<Long,Long> ruddermenuIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> ruddermenuIdResultMap = Maps.newHashMap();

        Map<Long,Long> rudderpermissionIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> rudderpermissionIdResultMap = Maps.newHashMap();

       for(RudderMenu2permission entity:entitys) {
            ruddermenuIdMap.put(entity.getId(),entity.getRuddermenuId());
            rudderpermissionIdMap.put(entity.getId(),entity.getRudderpermissionId());
        }
        RudderMenuExample ruddermenuIdExample = new RudderMenuExample();

        List<Long> ruddermenuIds = new ArrayList<>();
        ruddermenuIds.addAll(ruddermenuIdMap.values());
        if (ruddermenuIds.size()>0) {
            ruddermenuIdExample.createCriteria().andIdIn(ruddermenuIds);
        }
        List<RudderMenu>  ruddermenuIdList = ruddermenuMapper.selectByExample(ruddermenuIdExample);
        for(RudderMenu item:ruddermenuIdList) {
           LabelValueItem ruddermenuIdItem = new LabelValueItem();
           ruddermenuIdItem.setName("ruddermenuId");
           ruddermenuIdItem.setValue(String.valueOf(item.getId()));
           ruddermenuIdItem.setLabel(item.getRudderMenuName());
           ruddermenuIdResultMap.put(item.getId(),ruddermenuIdItem);
        }
        RudderPermissionExample rudderpermissionIdExample = new RudderPermissionExample();

        List<Long> rudderpermissionIds = new ArrayList<>();
        rudderpermissionIds.addAll(rudderpermissionIdMap.values());
        if (rudderpermissionIds.size()>0) {
            rudderpermissionIdExample.createCriteria().andIdIn(rudderpermissionIds);
        }
        List<RudderPermission>  rudderpermissionIdList = rudderpermissionMapper.selectByExample(rudderpermissionIdExample);
        for(RudderPermission item:rudderpermissionIdList) {
           LabelValueItem rudderpermissionIdItem = new LabelValueItem();
           rudderpermissionIdItem.setName("rudderpermissionId");
           rudderpermissionIdItem.setValue(String.valueOf(item.getId()));
           rudderpermissionIdItem.setLabel(item.getRudderpermissionName());
           rudderpermissionIdResultMap.put(item.getId(),rudderpermissionIdItem);
        }
        //第一组
        for(RudderMenu2permission entity:entitys) {
            SimpleRudderMenu2permissionQueryResponse response = new SimpleRudderMenu2permissionQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long ruddermenuId = ruddermenuIdMap.get(entity.getId());

            LabelValueItem ruddermenuIdlvi = null;
            if (ruddermenuId!=null && ruddermenuIdResultMap.get(ruddermenuId)!=null) {
                ruddermenuIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(ruddermenuIdResultMap.get(ruddermenuId),ruddermenuIdlvi);
            }
            response.setRuddermenuIdObject(ruddermenuIdlvi);
            Long rudderpermissionId = rudderpermissionIdMap.get(entity.getId());

            LabelValueItem rudderpermissionIdlvi = null;
            if (rudderpermissionId!=null && rudderpermissionIdResultMap.get(rudderpermissionId)!=null) {
                rudderpermissionIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(rudderpermissionIdResultMap.get(rudderpermissionId),rudderpermissionIdlvi);
            }
            response.setRudderpermissionIdObject(rudderpermissionIdlvi);
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
