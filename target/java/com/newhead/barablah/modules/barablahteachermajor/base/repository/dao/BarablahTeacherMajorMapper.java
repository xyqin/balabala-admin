package com.newhead.barablah.modules.barablahteachermajor.base.repository.dao;

import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajor;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahTeacherMajorMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    long countByExample(BarablahTeacherMajorExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    int deleteByExample(BarablahTeacherMajorExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    int insert(BarablahTeacherMajor record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    int insertSelective(BarablahTeacherMajor record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    List<BarablahTeacherMajor> selectByExample(BarablahTeacherMajorExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    BarablahTeacherMajor selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    int updateByExampleSelective(@Param("record") BarablahTeacherMajor record, @Param("example") BarablahTeacherMajorExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    int updateByExample(@Param("record") BarablahTeacherMajor record, @Param("example") BarablahTeacherMajorExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    int updateByPrimaryKeySelective(BarablahTeacherMajor record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月22日 08:05:40
     */
    int updateByPrimaryKey(BarablahTeacherMajor record);
}