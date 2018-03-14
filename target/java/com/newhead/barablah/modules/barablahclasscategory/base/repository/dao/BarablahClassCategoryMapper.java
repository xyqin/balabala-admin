package com.newhead.barablah.modules.barablahclasscategory.base.repository.dao;

import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategory;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahClassCategoryMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    long countByExample(BarablahClassCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    int deleteByExample(BarablahClassCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    int insert(BarablahClassCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    int insertSelective(BarablahClassCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    List<BarablahClassCategory> selectByExample(BarablahClassCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    BarablahClassCategory selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    int updateByExampleSelective(@Param("record") BarablahClassCategory record, @Param("example") BarablahClassCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    int updateByExample(@Param("record") BarablahClassCategory record, @Param("example") BarablahClassCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    int updateByPrimaryKeySelective(BarablahClassCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月13日 09:31:59
     */
    int updateByPrimaryKey(BarablahClassCategory record);
}