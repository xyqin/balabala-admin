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
     * @generated 2018年2月6日 03:55:36
     */
    long countByExample(RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 03:55:36
     */
    int deleteByExample(RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 03:55:36
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 03:55:36
     */
    int insert(RudderMenu record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 03:55:36
     */
    int insertSelective(RudderMenu record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 03:55:36
     */
    List<RudderMenu> selectByExample(RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 03:55:36
     */
    RudderMenu selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 03:55:36
     */
    int updateByExampleSelective(@Param("record") RudderMenu record, @Param("example") RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 03:55:36
     */
    int updateByExample(@Param("record") RudderMenu record, @Param("example") RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 03:55:36
     */
    int updateByPrimaryKeySelective(RudderMenu record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 03:55:36
     */
    int updateByPrimaryKey(RudderMenu record);
}