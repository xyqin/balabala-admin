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
     * @generated 2018年3月22日 08:05:39
     */
    long countByExample(BarablahTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年3月22日 08:05:39
     */
    int deleteByExample(BarablahTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年3月22日 08:05:39
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年3月22日 08:05:39
     */
    int insert(BarablahTeacherHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年3月22日 08:05:39
     */
    int insertSelective(BarablahTeacherHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年3月22日 08:05:39
     */
    List<BarablahTeacherHomeworkItem> selectByExample(BarablahTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年3月22日 08:05:39
     */
    BarablahTeacherHomeworkItem selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年3月22日 08:05:39
     */
    int updateByExampleSelective(@Param("record") BarablahTeacherHomeworkItem record, @Param("example") BarablahTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年3月22日 08:05:39
     */
    int updateByExample(@Param("record") BarablahTeacherHomeworkItem record, @Param("example") BarablahTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年3月22日 08:05:39
     */
    int updateByPrimaryKeySelective(BarablahTeacherHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework_item
     * @generated 2018年3月22日 08:05:39
     */
    int updateByPrimaryKey(BarablahTeacherHomeworkItem record);
}