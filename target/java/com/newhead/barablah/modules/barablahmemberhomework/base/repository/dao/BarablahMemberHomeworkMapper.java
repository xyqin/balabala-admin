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
     * @generated 2018年2月7日 04:00:56
     */
    long countByExample(BarablahMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月7日 04:00:56
     */
    int deleteByExample(BarablahMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月7日 04:00:56
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月7日 04:00:56
     */
    int insert(BarablahMemberHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月7日 04:00:56
     */
    int insertSelective(BarablahMemberHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月7日 04:00:56
     */
    List<BarablahMemberHomework> selectByExample(BarablahMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月7日 04:00:56
     */
    BarablahMemberHomework selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月7日 04:00:56
     */
    int updateByExampleSelective(@Param("record") BarablahMemberHomework record, @Param("example") BarablahMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月7日 04:00:56
     */
    int updateByExample(@Param("record") BarablahMemberHomework record, @Param("example") BarablahMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月7日 04:00:56
     */
    int updateByPrimaryKeySelective(BarablahMemberHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_homework
     * @generated 2018年2月7日 04:00:56
     */
    int updateByPrimaryKey(BarablahMemberHomework record);
}