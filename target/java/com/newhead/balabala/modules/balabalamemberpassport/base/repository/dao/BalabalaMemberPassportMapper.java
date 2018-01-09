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
     * @generated 2018年1月9日 04:35:21
     */
    long countByExample(BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByExample(BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2018年1月9日 04:35:21
     */
    int insert(BalabalaMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2018年1月9日 04:35:21
     */
    int insertSelective(BalabalaMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2018年1月9日 04:35:21
     */
    List<BalabalaMemberPassport> selectByExample(BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2018年1月9日 04:35:21
     */
    BalabalaMemberPassport selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberPassport record, @Param("example") BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExample(@Param("record") BalabalaMemberPassport record, @Param("example") BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKeySelective(BalabalaMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKey(BalabalaMemberPassport record);
}