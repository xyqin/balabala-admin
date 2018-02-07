package com.newhead.barablah.modules.barablahmembercomment.ext;

import com.newhead.barablah.modules.barablahmembercomment.base.AbstractBarablahMemberCommentService;
import com.newhead.barablah.modules.barablahmembercomment.base.repository.dao.BarablahMemberCommentMapper;
import com.newhead.barablah.modules.barablahmembercomment.base.repository.entity.BarablahMemberComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教师评语表服务
 * 2018年02月07日 04:00:57
 */
@Api(tags = "教师评语表", description = "相关的API")
@Service
public class SimpleBarablahMemberCommentService extends AbstractBarablahMemberCommentService {

    @Autowired
    private BarablahMemberCommentMapper mapper;

    @Override
    protected BarablahMemberCommentMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMemberComment entity) {

    }
}
