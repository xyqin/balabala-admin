package com.newhead.balabala.modules.balabalatextbookhomework.base;

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
import com.newhead.balabala.modules.balabalatextbookhomework.base.repository.dao.BalabalaTextbookHomeworkMapper;
import com.newhead.balabala.modules.balabalatextbookhomework.base.repository.entity.BalabalaTextbookHomework;
import com.newhead.balabala.modules.balabalatextbookhomework.base.repository.entity.BalabalaTextbookHomeworkExample;
import com.newhead.balabala.modules.balabalatextbookhomework.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.balabala.modules.balabalatextbook.base.repository.entity.BalabalaTextbook;
import com.newhead.balabala.modules.balabalatextbook.base.repository.entity.BalabalaTextbookExample;

import com.newhead.balabala.modules.balabalatextbook.base.repository.dao.BalabalaTextbookMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBalabalaTextbookHomeworkService extends BaseService {
    protected abstract BalabalaTextbookHomeworkMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaTextbookHomework entity);

    @Autowired
    protected BalabalaTextbookMapper balabalatextbookMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaTextbookHomework create(SimpleBalabalaTextbookHomeworkCreateRequest request) {
        BalabalaTextbookHomework entity = new BalabalaTextbookHomework();
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
    public BalabalaTextbookHomework update(SimpleBalabalaTextbookHomeworkUpdateRequest request) {
        BalabalaTextbookHomework entity = new BalabalaTextbookHomework();
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
    public SimpleBalabalaTextbookHomeworkGetDetailResponse getDetail(Long id) {
        BalabalaTextbookHomework entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaTextbookHomeworkGetDetailResponse response = new SimpleBalabalaTextbookHomeworkGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaTextbook  textbookIdEntity = balabalatextbookMapper.selectByPrimaryKey(Long.valueOf(entity.getTextbookId()));
        if (textbookIdEntity!=null) {
            LabelValueItem textbookIdObject = response.getTextbookIdObject();
            textbookIdObject.setName("textbookId");
            textbookIdObject.setLabel(textbookIdEntity.getTextbookName());
            textbookIdObject.setValue(String.valueOf(entity.getTextbookId()));
            textbookIdObject.setChecked(false);
        }
        LabelValueItem typeEnum = response.getTypeEnum();
        typeEnum.setName("type");
        typeEnum.setLabel(com.newhead.balabala.modules.balabalatextbookhomework.BalabalaTextbookHomeworkTypeEnum.getLabel(entity.getType()));
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
        BalabalaTextbookHomework entity = new BalabalaTextbookHomework();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaTextbookHomeworkQueryResponse> queryList(SimpleBalabalaTextbookHomeworkQueryListRequest request) {
        List<SimpleBalabalaTextbookHomeworkQueryResponse> results = new ArrayList<SimpleBalabalaTextbookHomeworkQueryResponse>();

        //构造查询对象
        BalabalaTextbookHomeworkExample example = new BalabalaTextbookHomeworkExample();
        BalabalaTextbookHomeworkExample.Criteria c = example.createCriteria();
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
    public Page<SimpleBalabalaTextbookHomeworkQueryResponse> queryPage(SimpleBalabalaTextbookHomeworkQueryPageRequest request) {
        //结果
        List<SimpleBalabalaTextbookHomeworkQueryResponse> results = new ArrayList<SimpleBalabalaTextbookHomeworkQueryResponse>();

        //构造查询对象
        BalabalaTextbookHomeworkExample example = new BalabalaTextbookHomeworkExample();
        BalabalaTextbookHomeworkExample.Criteria c = example.createCriteria();
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
    private void convertEntityToResponse(List<BalabalaTextbookHomework> entitys,List<SimpleBalabalaTextbookHomeworkQueryResponse> results) {
        Map<Long,Long> textbookIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> textbookIdResultMap = Maps.newHashMap();

       for(BalabalaTextbookHomework entity:entitys) {
            textbookIdMap.put(entity.getId(),entity.getTextbookId());
        }
        BalabalaTextbookExample textbookIdExample = new BalabalaTextbookExample();

        List<Long> textbookIds = new ArrayList<>();
        textbookIds.addAll(textbookIdMap.values());
        if (textbookIds.size()>0) {
            textbookIdExample.createCriteria().andIdIn(textbookIds);
        }
        List<BalabalaTextbook>  textbookIdList = balabalatextbookMapper.selectByExample(textbookIdExample);
        for(BalabalaTextbook item:textbookIdList) {
           LabelValueItem textbookIdItem = new LabelValueItem();
           textbookIdItem.setName("textbookId");
           textbookIdItem.setValue(String.valueOf(item.getId()));
           textbookIdItem.setLabel(item.getTextbookName());
           textbookIdResultMap.put(item.getId(),textbookIdItem);
        }
        //第一组
        for(BalabalaTextbookHomework entity:entitys) {
            SimpleBalabalaTextbookHomeworkQueryResponse response = new SimpleBalabalaTextbookHomeworkQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long textbookId = textbookIdMap.get(entity.getId());

            LabelValueItem textbookIdlvi = null;
            if (textbookId!=null && textbookIdResultMap.get(textbookId)!=null) {
                textbookIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(textbookIdResultMap.get(textbookId),textbookIdlvi);
            }
            response.setTextbookIdObject(textbookIdlvi);
            LabelValueItem typeEnum = response.getTypeEnum();
            typeEnum.setName("type");
            typeEnum.setLabel(com.newhead.balabala.modules.balabalatextbookhomework.BalabalaTextbookHomeworkTypeEnum.getLabel(entity.getType()));
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
     * @param homeworkName
     * @return
     */
    public BalabalaTextbookHomework existByHomeworkName(String homeworkName) {
        //构造查询对象
        BalabalaTextbookHomeworkExample example = new BalabalaTextbookHomeworkExample();
        BalabalaTextbookHomeworkExample.Criteria c = example.createCriteria();
        c.andHomeworkNameEqualTo(homeworkName);
        List<BalabalaTextbookHomework> list = getMapper().selectByExample(example);
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
    public BalabalaTextbookHomework existByQuestion(String question) {
        //构造查询对象
        BalabalaTextbookHomeworkExample example = new BalabalaTextbookHomeworkExample();
        BalabalaTextbookHomeworkExample.Criteria c = example.createCriteria();
        c.andQuestionEqualTo(question);
        List<BalabalaTextbookHomework> list = getMapper().selectByExample(example);
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
    public BalabalaTextbookHomework existByCorrect(String correct) {
        //构造查询对象
        BalabalaTextbookHomeworkExample example = new BalabalaTextbookHomeworkExample();
        BalabalaTextbookHomeworkExample.Criteria c = example.createCriteria();
        c.andCorrectEqualTo(correct);
        List<BalabalaTextbookHomework> list = getMapper().selectByExample(example);
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
    public BalabalaTextbookHomework existByImage(String image) {
        //构造查询对象
        BalabalaTextbookHomeworkExample example = new BalabalaTextbookHomeworkExample();
        BalabalaTextbookHomeworkExample.Criteria c = example.createCriteria();
        c.andImageEqualTo(image);
        List<BalabalaTextbookHomework> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }





}
