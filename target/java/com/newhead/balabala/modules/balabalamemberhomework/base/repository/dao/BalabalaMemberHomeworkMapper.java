package com.newhead.balabala.modules.balabalamemberhomework.base.repository.dao;

import com.newhead.balabala.modules.balabalamemberhomework.base.repository.entity.BalabalaMemberHomework;
import com.newhead.balabala.modules.balabalamemberhomework.base.repository.entity.BalabalaMemberHomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaMemberHomeworkMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    long countByExample(BalabalaMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    int deleteByExample(BalabalaMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    int insert(BalabalaMemberHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    int insertSelective(BalabalaMemberHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    List<BalabalaMemberHomework> selectByExample(BalabalaMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    BalabalaMemberHomework selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberHomework record, @Param("example") BalabalaMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    int updateByExample(@Param("record") BalabalaMemberHomework record, @Param("example") BalabalaMemberHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    int updateByPrimaryKeySelective(BalabalaMemberHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework
     * @generated 2017年12月28日 07:22:02
     */
    int updateByPrimaryKey(BalabalaMemberHomework record);
}