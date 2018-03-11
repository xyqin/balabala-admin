package com.newhead.barablah.modules.barablahcoursecategory.base.repository.dao;

import com.newhead.barablah.modules.barablahcoursecategory.base.repository.entity.BarablahCourseCategory;
import com.newhead.barablah.modules.barablahcoursecategory.base.repository.entity.BarablahCourseCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahCourseCategoryMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    long countByExample(BarablahCourseCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    int deleteByExample(BarablahCourseCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    int insert(BarablahCourseCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    int insertSelective(BarablahCourseCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    List<BarablahCourseCategory> selectByExample(BarablahCourseCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    BarablahCourseCategory selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    int updateByExampleSelective(@Param("record") BarablahCourseCategory record, @Param("example") BarablahCourseCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    int updateByExample(@Param("record") BarablahCourseCategory record, @Param("example") BarablahCourseCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    int updateByPrimaryKeySelective(BarablahCourseCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course_category
     * @generated 2018年3月12日 05:37:03
     */
    int updateByPrimaryKey(BarablahCourseCategory record);
}