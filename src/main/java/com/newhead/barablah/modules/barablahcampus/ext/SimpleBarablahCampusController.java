package com.newhead.barablah.modules.barablahcampus.ext;

import com.newhead.barablah.modules.barablahcampus.base.AbstractBarablahCampusController;
import com.newhead.barablah.modules.barablahteacher.ext.SimpleBarablahTeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 校区控制
 * 2018年01月18日 06:52:58
 */
@Api(tags = "校区", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahcampus", method = RequestMethod.GET)
public class SimpleBarablahCampusController extends AbstractBarablahCampusController {
    @Autowired
    private SimpleBarablahCampusService service;

    @Autowired
    protected SimpleBarablahTeacherService teacherService;


    @Override
    public SimpleBarablahCampusService getService() {
        return service;
    }

}
