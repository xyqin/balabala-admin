package com.newhead.barablah.modules.barablahmemberpassport.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_member_passport
 * @generated do_not_delete_during_merge 2018年2月7日 10:47:06
 */
public class BarablahMemberPassport implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"会员ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月7日 10:47:06
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"会员ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahMember","field":"nickname","type":"SingleList"},"valid":true}
     * @generated 2018年2月7日 10:47:06
     */
    private Long memberId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"帐号来源","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月7日 10:47:06
     */
    @NotEmpty(message="帐号来源不能为空")
    @Size(max=0,message = "帐号来源长度无效")

    private String provider;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"帐号授权ID","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月7日 10:47:06
     */
    @NotEmpty(message="帐号授权ID不能为空")
    @Size(max=0,message = "帐号授权ID长度无效")

    private String providerId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"密码","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月7日 10:47:06
     */
    @NotEmpty(message="密码不能为空")
    @Size(max=0,message = "密码长度无效")

    private String password;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 10:47:06
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 10:47:06
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 10:47:06
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 10:47:06
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 10:47:06
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 会员ID
     * @generated 2018年2月7日 10:47:06
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置会员ID
     *
     * @param id
     * @generated 2018年2月7日 10:47:06
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 member_id 会员ID
     * @generated 2018年2月7日 10:47:06
     */
    public Long getMemberId() {
        
        return memberId;
    }

    /**
     * 设置会员ID
     *
     * @param memberId
     * @generated 2018年2月7日 10:47:06
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 返回 provider 帐号来源
     * @generated 2018年2月7日 10:47:06
     */
    public String getProvider() {
        
        return provider;
    }

    /**
     * 设置帐号来源
     *
     * @param provider
     * @generated 2018年2月7日 10:47:06
     */
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**
     * 返回 provider_id 帐号授权ID
     * @generated 2018年2月7日 10:47:06
     */
    public String getProviderId() {
        
        return providerId;
    }

    /**
     * 设置帐号授权ID
     *
     * @param providerId
     * @generated 2018年2月7日 10:47:06
     */
    public void setProviderId(String providerId) {
        this.providerId = providerId == null ? null : providerId.trim();
    }

    /**
     * 返回 password 密码
     * @generated 2018年2月7日 10:47:06
     */
    public String getPassword() {
        
        return password;
    }

    /**
     * 设置密码
     *
     * @param password
     * @generated 2018年2月7日 10:47:06
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年2月7日 10:47:06
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年2月7日 10:47:06
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年2月7日 10:47:06
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年2月7日 10:47:06
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年2月7日 10:47:06
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年2月7日 10:47:06
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年2月7日 10:47:06
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年2月7日 10:47:06
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年2月7日 10:47:06
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年2月7日 10:47:06
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}