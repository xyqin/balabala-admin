package com.newhead.barablah.modules.barablahcountry.base.repository.dao;

import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountry;
import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahCountryMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    long countByExample(BarablahCountryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    int deleteByExample(BarablahCountryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    int insert(BarablahCountry record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    int insertSelective(BarablahCountry record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    List<BarablahCountry> selectByExample(BarablahCountryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    BarablahCountry selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    int updateByExampleSelective(@Param("record") BarablahCountry record, @Param("example") BarablahCountryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    int updateByExample(@Param("record") BarablahCountry record, @Param("example") BarablahCountryExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    int updateByPrimaryKeySelective(BarablahCountry record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_country
     * @generated 2018年3月24日 04:28:55
     */
    int updateByPrimaryKey(BarablahCountry record);
}