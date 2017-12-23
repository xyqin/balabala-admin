package com.newhead.balabala.modules.balabalamembershippingaddress.base;

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
import com.newhead.balabala.modules.balabalamembershippingaddress.base.repository.dao.BalabalaMemberShippingAddressMapper;
import com.newhead.balabala.modules.balabalamembershippingaddress.base.repository.entity.BalabalaMemberShippingAddress;
import com.newhead.balabala.modules.balabalamembershippingaddress.base.repository.entity.BalabalaMemberShippingAddressExample;
import com.newhead.balabala.modules.balabalamembershippingaddress.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


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
public abstract class AbstractBalabalaMemberShippingAddressService extends BaseService {
    protected abstract BalabalaMemberShippingAddressMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaMemberShippingAddress entity);

    @Autowired
    protected BalabalaMemberMapper balabalamemberMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaMemberShippingAddress create(SimpleBalabalaMemberShippingAddressCreateRequest request) {
        BalabalaMemberShippingAddress entity = new BalabalaMemberShippingAddress();
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
    public BalabalaMemberShippingAddress update(SimpleBalabalaMemberShippingAddressUpdateRequest request) {
        BalabalaMemberShippingAddress entity = new BalabalaMemberShippingAddress();
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
    public SimpleBalabalaMemberShippingAddressGetDetailResponse getDetail(Long id) {
        BalabalaMemberShippingAddress entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaMemberShippingAddressGetDetailResponse response = new SimpleBalabalaMemberShippingAddressGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaMember  memberIdEntity = balabalamemberMapper.selectByPrimaryKey(Long.valueOf(entity.getMemberId()));
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
        BalabalaMemberShippingAddress entity = new BalabalaMemberShippingAddress();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaMemberShippingAddressQueryResponse> queryList(SimpleBalabalaMemberShippingAddressQueryListRequest request) {
        List<SimpleBalabalaMemberShippingAddressQueryResponse> results = new ArrayList<SimpleBalabalaMemberShippingAddressQueryResponse>();

        //构造查询对象
        BalabalaMemberShippingAddressExample example = new BalabalaMemberShippingAddressExample();
        BalabalaMemberShippingAddressExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBalabalaMemberShippingAddressQueryResponse> queryPage(SimpleBalabalaMemberShippingAddressQueryPageRequest request) {
        //结果
        List<SimpleBalabalaMemberShippingAddressQueryResponse> results = new ArrayList<SimpleBalabalaMemberShippingAddressQueryResponse>();

        //构造查询对象
        BalabalaMemberShippingAddressExample example = new BalabalaMemberShippingAddressExample();
        BalabalaMemberShippingAddressExample.Criteria c = example.createCriteria();
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
    private void convertEntityToResponse(List<BalabalaMemberShippingAddress> entitys,List<SimpleBalabalaMemberShippingAddressQueryResponse> results) {
        Map<Long,Long> memberIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> memberIdResultMap = Maps.newHashMap();

       for(BalabalaMemberShippingAddress entity:entitys) {
            memberIdMap.put(entity.getId(),entity.getMemberId());
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
        //第一组
        for(BalabalaMemberShippingAddress entity:entitys) {
            SimpleBalabalaMemberShippingAddressQueryResponse response = new SimpleBalabalaMemberShippingAddressQueryResponse();
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
