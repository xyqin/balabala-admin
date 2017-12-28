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
     * @generated 2017年12月28日 03:59:19
     */
    long countByExample(BalabalaMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2017年12月28日 03:59:19
     */
    int deleteByExample(BalabalaMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2017年12月28日 03:59:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2017年12月28日 03:59:19
     */
    int insert(BalabalaMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2017年12月28日 03:59:19
     */
    int insertSelective(BalabalaMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2017年12月28日 03:59:19
     */
    List<BalabalaMemberHomeworkItem> selectByExample(BalabalaMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2017年12月28日 03:59:19
     */
    BalabalaMemberHomeworkItem selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2017年12月28日 03:59:19
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberHomeworkItem record, @Param("example") BalabalaMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2017年12月28日 03:59:19
     */
    int updateByExample(@Param("record") BalabalaMemberHomeworkItem record, @Param("example") BalabalaMemberHomeworkItemExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2017年12月28日 03:59:19
     */
    int updateByPrimaryKeySelective(BalabalaMemberHomeworkItem record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_homework_item
     * @generated 2017年12月28日 03:59:19
     */
    int updateByPrimaryKey(BalabalaMemberHomeworkItem record);
}