package com.newhead.rudderframework.tools.generator;

import com.alibaba.fastjson.JSON;
import com.newhead.rudderframework.tools.generator.fields.Module;
import com.newhead.rudderframework.tools.generator.fields.Project;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class RudderGeneratorTools {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        RudderGeneratorTools tools = new RudderGeneratorTools();
        tools.initProjectInfo();

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        InputStream configFile = ClassLoader.getSystemResourceAsStream("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator;

        myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
        myBatisGenerator.generate(null);

        tools.generator();
    }

    private void initProjectInfo() throws IOException {
        Project.newProject("rudderframework","Rudder框架");
        Project.newProject("sc","智能");

        InputStream input = RudderGeneratorTools.class.getClassLoader().getResourceAsStream("template/rudderframework/table.txt");
        InputStreamReader isr = new InputStreamReader(input);
        BufferedReader reader = new BufferedReader(isr);
        String line = null;
        try {
            line = reader.readLine();
            while (StringUtils.isNotEmpty(line)) {
                Module m = JSON.parseObject(line,Module.class);
                System.out.println(line);
                Project.getProject(m.getKey()).addModule(m);
                line  = reader.readLine();
            }
        } finally {
            if (input!=null) {
                input.close();
            }
        }
    }

    private void generator() {
        List<Project> projects = Project.getProjects();
        RudderGeneratorFactory.getRudderGenerator().go(projects);
    }
}
