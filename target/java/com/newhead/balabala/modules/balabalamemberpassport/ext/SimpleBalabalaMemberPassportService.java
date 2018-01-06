package com.newhead.balabala.modules.balabalamemberpassport.ext;

import com.newhead.balabala.modules.balabalamemberpassport.base.AbstractBalabalaMemberPassportService;
import com.newhead.balabala.modules.balabalamemberpassport.base.repository.dao.BalabalaMemberPassportMapper;
import com.newhead.balabala.modules.balabalamemberpassport.base.repository.entity.BalabalaMemberPassport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员通行证服务
 * 2018年01月06日 09:19:38
 */
@Api(tags = "会员通行证", description = "相关的API")
@Service
public class SimpleBalabalaMemberPassportService extends AbstractBalabalaMemberPassportService {

    @Autowired
    private BalabalaMemberPassportMapper mapper;

    @Override
    protected BalabalaMemberPassportMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaMemberPassport entity) {

    }
}
