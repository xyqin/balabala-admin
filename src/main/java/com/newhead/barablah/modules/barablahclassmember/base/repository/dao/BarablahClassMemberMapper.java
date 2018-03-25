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
     * @generated 2018年3月25日 10:55:18
     */
    long countByExample(BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年3月25日 10:55:18
     */
    int deleteByExample(BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年3月25日 10:55:18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年3月25日 10:55:18
     */
    int insert(BarablahClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年3月25日 10:55:18
     */
    int insertSelective(BarablahClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年3月25日 10:55:18
     */
    List<BarablahClassMember> selectByExample(BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年3月25日 10:55:18
     */
    BarablahClassMember selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年3月25日 10:55:18
     */
    int updateByExampleSelective(@Param("record") BarablahClassMember record, @Param("example") BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年3月25日 10:55:18
     */
    int updateByExample(@Param("record") BarablahClassMember record, @Param("example") BarablahClassMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年3月25日 10:55:18
     */
    int updateByPrimaryKeySelective(BarablahClassMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_member
     * @generated 2018年3月25日 10:55:18
     */
    int updateByPrimaryKey(BarablahClassMember record);
}