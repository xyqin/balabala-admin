package com.newhead.balabala.modules.balabalamemberpassport.base.repository.dao;

import com.newhead.balabala.modules.balabalamemberpassport.base.repository.entity.BalabalaMemberPassport;
import com.newhead.balabala.modules.balabalamemberpassport.base.repository.entity.BalabalaMemberPassportExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaMemberPassportMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    long countByExample(BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    int deleteByExample(BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    int insert(BalabalaMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    int insertSelective(BalabalaMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    List<BalabalaMemberPassport> selectByExample(BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    BalabalaMemberPassport selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberPassport record, @Param("example") BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    int updateByExample(@Param("record") BalabalaMemberPassport record, @Param("example") BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    int updateByPrimaryKeySelective(BalabalaMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月28日 01:55:47
     */
    int updateByPrimaryKey(BalabalaMemberPassport record);
}