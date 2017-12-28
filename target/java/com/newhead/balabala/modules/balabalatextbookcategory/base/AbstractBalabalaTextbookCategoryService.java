package com.newhead.balabala.modules.balabalatextbookcategory.base;

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
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.dao.BalabalaTextbookCategoryMapper;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategory;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategoryExample;
import com.newhead.balabala.modules.balabalatextbookcategory.ext.protocol.*;
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
public abstract class AbstractBalabalaTextbookCategoryService extends BaseService {
    protected abstract BalabalaTextbookCategoryMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaTextbookCategory entity);


    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaTextbookCategory create(SimpleBalabalaTextbookCategoryCreateRequest request) {
        BalabalaTextbookCategory entity = new BalabalaTextbookCategory();
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
    public BalabalaTextbookCategory update(SimpleBalabalaTextbookCategoryUpdateRequest request) {
        BalabalaTextbookCategory entity = new BalabalaTextbookCategory();
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
    public SimpleBalabalaTextbookCategoryGetDetailResponse getDetail(Long id) {
        BalabalaTextbookCategory entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaTextbookCategoryGetDetailResponse response = new SimpleBalabalaTextbookCategoryGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaTextbookCategory  parentIdEntity = getMapper().selectByPrimaryKey(Long.valueOf(entity.getParentId()));
        if (parentIdEntity!=null) {
            LabelValueItem parentIdObject = response.getParentIdObject();
            parentIdObject.setName("parentId");
            parentIdObject.setLabel(parentIdEntity.getCategoryName());
            parentIdObject.setValue(String.valueOf(entity.getParentId()));
            parentIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BalabalaTextbookCategory entity = new BalabalaTextbookCategory();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaTextbookCategoryQueryResponse> queryList(SimpleBalabalaTextbookCategoryQueryListRequest request) {
        List<SimpleBalabalaTextbookCategoryQueryResponse> results = new ArrayList<SimpleBalabalaTextbookCategoryQueryResponse>();

        //构造查询对象
        BalabalaTextbookCategoryExample example = new BalabalaTextbookCategoryExample();
        BalabalaTextbookCategoryExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
            example.setOrderByClause("position desc");
        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBalabalaTextbookCategoryQueryResponse> queryPage(SimpleBalabalaTextbookCategoryQueryPageRequest request) {
        //结果
        List<SimpleBalabalaTextbookCategoryQueryResponse> results = new ArrayList<SimpleBalabalaTextbookCategoryQueryResponse>();

        //构造查询对象
        BalabalaTextbookCategoryExample example = new BalabalaTextbookCategoryExample();
        BalabalaTextbookCategoryExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
            example.setOrderByClause("position desc");

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
    private void convertEntityToResponse(List<BalabalaTextbookCategory> entitys,List<SimpleBalabalaTextbookCategoryQueryResponse> results) {
        Map<Long,Long> parentIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> parentIdResultMap = Maps.newHashMap();

       for(BalabalaTextbookCategory entity:entitys) {
            parentIdMap.put(entity.getId(),entity.getParentId());
        }
        BalabalaTextbookCategoryExample parentIdExample = new BalabalaTextbookCategoryExample();

        List<Long> parentIds = new ArrayList<>();
        parentIds.addAll(parentIdMap.values());
        if (parentIds.size()>0) {
            parentIdExample.createCriteria().andIdIn(parentIds);
        }
        List<BalabalaTextbookCategory> parentIdList = getMapper().selectByExample(parentIdExample);
        for(BalabalaTextbookCategory item:parentIdList) {
           LabelValueItem parentIdItem = new LabelValueItem();
           parentIdItem.setName("parentId");
           parentIdItem.setValue(String.valueOf(item.getId()));
           parentIdItem.setLabel(item.getCategoryName());
           parentIdResultMap.put(item.getId(),parentIdItem);
        }
        //第一组
        for(BalabalaTextbookCategory entity:entitys) {
            SimpleBalabalaTextbookCategoryQueryResponse response = new SimpleBalabalaTextbookCategoryQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long parentId = parentIdMap.get(entity.getId());

            LabelValueItem parentIdlvi = null;
            if (parentId!=null && parentIdResultMap.get(parentId)!=null) {
                parentIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(parentIdResultMap.get(parentId),parentIdlvi);
            }
            response.setParentIdObject(parentIdlvi);
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
    public BalabalaTextbookCategory existByCategoryName(String categoryName) {
        //构造查询对象
        BalabalaTextbookCategoryExample example = new BalabalaTextbookCategoryExample();
        BalabalaTextbookCategoryExample.Criteria c = example.createCriteria();
        c.andCategoryNameEqualTo(categoryName);
        List<BalabalaTextbookCategory> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }
    /**
     * 是否存在同名数据
     * @param path
     * @return
     */
    public BalabalaTextbookCategory existByPath(String path) {
        //构造查询对象
        BalabalaTextbookCategoryExample example = new BalabalaTextbookCategoryExample();
        BalabalaTextbookCategoryExample.Criteria c = example.createCriteria();
        c.andPathEqualTo(path);
        List<BalabalaTextbookCategory> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }





}
