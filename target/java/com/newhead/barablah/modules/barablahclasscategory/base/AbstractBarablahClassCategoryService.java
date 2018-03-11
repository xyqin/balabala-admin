package com.newhead.barablah.modules.barablahclasscategory.base;

import com.newhead.rudderframework.core.web.component.pagination.Page;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.core.web.component.tree.ExtNode;
import com.newhead.rudderframework.core.web.component.tree.Node;
import com.newhead.rudderframework.core.web.component.tree.TransitionTree;
import com.newhead.rudderframework.core.services.BaseService;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.dao.BarablahClassCategoryMapper;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategory;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategoryExample;
import com.newhead.barablah.modules.barablahclasscategory.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBarablahClassCategoryService extends BaseService {
    protected abstract BarablahClassCategoryMapper getMapper();

    protected abstract void saveOrUpdate(BarablahClassCategory entity);


    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahClassCategory create(SimpleBarablahClassCategoryCreateRequest request) {
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

    /**
     * 修改
     * @param request
     * @return
     */
    @Transactional
    public BarablahClassCategory update(SimpleBarablahClassCategoryUpdateRequest request) {
        BarablahClassCategory entity = new BarablahClassCategory();
        BeanUtils.copyProperties(request,entity);
        entity.setUpdatedAt(new Date());
        entity.setDeleted(false);
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().updateByPrimaryKeySelective(entity);

        return entity;
    }

    /**
     * 查看菜单详情
     * @param id
     * @return
     */
    public SimpleBarablahClassCategoryGetDetailResponse getDetail(Long id) {
        BarablahClassCategory entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahClassCategoryGetDetailResponse response = new SimpleBarablahClassCategoryGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahClassCategory entity = new BarablahClassCategory();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahClassCategoryQueryResponse> queryList(SimpleBarablahClassCategoryQueryListRequest request) {
        List<SimpleBarablahClassCategoryQueryResponse> results = new ArrayList<SimpleBarablahClassCategoryQueryResponse>();

        //构造查询对象
        BarablahClassCategoryExample example = new BarablahClassCategoryExample();
        BarablahClassCategoryExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        if (request.getCategoryName()!=null) {
            c.andCategoryNameLike("%"+request.getCategoryName()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahClassCategoryQueryResponse> queryPage(SimpleBarablahClassCategoryQueryPageRequest request) {
        //结果
        List<SimpleBarablahClassCategoryQueryResponse> results = new ArrayList<SimpleBarablahClassCategoryQueryResponse>();

        //构造查询对象
        BarablahClassCategoryExample example = new BarablahClassCategoryExample();
        BarablahClassCategoryExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getCategoryName()!=null) {
            c.andCategoryNameLike("%"+request.getCategoryName()+"%");
        }

        example.setPageSize(request.getSize());
        example.setStartRow(request.getOffset());

        long count = getMapper().countByExample(example);

        convertEntityToResponse(getMapper().selectByExample(example),results);

        Page page = new Page();
        page.setNumber(request.getPage());
        page.setSize(request.getSize());
        page.setContent(results);
        page.setTotalElements(count);
        return page;
    }

    /**
     * 对象转换
     * @param entitys
     * @param results
     */
    private void convertEntityToResponse(List<BarablahClassCategory> entitys,List<SimpleBarablahClassCategoryQueryResponse> results) {
       for(BarablahClassCategory entity:entitys) {
        }
        //第一组
        for(BarablahClassCategory entity:entitys) {
            SimpleBarablahClassCategoryQueryResponse response = new SimpleBarablahClassCategoryQueryResponse();
            BeanUtils.copyProperties(entity,response);
            results.add(response);
        }
    }

    /**
     *
     * @param node
     * @param selectMap
     */
    private void traversalTree(Node node,Map<Long,Boolean> selectMap) {
        if (node.getValue()!=null && org.apache.commons.lang3.math.NumberUtils.isNumber(node.getValue())) {
            if (selectMap.containsKey(Long.valueOf(node.getValue()))) {
                node.setSelected(true);
            }
        }
        if (node.getChildren()!=null) {
            for(Node child:node.getChildren()) {
                traversalTree(child,selectMap);
            }
        }
    }

    /**
     * 是否存在同名数据
     * @param categoryName
     * @return
     */
    public BarablahClassCategory existByCategoryName(String categoryName) {
        //构造查询对象
        BarablahClassCategoryExample example = new BarablahClassCategoryExample();
        BarablahClassCategoryExample.Criteria c = example.createCriteria();
        c.andCategoryNameEqualTo(categoryName);
        List<BarablahClassCategory> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }





}
