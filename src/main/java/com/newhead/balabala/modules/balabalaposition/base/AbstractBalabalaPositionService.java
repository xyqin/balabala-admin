package com.newhead.balabala.modules.balabalaposition.base;

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
import com.newhead.balabala.modules.balabalaposition.base.repository.dao.BalabalaPositionMapper;
import com.newhead.balabala.modules.balabalaposition.base.repository.entity.BalabalaPosition;
import com.newhead.balabala.modules.balabalaposition.base.repository.entity.BalabalaPositionExample;
import com.newhead.balabala.modules.balabalaposition.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBalabalaPositionService extends BaseService {
    protected abstract BalabalaPositionMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaPosition entity);


    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaPosition create(SimpleBalabalaPositionCreateRequest request) {
        BalabalaPosition entity = new BalabalaPosition();
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
    public BalabalaPosition update(SimpleBalabalaPositionUpdateRequest request) {
        BalabalaPosition entity = new BalabalaPosition();
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
    public SimpleBalabalaPositionGetDetailResponse getDetail(Long id) {
        BalabalaPosition entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaPositionGetDetailResponse response = new SimpleBalabalaPositionGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BalabalaPosition entity = new BalabalaPosition();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaPositionQueryResponse> queryList(SimpleBalabalaPositionQueryListRequest request) {
        List<SimpleBalabalaPositionQueryResponse> results = new ArrayList<SimpleBalabalaPositionQueryResponse>();

        //构造查询对象
        BalabalaPositionExample example = new BalabalaPositionExample();
        BalabalaPositionExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getPositionName()!=null) {
            c.andPositionNameLike("%"+request.getPositionName()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBalabalaPositionQueryResponse> queryPage(SimpleBalabalaPositionQueryPageRequest request) {
        //结果
        List<SimpleBalabalaPositionQueryResponse> results = new ArrayList<SimpleBalabalaPositionQueryResponse>();

        //构造查询对象
        BalabalaPositionExample example = new BalabalaPositionExample();
        BalabalaPositionExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getPositionName()!=null) {
            c.andPositionNameLike("%"+request.getPositionName()+"%");
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
    private void convertEntityToResponse(List<BalabalaPosition> entitys,List<SimpleBalabalaPositionQueryResponse> results) {
       for(BalabalaPosition entity:entitys) {
        }
        //第一组
        for(BalabalaPosition entity:entitys) {
            SimpleBalabalaPositionQueryResponse response = new SimpleBalabalaPositionQueryResponse();
            BeanUtils.copyProperties(entity,response);
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
