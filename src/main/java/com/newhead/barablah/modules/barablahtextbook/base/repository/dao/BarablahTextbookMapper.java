package com.newhead.barablah.modules.barablahtextbook.base.repository.dao;

import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbook;
import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbookExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BarablahTextbookMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    long countByExample(BarablahTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    int deleteByExample(BarablahTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    int insert(BarablahTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    int insertSelective(BarablahTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    List<BarablahTextbook> selectByExample(BarablahTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    BarablahTextbook selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    int updateByExampleSelective(@Param("record") BarablahTextbook record, @Param("example") BarablahTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    int updateByExample(@Param("record") BarablahTextbook record, @Param("example") BarablahTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    int updateByPrimaryKeySelective(BarablahTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年3月6日 04:53:26
     */
    int updateByPrimaryKey(BarablahTextbook record);
}