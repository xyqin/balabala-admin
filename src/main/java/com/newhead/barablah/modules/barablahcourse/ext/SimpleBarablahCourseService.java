package com.newhead.barablah.modules.barablahcourse.ext;

import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahcourse.base.AbstractBarablahCourseService;
import com.newhead.barablah.modules.barablahcourse.base.repository.dao.BarablahCourseMapper;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourseExample;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.SimpleBarablahCourseQueryListRequest;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.SimpleBarablahCourseQueryResponse;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

}
