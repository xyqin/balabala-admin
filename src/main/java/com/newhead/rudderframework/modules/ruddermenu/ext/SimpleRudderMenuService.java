package com.newhead.rudderframework.modules.ruddermenu.ext;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.component.tree.ExtNode;
import com.newhead.rudderframework.core.web.component.tree.TransitionTree;
import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.modules.ruddermenu.base.AbstractRudderMenuService;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.dao.RudderMenuMapper;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenu;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenuExample;
import com.newhead.rudderframework.modules.ruddermenu.ext.protocol.SimpleRudderMenuQueryListRequest;
import com.newhead.rudderframework.modules.ruddermenu.ext.protocol.SimpleRudderMenuQueryResponse;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.dao.RudderMenu2permissionMapper;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permission;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permissionExample;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermission;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermissionExample;
import com.newhead.rudderframework.modules.rudderrole.base.repository.dao.RudderRoleMapper;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRole;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.dao.RudderRole2permissionMapper;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permission;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permissionExample;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.dao.RudderUser2roleMapper;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity.RudderUser2role;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity.RudderUser2roleExample;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年12月23日 02:12:57
 */
@Api(tags = "菜单", description = "相关的API")
@Service
public class SimpleRudderMenuService extends AbstractRudderMenuService {

    @Autowired
    private RudderMenuMapper mapper;

    @Autowired
    private RudderUser2roleMapper user2roleMapper;

    @Autowired
    private RudderRoleMapper roleMapper;

    @Autowired
    private RudderRole2permissionMapper role2permissionMapper;

    @Autowired
    private RudderMenu2permissionMapper menu2permissionMapper;

    @Override
    protected RudderMenuMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(RudderMenu entity) {

    }

    @Override
    protected TransitionTree getTransitionTree() {
        TransitionTree tree = new TransitionTree();
        tree.setUrl("/ruddermenu/gettree");

        // 根据当前登录用户获取角色菜单权限
        RudderUser2roleExample user2roleExample = new RudderUser2roleExample();
        user2roleExample.createCriteria()
                .andRudderuserIdEqualTo(getCurrentUser().getId())
                .andVisibleEqualTo(Boolean.TRUE)
                .andDeletedEqualTo(Boolean.FALSE);
        List<RudderUser2role> user2roles = user2roleMapper.selectByExample(user2roleExample);
        List<RudderRole> roles = Lists.newArrayList();

        for (RudderUser2role user2role : user2roles) {
            RudderRole role = roleMapper.selectByPrimaryKey(user2role.getRudderroleId());
            if (Objects.nonNull(role)) {
                roles.add(role);
            }
        }

        boolean isSysadmin = false;
        for (RudderRole role : roles) {
            if ("sysadmin".equals(role.getCode())) {
                isSysadmin = true;
                break;
            }
        }

        List<SimpleRudderMenuQueryResponse> sources = Lists.newArrayList();

        if (isSysadmin) {
            // 超级管理员获取所以菜单
            SimpleRudderMenuQueryListRequest request = new SimpleRudderMenuQueryListRequest();
            sources = queryList(request);
        } else {
            // 根据角色获取对应菜单
            sources = queryListByRoles(roles);
        }

        for (SimpleRudderMenuQueryResponse response : sources) {
            ExtNode node = new ExtNode();
            node.setId(response.getId());
            node.getNode().setUrl(response.getUrl());
            node.getNode().setLeaf(true);
            node.getNode().setLabel(response.getRuddermenuName());
            node.getNode().setValue(String.valueOf(response.getId()));
            node.getNode().setSelected(false);
            if (response.getParentIdObject() != null) {
                node.getNode().setParentId(response.getParentIdObject().getValue());
            } else {
                node.getNode().setParentId("0");
            }
            tree.getNdoes().add(node);
        }
        return tree;
    }

    protected List<SimpleRudderMenuQueryResponse> queryListByRoles(List<RudderRole> roles) {
        List<SimpleRudderMenuQueryResponse> results = new ArrayList<>();

        // 根据角色获取角色权限关系
        RudderRole2permissionExample role2permissionExample = new RudderRole2permissionExample();
        role2permissionExample.createCriteria()
                .andRudderroleIdIn(Lists.transform(roles, RudderRole::getId))
                .andVisibleEqualTo(Boolean.TRUE)
                .andDeletedEqualTo(Boolean.FALSE);
        List<RudderRole2permission> role2permissions = role2permissionMapper.selectByExample(role2permissionExample);

        // 根据角色权限关系获取菜单权限列表
        RudderMenu2permissionExample menu2permissionExample = new RudderMenu2permissionExample();
        menu2permissionExample.createCriteria()
                .andRudderpermissionIdIn(Lists.transform(role2permissions, RudderRole2permission::getRudderpermissionId))
                .andVisibleEqualTo(Boolean.TRUE)
                .andDeletedEqualTo(Boolean.FALSE);
        List<RudderMenu2permission> menu2permissions = menu2permissionMapper.selectByExample(menu2permissionExample);

        // 根据菜单权限关系获取菜单列表
        RudderMenuExample menuExample = new RudderMenuExample();
        menuExample.createCriteria()
                .andIdIn(Lists.transform(menu2permissions, RudderMenu2permission::getRuddermenuId))
                .andVisibleEqualTo(Boolean.TRUE)
                .andDeletedEqualTo(Boolean.FALSE);
        List<RudderMenu> menus = getMapper().selectByExample(menuExample);

        //构造查询对象
        convertEntityToResponse(menus, results);
        return results;
    }

    private void convertEntityToResponse(List<RudderMenu> entitys, List<SimpleRudderMenuQueryResponse> results) {
        Map<Long, Long> parentIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> parentIdResultMap = Maps.newHashMap();

        Map<Long, Long> resourceIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> resourceIdResultMap = Maps.newHashMap();

        for (RudderMenu entity : entitys) {
            parentIdMap.put(entity.getId(), entity.getParentId());
            resourceIdMap.put(entity.getId(), entity.getResourceId());
        }
        RudderMenuExample parentIdExample = new RudderMenuExample();

        List<Long> parentIds = new ArrayList<>();
        parentIds.addAll(parentIdMap.values());
        if (parentIds.size() > 0) {
            parentIdExample.createCriteria().andIdIn(parentIds);
        }
        List<RudderMenu> parentIdList = getMapper().selectByExample(parentIdExample);
        for (RudderMenu item : parentIdList) {
            LabelValueItem parentIdItem = new LabelValueItem();
            parentIdItem.setName("parentId");
            parentIdItem.setValue(String.valueOf(item.getId()));
            parentIdItem.setLabel(item.getRuddermenuName());
            parentIdResultMap.put(item.getId(), parentIdItem);
        }
        RudderPermissionExample resourceIdExample = new RudderPermissionExample();

        List<Long> resourceIds = new ArrayList<>();
        resourceIds.addAll(resourceIdMap.values());
        if (resourceIds.size() > 0) {
            resourceIdExample.createCriteria().andIdIn(resourceIds);
        }
        List<RudderPermission> resourceIdList = rudderpermissionMapper.selectByExample(resourceIdExample);
        for (RudderPermission item : resourceIdList) {
            LabelValueItem resourceIdItem = new LabelValueItem();
            resourceIdItem.setName("resourceId");
            resourceIdItem.setValue(String.valueOf(item.getId()));
            resourceIdItem.setLabel(item.getRudderpermissionName());
            resourceIdResultMap.put(item.getId(), resourceIdItem);
        }
        //第一组
        for (RudderMenu entity : entitys) {
            SimpleRudderMenuQueryResponse response = new SimpleRudderMenuQueryResponse();
            BeanUtils.copyProperties(entity, response);
            Long parentId = parentIdMap.get(entity.getId());

            LabelValueItem parentIdlvi = null;
            if (parentId != null && parentIdResultMap.get(parentId) != null) {
                parentIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(parentIdResultMap.get(parentId), parentIdlvi);
            }
            response.setParentIdObject(parentIdlvi);
            Long resourceId = resourceIdMap.get(entity.getId());

            LabelValueItem resourceIdlvi = null;
            if (resourceId != null && resourceIdResultMap.get(resourceId) != null) {
                resourceIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(resourceIdResultMap.get(resourceId), resourceIdlvi);
            }
            response.setResourceIdObject(resourceIdlvi);
            results.add(response);
        }
    }

}
