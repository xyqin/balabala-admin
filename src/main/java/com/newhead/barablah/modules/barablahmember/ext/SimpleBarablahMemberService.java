package com.newhead.barablah.modules.barablahmember.ext;

import com.newhead.barablah.modules.barablahmember.base.AbstractBarablahMemberService;
import com.newhead.barablah.modules.barablahmember.base.repository.dao.BarablahMemberMapper;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMember;
import com.newhead.barablah.modules.barablahmember.ext.protocol.SimpleBarablahMemberUpdateBatchRequest;
import io.swagger.annotations.Api;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * RudderFramework 自动生成
 * 会员服务
 * 2018年02月07日 04:55:37
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

    @Transactional
    public void updatebatch(SimpleBarablahMemberUpdateBatchRequest request) {
        if (CollectionUtils.isNotEmpty(request.getMemberIds())) {
            for (Long teacherId : request.getMemberIds()) {
                BarablahMember memberToBeUpdated = new BarablahMember();
                memberToBeUpdated.setId(teacherId);
                memberToBeUpdated.setStatus(request.getStatus());
                mapper.updateByPrimaryKeySelective(memberToBeUpdated);
            }
        }
    }
}
