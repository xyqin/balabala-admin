package com.newhead.rudderframework.tools.generator.v1.admin;

/**
 *
 */
public class ExtModuleControllerBuilder extends AbstractJavaBuilder {
    @Override
    protected String getOutpath() {
        return "com/newhead/${key}/modules/${smoduleName}/ext/Simple${bmoduleName}Controller.java";
    }

    @Override
    protected boolean isOverride() {
        return true;
    }
}
