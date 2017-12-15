package com.newhead.sc.modules.scdevicesignup.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 sc_device_signup
 * @generated do_not_delete_during_merge 2017年12月13日 12:17:47
 */
public class ScDeviceSignup implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"设备ID","fieldType":"Object","visible":true,"queryType":3,"displayOrder":0,"length":0,"ref":{"module":"ScDevice","field":"deviceName","type":"SingleList"},"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    private Long deviceId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"手机号码","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    @Size(max=0,message = "手机号码长度无效")

    private String phoneNumber;

    /**
     *
     * {"name":"系统创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月13日 12:17:47
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"系统修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月13日 12:17:47
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"系统创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月13日 12:17:47
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"系统修改者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月13日 12:17:47
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"逻辑删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月13日 12:17:47
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id ID
     * @generated 2017年12月13日 12:17:47
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置ID
     *
     * @param id
     * @generated 2017年12月13日 12:17:47
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 device_id 设备ID
     * @generated 2017年12月13日 12:17:47
     */
    public Long getDeviceId() {
        
        return deviceId;
    }

    /**
     * 设置设备ID
     *
     * @param deviceId
     * @generated 2017年12月13日 12:17:47
     */
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 返回 phone_number 手机号码
     * @generated 2017年12月13日 12:17:47
     */
    public String getPhoneNumber() {
        
        return phoneNumber;
    }

    /**
     * 设置手机号码
     *
     * @param phoneNumber
     * @generated 2017年12月13日 12:17:47
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 返回 created_at 系统创建时间
     * @generated 2017年12月13日 12:17:47
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置系统创建时间
     *
     * @param createdAt
     * @generated 2017年12月13日 12:17:47
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 系统修改时间
     * @generated 2017年12月13日 12:17:47
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置系统修改时间
     *
     * @param updatedAt
     * @generated 2017年12月13日 12:17:47
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 系统创建者
     * @generated 2017年12月13日 12:17:47
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置系统创建者
     *
     * @param creator
     * @generated 2017年12月13日 12:17:47
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 系统修改者
     * @generated 2017年12月13日 12:17:47
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置系统修改者
     *
     * @param lastModifier
     * @generated 2017年12月13日 12:17:47
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 逻辑删除标志
     * @generated 2017年12月13日 12:17:47
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置逻辑删除标志
     *
     * @param deleted
     * @generated 2017年12月13日 12:17:47
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}