package com.newhead.rudderframework.modules.rudderuser.base;

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
import com.newhead.rudderframework.modules.rudderuser.base.repository.dao.RudderUserMapper;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUserExample;
import com.newhead.rudderframework.modules.rudderuser.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampus;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampusExample;

import com.newhead.barablah.modules.barablahcampus.base.repository.dao.BarablahCampusMapper;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity.RudderUser2role;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity.RudderUser2roleExample;

import com.newhead.rudderframework.modules.rudderuser2role.base.repository.dao.RudderUser2roleMapper;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRole;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRoleExample;

import com.newhead.rudderframework.modules.rudderrole.base.repository.dao.RudderRoleMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractRudderUserService extends BaseService {
    protected abstract RudderUserMapper getMapper();

    protected abstract void saveOrUpdate(RudderUser entity);

    @Autowired
    protected BarablahCampusMapper barablahcampusMapper;
    @Autowired
    protected RudderUser2roleMapper rudderuser2roleMapper;
    @Autowired
    protected RudderRoleMapper rudderroleMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public RudderUser create(SimpleRudderUserCreateRequest request) {
        RudderUser entity = new RudderUser();
        BeanUtils.copyProperties(request,entity);
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());
        entity.setDeleted(false);
        entity.setCreator(getCurrentUser().getId());
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().insert(entity);

        //添加关系
            addRudderUser2role(request.getRudderRoles(),entity.getId());
        return entity;
    }

    /**
     * 修改
     * @param request
     * @return
     */
    @Transactional
    public RudderUser update(SimpleRudderUserUpdateRequest request) {
        RudderUser entity = new RudderUser();
        BeanUtils.copyProperties(request,entity);
        entity.setUpdatedAt(new Date());
        entity.setDeleted(false);
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().updateByPrimaryKeySelective(entity);

        //删除关系
        RudderUser2roleExample example = new RudderUser2roleExample();
        example.createCriteria().andRudderuserIdEqualTo(entity.getId());
        rudderuser2roleMapper.deleteByExample(example);
        //添加关系
        addRudderUser2role(request.getRudderRoles(),entity.getId());
        return entity;
    }

    /**
     * 查看菜单详情
     * @param id
     * @return
     */
    public SimpleRudderUserGetDetailResponse getDetail(Long id) {
        RudderUser entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleRudderUserGetDetailResponse response = new SimpleRudderUserGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        LabelValueItem statusEnum = response.getStatusEnum();
        statusEnum.setName("status");
        statusEnum.setLabel(com.newhead.rudderframework.modules.rudderuser.RudderUserStatusEnum.getLabel(entity.getStatus()));
        statusEnum.setValue(entity.getStatus());
        statusEnum.setChecked(true);
        BarablahCampus  campusIdEntity = barablahcampusMapper.selectByPrimaryKey(Long.valueOf(entity.getCampusId()));
        if (campusIdEntity!=null) {
            LabelValueItem campusIdObject = response.getCampusIdObject();
            campusIdObject.setName("campusId");
            campusIdObject.setLabel(campusIdEntity.getCampusName());
            campusIdObject.setValue(String.valueOf(entity.getCampusId()));
            campusIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        RudderUser entity = new RudderUser();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleRudderUserQueryResponse> queryList(SimpleRudderUserQueryListRequest request) {
        List<SimpleRudderUserQueryResponse> results = new ArrayList<SimpleRudderUserQueryResponse>();

        //构造查询对象
        RudderUserExample example = new RudderUserExample();
        RudderUserExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        if (request.getRudderuserName()!=null) {
            c.andRudderuserNameLike("%"+request.getRudderuserName()+"%");
        }

        if (request.getStatus()!=null) {
            c.andStatusEqualTo(request.getStatus());
         }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleRudderUserQueryResponse> queryPage(SimpleRudderUserQueryPageRequest request) {
        //结果
        List<SimpleRudderUserQueryResponse> results = new ArrayList<SimpleRudderUserQueryResponse>();

        //构造查询对象
        RudderUserExample example = new RudderUserExample();
        RudderUserExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getRudderuserName()!=null) {
            c.andRudderuserNameLike("%"+request.getRudderuserName()+"%");
        }

        if (request.getStatus()!=null) {
            c.andStatusEqualTo(request.getStatus());
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
    private void convertEntityToResponse(List<RudderUser> entitys,List<SimpleRudderUserQueryResponse> results) {
        Map<Long,Long> campusIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> campusIdResultMap = Maps.newHashMap();

       for(RudderUser entity:entitys) {
            campusIdMap.put(entity.getId(),entity.getCampusId());
        }
        BarablahCampusExample campusIdExample = new BarablahCampusExample();

        List<Long> campusIds = new ArrayList<>();
        campusIds.addAll(campusIdMap.values());
        if (campusIds.size()>0) {
            campusIdExample.createCriteria().andIdIn(campusIds);
        }
        List<BarablahCampus>  campusIdList = barablahcampusMapper.selectByExample(campusIdExample);
        for(BarablahCampus item:campusIdList) {
           LabelValueItem campusIdItem = new LabelValueItem();
           campusIdItem.setName("campusId");
           campusIdItem.setValue(String.valueOf(item.getId()));
           campusIdItem.setLabel(item.getCampusName());
           campusIdResultMap.put(item.getId(),campusIdItem);
        }
        //第一组
        for(RudderUser entity:entitys) {
            SimpleRudderUserQueryResponse response = new SimpleRudderUserQueryResponse();
            BeanUtils.copyProperties(entity,response);
            LabelValueItem statusEnum = response.getStatusEnum();
            statusEnum.setName("status");
            statusEnum.setLabel(com.newhead.rudderframework.modules.rudderuser.RudderUserStatusEnum.getLabel(entity.getStatus()));
            statusEnum.setValue(entity.getStatus());
            statusEnum.setChecked(true);
            Long campusId = campusIdMap.get(entity.getId());

            LabelValueItem campusIdlvi = null;
            if (campusId!=null && campusIdResultMap.get(campusId)!=null) {
                campusIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(campusIdResultMap.get(campusId),campusIdlvi);
            }
            response.setCampusIdObject(campusIdlvi);
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
     * @param rudderuserName
     * @return
     */
    public RudderUser existByRudderuserName(String rudderuserName) {
        //构造查询对象
        RudderUserExample example = new RudderUserExample();
        RudderUserExample.Criteria c = example.createCriteria();
        c.andRudderuserNameEqualTo(rudderuserName);
        List<RudderUser> list = getMapper().selectByExample(example);
        if (list!=null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }


    /**
     *  添加引用对象
     */
    private void addRudderUser2role(String[] str,Long rmid) {
        if (str==null || str.length==0) return;
        for(String id:str) {
            RudderUser2role m2n = new RudderUser2role();
            m2n.setVisible(true);
            m2n.setCreatedAt(new Date());
            m2n.setDeleted(false);
            m2n.setRudderroleId(Long.valueOf(id));
            m2n.setUpdatedAt(new Date());
            m2n.setRudderuserId(rmid);
            rudderuser2roleMapper.insert(m2n);
        }
    }

    /**
     * 获得引用对象集
     * @param rmid
     * @return results
     */
    public List<LabelValueItem> getRudderRoles(Long rmid) {
        List<LabelValueItem> results = new ArrayList<>();
        Map<Long,RudderUser2role> maps = Maps.newHashMap();

        if (rmid!=null && rmid>0) {
            RudderUser2roleExample example = new RudderUser2roleExample();
            example.createCriteria().andRudderuserIdEqualTo(rmid);
            List<RudderUser2role> m2n = rudderuser2roleMapper.selectByExample(example);
            for (RudderUser2role item:m2n) {
                maps.put(item.getRudderroleId(),item);
            }
        }
        List<RudderRole> items = rudderroleMapper.selectByExample(new RudderRoleExample());
        for (RudderRole item:items) {
            LabelValueItem lvi = new LabelValueItem();
            lvi.setLabel(item.getRudderroleName());
            lvi.setValue(String.valueOf(item.getId()));
            if (maps.containsKey(item.getId())) {
                lvi.setChecked(true);
            } else {
                lvi.setChecked(false);
            }
            results.add(lvi);
        }
        return results;
    }


}
