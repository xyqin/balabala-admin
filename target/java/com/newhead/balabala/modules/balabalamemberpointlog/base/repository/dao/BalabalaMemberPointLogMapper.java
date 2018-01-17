package com.newhead.balabala.modules.balabalamemberpointlog.base.repository.dao;

import com.newhead.balabala.modules.balabalamemberpointlog.base.repository.entity.BalabalaMemberPointLog;
import com.newhead.balabala.modules.balabalamemberpointlog.base.repository.entity.BalabalaMemberPointLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaMemberPointLogMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    long countByExample(BalabalaMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    int deleteByExample(BalabalaMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    int insert(BalabalaMemberPointLog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    int insertSelective(BalabalaMemberPointLog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    List<BalabalaMemberPointLog> selectByExample(BalabalaMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    BalabalaMemberPointLog selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberPointLog record, @Param("example") BalabalaMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    int updateByExample(@Param("record") BalabalaMemberPointLog record, @Param("example") BalabalaMemberPointLogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    int updateByPrimaryKeySelective(BalabalaMemberPointLog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_point_log
     * @generated 2018年1月17日 05:42:33
     */
    int updateByPrimaryKey(BalabalaMemberPointLog record);
}