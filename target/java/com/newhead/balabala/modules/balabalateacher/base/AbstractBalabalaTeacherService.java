package com.newhead.balabala.modules.balabalateacher.base;

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
import com.newhead.balabala.modules.balabalateacher.base.repository.dao.BalabalaTeacherMapper;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacher;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacherExample;
import com.newhead.balabala.modules.balabalateacher.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampus;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampusExample;

import com.newhead.balabala.modules.balabalacampus.base.repository.dao.BalabalaCampusMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBalabalaTeacherService extends BaseService {
    protected abstract BalabalaTeacherMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaTeacher entity);

    @Autowired
    protected BalabalaCampusMapper balabalacampusMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaTeacher create(SimpleBalabalaTeacherCreateRequest request) {
        BalabalaTeacher entity = new BalabalaTeacher();
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
    public BalabalaTeacher update(SimpleBalabalaTeacherUpdateRequest request) {
        BalabalaTeacher entity = new BalabalaTeacher();
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
    public SimpleBalabalaTeacherGetDetailResponse getDetail(Long id) {
        BalabalaTeacher entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaTeacherGetDetailResponse response = new SimpleBalabalaTeacherGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaCampus  campusIdEntity = balabalacampusMapper.selectByPrimaryKey(Long.valueOf(entity.getCampusId()));
        if (campusIdEntity!=null) {
            LabelValueItem campusIdObject = response.getCampusIdObject();
            campusIdObject.setName("campusId");
            campusIdObject.setLabel(campusIdEntity.getCampusName());
            campusIdObject.setValue(String.valueOf(entity.getCampusId()));
            campusIdObject.setChecked(false);
        }
        LabelValueItem statusEnum = response.getStatusEnum();
        statusEnum.setName("status");
        statusEnum.setLabel(com.newhead.balabala.modules.balabalateacher.BalabalaTeacherStatusEnum.getLabel(entity.getStatus()));
        statusEnum.setValue(entity.getStatus());
        statusEnum.setChecked(true);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BalabalaTeacher entity = new BalabalaTeacher();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaTeacherQueryResponse> queryList(SimpleBalabalaTeacherQueryListRequest request) {
        List<SimpleBalabalaTeacherQueryResponse> results = new ArrayList<SimpleBalabalaTeacherQueryResponse>();

        //构造查询对象
        BalabalaTeacherExample example = new BalabalaTeacherExample();
        BalabalaTeacherExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getUsername()!=null) {
            c.andUsernameLike("%"+request.getUsername()+"%");
        }

        if (request.getFullName()!=null) {
            c.andFullNameLike("%"+request.getFullName()+"%");
        }

        if (request.getPhoneNumber()!=null) {
            c.andPhoneNumberLike("%"+request.getPhoneNumber()+"%");
        }

        if (request.getMajor()!=null) {
            c.andMajorLike("%"+request.getMajor()+"%");
        }

        if (request.getComeFrom()!=null) {
            c.andComeFromLike("%"+request.getComeFrom()+"%");
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
    public Page<SimpleBalabalaTeacherQueryResponse> queryPage(SimpleBalabalaTeacherQueryPageRequest request) {
        //结果
        List<SimpleBalabalaTeacherQueryResponse> results = new ArrayList<SimpleBalabalaTeacherQueryResponse>();

        //构造查询对象
        BalabalaTeacherExample example = new BalabalaTeacherExample();
        BalabalaTeacherExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getUsername()!=null) {
            c.andUsernameLike("%"+request.getUsername()+"%");
        }

        if (request.getFullName()!=null) {
            c.andFullNameLike("%"+request.getFullName()+"%");
        }

        if (request.getPhoneNumber()!=null) {
            c.andPhoneNumberLike("%"+request.getPhoneNumber()+"%");
        }

        if (request.getMajor()!=null) {
            c.andMajorLike("%"+request.getMajor()+"%");
        }

        if (request.getComeFrom()!=null) {
            c.andComeFromLike("%"+request.getComeFrom()+"%");
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
    private void convertEntityToResponse(List<BalabalaTeacher> entitys,List<SimpleBalabalaTeacherQueryResponse> results) {
        Map<Long,Long> campusIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> campusIdResultMap = Maps.newHashMap();

       for(BalabalaTeacher entity:entitys) {
            campusIdMap.put(entity.getId(),entity.getCampusId());
        }
        BalabalaCampusExample campusIdExample = new BalabalaCampusExample();

        List<Long> campusIds = new ArrayList<>();
        campusIds.addAll(campusIdMap.values());
        if (campusIds.size()>0) {
            campusIdExample.createCriteria().andIdIn(campusIds);
        }
        List<BalabalaCampus>  campusIdList = balabalacampusMapper.selectByExample(campusIdExample);
        for(BalabalaCampus item:campusIdList) {
           LabelValueItem campusIdItem = new LabelValueItem();
           campusIdItem.setName("campusId");
           campusIdItem.setValue(String.valueOf(item.getId()));
           campusIdItem.setLabel(item.getCampusName());
           campusIdResultMap.put(item.getId(),campusIdItem);
        }
        //第一组
        for(BalabalaTeacher entity:entitys) {
            SimpleBalabalaTeacherQueryResponse response = new SimpleBalabalaTeacherQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long campusId = campusIdMap.get(entity.getId());

            LabelValueItem campusIdlvi = null;
            if (campusId!=null && campusIdResultMap.get(campusId)!=null) {
                campusIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(campusIdResultMap.get(campusId),campusIdlvi);
            }
            response.setCampusIdObject(campusIdlvi);
            LabelValueItem statusEnum = response.getStatusEnum();
            statusEnum.setName("status");
            statusEnum.setLabel(com.newhead.balabala.modules.balabalateacher.BalabalaTeacherStatusEnum.getLabel(entity.getStatus()));
            statusEnum.setValue(entity.getStatus());
            statusEnum.setChecked(true);
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
