package com.newhead.balabala.modules.balabalacampus.base;

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
import com.newhead.balabala.modules.balabalacampus.base.repository.dao.BalabalaCampusMapper;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampus;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampusExample;
import com.newhead.balabala.modules.balabalacampus.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.balabala.modules.balabalaregion.base.repository.entity.BalabalaRegion;
import com.newhead.balabala.modules.balabalaregion.base.repository.entity.BalabalaRegionExample;

import com.newhead.balabala.modules.balabalaregion.base.repository.dao.BalabalaRegionMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBalabalaCampusService extends BaseService {
    protected abstract BalabalaCampusMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaCampus entity);

    @Autowired
    protected BalabalaRegionMapper balabalaregionMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaCampus create(SimpleBalabalaCampusCreateRequest request) {
        BalabalaCampus entity = new BalabalaCampus();
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
    public BalabalaCampus update(SimpleBalabalaCampusUpdateRequest request) {
        BalabalaCampus entity = new BalabalaCampus();
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
    public SimpleBalabalaCampusGetDetailResponse getDetail(Long id) {
        BalabalaCampus entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaCampusGetDetailResponse response = new SimpleBalabalaCampusGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaRegion  regionIdEntity = balabalaregionMapper.selectByPrimaryKey(Long.valueOf(entity.getRegionId()));
        if (regionIdEntity!=null) {
            LabelValueItem regionIdObject = response.getRegionIdObject();
            regionIdObject.setName("regionId");
            regionIdObject.setLabel(regionIdEntity.getRegionName());
            regionIdObject.setValue(String.valueOf(entity.getRegionId()));
            regionIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BalabalaCampus entity = new BalabalaCampus();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaCampusQueryResponse> queryList(SimpleBalabalaCampusQueryListRequest request) {
        List<SimpleBalabalaCampusQueryResponse> results = new ArrayList<SimpleBalabalaCampusQueryResponse>();

        //构造查询对象
        BalabalaCampusExample example = new BalabalaCampusExample();
        BalabalaCampusExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getCampusName()!=null) {
            c.andCampusNameLike("%"+request.getCampusName()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBalabalaCampusQueryResponse> queryPage(SimpleBalabalaCampusQueryPageRequest request) {
        //结果
        List<SimpleBalabalaCampusQueryResponse> results = new ArrayList<SimpleBalabalaCampusQueryResponse>();

        //构造查询对象
        BalabalaCampusExample example = new BalabalaCampusExample();
        BalabalaCampusExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getCampusName()!=null) {
            c.andCampusNameLike("%"+request.getCampusName()+"%");
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
    private void convertEntityToResponse(List<BalabalaCampus> entitys,List<SimpleBalabalaCampusQueryResponse> results) {
        Map<Long,Long> regionIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> regionIdResultMap = Maps.newHashMap();

       for(BalabalaCampus entity:entitys) {
            regionIdMap.put(entity.getId(),entity.getRegionId());
        }
        BalabalaRegionExample regionIdExample = new BalabalaRegionExample();

        List<Long> regionIds = new ArrayList<>();
        regionIds.addAll(regionIdMap.values());
        if (regionIds.size()>0) {
            regionIdExample.createCriteria().andIdIn(regionIds);
        }
        List<BalabalaRegion>  regionIdList = balabalaregionMapper.selectByExample(regionIdExample);
        for(BalabalaRegion item:regionIdList) {
           LabelValueItem regionIdItem = new LabelValueItem();
           regionIdItem.setName("regionId");
           regionIdItem.setValue(String.valueOf(item.getId()));
           regionIdItem.setLabel(item.getRegionName());
           regionIdResultMap.put(item.getId(),regionIdItem);
        }
        //第一组
        for(BalabalaCampus entity:entitys) {
            SimpleBalabalaCampusQueryResponse response = new SimpleBalabalaCampusQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long regionId = regionIdMap.get(entity.getId());

            LabelValueItem regionIdlvi = null;
            if (regionId!=null && regionIdResultMap.get(regionId)!=null) {
                regionIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(regionIdResultMap.get(regionId),regionIdlvi);
            }
            response.setRegionIdObject(regionIdlvi);
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
