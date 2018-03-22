package com.newhead.barablah.modules.barablahteacherhomework.base.repository.dao;

import com.newhead.barablah.modules.barablahteacherhomework.base.repository.entity.BarablahTeacherHomework;
import com.newhead.barablah.modules.barablahteacherhomework.base.repository.entity.BarablahTeacherHomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahTeacherHomeworkMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    long countByExample(BarablahTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    int deleteByExample(BarablahTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    int insert(BarablahTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    int insertSelective(BarablahTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    List<BarablahTeacherHomework> selectByExample(BarablahTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    BarablahTeacherHomework selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    int updateByExampleSelective(@Param("record") BarablahTeacherHomework record, @Param("example") BarablahTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    int updateByExample(@Param("record") BarablahTeacherHomework record, @Param("example") BarablahTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    int updateByPrimaryKeySelective(BarablahTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年3月22日 08:05:40
     */
    int updateByPrimaryKey(BarablahTeacherHomework record);
}