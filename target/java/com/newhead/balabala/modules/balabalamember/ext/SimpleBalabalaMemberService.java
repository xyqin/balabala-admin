package com.newhead.balabala.modules.balabalamember.ext;

import com.newhead.balabala.modules.balabalamember.base.AbstractBalabalaMemberService;
import com.newhead.balabala.modules.balabalamember.base.repository.dao.BalabalaMemberMapper;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员服务
 * 2017年12月28日 03:59:20
 */
@Api(tags = "会员", description = "相关的API")
@Service
public class SimpleBalabalaMemberService extends AbstractBalabalaMemberService {

    @Autowired
    private BalabalaMemberMapper mapper;

    @Override
    protected BalabalaMemberMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaMember entity) {

    }
}
