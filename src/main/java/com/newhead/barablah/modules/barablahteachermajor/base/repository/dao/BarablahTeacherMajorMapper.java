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
     * @generated 2018年3月18日 01:59:09
     */
    long countByExample(BarablahTeacherMajorExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月18日 01:59:09
     */
    int deleteByExample(BarablahTeacherMajorExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月18日 01:59:09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月18日 01:59:09
     */
    int insert(BarablahTeacherMajor record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月18日 01:59:09
     */
    int insertSelective(BarablahTeacherMajor record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月18日 01:59:09
     */
    List<BarablahTeacherMajor> selectByExample(BarablahTeacherMajorExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月18日 01:59:09
     */
    BarablahTeacherMajor selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月18日 01:59:09
     */
    int updateByExampleSelective(@Param("record") BarablahTeacherMajor record, @Param("example") BarablahTeacherMajorExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月18日 01:59:09
     */
    int updateByExample(@Param("record") BarablahTeacherMajor record, @Param("example") BarablahTeacherMajorExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月18日 01:59:09
     */
    int updateByPrimaryKeySelective(BarablahTeacherMajor record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_teacher_major
     * @generated 2018年3月18日 01:59:09
     */
    int updateByPrimaryKey(BarablahTeacherMajor record);
}