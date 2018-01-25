package com.newhead.barablah.modules.barablahmemberpointlog.ext;

import com.newhead.barablah.modules.barablahmemberpointlog.base.AbstractBarablahMemberPointLogService;
import com.newhead.barablah.modules.barablahmemberpointlog.base.repository.dao.BarablahMemberPointLogMapper;
import com.newhead.barablah.modules.barablahmemberpointlog.base.repository.entity.BarablahMemberPointLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员积分日志表服务
 * 2018年01月25日 01:52:20
 */
@Api(tags = "会员积分日志表", description = "相关的API")
@Service
public class SimpleBarablahMemberPointLogService extends AbstractBarablahMemberPointLogService {

    @Autowired
    private BarablahMemberPointLogMapper mapper;

    @Override
    protected BarablahMemberPointLogMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMemberPointLog entity) {

    }
}
