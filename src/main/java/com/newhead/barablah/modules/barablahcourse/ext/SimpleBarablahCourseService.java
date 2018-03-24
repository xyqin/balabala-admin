package com.newhead.barablah.modules.barablahcourse.ext;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahcourse.base.AbstractBarablahCourseService;
import com.newhead.barablah.modules.barablahcourse.base.repository.dao.BarablahCourseMapper;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourseExample;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.SimpleBarablahCourseQueryListRequest;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.SimpleBarablahCourseQueryResponse;
import com.newhead.barablah.modules.barablahcoursecategory.base.repository.entity.BarablahCourseCategory;
import com.newhead.barablah.modules.barablahcoursecategory.base.repository.entity.BarablahCourseCategoryExample;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.modules.LabelValueItem;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 课程服务
 * 2018年01月18日 06:52:58
 */
@Api(tags = "课程", description = "相关的API")
@Service
public class SimpleBarablahCourseService extends AbstractBarablahCourseService {

    @Autowired
    private BarablahCourseMapper mapper;

    @Autowired
    private BarablahClassMapper classMapper;

    @Override
    protected BarablahCourseMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahCourse entity) {

    }

    @Override
    public void delete(Long id) {
        BarablahClassExample bce = new BarablahClassExample();
        bce.createCriteria().andCourseIdEqualTo(id);

        long num = classMapper.countByExample(bce);
        if (num>0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(), "课程已经在开班里使用,不允许删除!");
        }

        getMapper().deleteByPrimaryKey(id);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahCourseQueryResponse> queryList(SimpleBarablahCourseQueryListRequest request) {
        List<SimpleBarablahCourseQueryResponse> results = new ArrayList<SimpleBarablahCourseQueryResponse>();

        //构造查询对象
        BarablahCourseExample example = new BarablahCourseExample();
        BarablahCourseExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getCourseCatId()!=null) {
            c.andCategoryIdEqualTo(request.getCourseCatId());
        }

        if (request.getCourseName()!=null) {
            c.andCourseNameLike("%"+request.getCourseName()+"%");
        }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }


    /**
     * 对象转换
     * @param entitys
     * @param results
     */
    private void convertEntityToResponse(List<BarablahCourse> entitys,List<SimpleBarablahCourseQueryResponse> results) {
        Map<Long,Long> categoryIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> categoryIdResultMap = Maps.newHashMap();

        Map<Long,Long> textbookCategoryIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> textbookCategoryIdResultMap = Maps.newHashMap();

        for(BarablahCourse entity:entitys) {
            categoryIdMap.put(entity.getId(),entity.getCategoryId());
            textbookCategoryIdMap.put(entity.getId(),entity.getTextbookCategoryId());
        }
        BarablahCourseCategoryExample categoryIdExample = new BarablahCourseCategoryExample();

        List<Long> categoryIds = new ArrayList<>();
        categoryIds.addAll(categoryIdMap.values());
        if (categoryIds.size()>0) {
            categoryIdExample.createCriteria().andIdIn(categoryIds);
        }
        List<BarablahCourseCategory>  categoryIdList = barablahcoursecategoryMapper.selectByExample(categoryIdExample);
        for(BarablahCourseCategory item:categoryIdList) {
            LabelValueItem categoryIdItem = new LabelValueItem();
            categoryIdItem.setName("categoryId");
            categoryIdItem.setValue(String.valueOf(item.getId()));
            categoryIdItem.setLabel(item.getCategoryName());
            categoryIdResultMap.put(item.getId(),categoryIdItem);
        }
        BarablahTextbookCategoryExample textbookCategoryIdExample = new BarablahTextbookCategoryExample();

        List<Long> textbookCategoryIds = new ArrayList<>();
        textbookCategoryIds.addAll(textbookCategoryIdMap.values());
        if (textbookCategoryIds.size()>0) {
            textbookCategoryIdExample.createCriteria().andIdIn(textbookCategoryIds);
        }
        List<BarablahTextbookCategory>  textbookCategoryIdList = barablahtextbookcategoryMapper.selectByExample(textbookCategoryIdExample);
        for(BarablahTextbookCategory item:textbookCategoryIdList) {
            LabelValueItem textbookCategoryIdItem = new LabelValueItem();
            textbookCategoryIdItem.setName("textbookCategoryId");
            textbookCategoryIdItem.setValue(String.valueOf(item.getId()));
            textbookCategoryIdItem.setLabel(item.getCategoryName());
            textbookCategoryIdResultMap.put(item.getId(),textbookCategoryIdItem);
        }
        //第一组
        for(BarablahCourse entity:entitys) {
            SimpleBarablahCourseQueryResponse response = new SimpleBarablahCourseQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long categoryId = categoryIdMap.get(entity.getId());

            LabelValueItem categoryIdlvi = null;
            if (categoryId!=null && categoryIdResultMap.get(categoryId)!=null) {
                categoryIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(categoryIdResultMap.get(categoryId),categoryIdlvi);
            }
            response.setCategoryIdObject(categoryIdlvi);
            Long textbookCategoryId = textbookCategoryIdMap.get(entity.getId());

            LabelValueItem textbookCategoryIdlvi = null;
            if (textbookCategoryId!=null && textbookCategoryIdResultMap.get(textbookCategoryId)!=null) {
                textbookCategoryIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(textbookCategoryIdResultMap.get(textbookCategoryId),textbookCategoryIdlvi);
            }
            response.setTextbookCategoryIdObject(textbookCategoryIdlvi);
            results.add(response);
        }
    }
}
