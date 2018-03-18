package com.newhead.rudderframework.modules.rudderrole.ext;

import com.newhead.rudderframework.modules.rudderrole.base.AbstractRudderRoleService;
import com.newhead.rudderframework.modules.rudderrole.base.repository.dao.RudderRoleMapper;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 角色服务
 * 2018年03月18日 05:08:24
 */
@Api(tags = "角色", description = "相关的API")
@Service
public class SimpleRudderRoleService extends AbstractRudderRoleService {

    @Autowired
    private RudderRoleMapper mapper;

    @Override
    protected RudderRoleMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(RudderRole entity) {

    }
}
