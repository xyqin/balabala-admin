package com.newhead.barablah.modules.barablahmemberpassport.base;

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
import com.newhead.barablah.modules.barablahmemberpassport.base.repository.dao.BarablahMemberPassportMapper;
import com.newhead.barablah.modules.barablahmemberpassport.base.repository.entity.BarablahMemberPassport;
import com.newhead.barablah.modules.barablahmemberpassport.base.repository.entity.BarablahMemberPassportExample;
import com.newhead.barablah.modules.barablahmemberpassport.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


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
public abstract class AbstractBarablahMemberPassportService extends BaseService {
    protected abstract BarablahMemberPassportMapper getMapper();

    protected abstract void saveOrUpdate(BarablahMemberPassport entity);

    @Autowired
    protected BarablahMemberMapper barablahmemberMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahMemberPassport create(SimpleBarablahMemberPassportCreateRequest request) {
        BarablahMemberPassport entity = new BarablahMemberPassport();
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
    public BarablahMemberPassport update(SimpleBarablahMemberPassportUpdateRequest request) {
        BarablahMemberPassport entity = new BarablahMemberPassport();
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
    public SimpleBarablahMemberPassportGetDetailResponse getDetail(Long id) {
        BarablahMemberPassport entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahMemberPassportGetDetailResponse response = new SimpleBarablahMemberPassportGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahMember  memberIdEntity = barablahmemberMapper.selectByPrimaryKey(Long.valueOf(entity.getMemberId()));
        if (memberIdEntity!=null) {
            LabelValueItem memberIdObject = response.getMemberIdObject();
            memberIdObject.setName("memberId");
            memberIdObject.setLabel(memberIdEntity.getNickname());
            memberIdObject.setValue(String.valueOf(entity.getMemberId()));
            memberIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahMemberPassport entity = new BarablahMemberPassport();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahMemberPassportQueryResponse> queryList(SimpleBarablahMemberPassportQueryListRequest request) {
        List<SimpleBarablahMemberPassportQueryResponse> results = new ArrayList<SimpleBarablahMemberPassportQueryResponse>();

        //构造查询对象
        BarablahMemberPassportExample example = new BarablahMemberPassportExample();
        BarablahMemberPassportExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahMemberPassportQueryResponse> queryPage(SimpleBarablahMemberPassportQueryPageRequest request) {
        //结果
        List<SimpleBarablahMemberPassportQueryResponse> results = new ArrayList<SimpleBarablahMemberPassportQueryResponse>();

        //构造查询对象
        BarablahMemberPassportExample example = new BarablahMemberPassportExample();
        BarablahMemberPassportExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
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
    private void convertEntityToResponse(List<BarablahMemberPassport> entitys,List<SimpleBarablahMemberPassportQueryResponse> results) {
        Map<Long,Long> memberIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> memberIdResultMap = Maps.newHashMap();

       for(BarablahMemberPassport entity:entitys) {
            memberIdMap.put(entity.getId(),entity.getMemberId());
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
        //第一组
        for(BarablahMemberPassport entity:entitys) {
            SimpleBarablahMemberPassportQueryResponse response = new SimpleBarablahMemberPassportQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long memberId = memberIdMap.get(entity.getId());

            LabelValueItem memberIdlvi = null;
            if (memberId!=null && memberIdResultMap.get(memberId)!=null) {
                memberIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(memberIdResultMap.get(memberId),memberIdlvi);
            }
            response.setMemberIdObject(memberIdlvi);
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
