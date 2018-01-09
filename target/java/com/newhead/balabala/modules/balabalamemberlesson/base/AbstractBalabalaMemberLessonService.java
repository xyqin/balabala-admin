package com.newhead.balabala.modules.balabalamemberlesson.base;

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
import com.newhead.balabala.modules.balabalamemberlesson.base.repository.dao.BalabalaMemberLessonMapper;
import com.newhead.balabala.modules.balabalamemberlesson.base.repository.entity.BalabalaMemberLesson;
import com.newhead.balabala.modules.balabalamemberlesson.base.repository.entity.BalabalaMemberLessonExample;
import com.newhead.balabala.modules.balabalamemberlesson.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClass;
import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClassExample;

import com.newhead.balabala.modules.balabalaclass.base.repository.dao.BalabalaClassMapper;
import com.newhead.balabala.modules.balabalaclasslesson.base.repository.entity.BalabalaClassLesson;
import com.newhead.balabala.modules.balabalaclasslesson.base.repository.entity.BalabalaClassLessonExample;

import com.newhead.balabala.modules.balabalaclasslesson.base.repository.dao.BalabalaClassLessonMapper;
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
public abstract class AbstractBalabalaMemberLessonService extends BaseService {
    protected abstract BalabalaMemberLessonMapper getMapper();

    protected abstract void saveOrUpdate(BalabalaMemberLesson entity);

    @Autowired
    protected BalabalaClassMapper balabalaclassMapper;
    @Autowired
    protected BalabalaClassLessonMapper balabalaclasslessonMapper;
    @Autowired
    protected BalabalaMemberMapper balabalamemberMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BalabalaMemberLesson create(SimpleBalabalaMemberLessonCreateRequest request) {
        BalabalaMemberLesson entity = new BalabalaMemberLesson();
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
    public BalabalaMemberLesson update(SimpleBalabalaMemberLessonUpdateRequest request) {
        BalabalaMemberLesson entity = new BalabalaMemberLesson();
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
    public SimpleBalabalaMemberLessonGetDetailResponse getDetail(Long id) {
        BalabalaMemberLesson entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBalabalaMemberLessonGetDetailResponse response = new SimpleBalabalaMemberLessonGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BalabalaMember  memberIdEntity = balabalamemberMapper.selectByPrimaryKey(Long.valueOf(entity.getMemberId()));
        if (memberIdEntity!=null) {
            LabelValueItem memberIdObject = response.getMemberIdObject();
            memberIdObject.setName("memberId");
            memberIdObject.setLabel(memberIdEntity.getNickname());
            memberIdObject.setValue(String.valueOf(entity.getMemberId()));
            memberIdObject.setChecked(false);
        }
        BalabalaClass  classIdEntity = balabalaclassMapper.selectByPrimaryKey(Long.valueOf(entity.getClassId()));
        if (classIdEntity!=null) {
            LabelValueItem classIdObject = response.getClassIdObject();
            classIdObject.setName("classId");
            classIdObject.setLabel(classIdEntity.getClassName());
            classIdObject.setValue(String.valueOf(entity.getClassId()));
            classIdObject.setChecked(false);
        }
        BalabalaClassLesson  lessonIdEntity = balabalaclasslessonMapper.selectByPrimaryKey(Long.valueOf(entity.getLessonId()));
        if (lessonIdEntity!=null) {
            LabelValueItem lessonIdObject = response.getLessonIdObject();
            lessonIdObject.setName("lessonId");
            lessonIdObject.setLabel(lessonIdEntity.getLessonName());
            lessonIdObject.setValue(String.valueOf(entity.getLessonId()));
            lessonIdObject.setChecked(false);
        }
        LabelValueItem typeEnum = response.getTypeEnum();
        typeEnum.setName("type");
        typeEnum.setLabel(com.newhead.balabala.modules.balabalamemberlesson.BalabalaMemberLessonTypeEnum.getLabel(entity.getType()));
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
        BalabalaMemberLesson entity = new BalabalaMemberLesson();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBalabalaMemberLessonQueryResponse> queryList(SimpleBalabalaMemberLessonQueryListRequest request) {
        List<SimpleBalabalaMemberLessonQueryResponse> results = new ArrayList<SimpleBalabalaMemberLessonQueryResponse>();

        //构造查询对象
        BalabalaMemberLessonExample example = new BalabalaMemberLessonExample();
        BalabalaMemberLessonExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        if (request.getType()!=null) {
            c.andTypeEqualTo(request.getType());
         }

        if (request.getProbational()!=null) {
            c.andProbationalEqualTo(request.getProbational());
         }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBalabalaMemberLessonQueryResponse> queryPage(SimpleBalabalaMemberLessonQueryPageRequest request) {
        //结果
        List<SimpleBalabalaMemberLessonQueryResponse> results = new ArrayList<SimpleBalabalaMemberLessonQueryResponse>();

        //构造查询对象
        BalabalaMemberLessonExample example = new BalabalaMemberLessonExample();
        BalabalaMemberLessonExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getType()!=null) {
            c.andTypeEqualTo(request.getType());
         }

        if (request.getProbational()!=null) {
            c.andProbationalEqualTo(request.getProbational());
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
    private void convertEntityToResponse(List<BalabalaMemberLesson> entitys,List<SimpleBalabalaMemberLessonQueryResponse> results) {
        Map<Long,Long> memberIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> memberIdResultMap = Maps.newHashMap();

        Map<Long,Long> classIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> classIdResultMap = Maps.newHashMap();

        Map<Long,Long> lessonIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> lessonIdResultMap = Maps.newHashMap();

       for(BalabalaMemberLesson entity:entitys) {
            memberIdMap.put(entity.getId(),entity.getMemberId());
            classIdMap.put(entity.getId(),entity.getClassId());
            lessonIdMap.put(entity.getId(),entity.getLessonId());
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
        BalabalaClassExample classIdExample = new BalabalaClassExample();

        List<Long> classIds = new ArrayList<>();
        classIds.addAll(classIdMap.values());
        if (classIds.size()>0) {
            classIdExample.createCriteria().andIdIn(classIds);
        }
        List<BalabalaClass>  classIdList = balabalaclassMapper.selectByExample(classIdExample);
        for(BalabalaClass item:classIdList) {
           LabelValueItem classIdItem = new LabelValueItem();
           classIdItem.setName("classId");
           classIdItem.setValue(String.valueOf(item.getId()));
           classIdItem.setLabel(item.getClassName());
           classIdResultMap.put(item.getId(),classIdItem);
        }
        BalabalaClassLessonExample lessonIdExample = new BalabalaClassLessonExample();

        List<Long> lessonIds = new ArrayList<>();
        lessonIds.addAll(lessonIdMap.values());
        if (lessonIds.size()>0) {
            lessonIdExample.createCriteria().andIdIn(lessonIds);
        }
        List<BalabalaClassLesson>  lessonIdList = balabalaclasslessonMapper.selectByExample(lessonIdExample);
        for(BalabalaClassLesson item:lessonIdList) {
           LabelValueItem lessonIdItem = new LabelValueItem();
           lessonIdItem.setName("lessonId");
           lessonIdItem.setValue(String.valueOf(item.getId()));
           lessonIdItem.setLabel(item.getLessonName());
           lessonIdResultMap.put(item.getId(),lessonIdItem);
        }
        //第一组
        for(BalabalaMemberLesson entity:entitys) {
            SimpleBalabalaMemberLessonQueryResponse response = new SimpleBalabalaMemberLessonQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long memberId = memberIdMap.get(entity.getId());

            LabelValueItem memberIdlvi = null;
            if (memberId!=null && memberIdResultMap.get(memberId)!=null) {
                memberIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(memberIdResultMap.get(memberId),memberIdlvi);
            }
            response.setMemberIdObject(memberIdlvi);
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
            LabelValueItem typeEnum = response.getTypeEnum();
            typeEnum.setName("type");
            typeEnum.setLabel(com.newhead.balabala.modules.balabalamemberlesson.BalabalaMemberLessonTypeEnum.getLabel(entity.getType()));
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
