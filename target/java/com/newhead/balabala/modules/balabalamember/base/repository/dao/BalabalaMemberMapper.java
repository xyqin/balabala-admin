package com.newhead.balabala.modules.balabalamember.base.repository.dao;

import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMember;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaMemberMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    long countByExample(BalabalaMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    int deleteByExample(BalabalaMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    int insert(BalabalaMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    int insertSelective(BalabalaMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    List<BalabalaMember> selectByExample(BalabalaMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    BalabalaMember selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    int updateByExampleSelective(@Param("record") BalabalaMember record, @Param("example") BalabalaMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    int updateByExample(@Param("record") BalabalaMember record, @Param("example") BalabalaMemberExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    int updateByPrimaryKeySelective(BalabalaMember record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member
     * @generated 2017年12月28日 05:00:55
     */
    int updateByPrimaryKey(BalabalaMember record);
}