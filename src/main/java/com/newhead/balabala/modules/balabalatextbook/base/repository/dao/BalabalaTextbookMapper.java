package com.newhead.balabala.modules.balabalatextbook.base.repository.dao;

import com.newhead.balabala.modules.balabalatextbook.base.repository.entity.BalabalaTextbook;
import com.newhead.balabala.modules.balabalatextbook.base.repository.entity.BalabalaTextbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaTextbookMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    long countByExample(BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    int deleteByExample(BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    int insert(BalabalaTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    int insertSelective(BalabalaTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    List<BalabalaTextbook> selectByExample(BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    BalabalaTextbook selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    int updateByExampleSelective(@Param("record") BalabalaTextbook record, @Param("example") BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    int updateByExample(@Param("record") BalabalaTextbook record, @Param("example") BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    int updateByPrimaryKeySelective(BalabalaTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 01:55:47
     */
    int updateByPrimaryKey(BalabalaTextbook record);
}