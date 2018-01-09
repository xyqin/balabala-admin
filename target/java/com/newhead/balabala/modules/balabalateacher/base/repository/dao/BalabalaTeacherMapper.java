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
     * @generated 2018年1月9日 04:35:21
     */
    long countByExample(BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByExample(BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月9日 04:35:21
     */
    int insert(BalabalaTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月9日 04:35:21
     */
    int insertSelective(BalabalaTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月9日 04:35:21
     */
    List<BalabalaTeacher> selectByExample(BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月9日 04:35:21
     */
    BalabalaTeacher selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExampleSelective(@Param("record") BalabalaTeacher record, @Param("example") BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExample(@Param("record") BalabalaTeacher record, @Param("example") BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKeySelective(BalabalaTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKey(BalabalaTeacher record);
}