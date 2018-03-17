package com.newhead.rudderframework.modules.ruddermenu.ext;

import com.newhead.rudderframework.modules.ruddermenu.base.AbstractRudderMenuService;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.dao.RudderMenuMapper;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenu;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2018年03月18日 02:48:17
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
