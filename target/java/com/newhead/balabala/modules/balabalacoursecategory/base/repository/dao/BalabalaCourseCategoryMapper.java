package com.newhead.balabala.modules.balabalacoursecategory.base.repository.dao;

import com.newhead.balabala.modules.balabalacoursecategory.base.repository.entity.BalabalaCourseCategory;
import com.newhead.balabala.modules.balabalacoursecategory.base.repository.entity.BalabalaCourseCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaCourseCategoryMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    long countByExample(BalabalaCourseCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    int deleteByExample(BalabalaCourseCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    int insert(BalabalaCourseCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    int insertSelective(BalabalaCourseCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    List<BalabalaCourseCategory> selectByExample(BalabalaCourseCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    BalabalaCourseCategory selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    int updateByExampleSelective(@Param("record") BalabalaCourseCategory record, @Param("example") BalabalaCourseCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    int updateByExample(@Param("record") BalabalaCourseCategory record, @Param("example") BalabalaCourseCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    int updateByPrimaryKeySelective(BalabalaCourseCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course_category
     * @generated 2017年12月28日 03:59:19
     */
    int updateByPrimaryKey(BalabalaCourseCategory record);
}