package com.newhead.balabala.modules.balabalamemberpointlog.ext;

import com.newhead.balabala.modules.balabalamemberpointlog.base.AbstractBalabalaMemberPointLogService;
import com.newhead.balabala.modules.balabalamemberpointlog.base.repository.dao.BalabalaMemberPointLogMapper;
import com.newhead.balabala.modules.balabalamemberpointlog.base.repository.entity.BalabalaMemberPointLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员积分日志表服务
 * 2018年01月17日 05:42:34
 */
@Api(tags = "会员积分日志表", description = "相关的API")
@Service
public class SimpleBalabalaMemberPointLogService extends AbstractBalabalaMemberPointLogService {

    @Autowired
    private BalabalaMemberPointLogMapper mapper;

    @Override
    protected BalabalaMemberPointLogMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaMemberPointLog entity) {

    }
}
