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
     * @generated 2018年3月6日 04:53:26
     */
    long countByExample(BarablahCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月6日 04:53:26
     */
    int deleteByExample(BarablahCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月6日 04:53:26
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月6日 04:53:26
     */
    int insert(BarablahCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月6日 04:53:26
     */
    int insertSelective(BarablahCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月6日 04:53:26
     */
    List<BarablahCourse> selectByExample(BarablahCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月6日 04:53:26
     */
    BarablahCourse selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月6日 04:53:26
     */
    int updateByExampleSelective(@Param("record") BarablahCourse record, @Param("example") BarablahCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月6日 04:53:26
     */
    int updateByExample(@Param("record") BarablahCourse record, @Param("example") BarablahCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月6日 04:53:26
     */
    int updateByPrimaryKeySelective(BarablahCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月6日 04:53:26
     */
    int updateByPrimaryKey(BarablahCourse record);
}