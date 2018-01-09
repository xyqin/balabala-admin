package com.newhead.balabala.modules.balabalatextbookcategory.ext;

import com.newhead.balabala.modules.balabalatextbookcategory.base.AbstractBalabalaTextbookCategoryService;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.dao.BalabalaTextbookCategoryMapper;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教材分类表服务
 * 2018年01月09日 04:35:22
 */
@Api(tags = "教材分类表", description = "相关的API")
@Service
public class SimpleBalabalaTextbookCategoryService extends AbstractBalabalaTextbookCategoryService {

    @Autowired
    private BalabalaTextbookCategoryMapper mapper;

    @Override
    protected BalabalaTextbookCategoryMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaTextbookCategory entity) {

    }
}
