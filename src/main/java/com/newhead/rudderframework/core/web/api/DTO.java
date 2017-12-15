package com.newhead.rudderframework.core.web.api;

/**
 * 定义DTO抽象行为
 * Created by xyqin on 16/9/18.
 */
public interface DTO<T> {
    /**
     * 转换domain对象到dto
     *
     * @param domain
     */
    void fromDomain(T domain);

    /**
     * 转换dto到domain对象
     *
     * @return
     */
    T toDomain();

    /**
     * 创建时校验数据有效性
     *
     * @throws ApiException
     */
    void validateWhenCreating() throws ApiException;

    /**
     * 更新时校验数据有效性
     *
     * @throws ApiException
     */
    void validateWhenUpdating() throws ApiException;

}
