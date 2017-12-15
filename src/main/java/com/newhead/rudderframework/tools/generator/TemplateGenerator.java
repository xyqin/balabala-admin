package com.newhead.rudderframework.tools.generator;

import org.apache.commons.lang3.StringUtils;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.core.resource.StringTemplateResourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Properties;

/**
 * Created by ling on 2017/3/27.
 */
public class TemplateGenerator {
    private static TemplateGenerator instance;

    private static String outRootPackage = "";
    public static String adminTargetPath = "";
    public static String webTargetPath = "";

    public static String rootTemplatePath;
    public static Properties properties;

    public static String baseJavaPath = "";

    public static String extJavaPath = "";

    public static String interfaceJavaPath = "";

    public static String webTemplatePath = "";
    public static String adminResourceTargetPath;

    static {
        properties = new Properties();
        InputStream is = ClassLoader.getSystemResourceAsStream("configure.properties");
        try {
            properties.load(is);
            adminTargetPath = properties.getProperty("adminTargetPath");
            adminResourceTargetPath = properties.getProperty("adminResourceTargetPath");

            outRootPackage = properties.getProperty("outRootPackage");
            baseJavaPath = properties.getProperty("baseJavaPath");
            extJavaPath = properties.getProperty("extJavaPath");
            interfaceJavaPath = properties.getProperty("interfaceJavaPath");
            webTargetPath = properties.getProperty("webTargetPath");
            webTemplatePath = properties.getProperty("webTemplatePath");
            rootTemplatePath = properties.getProperty("rootTemplatePath");
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static String getOutRootPackage(String flag,String projectName) {
        if (flag.toLowerCase().contains("rudder")) {
            return StringUtils.replace(outRootPackage,"$projectName","rudderframework");
        } else {
            return StringUtils.replace(outRootPackage,"$projectName",projectName);
        }
    }

    public static void setOutRootPackage(String outRootPackage) {
        TemplateGenerator.outRootPackage = outRootPackage;
    }

    /**
     * 构建模版文件
     *
     * @param templatePath 模版路径
     * @param templateFile 模版文件
     * @param btv          动态对象
     * @param targetFile   输出文件
     * @throws IOException
     */
    public static void generator(String templatePath, String templateFile, Object btv, OutputStream targetFile) throws IOException {

        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader(templatePath);
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate("/"+templateFile);
        t.binding("vo", btv);
        t.renderTo(targetFile);
    }

    public static String generatorTxt(String txt,Map<String,String> parames) throws IOException {
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate(txt);
        for(Map.Entry<String,String> entry:parames.entrySet()) {
            t.binding(entry.getKey(), entry.getValue());
        }
        return t.render();
    }

}
