package com.newhead.balabala.modules.balabalatextbook.ext;

import com.newhead.balabala.modules.balabalatextbook.base.AbstractBalabalaTextbookService;
import com.newhead.balabala.modules.balabalatextbook.base.repository.dao.BalabalaTextbookMapper;
import com.newhead.balabala.modules.balabalatextbook.base.repository.entity.BalabalaTextbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教材表服务
 * 2018年01月06日 09:19:38
 */
@Api(tags = "教材表", description = "相关的API")
@Service
public class SimpleBalabalaTextbookService extends AbstractBalabalaTextbookService {

    @Autowired
    private BalabalaTextbookMapper mapper;

    @Override
    protected BalabalaTextbookMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaTextbook entity) {

    }
}
