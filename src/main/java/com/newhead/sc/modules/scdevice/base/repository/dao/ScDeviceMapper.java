package com.newhead.sc.modules.scdevice.base.repository.dao;

import com.newhead.sc.modules.scdevice.base.repository.entity.ScDevice;
import com.newhead.sc.modules.scdevice.base.repository.entity.ScDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ScDeviceMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    long countByExample(ScDeviceExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    int deleteByExample(ScDeviceExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    int insert(ScDevice record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    int insertSelective(ScDevice record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    List<ScDevice> selectByExample(ScDeviceExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    ScDevice selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    int updateByExampleSelective(@Param("record") ScDevice record, @Param("example") ScDeviceExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    int updateByExample(@Param("record") ScDevice record, @Param("example") ScDeviceExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    int updateByPrimaryKeySelective(ScDevice record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device
     * @generated 2017年12月13日 12:17:47
     */
    int updateByPrimaryKey(ScDevice record);
}