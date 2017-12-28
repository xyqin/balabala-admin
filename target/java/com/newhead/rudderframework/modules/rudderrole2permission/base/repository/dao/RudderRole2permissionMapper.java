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
     * @generated 2017年12月28日 05:00:55
     */
    long countByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年12月28日 05:00:55
     */
    int deleteByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年12月28日 05:00:55
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年12月28日 05:00:55
     */
    int insert(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年12月28日 05:00:55
     */
    int insertSelective(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年12月28日 05:00:55
     */
    List<RudderRole2permission> selectByExample(RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年12月28日 05:00:55
     */
    RudderRole2permission selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年12月28日 05:00:55
     */
    int updateByExampleSelective(@Param("record") RudderRole2permission record, @Param("example") RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年12月28日 05:00:55
     */
    int updateByExample(@Param("record") RudderRole2permission record, @Param("example") RudderRole2permissionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年12月28日 05:00:55
     */
    int updateByPrimaryKeySelective(RudderRole2permission record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role2permission
     * @generated 2017年12月28日 05:00:55
     */
    int updateByPrimaryKey(RudderRole2permission record);
}