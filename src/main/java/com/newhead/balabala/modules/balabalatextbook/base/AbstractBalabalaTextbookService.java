package com.newhead.balabala.modules.balabalatextbook.base;

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
import com.newhead.balabala.modules.balabalatextbook.base.repository.dao.BalabalaTextbookMapper;
import com.newhead.balabala.modules.balabalatextbook.base.repository.entity.BalabalaTextbook;
import com.newhead.balabala.modules.balabalatextbook.base.repository.entity.BalabalaTextbookExample;
import com.newhead.balabala.modules.balabalatextbook.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategory;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategoryExample;

import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.dao.BalabalaTextbookCategoryMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBalabalaTextbookService extends BaseService {
    protected abstract BalabalaTextbookMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaTextbook entity);

    @Autowired
    protected BalabalaTextbookCategoryMapper balabalatextbookcategoryMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaTextbook create(SimpleBalabalaTextbookCreateRequest request) {
        BalabalaTextbook entity = new BalabalaTextbook();
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
    public BalabalaTextbook update(SimpleBalabalaTextbookUpdateRequest request) {
        BalabalaTextbook entity = new BalabalaTextbook();
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
    public SimpleBalabalaTextbookGetDetailResponse getDetail(Long id) {
        BalabalaTextbook entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaTextbookGetDetailResponse response = new SimpleBalabalaTextbookGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaTextbookCategory  categoryIdEntity = balabalatextbookcategoryMapper.selectByPrimaryKey(Long.valueOf(entity.getCategoryId()));
        if (categoryIdEntity!=null) {
            LabelValueItem categoryIdObject = response.getCategoryIdObject();
            categoryIdObject.setName("categoryId");
            categoryIdObject.setLabel(categoryIdEntity.getCategoryName());
            categoryIdObject.setValue(String.valueOf(entity.getCategoryId()));
            categoryIdObject.setChecked(false);
        }
        LabelValueItem typeEnum = response.getTypeEnum();
        typeEnum.setName("type");
        typeEnum.setLabel(com.newhead.balabala.modules.balabalatextbook.BalabalaTextbookTypeEnum.getLabel(entity.getType()));
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
        BalabalaTextbook entity = new BalabalaTextbook();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaTextbookQueryResponse> queryList(SimpleBalabalaTextbookQueryListRequest request) {
        List<SimpleBalabalaTextbookQueryResponse> results = new ArrayList<SimpleBalabalaTextbookQueryResponse>();

        //构造查询对象
        BalabalaTextbookExample example = new BalabalaTextbookExample();
        BalabalaTextbookExample.Criteria c = example.createCriteria();
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
    public Page<SimpleBalabalaTextbookQueryResponse> queryPage(SimpleBalabalaTextbookQueryPageRequest request) {
        //结果
        List<SimpleBalabalaTextbookQueryResponse> results = new ArrayList<SimpleBalabalaTextbookQueryResponse>();

        //构造查询对象
        BalabalaTextbookExample example = new BalabalaTextbookExample();
        BalabalaTextbookExample.Criteria c = example.createCriteria();
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
    private void convertEntityToResponse(List<BalabalaTextbook> entitys,List<SimpleBalabalaTextbookQueryResponse> results) {
        Map<Long,Long> categoryIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> categoryIdResultMap = Maps.newHashMap();

       for(BalabalaTextbook entity:entitys) {
            categoryIdMap.put(entity.getId(),entity.getCategoryId());
        }
        BalabalaTextbookCategoryExample categoryIdExample = new BalabalaTextbookCategoryExample();

        List<Long> categoryIds = new ArrayList<>();
        categoryIds.addAll(categoryIdMap.values());
        if (categoryIds.size()>0) {
            categoryIdExample.createCriteria().andIdIn(categoryIds);
        }
        List<BalabalaTextbookCategory>  categoryIdList = balabalatextbookcategoryMapper.selectByExample(categoryIdExample);
        for(BalabalaTextbookCategory item:categoryIdList) {
           LabelValueItem categoryIdItem = new LabelValueItem();
           categoryIdItem.setName("categoryId");
           categoryIdItem.setValue(String.valueOf(item.getId()));
           categoryIdItem.setLabel(item.getCategoryName());
           categoryIdResultMap.put(item.getId(),categoryIdItem);
        }
        //第一组
        for(BalabalaTextbook entity:entitys) {
            SimpleBalabalaTextbookQueryResponse response = new SimpleBalabalaTextbookQueryResponse();
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
            typeEnum.setLabel(com.newhead.balabala.modules.balabalatextbook.BalabalaTextbookTypeEnum.getLabel(entity.getType()));
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
    public BalabalaTextbook existByTextbookName(String textbookName) {
        //构造查询对象
        BalabalaTextbookExample example = new BalabalaTextbookExample();
        BalabalaTextbookExample.Criteria c = example.createCriteria();
        c.andTextbookNameEqualTo(textbookName);
        List<BalabalaTextbook> list = getMapper().selectByExample(example);
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
    public BalabalaTextbook existByQuestion(String question) {
        //构造查询对象
        BalabalaTextbookExample example = new BalabalaTextbookExample();
        BalabalaTextbookExample.Criteria c = example.createCriteria();
        c.andQuestionEqualTo(question);
        List<BalabalaTextbook> list = getMapper().selectByExample(example);
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
    public BalabalaTextbook existByOption(String option) {
        //构造查询对象
        BalabalaTextbookExample example = new BalabalaTextbookExample();
        BalabalaTextbookExample.Criteria c = example.createCriteria();
        c.andOptionEqualTo(option);
        List<BalabalaTextbook> list = getMapper().selectByExample(example);
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
    public BalabalaTextbook existByCorrect(String correct) {
        //构造查询对象
        BalabalaTextbookExample example = new BalabalaTextbookExample();
        BalabalaTextbookExample.Criteria c = example.createCriteria();
        c.andCorrectEqualTo(correct);
        List<BalabalaTextbook> list = getMapper().selectByExample(example);
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
    public BalabalaTextbook existByImage(String image) {
        //构造查询对象
        BalabalaTextbookExample example = new BalabalaTextbookExample();
        BalabalaTextbookExample.Criteria c = example.createCriteria();
        c.andImageEqualTo(image);
        List<BalabalaTextbook> list = getMapper().selectByExample(example);
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
    public BalabalaTextbook existByVideo(String video) {
        //构造查询对象
        BalabalaTextbookExample example = new BalabalaTextbookExample();
        BalabalaTextbookExample.Criteria c = example.createCriteria();
        c.andVideoEqualTo(video);
        List<BalabalaTextbook> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }





}