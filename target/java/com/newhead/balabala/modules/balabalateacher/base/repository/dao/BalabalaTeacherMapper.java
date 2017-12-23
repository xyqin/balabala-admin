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
     * @generated 2017年12月23日 02:12:57
     */
    long countByExample(BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2017年12月23日 02:12:57
     */
    int deleteByExample(BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2017年12月23日 02:12:57
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2017年12月23日 02:12:57
     */
    int insert(BalabalaTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2017年12月23日 02:12:57
     */
    int insertSelective(BalabalaTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2017年12月23日 02:12:57
     */
    List<BalabalaTeacher> selectByExample(BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2017年12月23日 02:12:57
     */
    BalabalaTeacher selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2017年12月23日 02:12:57
     */
    int updateByExampleSelective(@Param("record") BalabalaTeacher record, @Param("example") BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2017年12月23日 02:12:57
     */
    int updateByExample(@Param("record") BalabalaTeacher record, @Param("example") BalabalaTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2017年12月23日 02:12:57
     */
    int updateByPrimaryKeySelective(BalabalaTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_teacher
     * @generated 2017年12月23日 02:12:57
     */
    int updateByPrimaryKey(BalabalaTeacher record);
}