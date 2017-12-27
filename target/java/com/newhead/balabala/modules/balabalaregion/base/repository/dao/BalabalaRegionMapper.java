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
     * @generated 2017年12月28日 12:00:27
     */
    long countByExample(BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 12:00:27
     */
    int deleteByExample(BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 12:00:27
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 12:00:27
     */
    int insert(BalabalaRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 12:00:27
     */
    int insertSelective(BalabalaRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 12:00:27
     */
    List<BalabalaRegion> selectByExample(BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 12:00:27
     */
    BalabalaRegion selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 12:00:27
     */
    int updateByExampleSelective(@Param("record") BalabalaRegion record, @Param("example") BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 12:00:27
     */
    int updateByExample(@Param("record") BalabalaRegion record, @Param("example") BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 12:00:27
     */
    int updateByPrimaryKeySelective(BalabalaRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 12:00:27
     */
    int updateByPrimaryKey(BalabalaRegion record);
}