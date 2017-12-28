package com.newhead.balabala.modules.balabalamemberhomeworkitem.base;

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
import com.newhead.balabala.modules.balabalamemberhomeworkitem.base.repository.dao.BalabalaMemberHomeworkItemMapper;
import com.newhead.balabala.modules.balabalamemberhomeworkitem.base.repository.entity.BalabalaMemberHomeworkItem;
import com.newhead.balabala.modules.balabalamemberhomeworkitem.base.repository.entity.BalabalaMemberHomeworkItemExample;
import com.newhead.balabala.modules.balabalamemberhomeworkitem.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.balabala.modules.balabalamemberhomework.base.repository.entity.BalabalaMemberHomework;
import com.newhead.balabala.modules.balabalamemberhomework.base.repository.entity.BalabalaMemberHomeworkExample;

import com.newhead.balabala.modules.balabalamemberhomework.base.repository.dao.BalabalaMemberHomeworkMapper;
import com.newhead.balabala.modules.balabalatextbook.base.repository.entity.BalabalaTextbook;
import com.newhead.balabala.modules.balabalatextbook.base.repository.entity.BalabalaTextbookExample;

import com.newhead.balabala.modules.balabalatextbook.base.repository.dao.BalabalaTextbookMapper;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMember;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMemberExample;

import com.newhead.balabala.modules.balabalamember.base.repository.dao.BalabalaMemberMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBalabalaMemberHomeworkItemService extends BaseService {
    protected abstract BalabalaMemberHomeworkItemMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaMemberHomeworkItem entity);

    @Autowired
    protected BalabalaMemberHomeworkMapper balabalamemberhomeworkMapper;
    @Autowired
    protected BalabalaTextbookMapper balabalatextbookMapper;
    @Autowired
    protected BalabalaMemberMapper balabalamemberMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaMemberHomeworkItem create(SimpleBalabalaMemberHomeworkItemCreateRequest request) {
        BalabalaMemberHomeworkItem entity = new BalabalaMemberHomeworkItem();
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
    public BalabalaMemberHomeworkItem update(SimpleBalabalaMemberHomeworkItemUpdateRequest request) {
        BalabalaMemberHomeworkItem entity = new BalabalaMemberHomeworkItem();
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
    public SimpleBalabalaMemberHomeworkItemGetDetailResponse getDetail(Long id) {
        BalabalaMemberHomeworkItem entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaMemberHomeworkItemGetDetailResponse response = new SimpleBalabalaMemberHomeworkItemGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaMember  memberIdEntity = balabalamemberMapper.selectByPrimaryKey(Long.valueOf(entity.getMemberId()));
        if (memberIdEntity!=null) {
            LabelValueItem memberIdObject = response.getMemberIdObject();
            memberIdObject.setName("memberId");
            memberIdObject.setLabel(memberIdEntity.getNickname());
            memberIdObject.setValue(String.valueOf(entity.getMemberId()));
            memberIdObject.setChecked(false);
        }
        BalabalaMemberHomework  homeworkIdEntity = balabalamemberhomeworkMapper.selectByPrimaryKey(Long.valueOf(entity.getHomeworkId()));
        if (homeworkIdEntity!=null) {
            LabelValueItem homeworkIdObject = response.getHomeworkIdObject();
            homeworkIdObject.setName("homeworkId");
            homeworkIdObject.setLabel(homeworkIdEntity.getHomeworkName());
            homeworkIdObject.setValue(String.valueOf(entity.getHomeworkId()));
            homeworkIdObject.setChecked(false);
        }
        BalabalaTextbook  textbookIdEntity = balabalatextbookMapper.selectByPrimaryKey(Long.valueOf(entity.getTextbookId()));
        if (textbookIdEntity!=null) {
            LabelValueItem textbookIdObject = response.getTextbookIdObject();
            textbookIdObject.setName("textbookId");
            textbookIdObject.setLabel(textbookIdEntity.getTextbookName());
            textbookIdObject.setValue(String.valueOf(entity.getTextbookId()));
            textbookIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BalabalaMemberHomeworkItem entity = new BalabalaMemberHomeworkItem();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaMemberHomeworkItemQueryResponse> queryList(SimpleBalabalaMemberHomeworkItemQueryListRequest request) {
        List<SimpleBalabalaMemberHomeworkItemQueryResponse> results = new ArrayList<SimpleBalabalaMemberHomeworkItemQueryResponse>();

        //构造查询对象
        BalabalaMemberHomeworkItemExample example = new BalabalaMemberHomeworkItemExample();
        BalabalaMemberHomeworkItemExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBalabalaMemberHomeworkItemQueryResponse> queryPage(SimpleBalabalaMemberHomeworkItemQueryPageRequest request) {
        //结果
        List<SimpleBalabalaMemberHomeworkItemQueryResponse> results = new ArrayList<SimpleBalabalaMemberHomeworkItemQueryResponse>();

        //构造查询对象
        BalabalaMemberHomeworkItemExample example = new BalabalaMemberHomeworkItemExample();
        BalabalaMemberHomeworkItemExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

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
    private void convertEntityToResponse(List<BalabalaMemberHomeworkItem> entitys,List<SimpleBalabalaMemberHomeworkItemQueryResponse> results) {
        Map<Long,Long> memberIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> memberIdResultMap = Maps.newHashMap();

        Map<Long,Long> homeworkIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> homeworkIdResultMap = Maps.newHashMap();

        Map<Long,Long> textbookIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> textbookIdResultMap = Maps.newHashMap();

       for(BalabalaMemberHomeworkItem entity:entitys) {
            memberIdMap.put(entity.getId(),entity.getMemberId());
            homeworkIdMap.put(entity.getId(),entity.getHomeworkId());
            textbookIdMap.put(entity.getId(),entity.getTextbookId());
        }
        BalabalaMemberExample memberIdExample = new BalabalaMemberExample();

        List<Long> memberIds = new ArrayList<>();
        memberIds.addAll(memberIdMap.values());
        if (memberIds.size()>0) {
            memberIdExample.createCriteria().andIdIn(memberIds);
        }
        List<BalabalaMember>  memberIdList = balabalamemberMapper.selectByExample(memberIdExample);
        for(BalabalaMember item:memberIdList) {
           LabelValueItem memberIdItem = new LabelValueItem();
           memberIdItem.setName("memberId");
           memberIdItem.setValue(String.valueOf(item.getId()));
           memberIdItem.setLabel(item.getNickname());
           memberIdResultMap.put(item.getId(),memberIdItem);
        }
        BalabalaMemberHomeworkExample homeworkIdExample = new BalabalaMemberHomeworkExample();

        List<Long> homeworkIds = new ArrayList<>();
        homeworkIds.addAll(homeworkIdMap.values());
        if (homeworkIds.size()>0) {
            homeworkIdExample.createCriteria().andIdIn(homeworkIds);
        }
        List<BalabalaMemberHomework>  homeworkIdList = balabalamemberhomeworkMapper.selectByExample(homeworkIdExample);
        for(BalabalaMemberHomework item:homeworkIdList) {
           LabelValueItem homeworkIdItem = new LabelValueItem();
           homeworkIdItem.setName("homeworkId");
           homeworkIdItem.setValue(String.valueOf(item.getId()));
           homeworkIdItem.setLabel(item.getHomeworkName());
           homeworkIdResultMap.put(item.getId(),homeworkIdItem);
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
        for(BalabalaMemberHomeworkItem entity:entitys) {
            SimpleBalabalaMemberHomeworkItemQueryResponse response = new SimpleBalabalaMemberHomeworkItemQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long memberId = memberIdMap.get(entity.getId());

            LabelValueItem memberIdlvi = null;
            if (memberId!=null && memberIdResultMap.get(memberId)!=null) {
                memberIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(memberIdResultMap.get(memberId),memberIdlvi);
            }
            response.setMemberIdObject(memberIdlvi);
            Long homeworkId = homeworkIdMap.get(entity.getId());

            LabelValueItem homeworkIdlvi = null;
            if (homeworkId!=null && homeworkIdResultMap.get(homeworkId)!=null) {
                homeworkIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(homeworkIdResultMap.get(homeworkId),homeworkIdlvi);
            }
            response.setHomeworkIdObject(homeworkIdlvi);
            Long textbookId = textbookIdMap.get(entity.getId());

            LabelValueItem textbookIdlvi = null;
            if (textbookId!=null && textbookIdResultMap.get(textbookId)!=null) {
                textbookIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(textbookIdResultMap.get(textbookId),textbookIdlvi);
            }
            response.setTextbookIdObject(textbookIdlvi);
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
     * @param answer
     * @return
     */
    public BalabalaMemberHomeworkItem existByAnswer(String answer) {
        //构造查询对象
        BalabalaMemberHomeworkItemExample example = new BalabalaMemberHomeworkItemExample();
        BalabalaMemberHomeworkItemExample.Criteria c = example.createCriteria();
        c.andAnswerEqualTo(answer);
        List<BalabalaMemberHomeworkItem> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }





}
