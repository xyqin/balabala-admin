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
     * @generated 2018年3月22日 08:05:40
     */
    long countByExample(BarablahTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月22日 08:05:40
     */
    int deleteByExample(BarablahTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月22日 08:05:40
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月22日 08:05:40
     */
    int insert(BarablahTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月22日 08:05:40
     */
    int insertSelective(BarablahTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月22日 08:05:40
     */
    List<BarablahTeacher> selectByExample(BarablahTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月22日 08:05:40
     */
    BarablahTeacher selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月22日 08:05:40
     */
    int updateByExampleSelective(@Param("record") BarablahTeacher record, @Param("example") BarablahTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月22日 08:05:40
     */
    int updateByExample(@Param("record") BarablahTeacher record, @Param("example") BarablahTeacherExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月22日 08:05:40
     */
    int updateByPrimaryKeySelective(BarablahTeacher record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher
     * @generated 2018年3月22日 08:05:40
     */
    int updateByPrimaryKey(BarablahTeacher record);
}