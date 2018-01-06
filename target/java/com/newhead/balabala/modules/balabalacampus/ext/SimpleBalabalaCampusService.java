package com.newhead.balabala.modules.balabalacampus.ext;

import com.newhead.balabala.modules.balabalacampus.base.AbstractBalabalaCampusService;
import com.newhead.balabala.modules.balabalacampus.base.repository.dao.BalabalaCampusMapper;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 校区服务
 * 2018年01月06日 09:19:38
 */
@Api(tags = "校区", description = "相关的API")
@Service
public class SimpleBalabalaCampusService extends AbstractBalabalaCampusService {

    @Autowired
    private BalabalaCampusMapper mapper;

    @Override
    protected BalabalaCampusMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaCampus entity) {

    }
}
