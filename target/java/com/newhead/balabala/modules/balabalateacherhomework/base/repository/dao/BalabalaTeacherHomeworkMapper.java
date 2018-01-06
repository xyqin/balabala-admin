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
     * @generated 2018年1月6日 09:19:37
     */
    long countByExample(BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月6日 09:19:37
     */
    int deleteByExample(BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月6日 09:19:37
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月6日 09:19:37
     */
    int insert(BalabalaTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月6日 09:19:37
     */
    int insertSelective(BalabalaTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月6日 09:19:37
     */
    List<BalabalaTeacherHomework> selectByExample(BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月6日 09:19:37
     */
    BalabalaTeacherHomework selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月6日 09:19:37
     */
    int updateByExampleSelective(@Param("record") BalabalaTeacherHomework record, @Param("example") BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月6日 09:19:37
     */
    int updateByExample(@Param("record") BalabalaTeacherHomework record, @Param("example") BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月6日 09:19:37
     */
    int updateByPrimaryKeySelective(BalabalaTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2018年1月6日 09:19:37
     */
    int updateByPrimaryKey(BalabalaTeacherHomework record);
}