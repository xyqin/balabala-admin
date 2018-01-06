package com.newhead.balabala.modules.balabalaregion.ext;

import com.newhead.balabala.modules.balabalaregion.base.AbstractBalabalaRegionService;
import com.newhead.balabala.modules.balabalaregion.base.repository.dao.BalabalaRegionMapper;
import com.newhead.balabala.modules.balabalaregion.base.repository.entity.BalabalaRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 地区服务
 * 2018年01月06日 09:19:38
 */
@Api(tags = "地区", description = "相关的API")
@Service
public class SimpleBalabalaRegionService extends AbstractBalabalaRegionService {

    @Autowired
    private BalabalaRegionMapper mapper;

    @Override
    protected BalabalaRegionMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaRegion entity) {

    }
}
