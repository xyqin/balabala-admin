package com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 rudder_menu2permission
 * @generated do_not_delete_during_merge 2018年3月11日 11:35:40
 */
public class RudderMenu2permission implements AuditableEntity {
    /**
     *
     * {"name":"资源ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月11日 11:35:40
     */
    private Long id;

    /**
     *
     * {"name":"菜单","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"RudderMenu","field":"ruddermenuName","type":"SingleTree"},"valid":true}
     * @generated 2018年3月11日 11:35:40
     */
    private Long ruddermenuId;

    /**
     *
     * {"name":"资源编码","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"RudderPermission","field":"rudderpermissionName","type":"SingleList"},"valid":true}
     * @generated 2018年3月11日 11:35:40
     */
    private Long rudderpermissionId;

    /**
     *
     * {"name":"是否显示","fieldType":"Bool","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月11日 11:35:40
     */
    private Boolean visible;

    /**
     *
     * {"name":"系统创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月11日 11:35:40
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"系统修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月11日 11:35:40
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"系统创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月11日 11:35:40
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"系统修改者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月11日 11:35:40
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"逻辑删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月11日 11:35:40
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 资源ID
     * @generated 2018年3月11日 11:35:40
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置资源ID
     *
     * @param id
     * @generated 2018年3月11日 11:35:40
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 ruddermenu_id 菜单
     * @generated 2018年3月11日 11:35:40
     */
    public Long getRuddermenuId() {
        
        return ruddermenuId;
    }

    /**
     * 设置菜单
     *
     * @param ruddermenuId
     * @generated 2018年3月11日 11:35:40
     */
    public void setRuddermenuId(Long ruddermenuId) {
        this.ruddermenuId = ruddermenuId;
    }

    /**
     * 返回 rudderpermission_id 资源编码
     * @generated 2018年3月11日 11:35:40
     */
    public Long getRudderpermissionId() {
        
        return rudderpermissionId;
    }

    /**
     * 设置资源编码
     *
     * @param rudderpermissionId
     * @generated 2018年3月11日 11:35:40
     */
    public void setRudderpermissionId(Long rudderpermissionId) {
        this.rudderpermissionId = rudderpermissionId;
    }

    /**
     * 返回 visible 是否显示
     * @generated 2018年3月11日 11:35:40
     */
    public Boolean getVisible() {
        
        return visible;
    }

    /**
     * 设置是否显示
     *
     * @param visible
     * @generated 2018年3月11日 11:35:40
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * 返回 created_at 系统创建时间
     * @generated 2018年3月11日 11:35:40
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置系统创建时间
     *
     * @param createdAt
     * @generated 2018年3月11日 11:35:40
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 系统修改时间
     * @generated 2018年3月11日 11:35:40
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置系统修改时间
     *
     * @param updatedAt
     * @generated 2018年3月11日 11:35:40
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 系统创建者
     * @generated 2018年3月11日 11:35:40
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置系统创建者
     *
     * @param creator
     * @generated 2018年3月11日 11:35:40
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 系统修改者
     * @generated 2018年3月11日 11:35:40
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置系统修改者
     *
     * @param lastModifier
     * @generated 2018年3月11日 11:35:40
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 逻辑删除标志
     * @generated 2018年3月11日 11:35:40
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置逻辑删除标志
     *
     * @param deleted
     * @generated 2018年3月11日 11:35:40
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}