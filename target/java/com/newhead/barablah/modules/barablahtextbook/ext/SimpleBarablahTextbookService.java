package com.newhead.barablah.modules.barablahtextbook.ext;

import com.newhead.barablah.modules.barablahtextbook.base.AbstractBarablahTextbookService;
import com.newhead.barablah.modules.barablahtextbook.base.repository.dao.BarablahTextbookMapper;
import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教材表服务
 * 2018年03月18日 05:08:24
 */
@Api(tags = "教材表", description = "相关的API")
@Service
public class SimpleBarablahTextbookService extends AbstractBarablahTextbookService {

    @Autowired
    private BarablahTextbookMapper mapper;

    @Override
    protected BarablahTextbookMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahTextbook entity) {

    }
}
