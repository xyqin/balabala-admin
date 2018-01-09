package com.newhead.balabala.modules.balabalateacherhomework.base.repository.dao;

import com.newhead.balabala.modules.balabalateacherhomework.base.repository.entity.BalabalaTeacherHomework;
import com.newhead.balabala.modules.balabalateacherhomework.base.repository.entity.BalabalaTeacherHomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaTeacherHomeworkMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    long countByExample(BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByExample(BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    int insert(BalabalaTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    int insertSelective(BalabalaTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    List<BalabalaTeacherHomework> selectByExample(BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    BalabalaTeacherHomework selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExampleSelective(@Param("record") BalabalaTeacherHomework record, @Param("example") BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExample(@Param("record") BalabalaTeacherHomework record, @Param("example") BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKeySelective(BalabalaTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKey(BalabalaTeacherHomework record);
}