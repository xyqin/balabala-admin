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
     * @generated 2018年1月25日 01:52:19
     */
    long countByExample(RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月25日 01:52:19
     */
    int deleteByExample(RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月25日 01:52:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月25日 01:52:19
     */
    int insert(RudderPermission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月25日 01:52:19
     */
    int insertSelective(RudderPermission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月25日 01:52:19
     */
    List<RudderPermission> selectByExample(RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月25日 01:52:19
     */
    RudderPermission selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月25日 01:52:19
     */
    int updateByExampleSelective(@Param("record") RudderPermission record, @Param("example") RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月25日 01:52:19
     */
    int updateByExample(@Param("record") RudderPermission record, @Param("example") RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月25日 01:52:19
     */
    int updateByPrimaryKeySelective(RudderPermission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年1月25日 01:52:19
     */
    int updateByPrimaryKey(RudderPermission record);
}