package com.newhead.rudderframework.modules.rudderrole2permission.base.repository.dao;

import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permission;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permissionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RudderRole2permissionMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    long countByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    int deleteByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    int insert(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    int insertSelective(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    List<RudderRole2permission> selectByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    RudderRole2permission selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    int updateByExampleSelective(@Param("record") RudderRole2permission record, @Param("example") RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    int updateByExample(@Param("record") RudderRole2permission record, @Param("example") RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    int updateByPrimaryKeySelective(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年3月6日 04:53:26
     */
    int updateByPrimaryKey(RudderRole2permission record);
}