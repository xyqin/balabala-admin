package com.newhead.barablah.modules.barablahmemberpassport.base.repository.dao;

import com.newhead.barablah.modules.barablahmemberpassport.base.repository.entity.BarablahMemberPassport;
import com.newhead.barablah.modules.barablahmemberpassport.base.repository.entity.BarablahMemberPassportExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahMemberPassportMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    long countByExample(BarablahMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    int deleteByExample(BarablahMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    int insert(BarablahMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    int insertSelective(BarablahMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    List<BarablahMemberPassport> selectByExample(BarablahMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    BarablahMemberPassport selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    int updateByExampleSelective(@Param("record") BarablahMemberPassport record, @Param("example") BarablahMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    int updateByExample(@Param("record") BarablahMemberPassport record, @Param("example") BarablahMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    int updateByPrimaryKeySelective(BarablahMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_passport
     * @generated 2018年1月26日 11:13:51
     */
    int updateByPrimaryKey(BarablahMemberPassport record);
}