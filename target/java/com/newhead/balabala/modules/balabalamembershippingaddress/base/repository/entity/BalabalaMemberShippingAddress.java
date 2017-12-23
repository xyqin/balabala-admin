package com.newhead.balabala.modules.balabalamembershippingaddress.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 balabala_member_shipping_address
 * @generated do_not_delete_during_merge 2017年12月23日 02:12:57
 */
public class BalabalaMemberShippingAddress implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"主键","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"会员","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BalabalaMember","field":"nickname","type":"SingleList"},"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    private Long memberId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"收获人全名","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    @NotEmpty(message="收获人全名不能为空")
    @Size(max=0,message = "收获人全名长度无效")

    private String fullName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"省市地区","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    @NotEmpty(message="省市地区不能为空")
    @Size(max=0,message = "省市地区长度无效")

    private String region;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"省市地区ID","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    @NotEmpty(message="省市地区ID不能为空")
    @Size(max=0,message = "省市地区ID长度无效")

    private String regionPath;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"街道地址","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    @NotEmpty(message="街道地址不能为空")
    @Size(max=0,message = "街道地址长度无效")

    private String streetAddress;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"电话号码","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    @NotEmpty(message="电话号码不能为空")
    @Size(max=0,message = "电话号码长度无效")

    private String phoneNumber;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"优先的","fieldType":"Bool","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    private Byte prior;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 主键
     * @generated 2017年12月23日 02:12:57
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置主键
     *
     * @param id
     * @generated 2017年12月23日 02:12:57
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 member_id 会员
     * @generated 2017年12月23日 02:12:57
     */
    public Long getMemberId() {
        
        return memberId;
    }

    /**
     * 设置会员
     *
     * @param memberId
     * @generated 2017年12月23日 02:12:57
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 返回 full_name 收获人全名
     * @generated 2017年12月23日 02:12:57
     */
    public String getFullName() {
        
        return fullName;
    }

    /**
     * 设置收获人全名
     *
     * @param fullName
     * @generated 2017年12月23日 02:12:57
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * 返回 region 省市地区
     * @generated 2017年12月23日 02:12:57
     */
    public String getRegion() {
        
        return region;
    }

    /**
     * 设置省市地区
     *
     * @param region
     * @generated 2017年12月23日 02:12:57
     */
    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    /**
     * 返回 region_path 省市地区ID
     * @generated 2017年12月23日 02:12:57
     */
    public String getRegionPath() {
        
        return regionPath;
    }

    /**
     * 设置省市地区ID
     *
     * @param regionPath
     * @generated 2017年12月23日 02:12:57
     */
    public void setRegionPath(String regionPath) {
        this.regionPath = regionPath == null ? null : regionPath.trim();
    }

    /**
     * 返回 street_address 街道地址
     * @generated 2017年12月23日 02:12:57
     */
    public String getStreetAddress() {
        
        return streetAddress;
    }

    /**
     * 设置街道地址
     *
     * @param streetAddress
     * @generated 2017年12月23日 02:12:57
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress == null ? null : streetAddress.trim();
    }

    /**
     * 返回 phone_number 电话号码
     * @generated 2017年12月23日 02:12:57
     */
    public String getPhoneNumber() {
        
        return phoneNumber;
    }

    /**
     * 设置电话号码
     *
     * @param phoneNumber
     * @generated 2017年12月23日 02:12:57
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 返回 prior 优先的
     * @generated 2017年12月23日 02:12:57
     */
    public Byte getPrior() {
        
        return prior;
    }

    /**
     * 设置优先的
     *
     * @param prior
     * @generated 2017年12月23日 02:12:57
     */
    public void setPrior(Byte prior) {
        this.prior = prior;
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2017年12月23日 02:12:57
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2017年12月23日 02:12:57
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2017年12月23日 02:12:57
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2017年12月23日 02:12:57
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2017年12月23日 02:12:57
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2017年12月23日 02:12:57
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2017年12月23日 02:12:57
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2017年12月23日 02:12:57
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2017年12月23日 02:12:57
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2017年12月23日 02:12:57
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}