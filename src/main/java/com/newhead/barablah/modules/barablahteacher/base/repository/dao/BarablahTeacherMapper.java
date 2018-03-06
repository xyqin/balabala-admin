package com.newhead.barablah.modules.barablahteacher.base.repository.dao;

import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacher;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahTeacherMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    long countByExample(BarablahTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    int deleteByExample(BarablahTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    int insert(BarablahTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    int insertSelective(BarablahTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    List<BarablahTeacher> selectByExample(BarablahTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    BarablahTeacher selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    int updateByExampleSelective(@Param("record") BarablahTeacher record, @Param("example") BarablahTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    int updateByExample(@Param("record") BarablahTeacher record, @Param("example") BarablahTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    int updateByPrimaryKeySelective(BarablahTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月6日 04:53:26
     */
    int updateByPrimaryKey(BarablahTeacher record);
}