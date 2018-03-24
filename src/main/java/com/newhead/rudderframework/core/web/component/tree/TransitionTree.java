package com.newhead.rudderframework.core.web.component.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/5/3.
 */
public class TransitionTree {
    private String url;

    private List<ExtNode> ndoes = new ArrayList<>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ExtNode> getNdoes() {
        return ndoes;
    }

    public void setNdoes(List<ExtNode> ndoes) {
        this.ndoes = ndoes;
    }
    
}
