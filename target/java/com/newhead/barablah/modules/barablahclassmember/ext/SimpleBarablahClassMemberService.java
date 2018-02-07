package com.newhead.barablah.modules.barablahclassmember.ext;

import com.newhead.barablah.modules.barablahclassmember.base.AbstractBarablahClassMemberService;
import com.newhead.barablah.modules.barablahclassmember.base.repository.dao.BarablahClassMemberMapper;
import com.newhead.barablah.modules.barablahclassmember.base.repository.entity.BarablahClassMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 开班会员服务
 * 2018年02月07日 10:47:07
 */
@Api(tags = "开班会员", description = "相关的API")
@Service
public class SimpleBarablahClassMemberService extends AbstractBarablahClassMemberService {

    @Autowired
    private BarablahClassMemberMapper mapper;

    @Override
    protected BarablahClassMemberMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahClassMember entity) {

    }
}
