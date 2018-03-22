package com.newhead.barablah.modules.barablahclasscategory.ext;

import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahclasscategory.base.AbstractBarablahClassCategoryService;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.dao.BarablahClassCategoryMapper;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategory;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategoryExample;
import com.newhead.barablah.modules.barablahclasscategory.ext.protocol.SimpleBarablahClassCategoryCreateRequest;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahClassCategory create(SimpleBarablahClassCategoryCreateRequest request) {
        long count = getMapper().countByExample(new BarablahClassCategoryExample());

        BarablahClassCategory entity = new BarablahClassCategory();
        BeanUtils.copyProperties(request,entity);
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());

        entity.setDeleted(false);
        entity.setCreator(getCurrentUser().getId());
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().insert(entity);

        //添加关系
        return entity;
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
