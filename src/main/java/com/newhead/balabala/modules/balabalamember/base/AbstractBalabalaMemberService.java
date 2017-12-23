package com.newhead.balabala.modules.balabalamember.base;

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
import com.newhead.balabala.modules.balabalamember.base.repository.dao.BalabalaMemberMapper;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMember;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMemberExample;
import com.newhead.balabala.modules.balabalamember.ext.protocol.*;
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
public abstract class AbstractBalabalaMemberService extends BaseService {
    protected abstract BalabalaMemberMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaMember entity);

    @Autowired
    protected BalabalaCampusMapper balabalacampusMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaMember create(SimpleBalabalaMemberCreateRequest request) {
        BalabalaMember entity = new BalabalaMember();
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
    public BalabalaMember update(SimpleBalabalaMemberUpdateRequest request) {
        BalabalaMember entity = new BalabalaMember();
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
    public SimpleBalabalaMemberGetDetailResponse getDetail(Long id) {
        BalabalaMember entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaMemberGetDetailResponse response = new SimpleBalabalaMemberGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaCampus  campusIdEntity = balabalacampusMapper.selectByPrimaryKey(Long.valueOf(entity.getCampusId()));
        if (campusIdEntity!=null) {
            LabelValueItem campusIdObject = response.getCampusIdObject();
            campusIdObject.setName("campusId");
            campusIdObject.setLabel(campusIdEntity.getCampusName());
            campusIdObject.setValue(String.valueOf(entity.getCampusId()));
            campusIdObject.setChecked(false);
        }
        LabelValueItem genderEnum = response.getGenderEnum();
        genderEnum.setName("gender");
        genderEnum.setLabel(com.newhead.balabala.modules.balabalamember.BalabalaMemberGenderEnum.getLabel(entity.getGender()));
        genderEnum.setValue(entity.getGender());
        genderEnum.setChecked(true);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BalabalaMember entity = new BalabalaMember();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaMemberQueryResponse> queryList(SimpleBalabalaMemberQueryListRequest request) {
        List<SimpleBalabalaMemberQueryResponse> results = new ArrayList<SimpleBalabalaMemberQueryResponse>();

        //构造查询对象
        BalabalaMemberExample example = new BalabalaMemberExample();
        BalabalaMemberExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getNickname()!=null) {
            c.andNicknameLike("%"+request.getNickname()+"%");
        }

        if (request.getAvatar()!=null) {
            c.andAvatarLike("%"+request.getAvatar()+"%");
        }

        if (request.getEnglishName()!=null) {
            c.andEnglishNameLike("%"+request.getEnglishName()+"%");
        }

        if (request.getGender()!=null) {
            c.andGenderEqualTo(request.getGender());
         }

        if (request.getBirthday()!=null) {
            c.andBirthdayLike("%"+request.getBirthday()+"%");
        }

        if (request.getAccid()!=null) {
            c.andAccidLike("%"+request.getAccid()+"%");
        }

        if (request.getToken()!=null) {
            c.andTokenLike("%"+request.getToken()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBalabalaMemberQueryResponse> queryPage(SimpleBalabalaMemberQueryPageRequest request) {
        //结果
        List<SimpleBalabalaMemberQueryResponse> results = new ArrayList<SimpleBalabalaMemberQueryResponse>();

        //构造查询对象
        BalabalaMemberExample example = new BalabalaMemberExample();
        BalabalaMemberExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getNickname()!=null) {
            c.andNicknameLike("%"+request.getNickname()+"%");
        }

        if (request.getAvatar()!=null) {
            c.andAvatarLike("%"+request.getAvatar()+"%");
        }

        if (request.getEnglishName()!=null) {
            c.andEnglishNameLike("%"+request.getEnglishName()+"%");
        }

        if (request.getGender()!=null) {
            c.andGenderEqualTo(request.getGender());
         }

        if (request.getBirthday()!=null) {
            c.andBirthdayLike("%"+request.getBirthday()+"%");
        }

        if (request.getAccid()!=null) {
            c.andAccidLike("%"+request.getAccid()+"%");
        }

        if (request.getToken()!=null) {
            c.andTokenLike("%"+request.getToken()+"%");
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
    private void convertEntityToResponse(List<BalabalaMember> entitys,List<SimpleBalabalaMemberQueryResponse> results) {
        Map<Long,Long> campusIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> campusIdResultMap = Maps.newHashMap();

       for(BalabalaMember entity:entitys) {
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
        for(BalabalaMember entity:entitys) {
            SimpleBalabalaMemberQueryResponse response = new SimpleBalabalaMemberQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long campusId = campusIdMap.get(entity.getId());

            LabelValueItem campusIdlvi = null;
            if (campusId!=null && campusIdResultMap.get(campusId)!=null) {
                campusIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(campusIdResultMap.get(campusId),campusIdlvi);
            }
            response.setCampusIdObject(campusIdlvi);
            LabelValueItem genderEnum = response.getGenderEnum();
            genderEnum.setName("gender");
            genderEnum.setLabel(com.newhead.balabala.modules.balabalamember.BalabalaMemberGenderEnum.getLabel(entity.getGender()));
            genderEnum.setValue(entity.getGender());
            genderEnum.setChecked(true);
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
