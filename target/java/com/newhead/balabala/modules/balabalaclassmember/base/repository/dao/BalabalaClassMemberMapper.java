package com.newhead.balabala.modules.balabalaclassmember.base.repository.dao;

import com.newhead.balabala.modules.balabalaclassmember.base.repository.entity.BalabalaClassMember;
import com.newhead.balabala.modules.balabalaclassmember.base.repository.entity.BalabalaClassMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaClassMemberMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    long countByExample(BalabalaClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    int deleteByExample(BalabalaClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    int insert(BalabalaClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    int insertSelective(BalabalaClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    List<BalabalaClassMember> selectByExample(BalabalaClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    BalabalaClassMember selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    int updateByExampleSelective(@Param("record") BalabalaClassMember record, @Param("example") BalabalaClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    int updateByExample(@Param("record") BalabalaClassMember record, @Param("example") BalabalaClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    int updateByPrimaryKeySelective(BalabalaClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2018年1月6日 09:19:37
     */
    int updateByPrimaryKey(BalabalaClassMember record);
}