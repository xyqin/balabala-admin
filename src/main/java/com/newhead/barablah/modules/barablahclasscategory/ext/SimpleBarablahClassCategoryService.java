package com.newhead.barablah.modules.barablahclasscategory.ext;

import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahclasscategory.base.AbstractBarablahClassCategoryService;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.dao.BarablahClassCategoryMapper;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategory;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * RudderFramework 自动生成
 * 班级分类服务
 * 2018年02月06日 02:50:56
 */
@Api(tags = "班级分类", description = "相关的API")
@Service
public class SimpleBarablahClassCategoryService extends AbstractBarablahClassCategoryService {

    @Autowired
    private BarablahClassCategoryMapper mapper;


    @Autowired
    private BarablahClassMapper classMapper;

    @Override
    protected BarablahClassCategoryMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahClassCategory entity) {

    }

    @Override
    public void delete(Long id) {
        BarablahClass entity = new BarablahClass();

        BarablahClassExample bcls = new BarablahClassExample();
        bcls.createCriteria().andCategoryIdEqualTo(id);

        List<BarablahClass> classes = classMapper.selectByExample(bcls);
        if (classes!=null && classes.size()>0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(), "类别已经使用,不允许删除!");
        }

        getMapper().deleteByPrimaryKey(id);
    }
}
