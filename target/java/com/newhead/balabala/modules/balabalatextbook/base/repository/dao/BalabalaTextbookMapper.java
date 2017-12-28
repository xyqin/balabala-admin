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
     * @generated 2017年12月28日 07:22:02
     */
    long countByExample(BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 07:22:02
     */
    int deleteByExample(BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 07:22:02
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 07:22:02
     */
    int insert(BalabalaTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 07:22:02
     */
    int insertSelective(BalabalaTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 07:22:02
     */
    List<BalabalaTextbook> selectByExample(BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 07:22:02
     */
    BalabalaTextbook selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 07:22:02
     */
    int updateByExampleSelective(@Param("record") BalabalaTextbook record, @Param("example") BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 07:22:02
     */
    int updateByExample(@Param("record") BalabalaTextbook record, @Param("example") BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 07:22:02
     */
    int updateByPrimaryKeySelective(BalabalaTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2017年12月28日 07:22:02
     */
    int updateByPrimaryKey(BalabalaTextbook record);
}