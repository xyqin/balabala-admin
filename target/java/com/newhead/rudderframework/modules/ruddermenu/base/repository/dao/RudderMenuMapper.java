package com.newhead.rudderframework.modules.ruddermenu.base.repository.dao;

import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenu;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RudderMenuMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    long countByExample(RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    int deleteByExample(RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    int insert(RudderMenu record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    int insertSelective(RudderMenu record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    List<RudderMenu> selectByExample(RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    RudderMenu selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    int updateByExampleSelective(@Param("record") RudderMenu record, @Param("example") RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    int updateByExample(@Param("record") RudderMenu record, @Param("example") RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    int updateByPrimaryKeySelective(RudderMenu record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年1月26日 11:59:28
     */
    int updateByPrimaryKey(RudderMenu record);
}