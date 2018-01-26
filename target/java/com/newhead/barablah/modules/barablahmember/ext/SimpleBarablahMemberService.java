package com.newhead.barablah.modules.barablahmember.ext;

import com.newhead.barablah.modules.barablahmember.base.AbstractBarablahMemberService;
import com.newhead.barablah.modules.barablahmember.base.repository.dao.BarablahMemberMapper;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员服务
 * 2018年01月26日 03:43:29
 */
@Api(tags = "会员", description = "相关的API")
@Service
public class SimpleBarablahMemberService extends AbstractBarablahMemberService {

    @Autowired
    private BarablahMemberMapper mapper;

    @Override
    protected BarablahMemberMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMember entity) {

    }
}
