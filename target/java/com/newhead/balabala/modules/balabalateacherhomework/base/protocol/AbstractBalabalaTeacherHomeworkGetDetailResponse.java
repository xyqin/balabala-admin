package com.newhead.balabala.modules.balabalateacherhomework.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年01月06日 09:19:39
 */
@Data
public abstract class AbstractBalabalaTeacherHomeworkGetDetailResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 教师ID
     */
    private LabelValueItem TeacherIdObject = new LabelValueItem();

    /**
     *
     * 作业名称
     */
     private String homeworkName;


}
