package com.newhead.rudderframework.core.web.component.tree;

/**
 * Created by ling on 2017/5/3.
 */
public class ExtNode {
    private Long id;

    private Node node = new Node();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
