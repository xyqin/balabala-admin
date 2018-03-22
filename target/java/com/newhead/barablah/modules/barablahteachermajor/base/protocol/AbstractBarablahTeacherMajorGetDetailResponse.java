package com.newhead.barablah.modules.barablahteachermajor.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月22日 08:05:46
 */
@Data
public abstract class AbstractBarablahTeacherMajorGetDetailResponse {
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
