package com.newhead.barablah.modules.barablahregion.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:22
 */
@Data
public abstract class AbstractBarablahRegionCreateRequest {
    /**
     *
     * 上级ID
     */
    private Long parentId;

    /**
     *
     * 地区名称
     */
    private String regionName;

    /**
     *
     * 地区路径，以分隔
     */
    private String path;

    /**
     *
     * 排序号
     */
    private Integer position;

    /**
     *
     * 资源地址
     */
    private String url;

}
