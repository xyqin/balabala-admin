package com.newhead.barablah.modules.barablahtextbook.base.repository.dao;

import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbook;
import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahTextbookMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    long countByExample(BarablahTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    int deleteByExample(BarablahTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    int insert(BarablahTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    int insertSelective(BarablahTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    List<BarablahTextbook> selectByExample(BarablahTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    BarablahTextbook selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    int updateByExampleSelective(@Param("record") BarablahTextbook record, @Param("example") BarablahTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    int updateByExample(@Param("record") BarablahTextbook record, @Param("example") BarablahTextbookExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    int updateByPrimaryKeySelective(BarablahTextbook record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_textbook
     * @generated 2018年2月6日 03:58:37
     */
    int updateByPrimaryKey(BarablahTextbook record);
}