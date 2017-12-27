package com.newhead.balabala.modules.balabalamembershippingaddress.ext;

import com.newhead.balabala.modules.balabalamembershippingaddress.base.AbstractBalabalaMemberShippingAddressService;
import com.newhead.balabala.modules.balabalamembershippingaddress.base.repository.dao.BalabalaMemberShippingAddressMapper;
import com.newhead.balabala.modules.balabalamembershippingaddress.base.repository.entity.BalabalaMemberShippingAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 收货地址服务
 * 2017年12月28日 12:00:28
 */
@Api(tags = "收货地址", description = "相关的API")
@Service
public class SimpleBalabalaMemberShippingAddressService extends AbstractBalabalaMemberShippingAddressService {

    @Autowired
    private BalabalaMemberShippingAddressMapper mapper;

    @Override
    protected BalabalaMemberShippingAddressMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaMemberShippingAddress entity) {

    }
}
