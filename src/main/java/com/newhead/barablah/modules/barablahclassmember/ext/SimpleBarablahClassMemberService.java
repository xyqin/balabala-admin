package com.newhead.barablah.modules.barablahclassmember.ext;

import com.newhead.barablah.modules.barablahclassmember.base.AbstractBarablahClassMemberService;
import com.newhead.barablah.modules.barablahclassmember.base.repository.dao.BarablahClassMemberMapper;
import com.newhead.barablah.modules.barablahclassmember.base.repository.entity.BarablahClassMember;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * RudderFramework 自动生成
 * 开班会员服务
 * 2018年02月07日 04:00:57
 */
@Api(tags = "开班会员", description = "相关的API")
@Service
public class SimpleBarablahClassMemberService extends AbstractBarablahClassMemberService {

    @Autowired
    private BarablahClassMemberMapper mapper;

    @Override
    public BarablahClassMemberMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahClassMember entity) {

    }

    @Override
    public void delete(Long id) {
        this.getMapper().deleteByPrimaryKey(id);
    }
}
