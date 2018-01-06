package com.newhead.balabala.modules.balabalateacherhomeworkitem.base.repository.dao;

import com.newhead.balabala.modules.balabalateacherhomeworkitem.base.repository.entity.BalabalaTeacherHomeworkItem;
import com.newhead.balabala.modules.balabalateacherhomeworkitem.base.repository.entity.BalabalaTeacherHomeworkItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaTeacherHomeworkItemMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    long countByExample(BalabalaTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    int deleteByExample(BalabalaTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    int insert(BalabalaTeacherHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    int insertSelective(BalabalaTeacherHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    List<BalabalaTeacherHomeworkItem> selectByExample(BalabalaTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    BalabalaTeacherHomeworkItem selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    int updateByExampleSelective(@Param("record") BalabalaTeacherHomeworkItem record, @Param("example") BalabalaTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    int updateByExample(@Param("record") BalabalaTeacherHomeworkItem record, @Param("example") BalabalaTeacherHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    int updateByPrimaryKeySelective(BalabalaTeacherHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher_homework_item
     * @generated 2018年1月6日 09:19:37
     */
    int updateByPrimaryKey(BalabalaTeacherHomeworkItem record);
}