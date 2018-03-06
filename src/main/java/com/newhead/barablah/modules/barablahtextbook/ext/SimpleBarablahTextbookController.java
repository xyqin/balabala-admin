package com.newhead.barablah.modules.barablahtextbook.ext;

import com.newhead.barablah.modules.barablahtextbook.base.AbstractBarablahTextbookController;
import com.newhead.barablah.modules.barablahtextbookcategory.ext.protocol.SimpleBarablahTextbookCategoryNumsResponse;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 教材表控制
 * 2018年02月07日 10:47:07
 */
@Api(tags = "教材表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahtextbook", method = RequestMethod.GET)
public class SimpleBarablahTextbookController extends AbstractBarablahTextbookController {
    @Autowired
    private SimpleBarablahTextbookService service;

    @Override
    public SimpleBarablahTextbookService getService() {
        return service;
    }


    /**
     * 得到教材分类表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取二级分类的数量", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getnums/{id}", method = RequestMethod.GET)
    public ApiEntity<SimpleBarablahTextbookCategoryNumsResponse> getChildNums(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        long nums = service.getChildNums(id);

        SimpleBarablahTextbookCategoryNumsResponse response = new SimpleBarablahTextbookCategoryNumsResponse();
        response.setNums((int)nums);
        return new ApiEntity<SimpleBarablahTextbookCategoryNumsResponse>(response);
    }
}
