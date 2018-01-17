package com.newhead.balabala.modules.balabalapositioncontent.ext;

import com.newhead.balabala.modules.balabalapositioncontent.base.AbstractBalabalaPositionContentService;
import com.newhead.balabala.modules.balabalapositioncontent.base.repository.dao.BalabalaPositionContentMapper;
import com.newhead.balabala.modules.balabalapositioncontent.base.repository.entity.BalabalaPositionContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 位置内容表服务
 * 2018年01月17日 05:42:34
 */
@Api(tags = "位置内容表", description = "相关的API")
@Service
public class SimpleBalabalaPositionContentService extends AbstractBalabalaPositionContentService {

    @Autowired
    private BalabalaPositionContentMapper mapper;

    @Override
    protected BalabalaPositionContentMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaPositionContent entity) {

    }
}
