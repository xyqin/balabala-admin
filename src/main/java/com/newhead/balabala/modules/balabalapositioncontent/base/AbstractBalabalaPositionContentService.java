package com.newhead.balabala.modules.balabalapositioncontent.base;

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
import com.newhead.balabala.modules.balabalapositioncontent.base.repository.dao.BalabalaPositionContentMapper;
import com.newhead.balabala.modules.balabalapositioncontent.base.repository.entity.BalabalaPositionContent;
import com.newhead.balabala.modules.balabalapositioncontent.base.repository.entity.BalabalaPositionContentExample;
import com.newhead.balabala.modules.balabalapositioncontent.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.balabala.modules.balabalaposition.base.repository.entity.BalabalaPosition;
import com.newhead.balabala.modules.balabalaposition.base.repository.entity.BalabalaPositionExample;

import com.newhead.balabala.modules.balabalaposition.base.repository.dao.BalabalaPositionMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBalabalaPositionContentService extends BaseService {
    protected abstract BalabalaPositionContentMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaPositionContent entity);

    @Autowired
    protected BalabalaPositionMapper balabalapositionMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaPositionContent create(SimpleBalabalaPositionContentCreateRequest request) {
        BalabalaPositionContent entity = new BalabalaPositionContent();
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
    public BalabalaPositionContent update(SimpleBalabalaPositionContentUpdateRequest request) {
        BalabalaPositionContent entity = new BalabalaPositionContent();
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
    public SimpleBalabalaPositionContentGetDetailResponse getDetail(Long id) {
        BalabalaPositionContent entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaPositionContentGetDetailResponse response = new SimpleBalabalaPositionContentGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaPosition  positionIdEntity = balabalapositionMapper.selectByPrimaryKey(Long.valueOf(entity.getPositionId()));
        if (positionIdEntity!=null) {
            LabelValueItem positionIdObject = response.getPositionIdObject();
            positionIdObject.setName("positionId");
            positionIdObject.setLabel(positionIdEntity.getPositionName());
            positionIdObject.setValue(String.valueOf(entity.getPositionId()));
            positionIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BalabalaPositionContent entity = new BalabalaPositionContent();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaPositionContentQueryResponse> queryList(SimpleBalabalaPositionContentQueryListRequest request) {
        List<SimpleBalabalaPositionContentQueryResponse> results = new ArrayList<SimpleBalabalaPositionContentQueryResponse>();

        //构造查询对象
        BalabalaPositionContentExample example = new BalabalaPositionContentExample();
        BalabalaPositionContentExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
            example.setOrderByClause("position desc");
        if (request.getContentName()!=null) {
            c.andContentNameLike("%"+request.getContentName()+"%");
        }

        if (request.getImage()!=null) {
            c.andImageLike("%"+request.getImage()+"%");
        }

        if (request.getLink()!=null) {
            c.andLinkLike("%"+request.getLink()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBalabalaPositionContentQueryResponse> queryPage(SimpleBalabalaPositionContentQueryPageRequest request) {
        //结果
        List<SimpleBalabalaPositionContentQueryResponse> results = new ArrayList<SimpleBalabalaPositionContentQueryResponse>();

        //构造查询对象
        BalabalaPositionContentExample example = new BalabalaPositionContentExample();
        BalabalaPositionContentExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
            example.setOrderByClause("position desc");

        if (request.getContentName()!=null) {
            c.andContentNameLike("%"+request.getContentName()+"%");
        }

        if (request.getImage()!=null) {
            c.andImageLike("%"+request.getImage()+"%");
        }

        if (request.getLink()!=null) {
            c.andLinkLike("%"+request.getLink()+"%");
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
    private void convertEntityToResponse(List<BalabalaPositionContent> entitys,List<SimpleBalabalaPositionContentQueryResponse> results) {
        Map<Long,Long> positionIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> positionIdResultMap = Maps.newHashMap();

       for(BalabalaPositionContent entity:entitys) {
            positionIdMap.put(entity.getId(),entity.getPositionId());
        }
        BalabalaPositionExample positionIdExample = new BalabalaPositionExample();

        List<Long> positionIds = new ArrayList<>();
        positionIds.addAll(positionIdMap.values());
        if (positionIds.size()>0) {
            positionIdExample.createCriteria().andIdIn(positionIds);
        }
        List<BalabalaPosition>  positionIdList = balabalapositionMapper.selectByExample(positionIdExample);
        for(BalabalaPosition item:positionIdList) {
           LabelValueItem positionIdItem = new LabelValueItem();
           positionIdItem.setName("positionId");
           positionIdItem.setValue(String.valueOf(item.getId()));
           positionIdItem.setLabel(item.getPositionName());
           positionIdResultMap.put(item.getId(),positionIdItem);
        }
        //第一组
        for(BalabalaPositionContent entity:entitys) {
            SimpleBalabalaPositionContentQueryResponse response = new SimpleBalabalaPositionContentQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long positionId = positionIdMap.get(entity.getId());

            LabelValueItem positionIdlvi = null;
            if (positionId!=null && positionIdResultMap.get(positionId)!=null) {
                positionIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(positionIdResultMap.get(positionId),positionIdlvi);
            }
            response.setPositionIdObject(positionIdlvi);
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
