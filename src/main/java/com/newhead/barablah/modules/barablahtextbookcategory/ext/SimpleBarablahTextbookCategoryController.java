package com.newhead.barablah.modules.barablahtextbookcategory.ext;

import com.newhead.barablah.modules.barablahtextbookcategory.base.AbstractBarablahTextbookCategoryController;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import com.newhead.barablah.modules.barablahtextbookcategory.ext.protocol.SimpleBarablahTextbookCategoryCreateRequest;
import com.newhead.barablah.modules.barablahtextbookcategory.ext.protocol.SimpleBarablahTextbookCategoryUpdateRequest;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.tree.Tree;
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
        if (request.getParentId()==null) {
            request.setParentId(0l);
            request.setPath("1");
        }
        if (request.getParentId()!=0) {
            BarablahTextbookCategory entity = service.getMapper().selectByPrimaryKey(request.getParentId());
            int level = Integer.valueOf(entity.getPath())+1;
            if (level>4) throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"教材类别最大只允许4级！");
            request.setPath(String.valueOf(level));
        }
        return null;
    }


    @Override
    protected ApiEntity fillUpdateRequest(SimpleBarablahTextbookCategoryUpdateRequest request) {
        if (request.getParentId()==null) {
            request.setParentId(0l);
        }
        if (request.getParentId()!=0) {
            BarablahTextbookCategory entity = service.getMapper().selectByPrimaryKey(request.getParentId());
            int level = Integer.valueOf(entity.getPath())+1;

            if (level>4) throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"教材类别最大只允许4级！");

            level = level + level(request.getId());
            if (level>4) throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"教材类别最大只允许4级！");

            request.setPath(String.valueOf(level));
        }

        if (request.getParentId()==null) {
            request.setParentId(0l);
        }

        BarablahTextbookCategoryExample s = new BarablahTextbookCategoryExample();
        s.createCriteria().andParentIdEqualTo(request.getParentId());
        long count = service.getMapper().countByExample(s);
        request.setPosition((int)count+1);

        return null;
    }

    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "gettreebyclass", method = RequestMethod.GET)
    public ApiEntity getTree(@RequestParam(required = true) Long classid) {
        Tree tree = getService().getTree(classid);
        return new ApiEntity<>(tree);
    }


    private int level(long id) {
        BarablahTextbookCategoryExample example = new BarablahTextbookCategoryExample();
        example.createCriteria().andDeletedEqualTo(false).andParentIdEqualTo(id);
        List<BarablahTextbookCategory> entitys = service.getMapper().selectByExample(example);
        int result = 0;
        if (entitys!=null && entitys.size()>0) {
            result = 1;
            for(BarablahTextbookCategory entity:entitys) {
                result= result + level(entity.getId());
            }
        }
        return result;
    }


}
