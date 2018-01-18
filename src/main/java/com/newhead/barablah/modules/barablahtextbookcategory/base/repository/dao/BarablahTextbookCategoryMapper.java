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
     * @generated 2018年1月18日 06:52:57
     */
    long countByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月18日 06:52:57
     */
    int deleteByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月18日 06:52:57
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月18日 06:52:57
     */
    int insert(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月18日 06:52:57
     */
    int insertSelective(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月18日 06:52:57
     */
    List<BarablahTextbookCategory> selectByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月18日 06:52:57
     */
    BarablahTextbookCategory selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月18日 06:52:57
     */
    int updateByExampleSelective(@Param("record") BarablahTextbookCategory record, @Param("example") BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月18日 06:52:57
     */
    int updateByExample(@Param("record") BarablahTextbookCategory record, @Param("example") BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月18日 06:52:57
     */
    int updateByPrimaryKeySelective(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年1月18日 06:52:57
     */
    int updateByPrimaryKey(BarablahTextbookCategory record);
}