package com.newhead.rudderframework.tools.generator;

import com.newhead.rudderframework.tools.generator.fields.Project;
import com.newhead.rudderframework.tools.generator.v1.Builder;
import com.newhead.rudderframework.tools.generator.v1.admin.EnumBuilder;
import com.newhead.rudderframework.tools.generator.v1.admin.StubModuleControllerBuilder;
import com.newhead.rudderframework.tools.generator.v1.admin.StubModuleServiceBuilder;
import com.newhead.rudderframework.tools.generator.v1.admin.XmlConfigureBuilder;
import com.newhead.rudderframework.tools.generator.v1.admin.protocol.StubProtocolBuilder;
import com.newhead.rudderframework.tools.generator.v1.web.StructureBuilder;
import com.newhead.rudderframework.tools.generator.v1.web.columns.JsColumnBuilder;
import com.newhead.rudderframework.tools.generator.v1.web.con.JsConditionsBuilder;
import com.newhead.rudderframework.tools.generator.v1.web.forms.FormBuilder;
import com.newhead.rudderframework.tools.generator.v1.web.rpc.RpcBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/4/25.
 */
public class V1RudderGenerator implements RudderGenerator {
    private static List<Builder> builderList = new ArrayList<>();

    static {
        loadBuilder();
    }

    public V1RudderGenerator() {
    }

    @Override
    public void go(List<Project> projectList) {
        for(Builder builder:builderList) {
            try {
                builder.toBuild(projectList);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void loadBuilder() {
//        builderList.add(new ExtModuleControllerBuilder());
//        builderList.add(new ExtModuleServiceBuilder());
//        builderList.add(new ExtProtocolBuilder());
        builderList.add(new StubProtocolBuilder());
        builderList.add(new StubModuleServiceBuilder());
        builderList.add(new StubModuleControllerBuilder());
        builderList.add(new XmlConfigureBuilder());
        builderList.add(new JsColumnBuilder());
        builderList.add(new EnumBuilder());
        builderList.add(new JsConditionsBuilder());
        builderList.add(new FormBuilder());
        builderList.add(new RpcBuilder());
        builderList.add(new StructureBuilder());
    }

}
