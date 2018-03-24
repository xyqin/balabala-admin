package com.newhead.barablah.modules.barablahclasscategory.ext;

import com.newhead.barablah.modules.barablahclasscategory.base.AbstractBarablahClassCategoryService;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.dao.BarablahClassCategoryMapper;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 班级分类服务
 * 2018年03月24日 04:28:57
 */
@Api(tags = "班级分类", description = "相关的API")
@Service
public class SimpleBarablahClassCategoryService extends AbstractBarablahClassCategoryService {

    @Autowired
    private BarablahClassCategoryMapper mapper;

    @Override
    protected BarablahClassCategoryMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahClassCategory entity) {

    }
}
