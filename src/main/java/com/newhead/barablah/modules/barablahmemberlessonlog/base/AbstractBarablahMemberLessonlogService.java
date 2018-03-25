package com.newhead.barablah.modules.barablahmemberlessonlog.base;

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
import com.newhead.barablah.modules.barablahmemberlessonlog.base.repository.dao.BarablahMemberLessonlogMapper;
import com.newhead.barablah.modules.barablahmemberlessonlog.base.repository.entity.BarablahMemberLessonlog;
import com.newhead.barablah.modules.barablahmemberlessonlog.base.repository.entity.BarablahMemberLessonlogExample;
import com.newhead.barablah.modules.barablahmemberlessonlog.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;

import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLessonExample;

import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMember;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMemberExample;

import com.newhead.barablah.modules.barablahmember.base.repository.dao.BarablahMemberMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBarablahMemberLessonlogService extends BaseService {
    protected abstract BarablahMemberLessonlogMapper getMapper();

    protected abstract void saveOrUpdate(BarablahMemberLessonlog entity);

    @Autowired
    protected BarablahClassMapper barablahclassMapper;
    @Autowired
    protected BarablahClassLessonMapper barablahclasslessonMapper;
    @Autowired
    protected BarablahMemberMapper barablahmemberMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahMemberLessonlog create(SimpleBarablahMemberLessonlogCreateRequest request) {
        BarablahMemberLessonlog entity = new BarablahMemberLessonlog();
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
    public BarablahMemberLessonlog update(SimpleBarablahMemberLessonlogUpdateRequest request) {
        BarablahMemberLessonlog entity = new BarablahMemberLessonlog();
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
    public SimpleBarablahMemberLessonlogGetDetailResponse getDetail(Long id) {
        BarablahMemberLessonlog entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahMemberLessonlogGetDetailResponse response = new SimpleBarablahMemberLessonlogGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahClass  classIdEntity = barablahclassMapper.selectByPrimaryKey(Long.valueOf(entity.getClassId()));
        if (classIdEntity!=null) {
            LabelValueItem classIdObject = response.getClassIdObject();
            classIdObject.setName("classId");
            classIdObject.setLabel(classIdEntity.getClassName());
            classIdObject.setValue(String.valueOf(entity.getClassId()));
            classIdObject.setChecked(false);
        }
        BarablahClassLesson  lessonIdEntity = barablahclasslessonMapper.selectByPrimaryKey(Long.valueOf(entity.getLessonId()));
        if (lessonIdEntity!=null) {
            LabelValueItem lessonIdObject = response.getLessonIdObject();
            lessonIdObject.setName("lessonId");
            lessonIdObject.setLabel(lessonIdEntity.getLessonName());
            lessonIdObject.setValue(String.valueOf(entity.getLessonId()));
            lessonIdObject.setChecked(false);
        }
        BarablahMember  memberIdEntity = barablahmemberMapper.selectByPrimaryKey(Long.valueOf(entity.getMemberId()));
        if (memberIdEntity!=null) {
            LabelValueItem memberIdObject = response.getMemberIdObject();
            memberIdObject.setName("memberId");
            memberIdObject.setLabel(memberIdEntity.getNickname());
            memberIdObject.setValue(String.valueOf(entity.getMemberId()));
            memberIdObject.setChecked(false);
        }
        LabelValueItem actionEnum = response.getActionEnum();
        actionEnum.setName("action");
        actionEnum.setLabel(com.newhead.barablah.modules.barablahmemberlessonlog.BarablahMemberLessonlogActionEnum.getLabel(entity.getAction()));
        actionEnum.setValue(entity.getAction());
        actionEnum.setChecked(true);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahMemberLessonlog entity = new BarablahMemberLessonlog();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahMemberLessonlogQueryResponse> queryList(SimpleBarablahMemberLessonlogQueryListRequest request) {
        List<SimpleBarablahMemberLessonlogQueryResponse> results = new ArrayList<SimpleBarablahMemberLessonlogQueryResponse>();

        //构造查询对象
        BarablahMemberLessonlogExample example = new BarablahMemberLessonlogExample();
        BarablahMemberLessonlogExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id asc";
        example.setOrderByClause(ordersrc);

        if (request.getAction()!=null) {
            c.andActionEqualTo(request.getAction());
         }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahMemberLessonlogQueryResponse> queryPage(SimpleBarablahMemberLessonlogQueryPageRequest request) {
        //结果
        List<SimpleBarablahMemberLessonlogQueryResponse> results = new ArrayList<SimpleBarablahMemberLessonlogQueryResponse>();

        //构造查询对象
        BarablahMemberLessonlogExample example = new BarablahMemberLessonlogExample();
        BarablahMemberLessonlogExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getAction()!=null) {
            c.andActionEqualTo(request.getAction());
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
    public void convertEntityToResponse(List<BarablahMemberLessonlog> entitys,List<SimpleBarablahMemberLessonlogQueryResponse> results) {
        Map<Long,Long> classIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> classIdResultMap = Maps.newHashMap();

        Map<Long,Long> lessonIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> lessonIdResultMap = Maps.newHashMap();

        Map<Long,Long> memberIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> memberIdResultMap = Maps.newHashMap();

       for(BarablahMemberLessonlog entity:entitys) {
            classIdMap.put(entity.getId(),entity.getClassId());
            lessonIdMap.put(entity.getId(),entity.getLessonId());
            memberIdMap.put(entity.getId(),entity.getMemberId());
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
        BarablahClassLessonExample lessonIdExample = new BarablahClassLessonExample();

        List<Long> lessonIds = new ArrayList<>();
        lessonIds.addAll(lessonIdMap.values());
        if (lessonIds.size()>0) {
            lessonIdExample.createCriteria().andIdIn(lessonIds);
        }
        List<BarablahClassLesson>  lessonIdList = barablahclasslessonMapper.selectByExample(lessonIdExample);
        for(BarablahClassLesson item:lessonIdList) {
           LabelValueItem lessonIdItem = new LabelValueItem();
           lessonIdItem.setName("lessonId");
           lessonIdItem.setValue(String.valueOf(item.getId()));
           lessonIdItem.setLabel(item.getLessonName());
           lessonIdResultMap.put(item.getId(),lessonIdItem);
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
        //第一组
        for(BarablahMemberLessonlog entity:entitys) {
            SimpleBarablahMemberLessonlogQueryResponse response = new SimpleBarablahMemberLessonlogQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long classId = classIdMap.get(entity.getId());

            LabelValueItem classIdlvi = null;
            if (classId!=null && classIdResultMap.get(classId)!=null) {
                classIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(classIdResultMap.get(classId),classIdlvi);
            }
            response.setClassIdObject(classIdlvi);
            Long lessonId = lessonIdMap.get(entity.getId());

            LabelValueItem lessonIdlvi = null;
            if (lessonId!=null && lessonIdResultMap.get(lessonId)!=null) {
                lessonIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(lessonIdResultMap.get(lessonId),lessonIdlvi);
            }
            response.setLessonIdObject(lessonIdlvi);
            Long memberId = memberIdMap.get(entity.getId());

            LabelValueItem memberIdlvi = null;
            if (memberId!=null && memberIdResultMap.get(memberId)!=null) {
                memberIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(memberIdResultMap.get(memberId),memberIdlvi);
            }
            response.setMemberIdObject(memberIdlvi);
            LabelValueItem actionEnum = response.getActionEnum();
            actionEnum.setName("action");
            actionEnum.setLabel(com.newhead.barablah.modules.barablahmemberlessonlog.BarablahMemberLessonlogActionEnum.getLabel(entity.getAction()));
            actionEnum.setValue(entity.getAction());
            actionEnum.setChecked(true);
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