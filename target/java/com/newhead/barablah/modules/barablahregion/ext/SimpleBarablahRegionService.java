package com.newhead.barablah.modules.barablahregion.ext;

import com.newhead.barablah.modules.barablahregion.base.AbstractBarablahRegionService;
import com.newhead.barablah.modules.barablahregion.base.repository.dao.BarablahRegionMapper;
import com.newhead.barablah.modules.barablahregion.base.repository.entity.BarablahRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 地区服务
 * 2018年01月26日 03:39:47
 */
@Api(tags = "地区", description = "相关的API")
@Service
public class SimpleBarablahRegionService extends AbstractBarablahRegionService {

    @Autowired
    private BarablahRegionMapper mapper;

    @Override
    protected BarablahRegionMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahRegion entity) {

    }
}
