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
     * @generated 2018年1月25日 03:24:33
     */
    long countByExample(BarablahTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年1月25日 03:24:33
     */
    int deleteByExample(BarablahTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年1月25日 03:24:33
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年1月25日 03:24:33
     */
    int insert(BarablahTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年1月25日 03:24:33
     */
    int insertSelective(BarablahTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年1月25日 03:24:33
     */
    List<BarablahTeacherHomework> selectByExample(BarablahTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年1月25日 03:24:33
     */
    BarablahTeacherHomework selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年1月25日 03:24:33
     */
    int updateByExampleSelective(@Param("record") BarablahTeacherHomework record, @Param("example") BarablahTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年1月25日 03:24:33
     */
    int updateByExample(@Param("record") BarablahTeacherHomework record, @Param("example") BarablahTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年1月25日 03:24:33
     */
    int updateByPrimaryKeySelective(BarablahTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_homework
     * @generated 2018年1月25日 03:24:33
     */
    int updateByPrimaryKey(BarablahTeacherHomework record);
}