package com.newhead.barablah.modules.barablahregion.base.repository.dao;

import com.newhead.barablah.modules.barablahregion.base.repository.entity.BarablahRegion;
import com.newhead.barablah.modules.barablahregion.base.repository.entity.BarablahRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahRegionMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    long countByExample(BarablahRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    int deleteByExample(BarablahRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    int insert(BarablahRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    int insertSelective(BarablahRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    List<BarablahRegion> selectByExample(BarablahRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    BarablahRegion selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    int updateByExampleSelective(@Param("record") BarablahRegion record, @Param("example") BarablahRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    int updateByExample(@Param("record") BarablahRegion record, @Param("example") BarablahRegionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    int updateByPrimaryKeySelective(BarablahRegion record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_region
     * @generated 2018年2月6日 03:58:37
     */
    int updateByPrimaryKey(BarablahRegion record);
}