package com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao;

import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahTextbookCategoryMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    long countByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    int deleteByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    int insert(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    int insertSelective(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    List<BarablahTextbookCategory> selectByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    BarablahTextbookCategory selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    int updateByExampleSelective(@Param("record") BarablahTextbookCategory record, @Param("example") BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    int updateByExample(@Param("record") BarablahTextbookCategory record, @Param("example") BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    int updateByPrimaryKeySelective(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月25日 01:52:19
     */
    int updateByPrimaryKey(BarablahTextbookCategory record);
}