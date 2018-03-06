package com.newhead.barablah.modules.barablahcourse.base;

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
import com.newhead.barablah.modules.barablahcourse.base.repository.dao.BarablahCourseMapper;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourseExample;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.barablah.modules.barablahcoursecategory.base.repository.entity.BarablahCourseCategory;
import com.newhead.barablah.modules.barablahcoursecategory.base.repository.entity.BarablahCourseCategoryExample;

import com.newhead.barablah.modules.barablahcoursecategory.base.repository.dao.BarablahCourseCategoryMapper;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;

import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao.BarablahTextbookCategoryMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBarablahCourseService extends BaseService {
    protected abstract BarablahCourseMapper getMapper();

    protected abstract void saveOrUpdate(BarablahCourse entity);

    @Autowired
    protected BarablahCourseCategoryMapper barablahcoursecategoryMapper;
    @Autowired
    protected BarablahTextbookCategoryMapper barablahtextbookcategoryMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahCourse create(SimpleBarablahCourseCreateRequest request) {
        BarablahCourse entity = new BarablahCourse();
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
    public BarablahCourse update(SimpleBarablahCourseUpdateRequest request) {
        BarablahCourse entity = new BarablahCourse();
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
    public SimpleBarablahCourseGetDetailResponse getDetail(Long id) {
        BarablahCourse entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahCourseGetDetailResponse response = new SimpleBarablahCourseGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahCourseCategory  categoryIdEntity = barablahcoursecategoryMapper.selectByPrimaryKey(Long.valueOf(entity.getCategoryId()));
        if (categoryIdEntity!=null) {
            LabelValueItem categoryIdObject = response.getCategoryIdObject();
            categoryIdObject.setName("categoryId");
            categoryIdObject.setLabel(categoryIdEntity.getCategoryName());
            categoryIdObject.setValue(String.valueOf(entity.getCategoryId()));
            categoryIdObject.setChecked(false);
        }
        BarablahTextbookCategory  textbookCategoryIdEntity = barablahtextbookcategoryMapper.selectByPrimaryKey(Long.valueOf(entity.getTextbookCategoryId()));
        if (textbookCategoryIdEntity!=null) {
            LabelValueItem textbookCategoryIdObject = response.getTextbookCategoryIdObject();
            textbookCategoryIdObject.setName("textbookCategoryId");
            textbookCategoryIdObject.setLabel(textbookCategoryIdEntity.getCategoryName());
            textbookCategoryIdObject.setValue(String.valueOf(entity.getTextbookCategoryId()));
            textbookCategoryIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahCourse entity = new BarablahCourse();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahCourseQueryResponse> queryList(SimpleBarablahCourseQueryListRequest request) {
        List<SimpleBarablahCourseQueryResponse> results = new ArrayList<SimpleBarablahCourseQueryResponse>();

        //构造查询对象
        BarablahCourseExample example = new BarablahCourseExample();
        BarablahCourseExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        if (request.getCourseName()!=null) {
            c.andCourseNameLike("%"+request.getCourseName()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahCourseQueryResponse> queryPage(SimpleBarablahCourseQueryPageRequest request) {
        //结果
        List<SimpleBarablahCourseQueryResponse> results = new ArrayList<SimpleBarablahCourseQueryResponse>();

        //构造查询对象
        BarablahCourseExample example = new BarablahCourseExample();
        BarablahCourseExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getCourseName()!=null) {
            c.andCourseNameLike("%"+request.getCourseName()+"%");
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
    private void convertEntityToResponse(List<BarablahCourse> entitys,List<SimpleBarablahCourseQueryResponse> results) {
        Map<Long,Long> categoryIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> categoryIdResultMap = Maps.newHashMap();

        Map<Long,Long> textbookCategoryIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> textbookCategoryIdResultMap = Maps.newHashMap();

       for(BarablahCourse entity:entitys) {
            categoryIdMap.put(entity.getId(),entity.getCategoryId());
            textbookCategoryIdMap.put(entity.getId(),entity.getTextbookCategoryId());
        }
        BarablahCourseCategoryExample categoryIdExample = new BarablahCourseCategoryExample();

        List<Long> categoryIds = new ArrayList<>();
        categoryIds.addAll(categoryIdMap.values());
        if (categoryIds.size()>0) {
            categoryIdExample.createCriteria().andIdIn(categoryIds);
        }
        List<BarablahCourseCategory>  categoryIdList = barablahcoursecategoryMapper.selectByExample(categoryIdExample);
        for(BarablahCourseCategory item:categoryIdList) {
           LabelValueItem categoryIdItem = new LabelValueItem();
           categoryIdItem.setName("categoryId");
           categoryIdItem.setValue(String.valueOf(item.getId()));
           categoryIdItem.setLabel(item.getCategoryName());
           categoryIdResultMap.put(item.getId(),categoryIdItem);
        }
        BarablahTextbookCategoryExample textbookCategoryIdExample = new BarablahTextbookCategoryExample();

        List<Long> textbookCategoryIds = new ArrayList<>();
        textbookCategoryIds.addAll(textbookCategoryIdMap.values());
        if (textbookCategoryIds.size()>0) {
            textbookCategoryIdExample.createCriteria().andIdIn(textbookCategoryIds);
        }
        List<BarablahTextbookCategory>  textbookCategoryIdList = barablahtextbookcategoryMapper.selectByExample(textbookCategoryIdExample);
        for(BarablahTextbookCategory item:textbookCategoryIdList) {
           LabelValueItem textbookCategoryIdItem = new LabelValueItem();
           textbookCategoryIdItem.setName("textbookCategoryId");
           textbookCategoryIdItem.setValue(String.valueOf(item.getId()));
           textbookCategoryIdItem.setLabel(item.getCategoryName());
           textbookCategoryIdResultMap.put(item.getId(),textbookCategoryIdItem);
        }
        //第一组
        for(BarablahCourse entity:entitys) {
            SimpleBarablahCourseQueryResponse response = new SimpleBarablahCourseQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long categoryId = categoryIdMap.get(entity.getId());

            LabelValueItem categoryIdlvi = null;
            if (categoryId!=null && categoryIdResultMap.get(categoryId)!=null) {
                categoryIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(categoryIdResultMap.get(categoryId),categoryIdlvi);
            }
            response.setCategoryIdObject(categoryIdlvi);
            Long textbookCategoryId = textbookCategoryIdMap.get(entity.getId());

            LabelValueItem textbookCategoryIdlvi = null;
            if (textbookCategoryId!=null && textbookCategoryIdResultMap.get(textbookCategoryId)!=null) {
                textbookCategoryIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(textbookCategoryIdResultMap.get(textbookCategoryId),textbookCategoryIdlvi);
            }
            response.setTextbookCategoryIdObject(textbookCategoryIdlvi);
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






}
