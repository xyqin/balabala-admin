package com.newhead.barablah.modules.barablahtextbookcategory.base;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao.BarablahTextbookCategoryMapper;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import com.newhead.barablah.modules.barablahtextbookcategory.ext.protocol.*;
import com.newhead.rudderframework.core.services.SimpleTreeService;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.ExtNode;
import com.newhead.rudderframework.core.web.component.tree.Node;
import com.newhead.rudderframework.core.web.component.tree.TransitionTree;
import com.newhead.rudderframework.modules.LabelValueItem;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBarablahTextbookCategoryService extends SimpleTreeService {
    protected abstract BarablahTextbookCategoryMapper getMapper();

    protected abstract void saveOrUpdate(BarablahTextbookCategory entity);


    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahTextbookCategory create(SimpleBarablahTextbookCategoryCreateRequest request) {
        BarablahTextbookCategory entity = new BarablahTextbookCategory();
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
    public BarablahTextbookCategory update(SimpleBarablahTextbookCategoryUpdateRequest request) {
        BarablahTextbookCategory entity = new BarablahTextbookCategory();
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
    public SimpleBarablahTextbookCategoryGetDetailResponse getDetail(Long id) {
        BarablahTextbookCategory entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahTextbookCategoryGetDetailResponse response = new SimpleBarablahTextbookCategoryGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahTextbookCategory  parentIdEntity = getMapper().selectByPrimaryKey(Long.valueOf(entity.getParentId()));
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
        BarablahTextbookCategory entity = new BarablahTextbookCategory();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahTextbookCategoryQueryResponse> queryList(SimpleBarablahTextbookCategoryQueryListRequest request) {
        List<SimpleBarablahTextbookCategoryQueryResponse> results = new ArrayList<SimpleBarablahTextbookCategoryQueryResponse>();

        //构造查询对象
        BarablahTextbookCategoryExample example = new BarablahTextbookCategoryExample();
        BarablahTextbookCategoryExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
            ordersrc = "position desc,";
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
    public Page<SimpleBarablahTextbookCategoryQueryResponse> queryPage(SimpleBarablahTextbookCategoryQueryPageRequest request) {
        //结果
        List<SimpleBarablahTextbookCategoryQueryResponse> results = new ArrayList<SimpleBarablahTextbookCategoryQueryResponse>();

        //构造查询对象
        BarablahTextbookCategoryExample example = new BarablahTextbookCategoryExample();
        BarablahTextbookCategoryExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
            ordersrc = "position desc,";
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
    private void convertEntityToResponse(List<BarablahTextbookCategory> entitys,List<SimpleBarablahTextbookCategoryQueryResponse> results) {
        Map<Long,Long> parentIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> parentIdResultMap = Maps.newHashMap();

       for(BarablahTextbookCategory entity:entitys) {
            parentIdMap.put(entity.getId(),entity.getParentId());
        }
        BarablahTextbookCategoryExample parentIdExample = new BarablahTextbookCategoryExample();

        List<Long> parentIds = new ArrayList<>();
        parentIds.addAll(parentIdMap.values());
        if (parentIds.size()>0) {
            parentIdExample.createCriteria().andIdIn(parentIds);
        }
        List<BarablahTextbookCategory> parentIdList = getMapper().selectByExample(parentIdExample);
        for(BarablahTextbookCategory item:parentIdList) {
           LabelValueItem parentIdItem = new LabelValueItem();
           parentIdItem.setName("parentId");
           parentIdItem.setValue(String.valueOf(item.getId()));
           parentIdItem.setLabel(item.getCategoryName());
           parentIdResultMap.put(item.getId(),parentIdItem);
        }
        //第一组
        for(BarablahTextbookCategory entity:entitys) {
            SimpleBarablahTextbookCategoryQueryResponse response = new SimpleBarablahTextbookCategoryQueryResponse();
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
    public BarablahTextbookCategory existByCategoryName(String categoryName) {
        //构造查询对象
        BarablahTextbookCategoryExample example = new BarablahTextbookCategoryExample();
        BarablahTextbookCategoryExample.Criteria c = example.createCriteria();
        c.andCategoryNameEqualTo(categoryName);
        List<BarablahTextbookCategory> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    protected TransitionTree getTransitionTree() {
        TransitionTree tree = new TransitionTree();
        tree.setUrl("/barablahtextbookcategory/gettree");

        SimpleBarablahTextbookCategoryQueryListRequest request = new SimpleBarablahTextbookCategoryQueryListRequest();
        List<SimpleBarablahTextbookCategoryQueryResponse> sources = queryList(request);

        for(SimpleBarablahTextbookCategoryQueryResponse response:sources) {
            ExtNode node = new ExtNode();
            node.setId(response.getId());
            node.getNode().setUrl("");
            node.getNode().setLeaf(true);
            node.getNode().setLabel(response.getCategoryName());
            node.getNode().setValue(String.valueOf(response.getId()));
            node.getNode().setSelected(false);
            if (response.getParentIdObject()!=null) {
                node.getNode().setParentId(response.getParentIdObject().getValue());
            } else {
                node.getNode().setParentId("0");
            }
            tree.getNdoes().add(node);
        }
        return tree;
    }




}
