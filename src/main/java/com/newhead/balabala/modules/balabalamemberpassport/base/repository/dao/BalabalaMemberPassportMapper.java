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
     * @generated 2017年12月23日 02:12:57
     */
    long countByExample(BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月23日 02:12:57
     */
    int deleteByExample(BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月23日 02:12:57
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月23日 02:12:57
     */
    int insert(BalabalaMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月23日 02:12:57
     */
    int insertSelective(BalabalaMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月23日 02:12:57
     */
    List<BalabalaMemberPassport> selectByExample(BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月23日 02:12:57
     */
    BalabalaMemberPassport selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月23日 02:12:57
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberPassport record, @Param("example") BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月23日 02:12:57
     */
    int updateByExample(@Param("record") BalabalaMemberPassport record, @Param("example") BalabalaMemberPassportExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月23日 02:12:57
     */
    int updateByPrimaryKeySelective(BalabalaMemberPassport record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_passport
     * @generated 2017年12月23日 02:12:57
     */
    int updateByPrimaryKey(BalabalaMemberPassport record);
}