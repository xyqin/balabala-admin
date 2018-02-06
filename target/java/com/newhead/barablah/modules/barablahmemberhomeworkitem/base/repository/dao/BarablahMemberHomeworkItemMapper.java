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
     * @generated 2018年2月6日 05:34:54
     */
    long countByExample(BarablahMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int deleteByExample(BarablahMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int insert(BarablahMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int insertSelective(BarablahMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    List<BarablahMemberHomeworkItem> selectByExample(BarablahMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    BarablahMemberHomeworkItem selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int updateByExampleSelective(@Param("record") BarablahMemberHomeworkItem record, @Param("example") BarablahMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int updateByExample(@Param("record") BarablahMemberHomeworkItem record, @Param("example") BarablahMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int updateByPrimaryKeySelective(BarablahMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework_item
     * @generated 2018年2月6日 05:34:54
     */
    int updateByPrimaryKey(BarablahMemberHomeworkItem record);
}