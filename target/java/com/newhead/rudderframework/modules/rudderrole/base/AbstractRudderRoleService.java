package com.newhead.rudderframework.modules.rudderrole.base;

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
import com.newhead.rudderframework.modules.rudderrole.base.repository.dao.RudderRoleMapper;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRole;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRoleExample;
import com.newhead.rudderframework.modules.rudderrole.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.newhead.rudderframework.modules.rudderpermission.ext.SimpleRudderPermissionService;

import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permission;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permissionExample;

import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.dao.RudderRole2permissionMapper;
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
public abstract class AbstractRudderRoleService extends BaseService {
    @Autowired
    private SimpleRudderPermissionService rudderPermissionService;
    protected abstract RudderRoleMapper getMapper();

    protected abstract void saveOrUpdate(RudderRole entity);

    @Autowired
    protected RudderRole2permissionMapper rudderrole2permissionMapper;
    @Autowired
    protected RudderPermissionMapper rudderpermissionMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public RudderRole create(SimpleRudderRoleCreateRequest request) {
        RudderRole entity = new RudderRole();
        BeanUtils.copyProperties(request,entity);
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());
        entity.setDeleted(false);
        entity.setCreator(getCurrentUser().getId());
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().insert(entity);

        //添加关系
            addRudderRole2permission(request.getRudderPermissions(),entity.getId());
        return entity;
    }

    /**
     * 修改
     * @param request
     * @return
     */
    @Transactional
    public RudderRole update(SimpleRudderRoleUpdateRequest request) {
        RudderRole entity = new RudderRole();
        BeanUtils.copyProperties(request,entity);
        entity.setUpdatedAt(new Date());
        entity.setDeleted(false);
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().updateByPrimaryKeySelective(entity);

        //删除关系
        RudderRole2permissionExample example = new RudderRole2permissionExample();
        example.createCriteria().andRudderroleIdEqualTo(entity.getId());
        rudderrole2permissionMapper.deleteByExample(example);
        //添加关系
        addRudderRole2permission(request.getRudderPermissions(),entity.getId());
        return entity;
    }

    /**
     * 查看菜单详情
     * @param id
     * @return
     */
    public SimpleRudderRoleGetDetailResponse getDetail(Long id) {
        RudderRole entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleRudderRoleGetDetailResponse response = new SimpleRudderRoleGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        RudderRole entity = new RudderRole();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleRudderRoleQueryResponse> queryList(SimpleRudderRoleQueryListRequest request) {
        List<SimpleRudderRoleQueryResponse> results = new ArrayList<SimpleRudderRoleQueryResponse>();

        //构造查询对象
        RudderRoleExample example = new RudderRoleExample();
        RudderRoleExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        if (request.getRudderroleName()!=null) {
            c.andRudderroleNameLike("%"+request.getRudderroleName()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleRudderRoleQueryResponse> queryPage(SimpleRudderRoleQueryPageRequest request) {
        //结果
        List<SimpleRudderRoleQueryResponse> results = new ArrayList<SimpleRudderRoleQueryResponse>();

        //构造查询对象
        RudderRoleExample example = new RudderRoleExample();
        RudderRoleExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getRudderroleName()!=null) {
            c.andRudderroleNameLike("%"+request.getRudderroleName()+"%");
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
    private void convertEntityToResponse(List<RudderRole> entitys,List<SimpleRudderRoleQueryResponse> results) {
       for(RudderRole entity:entitys) {
        }
        //第一组
        for(RudderRole entity:entitys) {
            SimpleRudderRoleQueryResponse response = new SimpleRudderRoleQueryResponse();
            BeanUtils.copyProperties(entity,response);
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
     * @param rudderroleName
     * @return
     */
    public RudderRole existByRudderroleName(String rudderroleName) {
        //构造查询对象
        RudderRoleExample example = new RudderRoleExample();
        RudderRoleExample.Criteria c = example.createCriteria();
        c.andRudderroleNameEqualTo(rudderroleName);
        List<RudderRole> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }
    /**
     * 是否存在同名数据
     * @param code
     * @return
     */
    public RudderRole existByCode(String code) {
        //构造查询对象
        RudderRoleExample example = new RudderRoleExample();
        RudderRoleExample.Criteria c = example.createCriteria();
        c.andCodeEqualTo(code);
        List<RudderRole> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }


    /**
     *  添加引用对象
     */
    private void addRudderRole2permission(String[] str,Long rmid) {
        if (str==null || str.length==0) return;
        for(String id:str) {
            RudderRole2permission m2n = new RudderRole2permission();
            m2n.setVisible(true);
            m2n.setCreatedAt(new Date());
            m2n.setDeleted(false);
            m2n.setRudderpermissionId(Long.valueOf(id));
            m2n.setUpdatedAt(new Date());
            m2n.setRudderroleId(rmid);
            rudderrole2permissionMapper.insert(m2n);
        }
    }

    /**
     * 获得引用对象集
     * @param rmid
     * @return results
     */
    public Tree getRudderPermissions(Long rmid) {
        Map<Long,Boolean> selectMap = Maps.newHashMap();
        if (rmid!=null && rmid>0) {
            RudderRole2permissionExample example = new RudderRole2permissionExample();
            example.createCriteria().andRudderroleIdEqualTo(rmid);
            List<RudderRole2permission> r2ps = rudderrole2permissionMapper.selectByExample(example);
            for(RudderRole2permission r2p:r2ps) {
                selectMap.put(r2p.getId(),true);
            }
        }
        //遍历
        Tree tree = rudderPermissionService.getTree();
        traversalTree(tree.getRootNode(),selectMap);
        return tree;
    }


}
