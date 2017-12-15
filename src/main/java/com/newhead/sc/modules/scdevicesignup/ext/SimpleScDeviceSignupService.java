package com.newhead.sc.modules.scdevicesignup.ext;

import com.newhead.sc.modules.scdevicesignup.base.AbstractScDeviceSignupService;
import com.newhead.sc.modules.scdevicesignup.base.repository.dao.ScDeviceSignupMapper;
import com.newhead.sc.modules.scdevicesignup.base.repository.entity.ScDeviceSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 设备登记服务
 * 2017年12月13日 12:17:48
 */
@Api(tags = "设备登记", description = "相关的API")
@Service
public class SimpleScDeviceSignupService extends AbstractScDeviceSignupService {

    @Autowired
    private ScDeviceSignupMapper mapper;

    @Override
    protected ScDeviceSignupMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(ScDeviceSignup entity) {

    }
}
