package com.newhead.barablah.modules.barablahcampus.ext;

import com.newhead.barablah.modules.barablahcampus.base.AbstractBarablahCampusService;
import com.newhead.barablah.modules.barablahcampus.base.repository.dao.BarablahCampusMapper;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 校区服务
 * 2018年02月06日 05:24:55
 */
@Api(tags = "校区", description = "相关的API")
@Service
public class SimpleBarablahCampusService extends AbstractBarablahCampusService {

    @Autowired
    private BarablahCampusMapper mapper;

    @Override
    protected BarablahCampusMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahCampus entity) {

    }
}
