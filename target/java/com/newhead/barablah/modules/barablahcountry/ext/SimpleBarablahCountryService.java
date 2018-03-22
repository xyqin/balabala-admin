package com.newhead.barablah.modules.barablahcountry.ext;

import com.newhead.barablah.modules.barablahcountry.base.AbstractBarablahCountryService;
import com.newhead.barablah.modules.barablahcountry.base.repository.dao.BarablahCountryMapper;
import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 国籍设置服务
 * 2018年03月22日 08:05:42
 */
@Api(tags = "国籍设置", description = "相关的API")
@Service
public class SimpleBarablahCountryService extends AbstractBarablahCountryService {

    @Autowired
    private BarablahCountryMapper mapper;

    @Override
    protected BarablahCountryMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahCountry entity) {

    }
}
