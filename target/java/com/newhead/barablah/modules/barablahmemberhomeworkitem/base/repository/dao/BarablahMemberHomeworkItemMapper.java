package com.newhead.barablah.modules.barablahmemberhomeworkitem.base.repository.dao;

import com.newhead.barablah.modules.barablahmemberhomeworkitem.base.repository.entity.BarablahMemberHomeworkItem;
import com.newhead.barablah.modules.barablahmemberhomeworkitem.base.repository.entity.BarablahMemberHomeworkItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahMemberHomeworkItemMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    long countByExample(BarablahMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    int deleteByExample(BarablahMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    int insert(BarablahMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    int insertSelective(BarablahMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    List<BarablahMemberHomeworkItem> selectByExample(BarablahMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    BarablahMemberHomeworkItem selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    int updateByExampleSelective(@Param("record") BarablahMemberHomeworkItem record, @Param("example") BarablahMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    int updateByExample(@Param("record") BarablahMemberHomeworkItem record, @Param("example") BarablahMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    int updateByPrimaryKeySelective(BarablahMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年1月26日 11:13:51
     */
    int updateByPrimaryKey(BarablahMemberHomeworkItem record);
}