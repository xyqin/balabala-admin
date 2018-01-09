package com.newhead.balabala.modules.balabalaposition.ext;

import com.newhead.balabala.modules.balabalaposition.base.AbstractBalabalaPositionService;
import com.newhead.balabala.modules.balabalaposition.base.repository.dao.BalabalaPositionMapper;
import com.newhead.balabala.modules.balabalaposition.base.repository.entity.BalabalaPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 广告位置表服务
 * 2018年01月09日 04:35:22
 */
@Api(tags = "广告位置表", description = "相关的API")
@Service
public class SimpleBalabalaPositionService extends AbstractBalabalaPositionService {

    @Autowired
    private BalabalaPositionMapper mapper;

    @Override
    protected BalabalaPositionMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaPosition entity) {

    }
}
