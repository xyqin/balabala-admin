package com.newhead.sc.modules.scdevicesignup.base.repository.dao;

import com.newhead.sc.modules.scdevicesignup.base.repository.entity.ScDeviceSignup;
import com.newhead.sc.modules.scdevicesignup.base.repository.entity.ScDeviceSignupExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ScDeviceSignupMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    long countByExample(ScDeviceSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    int deleteByExample(ScDeviceSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    int insert(ScDeviceSignup record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    int insertSelective(ScDeviceSignup record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    List<ScDeviceSignup> selectByExample(ScDeviceSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    ScDeviceSignup selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    int updateByExampleSelective(@Param("record") ScDeviceSignup record, @Param("example") ScDeviceSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    int updateByExample(@Param("record") ScDeviceSignup record, @Param("example") ScDeviceSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    int updateByPrimaryKeySelective(ScDeviceSignup record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  sc_device_signup
     * @generated 2017年12月13日 12:17:47
     */
    int updateByPrimaryKey(ScDeviceSignup record);
}