package com.newhead.barablah.modules.barablahtextbook.base;

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
import com.newhead.barablah.modules.barablahtextbook.base.repository.dao.BarablahTextbookMapper;
import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbook;
import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbookExample;
import com.newhead.barablah.modules.barablahtextbook.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


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
public abstract class AbstractBarablahTextbookService extends BaseService {
    protected abstract BarablahTextbookMapper getMapper();

    protected abstract void saveOrUpdate(BarablahTextbook entity);

    @Autowired
    protected BarablahTextbookCategoryMapper barablahtextbookcategoryMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahTextbook create(SimpleBarablahTextbookCreateRequest request) {
        BarablahTextbook entity = new BarablahTextbook();
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
    public BarablahTextbook update(SimpleBarablahTextbookUpdateRequest request) {
        BarablahTextbook entity = new BarablahTextbook();
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
    public SimpleBarablahTextbookGetDetailResponse getDetail(Long id) {
        BarablahTextbook entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahTextbookGetDetailResponse response = new SimpleBarablahTextbookGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahTextbookCategory  categoryIdEntity = barablahtextbookcategoryMapper.selectByPrimaryKey(Long.valueOf(entity.getCategoryId()));
        if (categoryIdEntity!=null) {
            LabelValueItem categoryIdObject = response.getCategoryIdObject();
            categoryIdObject.setName("categoryId");
            categoryIdObject.setLabel(categoryIdEntity.getCategoryName());
            categoryIdObject.setValue(String.valueOf(entity.getCategoryId()));
            categoryIdObject.setChecked(false);
        }
        LabelValueItem typeEnum = response.getTypeEnum();
        typeEnum.setName("type");
        typeEnum.setLabel(com.newhead.barablah.modules.barablahtextbook.BarablahTextbookTypeEnum.getLabel(entity.getType()));
        typeEnum.setValue(entity.getType());
        typeEnum.setChecked(true);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahTextbook entity = new BarablahTextbook();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahTextbookQueryResponse> queryList(SimpleBarablahTextbookQueryListRequest request) {
        List<SimpleBarablahTextbookQueryResponse> results = new ArrayList<SimpleBarablahTextbookQueryResponse>();

        //构造查询对象
        BarablahTextbookExample example = new BarablahTextbookExample();
        BarablahTextbookExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getType()!=null) {
            c.andTypeEqualTo(request.getType());
         }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahTextbookQueryResponse> queryPage(SimpleBarablahTextbookQueryPageRequest request) {
        //结果
        List<SimpleBarablahTextbookQueryResponse> results = new ArrayList<SimpleBarablahTextbookQueryResponse>();

        //构造查询对象
        BarablahTextbookExample example = new BarablahTextbookExample();
        BarablahTextbookExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getType()!=null) {
            c.andTypeEqualTo(request.getType());
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
    private void convertEntityToResponse(List<BarablahTextbook> entitys,List<SimpleBarablahTextbookQueryResponse> results) {
        Map<Long,Long> categoryIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> categoryIdResultMap = Maps.newHashMap();

       for(BarablahTextbook entity:entitys) {
            categoryIdMap.put(entity.getId(),entity.getCategoryId());
        }
        BarablahTextbookCategoryExample categoryIdExample = new BarablahTextbookCategoryExample();

        List<Long> categoryIds = new ArrayList<>();
        categoryIds.addAll(categoryIdMap.values());
        if (categoryIds.size()>0) {
            categoryIdExample.createCriteria().andIdIn(categoryIds);
        }
        List<BarablahTextbookCategory>  categoryIdList = barablahtextbookcategoryMapper.selectByExample(categoryIdExample);
        for(BarablahTextbookCategory item:categoryIdList) {
           LabelValueItem categoryIdItem = new LabelValueItem();
           categoryIdItem.setName("categoryId");
           categoryIdItem.setValue(String.valueOf(item.getId()));
           categoryIdItem.setLabel(item.getCategoryName());
           categoryIdResultMap.put(item.getId(),categoryIdItem);
        }
        //第一组
        for(BarablahTextbook entity:entitys) {
            SimpleBarablahTextbookQueryResponse response = new SimpleBarablahTextbookQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long categoryId = categoryIdMap.get(entity.getId());

            LabelValueItem categoryIdlvi = null;
            if (categoryId!=null && categoryIdResultMap.get(categoryId)!=null) {
                categoryIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(categoryIdResultMap.get(categoryId),categoryIdlvi);
            }
            response.setCategoryIdObject(categoryIdlvi);
            LabelValueItem typeEnum = response.getTypeEnum();
            typeEnum.setName("type");
            typeEnum.setLabel(com.newhead.barablah.modules.barablahtextbook.BarablahTextbookTypeEnum.getLabel(entity.getType()));
            typeEnum.setValue(entity.getType());
            typeEnum.setChecked(true);
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
     * @param textbookName
     * @return
     */
    public BarablahTextbook existByTextbookName(String textbookName) {
        //构造查询对象
        BarablahTextbookExample example = new BarablahTextbookExample();
        BarablahTextbookExample.Criteria c = example.createCriteria();
        c.andTextbookNameEqualTo(textbookName);
        List<BarablahTextbook> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }
    /**
     * 是否存在同名数据
     * @param question
     * @return
     */
    public BarablahTextbook existByQuestion(String question) {
        //构造查询对象
        BarablahTextbookExample example = new BarablahTextbookExample();
        BarablahTextbookExample.Criteria c = example.createCriteria();
        c.andQuestionEqualTo(question);
        List<BarablahTextbook> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }
    /**
     * 是否存在同名数据
     * @param option
     * @return
     */
    public BarablahTextbook existByOption(String option) {
        //构造查询对象
        BarablahTextbookExample example = new BarablahTextbookExample();
        BarablahTextbookExample.Criteria c = example.createCriteria();
        c.andOptionEqualTo(option);
        List<BarablahTextbook> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }
    /**
     * 是否存在同名数据
     * @param correct
     * @return
     */
    public BarablahTextbook existByCorrect(String correct) {
        //构造查询对象
        BarablahTextbookExample example = new BarablahTextbookExample();
        BarablahTextbookExample.Criteria c = example.createCriteria();
        c.andCorrectEqualTo(correct);
        List<BarablahTextbook> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }
    /**
     * 是否存在同名数据
     * @param image
     * @return
     */
    public BarablahTextbook existByImage(String image) {
        //构造查询对象
        BarablahTextbookExample example = new BarablahTextbookExample();
        BarablahTextbookExample.Criteria c = example.createCriteria();
        c.andImageEqualTo(image);
        List<BarablahTextbook> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }
    /**
     * 是否存在同名数据
     * @param video
     * @return
     */
    public BarablahTextbook existByVideo(String video) {
        //构造查询对象
        BarablahTextbookExample example = new BarablahTextbookExample();
        BarablahTextbookExample.Criteria c = example.createCriteria();
        c.andVideoEqualTo(video);
        List<BarablahTextbook> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }





}
