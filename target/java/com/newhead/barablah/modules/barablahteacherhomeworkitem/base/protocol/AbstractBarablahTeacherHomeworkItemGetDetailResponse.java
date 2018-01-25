package com.newhead.barablah.modules.barablahteacherhomeworkitem.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年01月25日 03:24:35
 */
@Data
public abstract class AbstractBarablahTeacherHomeworkItemGetDetailResponse {
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
     * 教师发布作业ID
     */
    private LabelValueItem HomeworkIdObject = new LabelValueItem();

    /**
     *
     * 题目ID
     */
    private LabelValueItem TextbookIdObject = new LabelValueItem();


}
