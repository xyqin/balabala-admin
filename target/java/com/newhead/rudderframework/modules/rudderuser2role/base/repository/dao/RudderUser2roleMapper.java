package com.newhead.rudderframework.modules.rudderuser2role.base.repository.dao;

import com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity.RudderUser2role;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity.RudderUser2roleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RudderUser2roleMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    long countByExample(RudderUser2roleExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    int deleteByExample(RudderUser2roleExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    int insert(RudderUser2role record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    int insertSelective(RudderUser2role record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    List<RudderUser2role> selectByExample(RudderUser2roleExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    RudderUser2role selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    int updateByExampleSelective(@Param("record") RudderUser2role record, @Param("example") RudderUser2roleExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    int updateByExample(@Param("record") RudderUser2role record, @Param("example") RudderUser2roleExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    int updateByPrimaryKeySelective(RudderUser2role record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  rudder_user2role
     * @generated 2018年1月25日 03:24:33
     */
    int updateByPrimaryKey(RudderUser2role record);
}