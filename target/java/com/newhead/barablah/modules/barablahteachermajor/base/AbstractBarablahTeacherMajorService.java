package com.newhead.barablah.modules.barablahteachermajor.base;

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
import com.newhead.barablah.modules.barablahteachermajor.base.repository.dao.BarablahTeacherMajorMapper;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajor;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajorExample;
import com.newhead.barablah.modules.barablahteachermajor.ext.protocol.*;
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
public abstract class AbstractBarablahTeacherMajorService extends BaseService {
    protected abstract BarablahTeacherMajorMapper getMapper();

    protected abstract void saveOrUpdate(BarablahTeacherMajor entity);


    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahTeacherMajor create(SimpleBarablahTeacherMajorCreateRequest request) {
        BarablahTeacherMajor entity = new BarablahTeacherMajor();
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
    public BarablahTeacherMajor update(SimpleBarablahTeacherMajorUpdateRequest request) {
        BarablahTeacherMajor entity = new BarablahTeacherMajor();
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
    public SimpleBarablahTeacherMajorGetDetailResponse getDetail(Long id) {
        BarablahTeacherMajor entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahTeacherMajorGetDetailResponse response = new SimpleBarablahTeacherMajorGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahTeacherMajor entity = new BarablahTeacherMajor();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahTeacherMajorQueryResponse> queryList(SimpleBarablahTeacherMajorQueryListRequest request) {
        List<SimpleBarablahTeacherMajorQueryResponse> results = new ArrayList<SimpleBarablahTeacherMajorQueryResponse>();

        //构造查询对象
        BarablahTeacherMajorExample example = new BarablahTeacherMajorExample();
        BarablahTeacherMajorExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
            ordersrc = "position desc,";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        if (request.getMajorName()!=null) {
            c.andMajorNameLike("%"+request.getMajorName()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahTeacherMajorQueryResponse> queryPage(SimpleBarablahTeacherMajorQueryPageRequest request) {
        //结果
        List<SimpleBarablahTeacherMajorQueryResponse> results = new ArrayList<SimpleBarablahTeacherMajorQueryResponse>();

        //构造查询对象
        BarablahTeacherMajorExample example = new BarablahTeacherMajorExample();
        BarablahTeacherMajorExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
            ordersrc = "position desc,";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getMajorName()!=null) {
            c.andMajorNameLike("%"+request.getMajorName()+"%");
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
    private void convertEntityToResponse(List<BarablahTeacherMajor> entitys,List<SimpleBarablahTeacherMajorQueryResponse> results) {
       for(BarablahTeacherMajor entity:entitys) {
        }
        //第一组
        for(BarablahTeacherMajor entity:entitys) {
            SimpleBarablahTeacherMajorQueryResponse response = new SimpleBarablahTeacherMajorQueryResponse();
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

    /**
     * 是否存在同名数据
     * @param majorName
     * @return
     */
    public BarablahTeacherMajor existByMajorName(String majorName) {
        //构造查询对象
        BarablahTeacherMajorExample example = new BarablahTeacherMajorExample();
        BarablahTeacherMajorExample.Criteria c = example.createCriteria();
        c.andMajorNameEqualTo(majorName);
        List<BarablahTeacherMajor> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }





}
