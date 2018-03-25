package com.newhead.barablah.modules.barablahcountry.base;

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
import com.newhead.barablah.modules.barablahcountry.base.repository.dao.BarablahCountryMapper;
import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountry;
import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountryExample;
import com.newhead.barablah.modules.barablahcountry.ext.protocol.*;
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
public abstract class AbstractBarablahCountryService extends BaseService {
    protected abstract BarablahCountryMapper getMapper();

    protected abstract void saveOrUpdate(BarablahCountry entity);


    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahCountry create(SimpleBarablahCountryCreateRequest request) {
        BarablahCountry entity = new BarablahCountry();
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
    public BarablahCountry update(SimpleBarablahCountryUpdateRequest request) {
        BarablahCountry entity = new BarablahCountry();
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
    public SimpleBarablahCountryGetDetailResponse getDetail(Long id) {
        BarablahCountry entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahCountryGetDetailResponse response = new SimpleBarablahCountryGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahCountry entity = new BarablahCountry();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahCountryQueryResponse> queryList(SimpleBarablahCountryQueryListRequest request) {
        List<SimpleBarablahCountryQueryResponse> results = new ArrayList<SimpleBarablahCountryQueryResponse>();

        //构造查询对象
        BarablahCountryExample example = new BarablahCountryExample();
        BarablahCountryExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id asc";
        example.setOrderByClause(ordersrc);

        if (request.getName()!=null) {
            c.andNameLike("%"+request.getName()+"%");
        }

        if (request.getZhName()!=null) {
            c.andZhNameLike("%"+request.getZhName()+"%");
        }

        if (request.getCode()!=null) {
            c.andCodeLike("%"+request.getCode()+"%");
        }

        if (request.getCode2()!=null) {
            c.andCode2Like("%"+request.getCode2()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahCountryQueryResponse> queryPage(SimpleBarablahCountryQueryPageRequest request) {
        //结果
        List<SimpleBarablahCountryQueryResponse> results = new ArrayList<SimpleBarablahCountryQueryResponse>();

        //构造查询对象
        BarablahCountryExample example = new BarablahCountryExample();
        BarablahCountryExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getName()!=null) {
            c.andNameLike("%"+request.getName()+"%");
        }
        if (request.getZhName()!=null) {
            c.andZhNameLike("%"+request.getZhName()+"%");
        }
        if (request.getCode()!=null) {
            c.andCodeLike("%"+request.getCode()+"%");
        }
        if (request.getCode2()!=null) {
            c.andCode2Like("%"+request.getCode2()+"%");
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
    public void convertEntityToResponse(List<BarablahCountry> entitys,List<SimpleBarablahCountryQueryResponse> results) {
       for(BarablahCountry entity:entitys) {
        }
        //第一组
        for(BarablahCountry entity:entitys) {
            SimpleBarablahCountryQueryResponse response = new SimpleBarablahCountryQueryResponse();
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
