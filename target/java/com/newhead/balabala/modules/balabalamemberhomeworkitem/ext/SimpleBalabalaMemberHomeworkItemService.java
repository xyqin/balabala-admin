package com.newhead.balabala.modules.balabalamemberhomeworkitem.ext;

import com.newhead.balabala.modules.balabalamemberhomeworkitem.base.AbstractBalabalaMemberHomeworkItemService;
import com.newhead.balabala.modules.balabalamemberhomeworkitem.base.repository.dao.BalabalaMemberHomeworkItemMapper;
import com.newhead.balabala.modules.balabalamemberhomeworkitem.base.repository.entity.BalabalaMemberHomeworkItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员作业答案表服务
 * 2018年01月09日 04:35:22
 */
@Api(tags = "会员作业答案表", description = "相关的API")
@Service
public class SimpleBalabalaMemberHomeworkItemService extends AbstractBalabalaMemberHomeworkItemService {

    @Autowired
    private BalabalaMemberHomeworkItemMapper mapper;

    @Override
    protected BalabalaMemberHomeworkItemMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaMemberHomeworkItem entity) {

    }
}
