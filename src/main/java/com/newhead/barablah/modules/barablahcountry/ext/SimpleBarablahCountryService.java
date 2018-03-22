package com.newhead.barablah.modules.barablahcountry.ext;

import com.newhead.barablah.modules.barablahcountry.base.AbstractBarablahCountryService;
import com.newhead.barablah.modules.barablahcountry.base.repository.dao.BarablahCountryMapper;
import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountry;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * RudderFramework 自动生成
 * 国籍设置服务
 * 2018年03月18日 01:59:11
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

    @Override
    public void delete(Long id) {
        getMapper().deleteByPrimaryKey(id);
    }
}
