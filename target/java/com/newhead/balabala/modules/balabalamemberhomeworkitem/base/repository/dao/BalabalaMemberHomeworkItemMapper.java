package com.newhead.balabala.modules.balabalamemberhomeworkitem.base.repository.dao;

import com.newhead.balabala.modules.balabalamemberhomeworkitem.base.repository.entity.BalabalaMemberHomeworkItem;
import com.newhead.balabala.modules.balabalamemberhomeworkitem.base.repository.entity.BalabalaMemberHomeworkItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaMemberHomeworkItemMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    long countByExample(BalabalaMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByExample(BalabalaMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    int insert(BalabalaMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    int insertSelective(BalabalaMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    List<BalabalaMemberHomeworkItem> selectByExample(BalabalaMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    BalabalaMemberHomeworkItem selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberHomeworkItem record, @Param("example") BalabalaMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExample(@Param("record") BalabalaMemberHomeworkItem record, @Param("example") BalabalaMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKeySelective(BalabalaMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKey(BalabalaMemberHomeworkItem record);
}