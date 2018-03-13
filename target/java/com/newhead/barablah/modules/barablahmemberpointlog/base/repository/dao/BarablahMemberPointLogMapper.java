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
     * @generated 2018年3月13日 12:41:30
     */
    long countByExample(BarablahMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月13日 12:41:30
     */
    int deleteByExample(BarablahMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月13日 12:41:30
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月13日 12:41:30
     */
    int insert(BarablahMemberPointLog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月13日 12:41:30
     */
    int insertSelective(BarablahMemberPointLog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月13日 12:41:30
     */
    List<BarablahMemberPointLog> selectByExample(BarablahMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月13日 12:41:30
     */
    BarablahMemberPointLog selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月13日 12:41:30
     */
    int updateByExampleSelective(@Param("record") BarablahMemberPointLog record, @Param("example") BarablahMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月13日 12:41:30
     */
    int updateByExample(@Param("record") BarablahMemberPointLog record, @Param("example") BarablahMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月13日 12:41:30
     */
    int updateByPrimaryKeySelective(BarablahMemberPointLog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_point_log
     * @generated 2018年3月13日 12:41:30
     */
    int updateByPrimaryKey(BarablahMemberPointLog record);
}