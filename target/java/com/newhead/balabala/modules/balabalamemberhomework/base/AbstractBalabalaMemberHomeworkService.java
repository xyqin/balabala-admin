package com.newhead.balabala.modules.balabalamemberhomework.base;

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
import com.newhead.balabala.modules.balabalamemberhomework.base.repository.dao.BalabalaMemberHomeworkMapper;
import com.newhead.balabala.modules.balabalamemberhomework.base.repository.entity.BalabalaMemberHomework;
import com.newhead.balabala.modules.balabalamemberhomework.base.repository.entity.BalabalaMemberHomeworkExample;
import com.newhead.balabala.modules.balabalamemberhomework.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacher;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacherExample;

import com.newhead.balabala.modules.balabalateacher.base.repository.dao.BalabalaTeacherMapper;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMember;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMemberExample;

import com.newhead.balabala.modules.balabalamember.base.repository.dao.BalabalaMemberMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBalabalaMemberHomeworkService extends BaseService {
    protected abstract BalabalaMemberHomeworkMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaMemberHomework entity);

    @Autowired
    protected BalabalaTeacherMapper balabalateacherMapper;
    @Autowired
    protected BalabalaMemberMapper balabalamemberMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaMemberHomework create(SimpleBalabalaMemberHomeworkCreateRequest request) {
        BalabalaMemberHomework entity = new BalabalaMemberHomework();
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
    public BalabalaMemberHomework update(SimpleBalabalaMemberHomeworkUpdateRequest request) {
        BalabalaMemberHomework entity = new BalabalaMemberHomework();
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
    public SimpleBalabalaMemberHomeworkGetDetailResponse getDetail(Long id) {
        BalabalaMemberHomework entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaMemberHomeworkGetDetailResponse response = new SimpleBalabalaMemberHomeworkGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaMember  memberIdEntity = balabalamemberMapper.selectByPrimaryKey(Long.valueOf(entity.getMemberId()));
        if (memberIdEntity!=null) {
            LabelValueItem memberIdObject = response.getMemberIdObject();
            memberIdObject.setName("memberId");
            memberIdObject.setLabel(memberIdEntity.getNickname());
            memberIdObject.setValue(String.valueOf(entity.getMemberId()));
            memberIdObject.setChecked(false);
        }
        BalabalaTeacher  teacherIdEntity = balabalateacherMapper.selectByPrimaryKey(Long.valueOf(entity.getTeacherId()));
        if (teacherIdEntity!=null) {
            LabelValueItem teacherIdObject = response.getTeacherIdObject();
            teacherIdObject.setName("teacherId");
            teacherIdObject.setLabel(teacherIdEntity.getFullName());
            teacherIdObject.setValue(String.valueOf(entity.getTeacherId()));
            teacherIdObject.setChecked(false);
        }
        LabelValueItem statusEnum = response.getStatusEnum();
        statusEnum.setName("status");
        statusEnum.setLabel(com.newhead.balabala.modules.balabalamemberhomework.BalabalaMemberHomeworkStatusEnum.getLabel(entity.getStatus()));
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
        BalabalaMemberHomework entity = new BalabalaMemberHomework();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaMemberHomeworkQueryResponse> queryList(SimpleBalabalaMemberHomeworkQueryListRequest request) {
        List<SimpleBalabalaMemberHomeworkQueryResponse> results = new ArrayList<SimpleBalabalaMemberHomeworkQueryResponse>();

        //构造查询对象
        BalabalaMemberHomeworkExample example = new BalabalaMemberHomeworkExample();
        BalabalaMemberHomeworkExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getHomeworkName()!=null) {
            c.andHomeworkNameLike("%"+request.getHomeworkName()+"%");
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
    public Page<SimpleBalabalaMemberHomeworkQueryResponse> queryPage(SimpleBalabalaMemberHomeworkQueryPageRequest request) {
        //结果
        List<SimpleBalabalaMemberHomeworkQueryResponse> results = new ArrayList<SimpleBalabalaMemberHomeworkQueryResponse>();

        //构造查询对象
        BalabalaMemberHomeworkExample example = new BalabalaMemberHomeworkExample();
        BalabalaMemberHomeworkExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getHomeworkName()!=null) {
            c.andHomeworkNameLike("%"+request.getHomeworkName()+"%");
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
    private void convertEntityToResponse(List<BalabalaMemberHomework> entitys,List<SimpleBalabalaMemberHomeworkQueryResponse> results) {
        Map<Long,Long> memberIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> memberIdResultMap = Maps.newHashMap();

        Map<Long,Long> teacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> teacherIdResultMap = Maps.newHashMap();

       for(BalabalaMemberHomework entity:entitys) {
            memberIdMap.put(entity.getId(),entity.getMemberId());
            teacherIdMap.put(entity.getId(),entity.getTeacherId());
        }
        BalabalaMemberExample memberIdExample = new BalabalaMemberExample();

        List<Long> memberIds = new ArrayList<>();
        memberIds.addAll(memberIdMap.values());
        if (memberIds.size()>0) {
            memberIdExample.createCriteria().andIdIn(memberIds);
        }
        List<BalabalaMember>  memberIdList = balabalamemberMapper.selectByExample(memberIdExample);
        for(BalabalaMember item:memberIdList) {
           LabelValueItem memberIdItem = new LabelValueItem();
           memberIdItem.setName("memberId");
           memberIdItem.setValue(String.valueOf(item.getId()));
           memberIdItem.setLabel(item.getNickname());
           memberIdResultMap.put(item.getId(),memberIdItem);
        }
        BalabalaTeacherExample teacherIdExample = new BalabalaTeacherExample();

        List<Long> teacherIds = new ArrayList<>();
        teacherIds.addAll(teacherIdMap.values());
        if (teacherIds.size()>0) {
            teacherIdExample.createCriteria().andIdIn(teacherIds);
        }
        List<BalabalaTeacher>  teacherIdList = balabalateacherMapper.selectByExample(teacherIdExample);
        for(BalabalaTeacher item:teacherIdList) {
           LabelValueItem teacherIdItem = new LabelValueItem();
           teacherIdItem.setName("teacherId");
           teacherIdItem.setValue(String.valueOf(item.getId()));
           teacherIdItem.setLabel(item.getFullName());
           teacherIdResultMap.put(item.getId(),teacherIdItem);
        }
        //第一组
        for(BalabalaMemberHomework entity:entitys) {
            SimpleBalabalaMemberHomeworkQueryResponse response = new SimpleBalabalaMemberHomeworkQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long memberId = memberIdMap.get(entity.getId());

            LabelValueItem memberIdlvi = null;
            if (memberId!=null && memberIdResultMap.get(memberId)!=null) {
                memberIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(memberIdResultMap.get(memberId),memberIdlvi);
            }
            response.setMemberIdObject(memberIdlvi);
            Long teacherId = teacherIdMap.get(entity.getId());

            LabelValueItem teacherIdlvi = null;
            if (teacherId!=null && teacherIdResultMap.get(teacherId)!=null) {
                teacherIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(teacherIdResultMap.get(teacherId),teacherIdlvi);
            }
            response.setTeacherIdObject(teacherIdlvi);
            LabelValueItem statusEnum = response.getStatusEnum();
            statusEnum.setName("status");
            statusEnum.setLabel(com.newhead.balabala.modules.balabalamemberhomework.BalabalaMemberHomeworkStatusEnum.getLabel(entity.getStatus()));
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
