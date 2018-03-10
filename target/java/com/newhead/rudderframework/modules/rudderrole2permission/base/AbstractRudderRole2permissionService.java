package com.newhead.rudderframework.modules.rudderrole2permission.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.services.BaseService;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Node;
import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.dao.RudderPermissionMapper;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermission;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermissionExample;
import com.newhead.rudderframework.modules.rudderrole.base.repository.dao.RudderRoleMapper;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRole;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRoleExample;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.dao.RudderRole2permissionMapper;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permission;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permissionExample;
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
public abstract class AbstractRudderRole2permissionService extends BaseService {
    protected abstract RudderRole2permissionMapper getMapper();

    protected abstract void saveOrUpdate(RudderRole2permission entity);

    @Autowired
    protected RudderPermissionMapper rudderpermissionMapper;
    @Autowired
    protected RudderRoleMapper rudderroleMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public RudderRole2permission create(SimpleRudderRole2permissionCreateRequest request) {
        RudderRole2permission entity = new RudderRole2permission();
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
    public RudderRole2permission update(SimpleRudderRole2permissionUpdateRequest request) {
        RudderRole2permission entity = new RudderRole2permission();
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
    public SimpleRudderRole2permissionGetDetailResponse getDetail(Long id) {
        RudderRole2permission entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleRudderRole2permissionGetDetailResponse response = new SimpleRudderRole2permissionGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        RudderPermission  rudderpermissionIdEntity = rudderpermissionMapper.selectByPrimaryKey(Long.valueOf(entity.getRudderpermissionId()));
        if (rudderpermissionIdEntity!=null) {
            LabelValueItem rudderpermissionIdObject = response.getRudderpermissionIdObject();
            rudderpermissionIdObject.setName("rudderpermissionId");
            rudderpermissionIdObject.setLabel(rudderpermissionIdEntity.getRudderpermissionName());
            rudderpermissionIdObject.setValue(String.valueOf(entity.getRudderpermissionId()));
            rudderpermissionIdObject.setChecked(false);
        }
        RudderRole  rudderroleIdEntity = rudderroleMapper.selectByPrimaryKey(Long.valueOf(entity.getRudderroleId()));
        if (rudderroleIdEntity!=null) {
            LabelValueItem rudderroleIdObject = response.getRudderroleIdObject();
            rudderroleIdObject.setName("rudderroleId");
            rudderroleIdObject.setLabel(rudderroleIdEntity.getRudderroleName());
            rudderroleIdObject.setValue(String.valueOf(entity.getRudderroleId()));
            rudderroleIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        RudderRole2permission entity = new RudderRole2permission();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleRudderRole2permissionQueryResponse> queryList(SimpleRudderRole2permissionQueryListRequest request) {
        List<SimpleRudderRole2permissionQueryResponse> results = new ArrayList<SimpleRudderRole2permissionQueryResponse>();

        //构造查询对象
        RudderRole2permissionExample example = new RudderRole2permissionExample();
        RudderRole2permissionExample.Criteria c = example.createCriteria();
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
    public Page<SimpleRudderRole2permissionQueryResponse> queryPage(SimpleRudderRole2permissionQueryPageRequest request) {
        //结果
        List<SimpleRudderRole2permissionQueryResponse> results = new ArrayList<SimpleRudderRole2permissionQueryResponse>();

        //构造查询对象
        RudderRole2permissionExample example = new RudderRole2permissionExample();
        RudderRole2permissionExample.Criteria c = example.createCriteria();
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
    private void convertEntityToResponse(List<RudderRole2permission> entitys,List<SimpleRudderRole2permissionQueryResponse> results) {
        Map<Long,Long> rudderpermissionIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> rudderpermissionIdResultMap = Maps.newHashMap();

        Map<Long,Long> rudderroleIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> rudderroleIdResultMap = Maps.newHashMap();

       for(RudderRole2permission entity:entitys) {
            rudderpermissionIdMap.put(entity.getId(),entity.getRudderpermissionId());
            rudderroleIdMap.put(entity.getId(),entity.getRudderroleId());
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
        //第一组
        for(RudderRole2permission entity:entitys) {
            SimpleRudderRole2permissionQueryResponse response = new SimpleRudderRole2permissionQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long rudderpermissionId = rudderpermissionIdMap.get(entity.getId());

            LabelValueItem rudderpermissionIdlvi = null;
            if (rudderpermissionId!=null && rudderpermissionIdResultMap.get(rudderpermissionId)!=null) {
                rudderpermissionIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(rudderpermissionIdResultMap.get(rudderpermissionId),rudderpermissionIdlvi);
            }
            response.setRudderpermissionIdObject(rudderpermissionIdlvi);
            Long rudderroleId = rudderroleIdMap.get(entity.getId());

            LabelValueItem rudderroleIdlvi = null;
            if (rudderroleId!=null && rudderroleIdResultMap.get(rudderroleId)!=null) {
                rudderroleIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(rudderroleIdResultMap.get(rudderroleId),rudderroleIdlvi);
            }
            response.setRudderroleIdObject(rudderroleIdlvi);
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
