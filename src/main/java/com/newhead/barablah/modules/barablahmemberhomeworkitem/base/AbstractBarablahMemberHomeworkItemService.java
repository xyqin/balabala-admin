package com.newhead.barablah.modules.barablahmemberhomeworkitem.base;

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
import com.newhead.barablah.modules.barablahmemberhomeworkitem.base.repository.dao.BarablahMemberHomeworkItemMapper;
import com.newhead.barablah.modules.barablahmemberhomeworkitem.base.repository.entity.BarablahMemberHomeworkItem;
import com.newhead.barablah.modules.barablahmemberhomeworkitem.base.repository.entity.BarablahMemberHomeworkItemExample;
import com.newhead.barablah.modules.barablahmemberhomeworkitem.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbook;
import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbookExample;

import com.newhead.barablah.modules.barablahtextbook.base.repository.dao.BarablahTextbookMapper;
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.entity.BarablahMemberHomework;
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.entity.BarablahMemberHomeworkExample;

import com.newhead.barablah.modules.barablahmemberhomework.base.repository.dao.BarablahMemberHomeworkMapper;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMember;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMemberExample;

import com.newhead.barablah.modules.barablahmember.base.repository.dao.BarablahMemberMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBarablahMemberHomeworkItemService extends BaseService {
    protected abstract BarablahMemberHomeworkItemMapper getMapper();

    protected abstract void saveOrUpdate(BarablahMemberHomeworkItem entity);

    @Autowired
    protected BarablahTextbookMapper barablahtextbookMapper;
    @Autowired
    protected BarablahMemberHomeworkMapper barablahmemberhomeworkMapper;
    @Autowired
    protected BarablahMemberMapper barablahmemberMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahMemberHomeworkItem create(SimpleBarablahMemberHomeworkItemCreateRequest request) {
        BarablahMemberHomeworkItem entity = new BarablahMemberHomeworkItem();
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
    public BarablahMemberHomeworkItem update(SimpleBarablahMemberHomeworkItemUpdateRequest request) {
        BarablahMemberHomeworkItem entity = new BarablahMemberHomeworkItem();
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
    public SimpleBarablahMemberHomeworkItemGetDetailResponse getDetail(Long id) {
        BarablahMemberHomeworkItem entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahMemberHomeworkItemGetDetailResponse response = new SimpleBarablahMemberHomeworkItemGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahMember  memberIdEntity = barablahmemberMapper.selectByPrimaryKey(Long.valueOf(entity.getMemberId()));
        if (memberIdEntity!=null) {
            LabelValueItem memberIdObject = response.getMemberIdObject();
            memberIdObject.setName("memberId");
            memberIdObject.setLabel(memberIdEntity.getNickname());
            memberIdObject.setValue(String.valueOf(entity.getMemberId()));
            memberIdObject.setChecked(false);
        }
        BarablahMemberHomework  homeworkIdEntity = barablahmemberhomeworkMapper.selectByPrimaryKey(Long.valueOf(entity.getHomeworkId()));
        if (homeworkIdEntity!=null) {
            LabelValueItem homeworkIdObject = response.getHomeworkIdObject();
            homeworkIdObject.setName("homeworkId");
            homeworkIdObject.setLabel(homeworkIdEntity.getHomeworkName());
            homeworkIdObject.setValue(String.valueOf(entity.getHomeworkId()));
            homeworkIdObject.setChecked(false);
        }
        BarablahTextbook  textbookIdEntity = barablahtextbookMapper.selectByPrimaryKey(Long.valueOf(entity.getTextbookId()));
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
        BarablahMemberHomeworkItem entity = new BarablahMemberHomeworkItem();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahMemberHomeworkItemQueryResponse> queryList(SimpleBarablahMemberHomeworkItemQueryListRequest request) {
        List<SimpleBarablahMemberHomeworkItemQueryResponse> results = new ArrayList<SimpleBarablahMemberHomeworkItemQueryResponse>();

        //构造查询对象
        BarablahMemberHomeworkItemExample example = new BarablahMemberHomeworkItemExample();
        BarablahMemberHomeworkItemExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahMemberHomeworkItemQueryResponse> queryPage(SimpleBarablahMemberHomeworkItemQueryPageRequest request) {
        //结果
        List<SimpleBarablahMemberHomeworkItemQueryResponse> results = new ArrayList<SimpleBarablahMemberHomeworkItemQueryResponse>();

        //构造查询对象
        BarablahMemberHomeworkItemExample example = new BarablahMemberHomeworkItemExample();
        BarablahMemberHomeworkItemExample.Criteria c = example.createCriteria();
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
    private void convertEntityToResponse(List<BarablahMemberHomeworkItem> entitys,List<SimpleBarablahMemberHomeworkItemQueryResponse> results) {
        Map<Long,Long> memberIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> memberIdResultMap = Maps.newHashMap();

        Map<Long,Long> homeworkIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> homeworkIdResultMap = Maps.newHashMap();

        Map<Long,Long> textbookIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> textbookIdResultMap = Maps.newHashMap();

       for(BarablahMemberHomeworkItem entity:entitys) {
            memberIdMap.put(entity.getId(),entity.getMemberId());
            homeworkIdMap.put(entity.getId(),entity.getHomeworkId());
            textbookIdMap.put(entity.getId(),entity.getTextbookId());
        }
        BarablahMemberExample memberIdExample = new BarablahMemberExample();

        List<Long> memberIds = new ArrayList<>();
        memberIds.addAll(memberIdMap.values());
        if (memberIds.size()>0) {
            memberIdExample.createCriteria().andIdIn(memberIds);
        }
        List<BarablahMember>  memberIdList = barablahmemberMapper.selectByExample(memberIdExample);
        for(BarablahMember item:memberIdList) {
           LabelValueItem memberIdItem = new LabelValueItem();
           memberIdItem.setName("memberId");
           memberIdItem.setValue(String.valueOf(item.getId()));
           memberIdItem.setLabel(item.getNickname());
           memberIdResultMap.put(item.getId(),memberIdItem);
        }
        BarablahMemberHomeworkExample homeworkIdExample = new BarablahMemberHomeworkExample();

        List<Long> homeworkIds = new ArrayList<>();
        homeworkIds.addAll(homeworkIdMap.values());
        if (homeworkIds.size()>0) {
            homeworkIdExample.createCriteria().andIdIn(homeworkIds);
        }
        List<BarablahMemberHomework>  homeworkIdList = barablahmemberhomeworkMapper.selectByExample(homeworkIdExample);
        for(BarablahMemberHomework item:homeworkIdList) {
           LabelValueItem homeworkIdItem = new LabelValueItem();
           homeworkIdItem.setName("homeworkId");
           homeworkIdItem.setValue(String.valueOf(item.getId()));
           homeworkIdItem.setLabel(item.getHomeworkName());
           homeworkIdResultMap.put(item.getId(),homeworkIdItem);
        }
        BarablahTextbookExample textbookIdExample = new BarablahTextbookExample();

        List<Long> textbookIds = new ArrayList<>();
        textbookIds.addAll(textbookIdMap.values());
        if (textbookIds.size()>0) {
            textbookIdExample.createCriteria().andIdIn(textbookIds);
        }
        List<BarablahTextbook>  textbookIdList = barablahtextbookMapper.selectByExample(textbookIdExample);
        for(BarablahTextbook item:textbookIdList) {
           LabelValueItem textbookIdItem = new LabelValueItem();
           textbookIdItem.setName("textbookId");
           textbookIdItem.setValue(String.valueOf(item.getId()));
           textbookIdItem.setLabel(item.getTextbookName());
           textbookIdResultMap.put(item.getId(),textbookIdItem);
        }
        //第一组
        for(BarablahMemberHomeworkItem entity:entitys) {
            SimpleBarablahMemberHomeworkItemQueryResponse response = new SimpleBarablahMemberHomeworkItemQueryResponse();
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
    public BarablahMemberHomeworkItem existByAnswer(String answer) {
        //构造查询对象
        BarablahMemberHomeworkItemExample example = new BarablahMemberHomeworkItemExample();
        BarablahMemberHomeworkItemExample.Criteria c = example.createCriteria();
        c.andAnswerEqualTo(answer);
        List<BarablahMemberHomeworkItem> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }





}
