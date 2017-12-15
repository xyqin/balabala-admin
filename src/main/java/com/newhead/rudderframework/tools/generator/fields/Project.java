package com.newhead.rudderframework.tools.generator.fields;

import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ling on 2017/4/24.
 */
public class Project {
    private String name;

    private String desc;

    private String version;

    private String code;

    private List<Module> modules = new ArrayList<>();

    private static Map<String,Project> projects = Maps.newHashMap();

    /**
     *
     * @param name
     * @param desc
     */
    public Project(String name,String desc) {
        this.name = name;
        this.desc = desc;
    }

    public static Project newProject(String name,String desc) {
        Project p = new Project(name, desc);
        projects.put(name,p);
        return p;
    }

    public static Project getProject(String key) {
        return projects.get(key);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Module> getModules() {
        if (modules==null) {
            modules  = new ArrayList<>();
        }
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public void addModule(Module module) {
        this.getModules().add(module);
    }

    public Module getMoudle(String moduleName) {
        for(Module m:getModules()) {
            if (m.getBmoduleName().equals(moduleName)) {
                return m;
            }
        }
        throw new RuntimeException("the module "+ moduleName+" is not exist!");
    }

    public static List<Project> getProjects() {
        Set<Map.Entry<String, Project>> es = projects.entrySet();
        List<Project> projects = new ArrayList<>();
        for(Map.Entry<String, Project> entry:es) {
            projects.add(entry.getValue());
        }
        return projects;
    }
}
