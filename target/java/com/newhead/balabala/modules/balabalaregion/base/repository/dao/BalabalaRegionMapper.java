package com.newhead.balabala.modules.balabalaregion.base.repository.dao;

import com.newhead.balabala.modules.balabalaregion.base.repository.entity.BalabalaRegion;
import com.newhead.balabala.modules.balabalaregion.base.repository.entity.BalabalaRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaRegionMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    long countByExample(BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByExample(BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    int insert(BalabalaRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    int insertSelective(BalabalaRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    List<BalabalaRegion> selectByExample(BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    BalabalaRegion selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExampleSelective(@Param("record") BalabalaRegion record, @Param("example") BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExample(@Param("record") BalabalaRegion record, @Param("example") BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKeySelective(BalabalaRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKey(BalabalaRegion record);
}