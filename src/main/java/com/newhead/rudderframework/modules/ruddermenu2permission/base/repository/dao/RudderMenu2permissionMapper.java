package com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.dao;

import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permission;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RudderMenu2permissionMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    long countByExample(RudderMenu2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    int deleteByExample(RudderMenu2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    int insert(RudderMenu2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    int insertSelective(RudderMenu2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    List<RudderMenu2permission> selectByExample(RudderMenu2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    RudderMenu2permission selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    int updateByExampleSelective(@Param("record") RudderMenu2permission record, @Param("example") RudderMenu2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    int updateByExample(@Param("record") RudderMenu2permission record, @Param("example") RudderMenu2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    int updateByPrimaryKeySelective(RudderMenu2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu2permission
     * @generated 2018年3月11日 11:35:40
     */
    int updateByPrimaryKey(RudderMenu2permission record);
}