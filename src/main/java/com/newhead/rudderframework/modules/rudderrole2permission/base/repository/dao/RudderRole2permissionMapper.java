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
     * @generated 2017年5月7日 06:44:27
     */
    long countByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年5月7日 06:44:27
     */
    int deleteByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年5月7日 06:44:27
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年5月7日 06:44:27
     */
    int insert(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年5月7日 06:44:27
     */
    int insertSelective(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年5月7日 06:44:27
     */
    List<RudderRole2permission> selectByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年5月7日 06:44:27
     */
    RudderRole2permission selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年5月7日 06:44:27
     */
    int updateByExampleSelective(@Param("record") RudderRole2permission record, @Param("example") RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年5月7日 06:44:27
     */
    int updateByExample(@Param("record") RudderRole2permission record, @Param("example") RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年5月7日 06:44:27
     */
    int updateByPrimaryKeySelective(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年5月7日 06:44:27
     */
    int updateByPrimaryKey(RudderRole2permission record);
}