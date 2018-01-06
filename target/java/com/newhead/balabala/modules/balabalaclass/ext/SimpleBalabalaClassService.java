package com.newhead.balabala.modules.balabalaclass.ext;

import com.newhead.balabala.modules.balabalaclass.base.AbstractBalabalaClassService;
import com.newhead.balabala.modules.balabalaclass.base.repository.dao.BalabalaClassMapper;
import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 开班服务
 * 2018年01月06日 09:19:38
 */
@Api(tags = "开班", description = "相关的API")
@Service
public class SimpleBalabalaClassService extends AbstractBalabalaClassService {

    @Autowired
    private BalabalaClassMapper mapper;

    @Override
    protected BalabalaClassMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaClass entity) {

    }
}
