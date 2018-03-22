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
     * @generated 2018年3月22日 08:05:40
     */
    long countByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月22日 08:05:40
     */
    int deleteByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月22日 08:05:40
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月22日 08:05:40
     */
    int insert(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月22日 08:05:40
     */
    int insertSelective(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月22日 08:05:40
     */
    List<BarablahTextbookCategory> selectByExample(BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月22日 08:05:40
     */
    BarablahTextbookCategory selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月22日 08:05:40
     */
    int updateByExampleSelective(@Param("record") BarablahTextbookCategory record, @Param("example") BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月22日 08:05:40
     */
    int updateByExample(@Param("record") BarablahTextbookCategory record, @Param("example") BarablahTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月22日 08:05:40
     */
    int updateByPrimaryKeySelective(BarablahTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook_category
     * @generated 2018年3月22日 08:05:40
     */
    int updateByPrimaryKey(BarablahTextbookCategory record);
}