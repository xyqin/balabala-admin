package com.newhead.barablah.modules.barablahposition.ext;

import com.newhead.barablah.modules.barablahposition.base.AbstractBarablahPositionService;
import com.newhead.barablah.modules.barablahposition.base.repository.dao.BarablahPositionMapper;
import com.newhead.barablah.modules.barablahposition.base.repository.entity.BarablahPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 广告位置表服务
 * 2018年03月22日 08:05:42
 */
@Api(tags = "广告位置表", description = "相关的API")
@Service
public class SimpleBarablahPositionService extends AbstractBarablahPositionService {

    @Autowired
    private BarablahPositionMapper mapper;

    @Override
    protected BarablahPositionMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahPosition entity) {

    }
}
