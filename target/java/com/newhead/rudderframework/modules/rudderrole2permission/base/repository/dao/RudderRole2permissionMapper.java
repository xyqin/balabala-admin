package com.newhead.rudderframework.modules.rudderrole2permission.base.repository.dao;

import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permission;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RudderRole2permissionMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    long countByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    int deleteByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    int insert(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    int insertSelective(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    List<RudderRole2permission> selectByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    RudderRole2permission selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    int updateByExampleSelective(@Param("record") RudderRole2permission record, @Param("example") RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    int updateByExample(@Param("record") RudderRole2permission record, @Param("example") RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    int updateByPrimaryKeySelective(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2018年1月17日 05:42:33
     */
    int updateByPrimaryKey(RudderRole2permission record);
}