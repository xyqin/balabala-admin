package com.newhead.sc.modules.scdevicesignup.base;

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
import com.newhead.sc.modules.scdevicesignup.base.repository.dao.ScDeviceSignupMapper;
import com.newhead.sc.modules.scdevicesignup.base.repository.entity.ScDeviceSignup;
import com.newhead.sc.modules.scdevicesignup.base.repository.entity.ScDeviceSignupExample;
import com.newhead.sc.modules.scdevicesignup.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.sc.modules.scdevice.base.repository.entity.ScDevice;
import com.newhead.sc.modules.scdevice.base.repository.entity.ScDeviceExample;

import com.newhead.sc.modules.scdevice.base.repository.dao.ScDeviceMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractScDeviceSignupService extends BaseService {
    protected abstract ScDeviceSignupMapper getMapper();

    protected abstract void saveOrUpdate(ScDeviceSignup entity);

    @Autowired
    protected ScDeviceMapper scdeviceMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public ScDeviceSignup create(SimpleScDeviceSignupCreateRequest request) {
        ScDeviceSignup entity = new ScDeviceSignup();
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
    public ScDeviceSignup update(SimpleScDeviceSignupUpdateRequest request) {
        ScDeviceSignup entity = new ScDeviceSignup();
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
    public SimpleScDeviceSignupGetDetailResponse getDetail(Long id) {
        ScDeviceSignup entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleScDeviceSignupGetDetailResponse response = new SimpleScDeviceSignupGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        ScDevice  deviceIdEntity = scdeviceMapper.selectByPrimaryKey(Long.valueOf(entity.getDeviceId()));
        if (deviceIdEntity!=null) {
            LabelValueItem deviceIdObject = response.getDeviceIdObject();
            deviceIdObject.setName("deviceId");
            deviceIdObject.setLabel(deviceIdEntity.getDeviceName());
            deviceIdObject.setValue(String.valueOf(entity.getDeviceId()));
            deviceIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        ScDeviceSignup entity = new ScDeviceSignup();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleScDeviceSignupQueryResponse> queryList(SimpleScDeviceSignupQueryListRequest request) {
        List<SimpleScDeviceSignupQueryResponse> results = new ArrayList<SimpleScDeviceSignupQueryResponse>();

        //构造查询对象
        ScDeviceSignupExample example = new ScDeviceSignupExample();
        ScDeviceSignupExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getDeviceId()!=null) {
            c.andDeviceIdEqualTo(request.getDeviceId());
         }

        if (request.getPhoneNumber()!=null) {
            c.andPhoneNumberLike("%"+request.getPhoneNumber()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleScDeviceSignupQueryResponse> queryPage(SimpleScDeviceSignupQueryPageRequest request) {
        //结果
        List<SimpleScDeviceSignupQueryResponse> results = new ArrayList<SimpleScDeviceSignupQueryResponse>();

        //构造查询对象
        ScDeviceSignupExample example = new ScDeviceSignupExample();
        ScDeviceSignupExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getDeviceId()!=null) {
            c.andDeviceIdEqualTo(request.getDeviceId());
         }

        if (request.getPhoneNumber()!=null) {
            c.andPhoneNumberLike("%"+request.getPhoneNumber()+"%");
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
    private void convertEntityToResponse(List<ScDeviceSignup> entitys,List<SimpleScDeviceSignupQueryResponse> results) {
        Map<Long,Long> deviceIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> deviceIdResultMap = Maps.newHashMap();

       for(ScDeviceSignup entity:entitys) {
            deviceIdMap.put(entity.getId(),entity.getDeviceId());
        }
        ScDeviceExample deviceIdExample = new ScDeviceExample();

        List<Long> deviceIds = new ArrayList<>();
        deviceIds.addAll(deviceIdMap.values());
        if (deviceIds.size()>0) {
            deviceIdExample.createCriteria().andIdIn(deviceIds);
        }
        List<ScDevice>  deviceIdList = scdeviceMapper.selectByExample(deviceIdExample);
        for(ScDevice item:deviceIdList) {
           LabelValueItem deviceIdItem = new LabelValueItem();
           deviceIdItem.setName("deviceId");
           deviceIdItem.setValue(String.valueOf(item.getId()));
           deviceIdItem.setLabel(item.getDeviceName());
           deviceIdResultMap.put(item.getId(),deviceIdItem);
        }
        //第一组
        for(ScDeviceSignup entity:entitys) {
            SimpleScDeviceSignupQueryResponse response = new SimpleScDeviceSignupQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long deviceId = deviceIdMap.get(entity.getId());

            LabelValueItem deviceIdlvi = null;
            if (deviceId!=null && deviceIdResultMap.get(deviceId)!=null) {
                deviceIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(deviceIdResultMap.get(deviceId),deviceIdlvi);
            }
            response.setDeviceIdObject(deviceIdlvi);
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
