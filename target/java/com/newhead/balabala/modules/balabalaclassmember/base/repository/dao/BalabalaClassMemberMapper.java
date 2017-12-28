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
     * @generated 2017年12月28日 01:55:47
     */
    long countByExample(BalabalaClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2017年12月28日 01:55:47
     */
    int deleteByExample(BalabalaClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2017年12月28日 01:55:47
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2017年12月28日 01:55:47
     */
    int insert(BalabalaClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2017年12月28日 01:55:47
     */
    int insertSelective(BalabalaClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2017年12月28日 01:55:47
     */
    List<BalabalaClassMember> selectByExample(BalabalaClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2017年12月28日 01:55:47
     */
    BalabalaClassMember selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2017年12月28日 01:55:47
     */
    int updateByExampleSelective(@Param("record") BalabalaClassMember record, @Param("example") BalabalaClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2017年12月28日 01:55:47
     */
    int updateByExample(@Param("record") BalabalaClassMember record, @Param("example") BalabalaClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2017年12月28日 01:55:47
     */
    int updateByPrimaryKeySelective(BalabalaClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_member
     * @generated 2017年12月28日 01:55:47
     */
    int updateByPrimaryKey(BalabalaClassMember record);
}