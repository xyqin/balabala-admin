package com.newhead.barablah.modules.barablahcampus.base.repository.dao;

import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampus;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampusExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahCampusMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    long countByExample(BarablahCampusExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    int deleteByExample(BarablahCampusExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    int insert(BarablahCampus record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    int insertSelective(BarablahCampus record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    List<BarablahCampus> selectByExample(BarablahCampusExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    BarablahCampus selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    int updateByExampleSelective(@Param("record") BarablahCampus record, @Param("example") BarablahCampusExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    int updateByExample(@Param("record") BarablahCampus record, @Param("example") BarablahCampusExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    int updateByPrimaryKeySelective(BarablahCampus record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_campus
     * @generated 2018年1月18日 06:52:57
     */
    int updateByPrimaryKey(BarablahCampus record);
}