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
     * @generated 2018年2月6日 05:24:54
     */
    long countByExample(RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 05:24:54
     */
    int deleteByExample(RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 05:24:54
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 05:24:54
     */
    int insert(RudderMenu record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 05:24:54
     */
    int insertSelective(RudderMenu record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 05:24:54
     */
    List<RudderMenu> selectByExample(RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 05:24:54
     */
    RudderMenu selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 05:24:54
     */
    int updateByExampleSelective(@Param("record") RudderMenu record, @Param("example") RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 05:24:54
     */
    int updateByExample(@Param("record") RudderMenu record, @Param("example") RudderMenuExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 05:24:54
     */
    int updateByPrimaryKeySelective(RudderMenu record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_menu
     * @generated 2018年2月6日 05:24:54
     */
    int updateByPrimaryKey(RudderMenu record);
}