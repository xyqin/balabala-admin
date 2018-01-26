package com.newhead.rudderframework.modules.rudderpermission.base.repository.dao;

import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermission;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RudderPermissionMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    long countByExample(RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    int deleteByExample(RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    int insert(RudderPermission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    int insertSelective(RudderPermission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    List<RudderPermission> selectByExample(RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    RudderPermission selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    int updateByExampleSelective(@Param("record") RudderPermission record, @Param("example") RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    int updateByExample(@Param("record") RudderPermission record, @Param("example") RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    int updateByPrimaryKeySelective(RudderPermission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月26日 11:13:51
     */
    int updateByPrimaryKey(RudderPermission record);
}