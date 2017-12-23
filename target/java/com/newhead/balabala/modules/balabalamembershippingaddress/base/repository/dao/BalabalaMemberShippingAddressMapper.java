package com.newhead.balabala.modules.balabalamembershippingaddress.base.repository.dao;

import com.newhead.balabala.modules.balabalamembershippingaddress.base.repository.entity.BalabalaMemberShippingAddress;
import com.newhead.balabala.modules.balabalamembershippingaddress.base.repository.entity.BalabalaMemberShippingAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaMemberShippingAddressMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    long countByExample(BalabalaMemberShippingAddressExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    int deleteByExample(BalabalaMemberShippingAddressExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    int insert(BalabalaMemberShippingAddress record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    int insertSelective(BalabalaMemberShippingAddress record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    List<BalabalaMemberShippingAddress> selectByExample(BalabalaMemberShippingAddressExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    BalabalaMemberShippingAddress selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberShippingAddress record, @Param("example") BalabalaMemberShippingAddressExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    int updateByExample(@Param("record") BalabalaMemberShippingAddress record, @Param("example") BalabalaMemberShippingAddressExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    int updateByPrimaryKeySelective(BalabalaMemberShippingAddress record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月23日 02:12:57
     */
    int updateByPrimaryKey(BalabalaMemberShippingAddress record);
}