package com.newhead.barablah.modules.barablahmemberpassport.ext;

import com.newhead.barablah.modules.barablahmemberpassport.base.AbstractBarablahMemberPassportService;
import com.newhead.barablah.modules.barablahmemberpassport.base.repository.dao.BarablahMemberPassportMapper;
import com.newhead.barablah.modules.barablahmemberpassport.base.repository.entity.BarablahMemberPassport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员通行证服务
 * 2018年01月26日 03:39:47
 */
@Api(tags = "会员通行证", description = "相关的API")
@Service
public class SimpleBarablahMemberPassportService extends AbstractBarablahMemberPassportService {

    @Autowired
    private BarablahMemberPassportMapper mapper;

    @Override
    protected BarablahMemberPassportMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMemberPassport entity) {

    }
}
