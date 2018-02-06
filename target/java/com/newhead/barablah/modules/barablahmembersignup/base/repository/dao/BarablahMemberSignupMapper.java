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
     * @generated 2018年2月6日 05:24:54
     */
    long countByExample(BarablahMemberSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 05:24:54
     */
    int deleteByExample(BarablahMemberSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 05:24:54
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 05:24:54
     */
    int insert(BarablahMemberSignup record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 05:24:54
     */
    int insertSelective(BarablahMemberSignup record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 05:24:54
     */
    List<BarablahMemberSignup> selectByExample(BarablahMemberSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 05:24:54
     */
    BarablahMemberSignup selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 05:24:54
     */
    int updateByExampleSelective(@Param("record") BarablahMemberSignup record, @Param("example") BarablahMemberSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 05:24:54
     */
    int updateByExample(@Param("record") BarablahMemberSignup record, @Param("example") BarablahMemberSignupExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 05:24:54
     */
    int updateByPrimaryKeySelective(BarablahMemberSignup record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_signup
     * @generated 2018年2月6日 05:24:54
     */
    int updateByPrimaryKey(BarablahMemberSignup record);
}