package com.newhead.rudderframework.modules.rudderuser2role.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 用户角色关系
 * 2018年01月09日 04:35:24
 */
@Data
public abstract class AbstractRudderUser2roleCreateRequest {
    /**
     *
     * 角色
     */
    private Long rudderroleId;

    /**
     *
     * 用户
     */
    private Long rudderuserId;

    /**
     *
     * 是否显示
     */
    private Boolean visible;

}
