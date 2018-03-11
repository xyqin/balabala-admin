package com.newhead.barablah.modules.barablahcourse.ext;

import com.newhead.barablah.modules.barablahcourse.base.AbstractBarablahCourseController;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.SimpleBarablahCourseCreateRequest;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.SimpleBarablahCourseUpdateRequest;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao.BarablahTextbookCategoryMapper;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    
    @Override
    public SimpleBarablahCourseService getService() {
        return service;
    }

    @Override
    protected ApiEntity fillCreateRequest(SimpleBarablahCourseCreateRequest request) {
        Long cid = request.getTextbookCategoryId();
        BarablahTextbookCategory cat = catMapper.selectByPrimaryKey(cid);
        if (cat.getParentId()!=null && cat.getParentId()>0 ) {
            BarablahTextbookCategory p = catMapper.selectByPrimaryKey(cat.getParentId());
            if (p.getParentId()==null || p.getParentId()==0) {
                BarablahTextbookCategoryExample example = new BarablahTextbookCategoryExample();
                example.createCriteria().andParentIdEqualTo(cid);
                long size = catMapper.countByExample(example);
                request.setOnlineLessons(Short.valueOf(String.valueOf(size)));
                return null;
            }
        }

        throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"必须选择二级教材分类！");
    }

    @Override
    protected ApiEntity fillUpdateRequest(SimpleBarablahCourseUpdateRequest request) {
        Long cid = request.getCategoryId();
        BarablahTextbookCategory cat = catMapper.selectByPrimaryKey(cid);
        if (cat.getParentId()!=null && cat.getParentId()>0 ) {
            BarablahTextbookCategory p = catMapper.selectByPrimaryKey(cat.getParentId());
            if (p.getParentId()==null || p.getParentId()==0) {
                BarablahTextbookCategoryExample example = new BarablahTextbookCategoryExample();
                example.createCriteria().andParentIdEqualTo(cid);
                long size = catMapper.countByExample(example);
                request.setOnlineLessons(Short.valueOf(String.valueOf(size)));
                return null;
            }
        }
        throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"必须选择二级教材分类！");    }
}
