package com.newhead.rudderframework.core.web.component.pagination;

import com.google.common.base.Preconditions;

/**
 * 分页请求
 * Created by xyqin on 16/5/23.
 */
public class PageRequest {

    private Integer page = 1;

    private Integer size = 10;

    private Integer offset;

    public PageRequest() { }

    public PageRequest(Integer page, Integer size) {
        this(page, size, null);
    }

    public PageRequest(Integer page, Integer size, Sort sort) {
        Preconditions.checkArgument(page > 0, "页码不能小于1");
        Preconditions.checkArgument(size > 0, "页面大小不能小于1");
        Preconditions.checkArgument(size < 50, "页面大小不能大于50");


        this.page = page;
        this.size = size;
        this.offset = (page - 1) * size;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getOffset() {
        this.offset = (page - 1) * size;
        return offset;
    }

    public void setPage(Integer page) {
        Preconditions.checkArgument(page > 0, "页码不能小于1");
        this.page = page;
    }

    public void setSize(Integer size) {
        Preconditions.checkArgument(size > 0, "页面大小不能小于1");
        Preconditions.checkArgument(size < 50, "页面大小不能大于50");
        this.size = size;
    }


}
