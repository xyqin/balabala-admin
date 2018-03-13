package com.newhead.rudderframework.modules.rudderrole.base.repository.dao;

import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRole;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RudderRoleMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    long countByExample(RudderRoleExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    int deleteByExample(RudderRoleExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    int insert(RudderRole record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    int insertSelective(RudderRole record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    List<RudderRole> selectByExample(RudderRoleExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    RudderRole selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    int updateByExampleSelective(@Param("record") RudderRole record, @Param("example") RudderRoleExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    int updateByExample(@Param("record") RudderRole record, @Param("example") RudderRoleExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    int updateByPrimaryKeySelective(RudderRole record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_role
     * @generated 2018年3月13日 09:31:59
     */
    int updateByPrimaryKey(RudderRole record);
}