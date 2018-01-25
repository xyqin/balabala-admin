package com.newhead.barablah.modules.barablahtextbookcategory.ext;

import com.newhead.barablah.modules.barablahtextbookcategory.base.AbstractBarablahTextbookCategoryService;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao.BarablahTextbookCategoryMapper;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教材分类表服务
 * 2018年01月25日 01:52:20
 */
@Api(tags = "教材分类表", description = "相关的API")
@Service
public class SimpleBarablahTextbookCategoryService extends AbstractBarablahTextbookCategoryService {

    @Autowired
    private BarablahTextbookCategoryMapper mapper;

    @Override
    protected BarablahTextbookCategoryMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahTextbookCategory entity) {

    }
}
