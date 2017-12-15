package com.newhead.rudderframework.core.web.component.pagination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 分页结果
 * Created by xyqin on 16/5/23.
 */
public class Page<T> {

    /**
     * 页码
     */
    private int number;

    /**
     * 页面大小
     */
    private int size;

    /**
     * 总记录数
     */
    private long totalElements;

    /**
     * 总页码数
     */
    private int totalPages;

    /**
     * 当前页码内容
     */
    private List<T> content = new ArrayList<T>();

    public Page() {}

    public Page(List<T> content, int number, int size, long totalElements) {
        this.content.addAll(content);
        this.number = number;
        this.size = size;
        this.totalElements = totalElements;
        this.totalPages = size <= 0 ? 1 : (int) ((totalElements + size - 1) / size);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public int getNumberOfElements() {
        return this.content.size();
    }

    public boolean hasContent() {
        return !this.content.isEmpty();
    }

    public List<T> getContent() {
        return Collections.unmodifiableList(this.content);
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
