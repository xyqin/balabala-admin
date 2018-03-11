package com.newhead.rudderframework.modules.rudderuser.base.repository.dao;

import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RudderUserMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    long countByExample(RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    int deleteByExample(RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    int insert(RudderUser record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    int insertSelective(RudderUser record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    List<RudderUser> selectByExample(RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    RudderUser selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    int updateByExampleSelective(@Param("record") RudderUser record, @Param("example") RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    int updateByExample(@Param("record") RudderUser record, @Param("example") RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    int updateByPrimaryKeySelective(RudderUser record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2018年3月11日 09:18:42
     */
    int updateByPrimaryKey(RudderUser record);
}