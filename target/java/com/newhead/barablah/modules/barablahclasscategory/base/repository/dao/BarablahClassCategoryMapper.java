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
     * @generated 2018年3月6日 04:53:26
     */
    long countByExample(BarablahClassCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月6日 04:53:26
     */
    int deleteByExample(BarablahClassCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月6日 04:53:26
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月6日 04:53:26
     */
    int insert(BarablahClassCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月6日 04:53:26
     */
    int insertSelective(BarablahClassCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月6日 04:53:26
     */
    List<BarablahClassCategory> selectByExample(BarablahClassCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月6日 04:53:26
     */
    BarablahClassCategory selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月6日 04:53:26
     */
    int updateByExampleSelective(@Param("record") BarablahClassCategory record, @Param("example") BarablahClassCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月6日 04:53:26
     */
    int updateByExample(@Param("record") BarablahClassCategory record, @Param("example") BarablahClassCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月6日 04:53:26
     */
    int updateByPrimaryKeySelective(BarablahClassCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_category
     * @generated 2018年3月6日 04:53:26
     */
    int updateByPrimaryKey(BarablahClassCategory record);
}