package com.newhead.balabala.modules.balabalateacher.base.repository.dao;

import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacher;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaTeacherMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    long countByExample(BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    int deleteByExample(BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    int insert(BalabalaTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    int insertSelective(BalabalaTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    List<BalabalaTeacher> selectByExample(BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    BalabalaTeacher selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    int updateByExampleSelective(@Param("record") BalabalaTeacher record, @Param("example") BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    int updateByExample(@Param("record") BalabalaTeacher record, @Param("example") BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    int updateByPrimaryKeySelective(BalabalaTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月6日 09:19:37
     */
    int updateByPrimaryKey(BalabalaTeacher record);
}