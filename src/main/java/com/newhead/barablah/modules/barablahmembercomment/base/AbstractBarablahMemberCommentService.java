package com.newhead.barablah.modules.barablahmembercomment.base;

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
import com.newhead.barablah.modules.barablahmembercomment.base.repository.dao.BarablahMemberCommentMapper;
import com.newhead.barablah.modules.barablahmembercomment.base.repository.entity.BarablahMemberComment;
import com.newhead.barablah.modules.barablahmembercomment.base.repository.entity.BarablahMemberCommentExample;
import com.newhead.barablah.modules.barablahmembercomment.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;

import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.entity.BarablahMemberHomework;
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.entity.BarablahMemberHomeworkExample;

import com.newhead.barablah.modules.barablahmemberhomework.base.repository.dao.BarablahMemberHomeworkMapper;
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
public abstract class AbstractBarablahMemberCommentService extends BaseService {
    protected abstract BarablahMemberCommentMapper getMapper();

    protected abstract void saveOrUpdate(BarablahMemberComment entity);

    @Autowired
    protected BarablahClassMapper barablahclassMapper;
    @Autowired
    protected BarablahMemberHomeworkMapper barablahmemberhomeworkMapper;
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
    public BarablahMemberComment create(SimpleBarablahMemberCommentCreateRequest request) {
        BarablahMemberComment entity = new BarablahMemberComment();
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
    public BarablahMemberComment update(SimpleBarablahMemberCommentUpdateRequest request) {
        BarablahMemberComment entity = new BarablahMemberComment();
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
    public SimpleBarablahMemberCommentGetDetailResponse getDetail(Long id) {
        BarablahMemberComment entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahMemberCommentGetDetailResponse response = new SimpleBarablahMemberCommentGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahClass  classIdEntity = barablahclassMapper.selectByPrimaryKey(Long.valueOf(entity.getClassId()));
        if (classIdEntity!=null) {
            LabelValueItem classIdObject = response.getClassIdObject();
            classIdObject.setName("classId");
            classIdObject.setLabel(classIdEntity.getClassName());
            classIdObject.setValue(String.valueOf(entity.getClassId()));
            classIdObject.setChecked(false);
        }
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
        BarablahMemberHomework  memberHomeworkIdEntity = barablahmemberhomeworkMapper.selectByPrimaryKey(Long.valueOf(entity.getMemberHomeworkId()));
        if (memberHomeworkIdEntity!=null) {
            LabelValueItem memberHomeworkIdObject = response.getMemberHomeworkIdObject();
            memberHomeworkIdObject.setName("memberHomeworkId");
            memberHomeworkIdObject.setLabel(memberHomeworkIdEntity.getHomeworkName());
            memberHomeworkIdObject.setValue(String.valueOf(entity.getMemberHomeworkId()));
            memberHomeworkIdObject.setChecked(false);
        }
        LabelValueItem commentTypeEnum = response.getCommentTypeEnum();
        commentTypeEnum.setName("commentType");
        commentTypeEnum.setLabel(com.newhead.barablah.modules.barablahmembercomment.BarablahMemberCommentCommentTypeEnum.getLabel(entity.getCommentType()));
        commentTypeEnum.setValue(entity.getCommentType());
        commentTypeEnum.setChecked(true);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahMemberComment entity = new BarablahMemberComment();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahMemberCommentQueryResponse> queryList(SimpleBarablahMemberCommentQueryListRequest request) {
        List<SimpleBarablahMemberCommentQueryResponse> results = new ArrayList<SimpleBarablahMemberCommentQueryResponse>();

        //构造查询对象
        BarablahMemberCommentExample example = new BarablahMemberCommentExample();
        BarablahMemberCommentExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        if (request.getClassId()!=null) {
            c.andClassIdEqualTo(request.getClassId());
         }

        if (request.getContent()!=null) {
            c.andContentLike("%"+request.getContent()+"%");
        }

        if (request.getCommentType()!=null) {
            c.andCommentTypeEqualTo(request.getCommentType());
         }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahMemberCommentQueryResponse> queryPage(SimpleBarablahMemberCommentQueryPageRequest request) {
        //结果
        List<SimpleBarablahMemberCommentQueryResponse> results = new ArrayList<SimpleBarablahMemberCommentQueryResponse>();

        //构造查询对象
        BarablahMemberCommentExample example = new BarablahMemberCommentExample();
        BarablahMemberCommentExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getClassId()!=null) {
            c.andClassIdEqualTo(request.getClassId());
         }

        if (request.getContent()!=null) {
            c.andContentLike("%"+request.getContent()+"%");
        }

        if (request.getCommentType()!=null) {
            c.andCommentTypeEqualTo(request.getCommentType());
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
    private void convertEntityToResponse(List<BarablahMemberComment> entitys,List<SimpleBarablahMemberCommentQueryResponse> results) {
        Map<Long,Long> classIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> classIdResultMap = Maps.newHashMap();

        Map<Long,Long> memberIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> memberIdResultMap = Maps.newHashMap();

        Map<Long,Long> teacherIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> teacherIdResultMap = Maps.newHashMap();

        Map<Long,Long> memberHomeworkIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> memberHomeworkIdResultMap = Maps.newHashMap();

       for(BarablahMemberComment entity:entitys) {
            classIdMap.put(entity.getId(),entity.getClassId());
            memberIdMap.put(entity.getId(),entity.getMemberId());
            teacherIdMap.put(entity.getId(),entity.getTeacherId());
            memberHomeworkIdMap.put(entity.getId(),entity.getMemberHomeworkId());
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
        BarablahMemberHomeworkExample memberHomeworkIdExample = new BarablahMemberHomeworkExample();

        List<Long> memberHomeworkIds = new ArrayList<>();
        memberHomeworkIds.addAll(memberHomeworkIdMap.values());
        if (memberHomeworkIds.size()>0) {
            memberHomeworkIdExample.createCriteria().andIdIn(memberHomeworkIds);
        }
        List<BarablahMemberHomework>  memberHomeworkIdList = barablahmemberhomeworkMapper.selectByExample(memberHomeworkIdExample);
        for(BarablahMemberHomework item:memberHomeworkIdList) {
           LabelValueItem memberHomeworkIdItem = new LabelValueItem();
           memberHomeworkIdItem.setName("memberHomeworkId");
           memberHomeworkIdItem.setValue(String.valueOf(item.getId()));
           memberHomeworkIdItem.setLabel(item.getHomeworkName());
           memberHomeworkIdResultMap.put(item.getId(),memberHomeworkIdItem);
        }
        //第一组
        for(BarablahMemberComment entity:entitys) {
            SimpleBarablahMemberCommentQueryResponse response = new SimpleBarablahMemberCommentQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long classId = classIdMap.get(entity.getId());

            LabelValueItem classIdlvi = null;
            if (classId!=null && classIdResultMap.get(classId)!=null) {
                classIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(classIdResultMap.get(classId),classIdlvi);
            }
            response.setClassIdObject(classIdlvi);
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
            Long memberHomeworkId = memberHomeworkIdMap.get(entity.getId());

            LabelValueItem memberHomeworkIdlvi = null;
            if (memberHomeworkId!=null && memberHomeworkIdResultMap.get(memberHomeworkId)!=null) {
                memberHomeworkIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(memberHomeworkIdResultMap.get(memberHomeworkId),memberHomeworkIdlvi);
            }
            response.setMemberHomeworkIdObject(memberHomeworkIdlvi);
            LabelValueItem commentTypeEnum = response.getCommentTypeEnum();
            commentTypeEnum.setName("commentType");
            commentTypeEnum.setLabel(com.newhead.barablah.modules.barablahmembercomment.BarablahMemberCommentCommentTypeEnum.getLabel(entity.getCommentType()));
            commentTypeEnum.setValue(entity.getCommentType());
            commentTypeEnum.setChecked(true);
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
