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
     * @generated 2017年12月28日 05:00:55
     */
    long countByExample(BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2017年12月28日 05:00:55
     */
    int deleteByExample(BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2017年12月28日 05:00:55
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2017年12月28日 05:00:55
     */
    int insert(BalabalaTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2017年12月28日 05:00:55
     */
    int insertSelective(BalabalaTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2017年12月28日 05:00:55
     */
    List<BalabalaTeacherHomework> selectByExample(BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2017年12月28日 05:00:55
     */
    BalabalaTeacherHomework selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2017年12月28日 05:00:55
     */
    int updateByExampleSelective(@Param("record") BalabalaTeacherHomework record, @Param("example") BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2017年12月28日 05:00:55
     */
    int updateByExample(@Param("record") BalabalaTeacherHomework record, @Param("example") BalabalaTeacherHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2017年12月28日 05:00:55
     */
    int updateByPrimaryKeySelective(BalabalaTeacherHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework
     * @generated 2017年12月28日 05:00:55
     */
    int updateByPrimaryKey(BalabalaTeacherHomework record);
}