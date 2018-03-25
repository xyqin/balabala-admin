package com.newhead.barablah.modules.barablahteachermajor.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 
 * @generated 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahTeacherMajorQueryResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 专业名称
     */
     private String majorName;

    /**
     *
     * 排序号
     */
     private Integer position;

}
