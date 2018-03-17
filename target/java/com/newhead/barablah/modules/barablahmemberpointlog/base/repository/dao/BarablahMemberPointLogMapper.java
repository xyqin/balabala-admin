package com.newhead.barablah.modules.barablahmemberpointlog.base.repository.dao;

import com.newhead.barablah.modules.barablahmemberpointlog.base.repository.entity.BarablahMemberPointLog;
import com.newhead.barablah.modules.barablahmemberpointlog.base.repository.entity.BarablahMemberPointLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahMemberPointLogMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    long countByExample(BarablahMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    int deleteByExample(BarablahMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    int insert(BarablahMemberPointLog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    int insertSelective(BarablahMemberPointLog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    List<BarablahMemberPointLog> selectByExample(BarablahMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    BarablahMemberPointLog selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    int updateByExampleSelective(@Param("record") BarablahMemberPointLog record, @Param("example") BarablahMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    int updateByExample(@Param("record") BarablahMemberPointLog record, @Param("example") BarablahMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    int updateByPrimaryKeySelective(BarablahMemberPointLog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月18日 02:48:14
     */
    int updateByPrimaryKey(BarablahMemberPointLog record);
}