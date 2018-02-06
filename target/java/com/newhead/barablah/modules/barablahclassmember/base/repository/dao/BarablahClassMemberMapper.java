package com.newhead.barablah.modules.barablahclassmember.base.repository.dao;

import com.newhead.barablah.modules.barablahclassmember.base.repository.entity.BarablahClassMember;
import com.newhead.barablah.modules.barablahclassmember.base.repository.entity.BarablahClassMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahClassMemberMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    long countByExample(BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    int deleteByExample(BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    int insert(BarablahClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    int insertSelective(BarablahClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    List<BarablahClassMember> selectByExample(BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    BarablahClassMember selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    int updateByExampleSelective(@Param("record") BarablahClassMember record, @Param("example") BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    int updateByExample(@Param("record") BarablahClassMember record, @Param("example") BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    int updateByPrimaryKeySelective(BarablahClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年2月6日 05:24:54
     */
    int updateByPrimaryKey(BarablahClassMember record);
}