package com.newhead.barablah.modules.barablahmembercomment.base.repository.dao;

import com.newhead.barablah.modules.barablahmembercomment.base.repository.entity.BarablahMemberComment;
import com.newhead.barablah.modules.barablahmembercomment.base.repository.entity.BarablahMemberCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahMemberCommentMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    long countByExample(BarablahMemberCommentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    int deleteByExample(BarablahMemberCommentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    int insert(BarablahMemberComment record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    int insertSelective(BarablahMemberComment record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    List<BarablahMemberComment> selectByExample(BarablahMemberCommentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    BarablahMemberComment selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    int updateByExampleSelective(@Param("record") BarablahMemberComment record, @Param("example") BarablahMemberCommentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    int updateByExample(@Param("record") BarablahMemberComment record, @Param("example") BarablahMemberCommentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    int updateByPrimaryKeySelective(BarablahMemberComment record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_comment
     * @generated 2018年1月25日 01:52:19
     */
    int updateByPrimaryKey(BarablahMemberComment record);
}