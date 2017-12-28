package com.newhead.balabala.modules.balabalamembercomment.base.repository.dao;

import com.newhead.balabala.modules.balabalamembercomment.base.repository.entity.BalabalaMemberComment;
import com.newhead.balabala.modules.balabalamembercomment.base.repository.entity.BalabalaMemberCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaMemberCommentMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    long countByExample(BalabalaMemberCommentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    int deleteByExample(BalabalaMemberCommentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    int insert(BalabalaMemberComment record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    int insertSelective(BalabalaMemberComment record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    List<BalabalaMemberComment> selectByExample(BalabalaMemberCommentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    BalabalaMemberComment selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberComment record, @Param("example") BalabalaMemberCommentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    int updateByExample(@Param("record") BalabalaMemberComment record, @Param("example") BalabalaMemberCommentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    int updateByPrimaryKeySelective(BalabalaMemberComment record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_comment
     * @generated 2017年12月28日 06:54:51
     */
    int updateByPrimaryKey(BalabalaMemberComment record);
}