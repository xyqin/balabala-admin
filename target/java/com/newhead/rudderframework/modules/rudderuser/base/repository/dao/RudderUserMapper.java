package com.newhead.rudderframework.modules.rudderuser.base.repository.dao;

import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RudderUserMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    long countByExample(RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    int deleteByExample(RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    int insert(RudderUser record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    int insertSelective(RudderUser record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    List<RudderUser> selectByExample(RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    RudderUser selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    int updateByExampleSelective(@Param("record") RudderUser record, @Param("example") RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    int updateByExample(@Param("record") RudderUser record, @Param("example") RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    int updateByPrimaryKeySelective(RudderUser record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月18日 05:08:22
     */
    int updateByPrimaryKey(RudderUser record);
}