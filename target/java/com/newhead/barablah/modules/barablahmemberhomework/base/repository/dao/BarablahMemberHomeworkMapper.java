package com.newhead.barablah.modules.barablahmemberhomework.base.repository.dao;

import com.newhead.barablah.modules.barablahmemberhomework.base.repository.entity.BarablahMemberHomework;
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.entity.BarablahMemberHomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahMemberHomeworkMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    long countByExample(BarablahMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    int deleteByExample(BarablahMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    int insert(BarablahMemberHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    int insertSelective(BarablahMemberHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    List<BarablahMemberHomework> selectByExample(BarablahMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    BarablahMemberHomework selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    int updateByExampleSelective(@Param("record") BarablahMemberHomework record, @Param("example") BarablahMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    int updateByExample(@Param("record") BarablahMemberHomework record, @Param("example") BarablahMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    int updateByPrimaryKeySelective(BarablahMemberHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月6日 05:24:54
     */
    int updateByPrimaryKey(BarablahMemberHomework record);
}