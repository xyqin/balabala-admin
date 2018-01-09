package com.newhead.balabala.modules.balabalamembercomment.ext;

import com.newhead.balabala.modules.balabalamembercomment.base.AbstractBalabalaMemberCommentService;
import com.newhead.balabala.modules.balabalamembercomment.base.repository.dao.BalabalaMemberCommentMapper;
import com.newhead.balabala.modules.balabalamembercomment.base.repository.entity.BalabalaMemberComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教师评语表服务
 * 2018年01月09日 04:35:22
 */
@Api(tags = "教师评语表", description = "相关的API")
@Service
public class SimpleBalabalaMemberCommentService extends AbstractBalabalaMemberCommentService {

    @Autowired
    private BalabalaMemberCommentMapper mapper;

    @Override
    protected BalabalaMemberCommentMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaMemberComment entity) {

    }
}
