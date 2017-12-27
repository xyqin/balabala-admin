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
     * @generated 2017年12月28日 12:00:27
     */
    long countByExample(BalabalaMemberShippingAddressExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月28日 12:00:27
     */
    int deleteByExample(BalabalaMemberShippingAddressExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月28日 12:00:27
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月28日 12:00:27
     */
    int insert(BalabalaMemberShippingAddress record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月28日 12:00:27
     */
    int insertSelective(BalabalaMemberShippingAddress record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月28日 12:00:27
     */
    List<BalabalaMemberShippingAddress> selectByExample(BalabalaMemberShippingAddressExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月28日 12:00:27
     */
    BalabalaMemberShippingAddress selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月28日 12:00:27
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberShippingAddress record, @Param("example") BalabalaMemberShippingAddressExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月28日 12:00:27
     */
    int updateByExample(@Param("record") BalabalaMemberShippingAddress record, @Param("example") BalabalaMemberShippingAddressExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月28日 12:00:27
     */
    int updateByPrimaryKeySelective(BalabalaMemberShippingAddress record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_shipping_address
     * @generated 2017年12月28日 12:00:27
     */
    int updateByPrimaryKey(BalabalaMemberShippingAddress record);
}