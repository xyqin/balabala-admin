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
     * @generated 2017年12月28日 07:22:02
     */
    long countByExample(BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 07:22:02
     */
    int deleteByExample(BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 07:22:02
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 07:22:02
     */
    int insert(BalabalaRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 07:22:02
     */
    int insertSelective(BalabalaRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 07:22:02
     */
    List<BalabalaRegion> selectByExample(BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 07:22:02
     */
    BalabalaRegion selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 07:22:02
     */
    int updateByExampleSelective(@Param("record") BalabalaRegion record, @Param("example") BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 07:22:02
     */
    int updateByExample(@Param("record") BalabalaRegion record, @Param("example") BalabalaRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 07:22:02
     */
    int updateByPrimaryKeySelective(BalabalaRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_region
     * @generated 2017年12月28日 07:22:02
     */
    int updateByPrimaryKey(BalabalaRegion record);
}