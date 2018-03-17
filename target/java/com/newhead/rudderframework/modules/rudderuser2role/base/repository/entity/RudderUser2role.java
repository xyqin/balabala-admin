package com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 rudder_user2role
 * @generated do_not_delete_during_merge 2018年3月18日 02:48:14
 */
public class RudderUser2role implements AuditableEntity {
    /**
     *
     * {"name":"资源ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月18日 02:48:14
     */
    private Long id;

    /**
     *
     * {"name":"角色","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"RudderRole","field":"rudderroleName","type":"SingleList"},"valid":true}
     * @generated 2018年3月18日 02:48:14
     */
    private Long rudderroleId;

    /**
     *
     * {"name":"用户","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"RudderUser","field":"rudderuserName","type":"SingleList"},"valid":true}
     * @generated 2018年3月18日 02:48:14
     */
    private Long rudderuserId;

    /**
     *
     * {"name":"是否显示","fieldType":"Bool","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月18日 02:48:14
     */
    private Boolean visible;

    /**
     *
     * {"name":"系统创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"系统修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"系统创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"系统修改者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"逻辑删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 资源ID
     * @generated 2018年3月18日 02:48:14
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置资源ID
     *
     * @param id
     * @generated 2018年3月18日 02:48:14
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 rudderrole_id 角色
     * @generated 2018年3月18日 02:48:14
     */
    public Long getRudderroleId() {
        
        return rudderroleId;
    }

    /**
     * 设置角色
     *
     * @param rudderroleId
     * @generated 2018年3月18日 02:48:14
     */
    public void setRudderroleId(Long rudderroleId) {
        this.rudderroleId = rudderroleId;
    }

    /**
     * 返回 rudderuser_id 用户
     * @generated 2018年3月18日 02:48:14
     */
    public Long getRudderuserId() {
        
        return rudderuserId;
    }

    /**
     * 设置用户
     *
     * @param rudderuserId
     * @generated 2018年3月18日 02:48:14
     */
    public void setRudderuserId(Long rudderuserId) {
        this.rudderuserId = rudderuserId;
    }

    /**
     * 返回 visible 是否显示
     * @generated 2018年3月18日 02:48:14
     */
    public Boolean getVisible() {
        
        return visible;
    }

    /**
     * 设置是否显示
     *
     * @param visible
     * @generated 2018年3月18日 02:48:14
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * 返回 created_at 系统创建时间
     * @generated 2018年3月18日 02:48:14
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置系统创建时间
     *
     * @param createdAt
     * @generated 2018年3月18日 02:48:14
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 系统修改时间
     * @generated 2018年3月18日 02:48:14
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置系统修改时间
     *
     * @param updatedAt
     * @generated 2018年3月18日 02:48:14
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 系统创建者
     * @generated 2018年3月18日 02:48:14
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置系统创建者
     *
     * @param creator
     * @generated 2018年3月18日 02:48:14
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 系统修改者
     * @generated 2018年3月18日 02:48:14
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置系统修改者
     *
     * @param lastModifier
     * @generated 2018年3月18日 02:48:14
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 逻辑删除标志
     * @generated 2018年3月18日 02:48:14
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置逻辑删除标志
     *
     * @param deleted
     * @generated 2018年3月18日 02:48:14
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}