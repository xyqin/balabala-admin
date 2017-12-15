package com.newhead.rudderframework.core.security;

/**
 * Created by ling on 2017/4/7.
 */
public class ShiroRole implements Role {
    private Long id;

    private String name;

    public ShiroRole(Long id,String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
