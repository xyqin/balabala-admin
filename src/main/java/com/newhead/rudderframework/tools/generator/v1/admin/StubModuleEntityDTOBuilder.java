package com.newhead.rudderframework.tools.generator.v1.admin;

/**
 * Created by ling on 2017/4/25.
 */
public class StubModuleEntityDTOBuilder extends AbstractJavaBuilder {
    @Override
    protected String getOutpath() {
        return "com/newhead/${key}/modules/${smoduleName}/base/Abstract${bmoduleName}EntityDTO.java";
    }

    @Override
    protected boolean isOverride() {
        return true;
    }
}
