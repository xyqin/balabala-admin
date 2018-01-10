package com.newhead.rudderframework.modules.rudderrole2permission.ext;

import com.newhead.rudderframework.modules.rudderpermission.base.repository.dao.RudderPermissionMapper;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermission;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermissionExample;
import com.newhead.rudderframework.modules.rudderrole.base.repository.dao.RudderRoleMapper;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRole;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRoleExample;
import com.newhead.rudderframework.modules.rudderrole2permission.base.AbstractRudderRole2permissionService;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.dao.RudderRole2permissionMapper;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permission;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permissionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 2017年04月21日 03:58:59
 */
@Service
public class SimpleRudderRole2permissionService extends AbstractRudderRole2permissionService {

    @Autowired
    private RudderRole2permissionMapper mapper;

    @Autowired
    private RudderRoleMapper roleMapper;

    @Autowired
    private RudderPermissionMapper permissionMapper;

    @Override
    protected RudderRole2permissionMapper getMapper() {
        return this.mapper;
    }

    @Override
    protected void saveOrUpdate(RudderRole2permission entity) {

    }


    public Map<String,String>  getPermissionsOfAllRoles() {
        Map<String,String> results = new HashMap<>();
        List<RudderRole2permission> r2p = this.mapper.selectByExample(new RudderRole2permissionExample());

        List<RudderRole> roles = this.roleMapper.selectByExample(new RudderRoleExample());

        List<RudderPermission> permissions = this.permissionMapper.selectByExample(new RudderPermissionExample());

        //遍历系统URL
        Map<Long,RudderPermission> permissionMap = new HashMap<>();
        for(RudderPermission p:permissions) {
            if(!StringUtils.isEmpty(p.getUrl())) {
                permissionMap.put(p.getId(),p);
            }
        }

        //遍历系统juese
//        Map<Long,RudderRole> roleMap = new HashMap<>();
//        for(RudderRole r:roles) {
//            roleMap.put(r.getId(),r);
//        }

        Map<Long,List<Long>> r2pMap = new HashMap<>();
        for(RudderRole2permission r:r2p) {
            if (r2pMap.containsKey(r.getRudderpermissionId())) {
                List<Long> roleids = r2pMap.get(r.getRudderpermissionId());
                roleids.add(r.getRudderroleId());
            } else {
                List<Long> roleids = new ArrayList<>();
                roleids.add(r.getRudderroleId());
                r2pMap.put(r.getRudderpermissionId(),roleids);
            }
        }

        for(Map.Entry<Long,RudderPermission> entry:permissionMap.entrySet()) {
            RudderPermission p = entry.getValue();
            if (r2pMap.containsKey(p.getId())) {
                List<Long> roleids = r2pMap.get(p.getId());
                String rolestr = org.apache.commons.lang3.StringUtils.join(roleids, ",");
                results.put(p.getUrl(),rolestr);
            }
        }
        return results;
    }
}
