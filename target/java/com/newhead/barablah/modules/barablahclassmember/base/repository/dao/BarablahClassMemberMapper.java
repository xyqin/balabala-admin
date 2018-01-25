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
     * @generated 2018年1月25日 01:52:19
     */
    long countByExample(BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年1月25日 01:52:19
     */
    int deleteByExample(BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年1月25日 01:52:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年1月25日 01:52:19
     */
    int insert(BarablahClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年1月25日 01:52:19
     */
    int insertSelective(BarablahClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年1月25日 01:52:19
     */
    List<BarablahClassMember> selectByExample(BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年1月25日 01:52:19
     */
    BarablahClassMember selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年1月25日 01:52:19
     */
    int updateByExampleSelective(@Param("record") BarablahClassMember record, @Param("example") BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年1月25日 01:52:19
     */
    int updateByExample(@Param("record") BarablahClassMember record, @Param("example") BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年1月25日 01:52:19
     */
    int updateByPrimaryKeySelective(BarablahClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年1月25日 01:52:19
     */
    int updateByPrimaryKey(BarablahClassMember record);
}