package com.newhead.barablah.modules.barablahmemberhomeworkitem.ext;

import com.newhead.barablah.modules.barablahmemberhomeworkitem.base.AbstractBarablahMemberHomeworkItemService;
import com.newhead.barablah.modules.barablahmemberhomeworkitem.base.repository.dao.BarablahMemberHomeworkItemMapper;
import com.newhead.barablah.modules.barablahmemberhomeworkitem.base.repository.entity.BarablahMemberHomeworkItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员作业答案表服务
 * 2018年01月18日 06:52:58
 */
@Api(tags = "会员作业答案表", description = "相关的API")
@Service
public class SimpleBarablahMemberHomeworkItemService extends AbstractBarablahMemberHomeworkItemService {

    @Autowired
    private BarablahMemberHomeworkItemMapper mapper;

    @Override
    protected BarablahMemberHomeworkItemMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMemberHomeworkItem entity) {

    }
}
