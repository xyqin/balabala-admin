package com.newhead.barablah.modules.barablahpositioncontent.ext;

import com.newhead.barablah.modules.barablahpositioncontent.base.AbstractBarablahPositionContentService;
import com.newhead.barablah.modules.barablahpositioncontent.base.repository.dao.BarablahPositionContentMapper;
import com.newhead.barablah.modules.barablahpositioncontent.base.repository.entity.BarablahPositionContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 位置内容表服务
 * 2018年02月06日 02:50:56
 */
@Api(tags = "位置内容表", description = "相关的API")
@Service
public class SimpleBarablahPositionContentService extends AbstractBarablahPositionContentService {

    @Autowired
    private BarablahPositionContentMapper mapper;

    @Override
    protected BarablahPositionContentMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahPositionContent entity) {

    }
}
