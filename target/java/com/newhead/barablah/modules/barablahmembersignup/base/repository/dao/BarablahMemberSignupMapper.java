package com.newhead.barablah.modules.barablahmembersignup.base.repository.dao;

import com.newhead.barablah.modules.barablahmembersignup.base.repository.entity.BarablahMemberSignup;
import com.newhead.barablah.modules.barablahmembersignup.base.repository.entity.BarablahMemberSignupExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahMemberSignupMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    long countByExample(BarablahMemberSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    int deleteByExample(BarablahMemberSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    int insert(BarablahMemberSignup record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    int insertSelective(BarablahMemberSignup record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    List<BarablahMemberSignup> selectByExample(BarablahMemberSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    BarablahMemberSignup selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    int updateByExampleSelective(@Param("record") BarablahMemberSignup record, @Param("example") BarablahMemberSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    int updateByExample(@Param("record") BarablahMemberSignup record, @Param("example") BarablahMemberSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    int updateByPrimaryKeySelective(BarablahMemberSignup record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 03:55:36
     */
    int updateByPrimaryKey(BarablahMemberSignup record);
}