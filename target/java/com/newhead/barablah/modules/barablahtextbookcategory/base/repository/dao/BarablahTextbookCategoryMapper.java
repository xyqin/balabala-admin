package com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao;

import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BarablahTextbookCategoryMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    long countByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    int deleteByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    int insert(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    int insertSelective(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    List<BarablahTextbookCategory> selectByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    BarablahTextbookCategory selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    int updateByExampleSelective(@Param("record") BarablahTextbookCategory record, @Param("example") BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    int updateByExample(@Param("record") BarablahTextbookCategory record, @Param("example") BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    int updateByPrimaryKeySelective(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月18日 05:08:22
     */
    int updateByPrimaryKey(BarablahTextbookCategory record);
}