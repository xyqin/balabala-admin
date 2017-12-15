package com.newhead.rudderframework.tools.generator.v1.web;

import com.newhead.rudderframework.tools.generator.TemplateGenerator;
import com.newhead.rudderframework.tools.generator.fields.Module;
import com.newhead.rudderframework.tools.generator.fields.Project;
import com.newhead.rudderframework.tools.generator.v1.AbstractBuilder;

import java.io.IOException;
import java.util.List;

/**
 * Created by ling on 2017/4/25.
 */
public class StructureBuilder extends AbstractBuilder {
    @Override
    protected String getOutpath() {
        return "columns/${bmoduleName}Columns.js";
    }

    @Override
    protected String getTemplatePath() {
        return "template/rudderframework/web";
    }

    @Override
    public void toBuild(List<Project> projectList) throws IOException {
        StructureTemplateBuildVo vo = new StructureTemplateBuildVo();

        for(Project project:projectList) {
            List<Module> modules = project.getModules();
            vo.getModules().addAll(modules);
        }

        String outFile = TemplateGenerator.webTargetPath +"structure.json";
        togen(outFile,vo,"model.structure");
    }

    @Override
    protected boolean isOverride() {
        return true;
    }
}
