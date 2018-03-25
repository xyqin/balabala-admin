package com.newhead.barablah.modules.barablahclasslesson.base;

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
import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLessonExample;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;


import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;

import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;

import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao.BarablahTextbookCategoryMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBarablahClassLessonService extends BaseService {
    protected abstract BarablahClassLessonMapper getMapper();

    protected abstract void saveOrUpdate(BarablahClassLesson entity);

    @Autowired
    protected BarablahClassMapper barablahclassMapper;
    @Autowired
    protected BarablahTextbookCategoryMapper barablahtextbookcategoryMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahClassLesson create(SimpleBarablahClassLessonCreateRequest request) {
        BarablahClassLesson entity = new BarablahClassLesson();
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
    public BarablahClassLesson update(SimpleBarablahClassLessonUpdateRequest request) {
        BarablahClassLesson entity = new BarablahClassLesson();
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
    public SimpleBarablahClassLessonGetDetailResponse getDetail(Long id) {
        BarablahClassLesson entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahClassLessonGetDetailResponse response = new SimpleBarablahClassLessonGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahClass  classIdEntity = barablahclassMapper.selectByPrimaryKey(Long.valueOf(entity.getClassId()));
        if (classIdEntity!=null) {
            LabelValueItem classIdObject = response.getClassIdObject();
            classIdObject.setName("classId");
            classIdObject.setLabel(classIdEntity.getClassName());
            classIdObject.setValue(String.valueOf(entity.getClassId()));
            classIdObject.setChecked(false);
        }
        BarablahTextbookCategory  categoryIdEntity = barablahtextbookcategoryMapper.selectByPrimaryKey(Long.valueOf(entity.getCategoryId()));
        if (categoryIdEntity!=null) {
            LabelValueItem categoryIdObject = response.getCategoryIdObject();
            categoryIdObject.setName("categoryId");
            categoryIdObject.setLabel(categoryIdEntity.getCategoryName());
            categoryIdObject.setValue(String.valueOf(entity.getCategoryId()));
            categoryIdObject.setChecked(false);
        }
        LabelValueItem statusEnum = response.getStatusEnum();
        statusEnum.setName("status");
        statusEnum.setLabel(com.newhead.barablah.modules.barablahclasslesson.BarablahClassLessonStatusEnum.getLabel(entity.getStatus()));
        statusEnum.setValue(entity.getStatus());
        statusEnum.setChecked(true);
        LabelValueItem typeEnum = response.getTypeEnum();
        typeEnum.setName("type");
        typeEnum.setLabel(com.newhead.barablah.modules.barablahclasslesson.BarablahClassLessonTypeEnum.getLabel(entity.getType()));
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
        BarablahClassLesson entity = new BarablahClassLesson();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahClassLessonQueryResponse> queryList(SimpleBarablahClassLessonQueryListRequest request) {
        List<SimpleBarablahClassLessonQueryResponse> results = new ArrayList<SimpleBarablahClassLessonQueryResponse>();

        //构造查询对象
        BarablahClassLessonExample example = new BarablahClassLessonExample();
        BarablahClassLessonExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id asc";
        example.setOrderByClause(ordersrc);

        if (request.getClassId()!=null) {
            c.andClassIdEqualTo(request.getClassId());
         }

        if (request.getLessonName()!=null) {
            c.andLessonNameLike("%"+request.getLessonName()+"%");
        }

        if (request.getStatus()!=null) {
            c.andStatusEqualTo(request.getStatus());
         }

        if (request.getType()!=null) {
            c.andTypeEqualTo(request.getType());
         }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahClassLessonQueryResponse> queryPage(SimpleBarablahClassLessonQueryPageRequest request) {
        //结果
        List<SimpleBarablahClassLessonQueryResponse> results = new ArrayList<SimpleBarablahClassLessonQueryResponse>();

        //构造查询对象
        BarablahClassLessonExample example = new BarablahClassLessonExample();
        BarablahClassLessonExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getClassId()!=null) {
            c.andClassIdEqualTo(request.getClassId());
         }
        if (request.getLessonName()!=null) {
            c.andLessonNameLike("%"+request.getLessonName()+"%");
        }
        if (request.getStatus()!=null) {
            c.andStatusEqualTo(request.getStatus());
         }
        if (request.getType()!=null) {
            c.andTypeEqualTo(request.getType());
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
    public void convertEntityToResponse(List<BarablahClassLesson> entitys,List<SimpleBarablahClassLessonQueryResponse> results) {
        Map<Long,Long> classIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> classIdResultMap = Maps.newHashMap();

        Map<Long,Long> categoryIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> categoryIdResultMap = Maps.newHashMap();

       for(BarablahClassLesson entity:entitys) {
            classIdMap.put(entity.getId(),entity.getClassId());
            categoryIdMap.put(entity.getId(),entity.getCategoryId());
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
        BarablahTextbookCategoryExample categoryIdExample = new BarablahTextbookCategoryExample();

        List<Long> categoryIds = new ArrayList<>();
        categoryIds.addAll(categoryIdMap.values());
        if (categoryIds.size()>0) {
            categoryIdExample.createCriteria().andIdIn(categoryIds);
        }
        List<BarablahTextbookCategory>  categoryIdList = barablahtextbookcategoryMapper.selectByExample(categoryIdExample);
        for(BarablahTextbookCategory item:categoryIdList) {
           LabelValueItem categoryIdItem = new LabelValueItem();
           categoryIdItem.setName("categoryId");
           categoryIdItem.setValue(String.valueOf(item.getId()));
           categoryIdItem.setLabel(item.getCategoryName());
           categoryIdResultMap.put(item.getId(),categoryIdItem);
        }
        //第一组
        for(BarablahClassLesson entity:entitys) {
            SimpleBarablahClassLessonQueryResponse response = new SimpleBarablahClassLessonQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long classId = classIdMap.get(entity.getId());

            LabelValueItem classIdlvi = null;
            if (classId!=null && classIdResultMap.get(classId)!=null) {
                classIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(classIdResultMap.get(classId),classIdlvi);
            }
            response.setClassIdObject(classIdlvi);
            Long categoryId = categoryIdMap.get(entity.getId());

            LabelValueItem categoryIdlvi = null;
            if (categoryId!=null && categoryIdResultMap.get(categoryId)!=null) {
                categoryIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(categoryIdResultMap.get(categoryId),categoryIdlvi);
            }
            response.setCategoryIdObject(categoryIdlvi);
            LabelValueItem statusEnum = response.getStatusEnum();
            statusEnum.setName("status");
            statusEnum.setLabel(com.newhead.barablah.modules.barablahclasslesson.BarablahClassLessonStatusEnum.getLabel(entity.getStatus()));
            statusEnum.setValue(entity.getStatus());
            statusEnum.setChecked(true);
            LabelValueItem typeEnum = response.getTypeEnum();
            typeEnum.setName("type");
            typeEnum.setLabel(com.newhead.barablah.modules.barablahclasslesson.BarablahClassLessonTypeEnum.getLabel(entity.getType()));
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
