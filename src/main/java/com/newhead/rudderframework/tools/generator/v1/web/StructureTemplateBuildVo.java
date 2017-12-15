package com.newhead.rudderframework.tools.generator.v1.web;

import com.newhead.rudderframework.tools.generator.fields.BaseTemplateVO;
import com.newhead.rudderframework.tools.generator.fields.Module;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ling on 2017/3/31.
 */
public class StructureTemplateBuildVo extends BaseTemplateVO{

    private List<Module> modules = new ArrayList<>();

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        return sdf.format(new Date());
    }

}
