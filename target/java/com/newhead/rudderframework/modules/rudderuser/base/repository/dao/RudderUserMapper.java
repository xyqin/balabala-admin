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
     * @generated 2017年12月28日 03:59:19
     */
    long countByExample(RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2017年12月28日 03:59:19
     */
    int deleteByExample(RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2017年12月28日 03:59:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2017年12月28日 03:59:19
     */
    int insert(RudderUser record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2017年12月28日 03:59:19
     */
    int insertSelective(RudderUser record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2017年12月28日 03:59:19
     */
    List<RudderUser> selectByExample(RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2017年12月28日 03:59:19
     */
    RudderUser selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2017年12月28日 03:59:19
     */
    int updateByExampleSelective(@Param("record") RudderUser record, @Param("example") RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2017年12月28日 03:59:19
     */
    int updateByExample(@Param("record") RudderUser record, @Param("example") RudderUserExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2017年12月28日 03:59:19
     */
    int updateByPrimaryKeySelective(RudderUser record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user
     * @generated 2017年12月28日 03:59:19
     */
    int updateByPrimaryKey(RudderUser record);
}