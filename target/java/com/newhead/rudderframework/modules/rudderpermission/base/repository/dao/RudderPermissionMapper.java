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
     * @generated 2018年3月12日 05:37:03
     */
    long countByExample(RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年3月12日 05:37:03
     */
    int deleteByExample(RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年3月12日 05:37:03
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年3月12日 05:37:03
     */
    int insert(RudderPermission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年3月12日 05:37:03
     */
    int insertSelective(RudderPermission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年3月12日 05:37:03
     */
    List<RudderPermission> selectByExample(RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年3月12日 05:37:03
     */
    RudderPermission selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年3月12日 05:37:03
     */
    int updateByExampleSelective(@Param("record") RudderPermission record, @Param("example") RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年3月12日 05:37:03
     */
    int updateByExample(@Param("record") RudderPermission record, @Param("example") RudderPermissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年3月12日 05:37:03
     */
    int updateByPrimaryKeySelective(RudderPermission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_permission
     * @generated 2018年3月12日 05:37:03
     */
    int updateByPrimaryKey(RudderPermission record);
}