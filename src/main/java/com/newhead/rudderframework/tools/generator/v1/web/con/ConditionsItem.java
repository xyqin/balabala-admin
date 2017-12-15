package com.newhead.rudderframework.tools.generator.v1.web.con;

public class ConditionsItem {
    private String name;

    private String desc;

    private String type;

    private boolean checked;

    public ConditionsItem() {

    }

    /**
     * @param name 名称
     * @param desc 描述
     * @param type 类型
     * @param checked 是否显示
     */
    public ConditionsItem(String name, String desc, String type, boolean checked) {
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.checked = checked;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
