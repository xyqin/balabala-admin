package com.newhead.rudderframework.core.web.component.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/4/1.
 */
public class Node {
    /**
     * 标题
     */
    private String label;

    /**
     * 对应值
     */
    private String value;

    /**
     * 是否叶子节点
     */
    private boolean leaf;

    /**
     * 上级节点
     */
    private String parentId;

    /**
     * 模块URL路径
     */
    private String url;

    /**
     * 是否选中
     */
    private boolean selected = false;


    private int level;

    /**
     * 子节点
     */
    private List<Node> children = new ArrayList<>();

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public void addChild(Node node) {
        if (this.children==null) this.children = new ArrayList<>();
        this.children.add(node);
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
