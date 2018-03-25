package com.newhead.barablah.modules.barablahmember.base.repository.dao;

import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMember;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahMemberMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    long countByExample(BarablahMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    int deleteByExample(BarablahMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    int insert(BarablahMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    int insertSelective(BarablahMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    List<BarablahMember> selectByExample(BarablahMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    BarablahMember selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    int updateByExampleSelective(@Param("record") BarablahMember record, @Param("example") BarablahMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    int updateByExample(@Param("record") BarablahMember record, @Param("example") BarablahMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    int updateByPrimaryKeySelective(BarablahMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member
     * @generated 2018年3月25日 10:55:18
     */
    int updateByPrimaryKey(BarablahMember record);
}