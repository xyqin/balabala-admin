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
     * @generated 2017年12月28日 07:22:02
     */
    long countByExample(BalabalaTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2017年12月28日 07:22:02
     */
    int deleteByExample(BalabalaTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2017年12月28日 07:22:02
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2017年12月28日 07:22:02
     */
    int insert(BalabalaTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2017年12月28日 07:22:02
     */
    int insertSelective(BalabalaTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2017年12月28日 07:22:02
     */
    List<BalabalaTextbookCategory> selectByExample(BalabalaTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2017年12月28日 07:22:02
     */
    BalabalaTextbookCategory selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2017年12月28日 07:22:02
     */
    int updateByExampleSelective(@Param("record") BalabalaTextbookCategory record, @Param("example") BalabalaTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2017年12月28日 07:22:02
     */
    int updateByExample(@Param("record") BalabalaTextbookCategory record, @Param("example") BalabalaTextbookCategoryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2017年12月28日 07:22:02
     */
    int updateByPrimaryKeySelective(BalabalaTextbookCategory record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_category
     * @generated 2017年12月28日 07:22:02
     */
    int updateByPrimaryKey(BalabalaTextbookCategory record);
}