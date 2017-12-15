package com.newhead.rudderframework.core.web.component.tree;

/**
 * 树形结构
 */
public class Tree {

    public Tree() {

    }

    public Tree(String url) {
        this.remoteApi = url;
    }
    /**
     * 远程Api用以远程加载数据使用
     */
    private String remoteApi;

    /**
     * 是否延迟加载
     */
    private boolean lazy = false;

    /**
     * 根节点
     */
    private Node rootNode;

    /**
     * 是否可以多选，用以节点是checkbox
     */
    private boolean multiSelect = false;

    /**
     * 节点是否带选择按钮
     */
    private String selectButton = SelectButtonEnum.radio.name();

    /**
     * 节点如果有图像该字段内容不为空
     */
    private String imgUrl;

    public String getSelectButton() {
        return selectButton;
    }

    public void setSelectButton(String selectButton) {
        this.selectButton = selectButton;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public boolean isMultiSelect() {
        return multiSelect;
    }

    public void setMultiSelect(boolean multiSelect) {
        this.multiSelect = multiSelect;
    }

    public String getRemoteApi() {
        return remoteApi;
    }

    public void setRemoteApi(String remoteApi) {
        this.remoteApi = remoteApi;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }
}
