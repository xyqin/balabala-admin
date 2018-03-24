package com.newhead.barablah.modules.barablahcourse.ext;

import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahcourse.base.AbstractBarablahCourseController;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.SimpleBarablahCourseCreateRequest;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.SimpleBarablahCourseQueryListRequest;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.SimpleBarablahCourseQueryResponse;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.SimpleBarablahCourseUpdateRequest;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao.BarablahTextbookCategoryMapper;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * RudderFramework 自动生成
 * 课程控制
 * 2018年01月18日 06:52:58
 */
@Api(tags = "课程", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahcourse", method = RequestMethod.GET)
public class SimpleBarablahCourseController extends AbstractBarablahCourseController {
    @Autowired
    private SimpleBarablahCourseService service;

    @Autowired
    private BarablahTextbookCategoryMapper catMapper;
    @Autowired
    private BarablahClassMapper classMapper;
    @Override
    public SimpleBarablahCourseService getService() {
        return service;
    }

    @Override
    protected ApiEntity fillCreateRequest(SimpleBarablahCourseCreateRequest request) {
        if (request.getOnlineMaxLessons()<request.getOnlineLessons()){
            request.setOnlineMaxLessons(request.getOnlineLessons());
        }
        if (request.getOnlineMaxDuration()<request.getOnlineDuration()){
            request.setOnlineMaxDuration(request.getOnlineDuration());
        }
        Long cid = request.getTextbookCategoryId();
        BarablahTextbookCategory cat = catMapper.selectByPrimaryKey(cid);
        int level = Integer.valueOf(cat.getPath());
        if(level!=3) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"必须选择三级教材分类！");
        }

        BarablahTextbookCategoryExample example = new BarablahTextbookCategoryExample();
        example.createCriteria().andParentIdEqualTo(cat.getId()).andDeletedEqualTo(false);
        List<BarablahTextbookCategory> entitys = catMapper.selectByExample(example);
        if (entitys==null || entitys.size()==0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"请先去设置题目!!!");
        }
        return null;
    }

    @Override
    protected ApiEntity fillUpdateRequest(SimpleBarablahCourseUpdateRequest request) {
        if (request.getOnlineMaxLessons()<request.getOnlineLessons()){
            request.setOnlineMaxLessons(request.getOnlineLessons());
        }
        if (request.getOnlineMaxDuration()<request.getOnlineDuration()){
            request.setOnlineMaxDuration(request.getOnlineDuration());
        }
        Long cid = request.getTextbookCategoryId();
        BarablahTextbookCategory cat = catMapper.selectByPrimaryKey(cid);
        int level = Integer.valueOf(cat.getPath());
        if(level!=3) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"必须选择三级教材分类！");
        }
        BarablahTextbookCategoryExample example = new BarablahTextbookCategoryExample();
        example.createCriteria().andParentIdEqualTo(cat.getId()).andDeletedEqualTo(false);
        List<BarablahTextbookCategory> entitys = catMapper.selectByExample(example);
        if (entitys==null || entitys.size()==0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"请先去设置题目!!!");
        }
        BarablahClassExample ce = new BarablahClassExample();
        ce.createCriteria().andCourseIdEqualTo(request.getId());
        long count = classMapper.countByExample(ce);
        if (count>0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"课程已经开班,不允许修改设置!!!");

        }
        return null;
    }


    /**
     * 得到课程列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "课程ID")
    @RequestMapping(value = "getlistby", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahCourseQueryResponse>> getList(@RequestParam(required = false) Long coursecatid) {
        SimpleBarablahCourseQueryListRequest request = new SimpleBarablahCourseQueryListRequest();
        if (coursecatid!=null) {
            request.setCourseCatId(coursecatid);
        }
        List<SimpleBarablahCourseQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahCourseQueryResponse>>(sources);
    }

}
