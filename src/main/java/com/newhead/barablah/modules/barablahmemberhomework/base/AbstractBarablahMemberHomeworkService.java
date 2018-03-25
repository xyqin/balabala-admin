package com.newhead.barablah.modules.barablahmemberhomework.base;

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
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.dao.BarablahMemberHomeworkMapper;
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.entity.BarablahMemberHomework;
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.entity.BarablahMemberHomeworkExample;
import com.newhead.barablah.modules.barablahmemberhomework.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;

import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMember;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMemberExample;

import com.newhead.barablah.modules.barablahmember.base.repository.dao.BarablahMemberMapper;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacher;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacherExample;

import com.newhead.barablah.modules.barablahteacher.base.repository.dao.BarablahTeacherMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBarablahMemberHomeworkService extends BaseService {
    protected abstract BarablahMemberHomeworkMapper getMapper();

    protected abstract void saveOrUpdate(BarablahMemberHomework entity);

    @Autowired
    protected BarablahClassMapper barablahclassMapper;
    @Autowired
    protected BarablahMemberMapper barablahmemberMapper;
    @Autowired
    protected BarablahTeacherMapper barablahteacherMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahMemberHomework create(SimpleBarablahMemberHomeworkCreateRequest request) {
        BarablahMemberHomework entity = new BarablahMemberHomework();
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
    public BarablahMemberHomework update(SimpleBarablahMemberHomeworkUpdateRequest request) {
        BarablahMemberHomework entity = new BarablahMemberHomework();
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
    public SimpleBarablahMemberHomeworkGetDetailResponse getDetail(Long id) {
        BarablahMemberHomework entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahMemberHomeworkGetDetailResponse response = new SimpleBarablahMemberHomeworkGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahMember  memberIdEntity = barablahmemberMapper.selectByPrimaryKey(Long.valueOf(entity.getMemberId()));
        if (memberIdEntity!=null) {
            LabelValueItem memberIdObject = response.getMemberIdObject();
            memberIdObject.setName("memberId");
            memberIdObject.setLabel(memberIdEntity.getNickname());
            memberIdObject.setValue(String.valueOf(entity.getMemberId()));
            memberIdObject.setChecked(false);
        }
        BarablahTeacher  teacherIdEntity = barablahteacherMapper.selectByPrimaryKey(Long.valueOf(entity.getTeacherId()));
        if (teacherIdEntity!=null) {
            LabelValueItem teacherIdObject = response.getTeacherIdObject();
            teacherIdObject.setName("teacherId");
            teacherIdObject.setLabel(teacherIdEntity.getFullName());
            teacherIdObject.setValue(String.valueOf(entity.getTeacherId()));
            teacherIdObject.setChecked(false);
        }
        LabelValueItem statusEnum = response.getStatusEnum();
        statusEnum.setName("status");
        statusEnum.setLabel(com.newhead.barablah.modules.barablahmemberhomework.BarablahMemberHomeworkStatusEnum.getLabel(entity.getStatus()));
        statusEnum.setValue(entity.getStatus());
        statusEnum.setChecked(true);
        BarablahClass  classIdEntity = barablahclassMapper.selectByPrimaryKey(Long.valueOf(entity.getClassId()));
        if (classIdEntity!=null) {
            LabelValueItem classIdObject = response.getClassIdObject();
            classIdObject.setName("classId");
            classIdObject.setLabel(classIdEntity.getClassName());
            classIdObject.setValue(String.valueOf(entity.getClassId()));
            classIdObject.setChecked(false);
        }
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahMemberHomework entity = new BarablahMemberHomework();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahMemberHomeworkQueryResponse> queryList(SimpleBarablahMemberHomeworkQueryListRequest request) {
        List<SimpleBarablahMemberHomeworkQueryResponse> results = new ArrayList<SimpleBarablahMemberHomeworkQueryResponse>();

        //构造查询对象
        BarablahMemberHomeworkExample example = new BarablahMemberHomeworkExample();
        BarablahMemberHomeworkExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id asc";
        example.setOrderByClause(ordersrc);

        if (request.getHomeworkName()!=null) {
            c.andHomeworkNameLike("%"+request.getHomeworkName()+"%");
        }

        if (request.getStatus()!=null) {
            c.andStatusEqualTo(request.getStatus());
         }

        if (request.getClassId()!=null) {
            c.andClassIdEqualTo(request.getClassId());
         }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahMemberHomeworkQueryResponse> queryPage(SimpleBarablahMemberHomeworkQueryPageRequest request) {
        //结果
        List<SimpleBarablahMemberHomeworkQueryResponse> results = new ArrayList<SimpleBarablahMemberHomeworkQueryResponse>();

        //构造查询对象
        BarablahMemberHomeworkExample example = new BarablahMemberHomeworkExample();
        BarablahMemberHomeworkExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getHomeworkName()!=null) {
            c.andHomeworkNameLike("%"+request.getHomeworkName()+"%");
        }
        if (request.getStatus()!=null) {
            c.andStatusEqualTo(request.getStatus());
         }
        if (request.getClassId()!=null) {
            c.andClassIdEqualTo(request.getClassId());
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
    public void convertEntityToResponse(List<BarablahMemberHomework> entitys,List<SimpleBarablahMemberHomeworkQueryResponse> results) {
        Map<Long,Long> memberIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> memberIdResultMap = Maps.newHashMap();

        Map<Long,Long> teacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> teacherIdResultMap = Maps.newHashMap();

        Map<Long,Long> classIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> classIdResultMap = Maps.newHashMap();

       for(BarablahMemberHomework entity:entitys) {
            memberIdMap.put(entity.getId(),entity.getMemberId());
            teacherIdMap.put(entity.getId(),entity.getTeacherId());
            classIdMap.put(entity.getId(),entity.getClassId());
        }
        BarablahMemberExample memberIdExample = new BarablahMemberExample();

        List<Long> memberIds = new ArrayList<>();
        memberIds.addAll(memberIdMap.values());
        if (memberIds.size()>0) {
            memberIdExample.createCriteria().andIdIn(memberIds);
        }
        List<BarablahMember>  memberIdList = barablahmemberMapper.selectByExample(memberIdExample);
        for(BarablahMember item:memberIdList) {
           LabelValueItem memberIdItem = new LabelValueItem();
           memberIdItem.setName("memberId");
           memberIdItem.setValue(String.valueOf(item.getId()));
           memberIdItem.setLabel(item.getNickname());
           memberIdResultMap.put(item.getId(),memberIdItem);
        }
        BarablahTeacherExample teacherIdExample = new BarablahTeacherExample();

        List<Long> teacherIds = new ArrayList<>();
        teacherIds.addAll(teacherIdMap.values());
        if (teacherIds.size()>0) {
            teacherIdExample.createCriteria().andIdIn(teacherIds);
        }
        List<BarablahTeacher>  teacherIdList = barablahteacherMapper.selectByExample(teacherIdExample);
        for(BarablahTeacher item:teacherIdList) {
           LabelValueItem teacherIdItem = new LabelValueItem();
           teacherIdItem.setName("teacherId");
           teacherIdItem.setValue(String.valueOf(item.getId()));
           teacherIdItem.setLabel(item.getFullName());
           teacherIdResultMap.put(item.getId(),teacherIdItem);
        }
        BarablahClassExample classIdExample = new BarablahClassExample();

        List<Long> classIds = new ArrayList<>();
        classIds.addAll(classIdMap.values());
        if (classIds.size()>0) {
            classIdExample.createCriteria().andIdIn(classIds);
        }
        List<BarablahClass>  classIdList = barablahclassMapper.selectByExample(classIdExample);
        for(BarablahClass item:classIdList) {
           LabelValueItem classIdItem = new LabelValueItem();
           classIdItem.setName("classId");
           classIdItem.setValue(String.valueOf(item.getId()));
           classIdItem.setLabel(item.getClassName());
           classIdResultMap.put(item.getId(),classIdItem);
        }
        //第一组
        for(BarablahMemberHomework entity:entitys) {
            SimpleBarablahMemberHomeworkQueryResponse response = new SimpleBarablahMemberHomeworkQueryResponse();
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
            statusEnum.setLabel(com.newhead.barablah.modules.barablahmemberhomework.BarablahMemberHomeworkStatusEnum.getLabel(entity.getStatus()));
            statusEnum.setValue(entity.getStatus());
            statusEnum.setChecked(true);
            Long classId = classIdMap.get(entity.getId());

            LabelValueItem classIdlvi = null;
            if (classId!=null && classIdResultMap.get(classId)!=null) {
                classIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(classIdResultMap.get(classId),classIdlvi);
            }
            response.setClassIdObject(classIdlvi);
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
