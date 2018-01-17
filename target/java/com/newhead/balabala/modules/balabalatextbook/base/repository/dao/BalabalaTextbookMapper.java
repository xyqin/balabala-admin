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
     * @generated 2018年1月17日 05:42:33
     */
    long countByExample(BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2018年1月17日 05:42:33
     */
    int deleteByExample(BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2018年1月17日 05:42:33
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2018年1月17日 05:42:33
     */
    int insert(BalabalaTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2018年1月17日 05:42:33
     */
    int insertSelective(BalabalaTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2018年1月17日 05:42:33
     */
    List<BalabalaTextbook> selectByExample(BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2018年1月17日 05:42:33
     */
    BalabalaTextbook selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2018年1月17日 05:42:33
     */
    int updateByExampleSelective(@Param("record") BalabalaTextbook record, @Param("example") BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2018年1月17日 05:42:33
     */
    int updateByExample(@Param("record") BalabalaTextbook record, @Param("example") BalabalaTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2018年1月17日 05:42:33
     */
    int updateByPrimaryKeySelective(BalabalaTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook
     * @generated 2018年1月17日 05:42:33
     */
    int updateByPrimaryKey(BalabalaTextbook record);
}