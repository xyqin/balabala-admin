package com.newhead.barablah.modules.barablahtextbookcategory.ext;

import com.newhead.barablah.modules.barablahtextbookcategory.base.AbstractBarablahTextbookCategoryController;
import com.newhead.barablah.modules.barablahtextbookcategory.ext.protocol.SimpleBarablahTextbookCategoryCreateRequest;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 教材分类表控制
 * 2018年01月25日 02:58:38
 */
@Api(tags = "教材分类表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahtextbookcategory", method = RequestMethod.GET)
public class SimpleBarablahTextbookCategoryController extends AbstractBarablahTextbookCategoryController {
    @Autowired
    private SimpleBarablahTextbookCategoryService service;

    @Override
    public SimpleBarablahTextbookCategoryService getService() {
        return service;
    }


    @Override
    protected ApiEntity fillCreateRequest(SimpleBarablahTextbookCategoryCreateRequest request) {

        return null;
    }

    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "gettreebyclass", method = RequestMethod.GET)
    public ApiEntity getTree(@RequestParam(required = true) Long classid) {
        Tree tree = getService().getTree(classid);
        return new ApiEntity<>(tree);
    }

}
