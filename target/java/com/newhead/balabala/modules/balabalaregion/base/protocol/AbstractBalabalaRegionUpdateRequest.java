package com.newhead.balabala.modules.balabalaregion.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月06日 09:19:39
 */
@Data
public abstract class AbstractBalabalaRegionUpdateRequest {
    /**
     *
     * 主键
     */
    private Long id;
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

}
