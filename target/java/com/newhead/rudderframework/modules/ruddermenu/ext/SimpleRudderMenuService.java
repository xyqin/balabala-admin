package com.newhead.rudderframework.modules.ruddermenu.ext;

import com.newhead.rudderframework.modules.ruddermenu.base.AbstractRudderMenuService;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.dao.RudderMenuMapper;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年12月28日 12:00:28
 */
@Api(tags = "菜单", description = "相关的API")
@Service
public class SimpleRudderMenuService extends AbstractRudderMenuService {

    @Autowired
    private RudderMenuMapper mapper;

    @Override
    protected RudderMenuMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(RudderMenu entity) {

    }
}
