package com.newhead.balabala.modules.balabalacampus.base.repository.dao;

import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampus;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampusExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaCampusMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    long countByExample(BalabalaCampusExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    int deleteByExample(BalabalaCampusExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    int insert(BalabalaCampus record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    int insertSelective(BalabalaCampus record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    List<BalabalaCampus> selectByExample(BalabalaCampusExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    BalabalaCampus selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    int updateByExampleSelective(@Param("record") BalabalaCampus record, @Param("example") BalabalaCampusExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    int updateByExample(@Param("record") BalabalaCampus record, @Param("example") BalabalaCampusExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    int updateByPrimaryKeySelective(BalabalaCampus record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_campus
     * @generated 2017年12月28日 12:00:27
     */
    int updateByPrimaryKey(BalabalaCampus record);
}