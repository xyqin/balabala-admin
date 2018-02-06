package com.newhead.barablah.modules.barablahteacherhomeworkitem.base.repository.dao;

import com.newhead.barablah.modules.barablahteacherhomeworkitem.base.repository.entity.BarablahTeacherHomeworkItem;
import com.newhead.barablah.modules.barablahteacherhomeworkitem.base.repository.entity.BarablahTeacherHomeworkItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahTeacherHomeworkItemMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    long countByExample(BarablahTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int deleteByExample(BarablahTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int insert(BarablahTeacherHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int insertSelective(BarablahTeacherHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    List<BarablahTeacherHomeworkItem> selectByExample(BarablahTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    BarablahTeacherHomeworkItem selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int updateByExampleSelective(@Param("record") BarablahTeacherHomeworkItem record, @Param("example") BarablahTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int updateByExample(@Param("record") BarablahTeacherHomeworkItem record, @Param("example") BarablahTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int updateByPrimaryKeySelective(BarablahTeacherHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int updateByPrimaryKey(BarablahTeacherHomeworkItem record);
}