package com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.dao;

import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permission;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permissionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RudderMenu2permissionMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    long countByExample(RudderMenu2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    int deleteByExample(RudderMenu2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    int insert(RudderMenu2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    int insertSelective(RudderMenu2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    List<RudderMenu2permission> selectByExample(RudderMenu2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    RudderMenu2permission selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    int updateByExampleSelective(@Param("record") RudderMenu2permission record, @Param("example") RudderMenu2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    int updateByExample(@Param("record") RudderMenu2permission record, @Param("example") RudderMenu2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    int updateByPrimaryKeySelective(RudderMenu2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月18日 05:08:22
     */
    int updateByPrimaryKey(RudderMenu2permission record);
}