package com.newhead.sc.modules.scdevice.base;

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
import com.newhead.sc.modules.scdevice.base.repository.dao.ScDeviceMapper;
import com.newhead.sc.modules.scdevice.base.repository.entity.ScDevice;
import com.newhead.sc.modules.scdevice.base.repository.entity.ScDeviceExample;
import com.newhead.sc.modules.scdevice.ext.protocol.*;
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
public abstract class AbstractScDeviceService extends BaseService {
    protected abstract ScDeviceMapper getMapper();

    protected abstract void saveOrUpdate(ScDevice entity);


    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public ScDevice create(SimpleScDeviceCreateRequest request) {
        ScDevice entity = new ScDevice();
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
    public ScDevice update(SimpleScDeviceUpdateRequest request) {
        ScDevice entity = new ScDevice();
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
    public SimpleScDeviceGetDetailResponse getDetail(Long id) {
        ScDevice entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleScDeviceGetDetailResponse response = new SimpleScDeviceGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        LabelValueItem typeEnum = response.getTypeEnum();
        typeEnum.setName("type");
        typeEnum.setLabel(com.newhead.sc.modules.scdevice.ScDeviceTypeEnum.getLabel(entity.getType()));
        typeEnum.setValue(entity.getType());
        typeEnum.setChecked(true);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        ScDevice entity = new ScDevice();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleScDeviceQueryResponse> queryList(SimpleScDeviceQueryListRequest request) {
        List<SimpleScDeviceQueryResponse> results = new ArrayList<SimpleScDeviceQueryResponse>();

        //构造查询对象
        ScDeviceExample example = new ScDeviceExample();
        ScDeviceExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getDeviceName()!=null) {
            c.andDeviceNameLike("%"+request.getDeviceName()+"%");
        }

        if (request.getVendor()!=null) {
            c.andVendorLike("%"+request.getVendor()+"%");
        }

        if (request.getModel()!=null) {
            c.andModelLike("%"+request.getModel()+"%");
        }

        if (request.getImage()!=null) {
            c.andImageLike("%"+request.getImage()+"%");
        }

        if (request.getInstallLocation()!=null) {
            c.andInstallLocationLike("%"+request.getInstallLocation()+"%");
        }

        if (request.getConfig()!=null) {
            c.andConfigLike("%"+request.getConfig()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleScDeviceQueryResponse> queryPage(SimpleScDeviceQueryPageRequest request) {
        //结果
        List<SimpleScDeviceQueryResponse> results = new ArrayList<SimpleScDeviceQueryResponse>();

        //构造查询对象
        ScDeviceExample example = new ScDeviceExample();
        ScDeviceExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getDeviceName()!=null) {
            c.andDeviceNameLike("%"+request.getDeviceName()+"%");
        }

        if (request.getVendor()!=null) {
            c.andVendorLike("%"+request.getVendor()+"%");
        }

        if (request.getModel()!=null) {
            c.andModelLike("%"+request.getModel()+"%");
        }

        if (request.getImage()!=null) {
            c.andImageLike("%"+request.getImage()+"%");
        }

        if (request.getInstallLocation()!=null) {
            c.andInstallLocationLike("%"+request.getInstallLocation()+"%");
        }

        if (request.getConfig()!=null) {
            c.andConfigLike("%"+request.getConfig()+"%");
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
    private void convertEntityToResponse(List<ScDevice> entitys,List<SimpleScDeviceQueryResponse> results) {
       for(ScDevice entity:entitys) {
        }
        //第一组
        for(ScDevice entity:entitys) {
            SimpleScDeviceQueryResponse response = new SimpleScDeviceQueryResponse();
            BeanUtils.copyProperties(entity,response);
            LabelValueItem typeEnum = response.getTypeEnum();
            typeEnum.setName("type");
            typeEnum.setLabel(com.newhead.sc.modules.scdevice.ScDeviceTypeEnum.getLabel(entity.getType()));
            typeEnum.setValue(entity.getType());
            typeEnum.setChecked(true);
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
