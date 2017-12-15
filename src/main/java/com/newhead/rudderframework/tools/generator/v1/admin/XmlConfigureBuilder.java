package com.newhead.rudderframework.tools.generator.v1.admin;

import com.newhead.rudderframework.tools.generator.TemplateGenerator;
import com.newhead.rudderframework.tools.generator.fields.Module;
import com.newhead.rudderframework.tools.generator.fields.Project;
import com.newhead.rudderframework.tools.generator.v1.AbstractBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/4/25.
 */
public class XmlConfigureBuilder extends AbstractBuilder {
    @Override
    protected String getOutpath() {
        return "mybatis-config.xml";
    }

    @Override
    protected String getTemplatePath() {
        return "template/rudderframework";
    }

    @Override
    public void toBuild(List<Project> projectList) throws IOException {
        List<Module> modules = new ArrayList<>();
        for(Project p:projectList) {
            modules.addAll(p.getModules());
        }
        String outfile = TemplateGenerator.adminResourceTargetPath + getOutpath();

        Project p = new Project("","");
        p.getModules().addAll(modules);
        togen(outfile,p,"mybatis-config.config");
    }

    @Override
    protected boolean isOverride() {
        return true;
    }
}
