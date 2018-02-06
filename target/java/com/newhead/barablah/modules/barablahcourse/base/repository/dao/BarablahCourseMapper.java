package com.newhead.barablah.modules.barablahcourse.base.repository.dao;

import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahCourseMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    long countByExample(BarablahCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    int deleteByExample(BarablahCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    int insert(BarablahCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    int insertSelective(BarablahCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    List<BarablahCourse> selectByExample(BarablahCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    BarablahCourse selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    int updateByExampleSelective(@Param("record") BarablahCourse record, @Param("example") BarablahCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    int updateByExample(@Param("record") BarablahCourse record, @Param("example") BarablahCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    int updateByPrimaryKeySelective(BarablahCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年2月6日 03:38:22
     */
    int updateByPrimaryKey(BarablahCourse record);
}