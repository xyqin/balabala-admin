package com.newhead.balabala.modules.balabalatextbookcategory.base.repository.dao;

import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategory;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaTextbookCategoryMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    long countByExample(BalabalaTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    int deleteByExample(BalabalaTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    int insert(BalabalaTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    int insertSelective(BalabalaTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    List<BalabalaTextbookCategory> selectByExample(BalabalaTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    BalabalaTextbookCategory selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    int updateByExampleSelective(@Param("record") BalabalaTextbookCategory record, @Param("example") BalabalaTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    int updateByExample(@Param("record") BalabalaTextbookCategory record, @Param("example") BalabalaTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    int updateByPrimaryKeySelective(BalabalaTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2018年1月6日 09:19:37
     */
    int updateByPrimaryKey(BalabalaTextbookCategory record);
}