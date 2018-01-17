package com.newhead.balabala.modules.balabalaclassmember.ext;

import com.newhead.balabala.modules.balabalaclassmember.base.AbstractBalabalaClassMemberService;
import com.newhead.balabala.modules.balabalaclassmember.base.repository.dao.BalabalaClassMemberMapper;
import com.newhead.balabala.modules.balabalaclassmember.base.repository.entity.BalabalaClassMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 开班会员服务
 * 2018年01月17日 05:42:34
 */
@Api(tags = "开班会员", description = "相关的API")
@Service
public class SimpleBalabalaClassMemberService extends AbstractBalabalaClassMemberService {

    @Autowired
    private BalabalaClassMemberMapper mapper;

    @Override
    protected BalabalaClassMemberMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaClassMember entity) {

    }
}
