package com.newhead.rudderframework.tools.generator.v1.web.rpc;

/**
 * Created by ling on 2017/3/30.
 */
public enum PpcMethodEnum {
    create("Post", RpcParamesTypeEnum.Entity.name()),
    update("Post", RpcParamesTypeEnum.Entity.name()),
    getdetail("Get", RpcParamesTypeEnum.IdPath.name()),
    delete("Get", RpcParamesTypeEnum.IdPath.name()),
    getlist("Get", RpcParamesTypeEnum.UrlParame.name()),
    getpage("Get", RpcParamesTypeEnum.UrlParameAtPage.name()),
    querylist("Post", RpcParamesTypeEnum.Query.name()),
    querypage("Post", RpcParamesTypeEnum.QueryAtPage.name()),
    getrnref("Get", RpcParamesTypeEnum.Nothing.name()),
    gettree("Get", RpcParamesTypeEnum.Nothing.name());


    private String requestMethod = "POST";

    private String parameType;

    private String desc;

    private PpcMethodEnum(String requestMethod, String parameType) {
        this.requestMethod = requestMethod;
        this.parameType = parameType;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getParameType() {
        return parameType;
    }

    public void setParameType(String parameType) {
        this.parameType = parameType;
    }

    public static String getDesc(String name) {
        if (name.equals("create")) {
            return "新建";
        } else if (name.equals("update")) {
            return "编辑";
        } else if (name.equals("getdetail")) {
            return "查看详情";
        } else if (name.equals("delete")) {
            return "删除";
        } else if (name.equals("getlist")) {
            return "查找";
        } else if (name.equals("getpage")) {
            return "查找";
        } else if (name.equals("querylist")) {
            return "查找";
        } else if (name.equals("querypage")) {
            return "查找";
        } else if (name.equals("gettree")) {
            return "查找";
        } else if (name.equals("getrnref")) {
            return "查找";
        }
        return "";
    }
}
