package com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 rudder_role2permission
 * @generated do_not_delete_during_merge 2017年5月7日 06:44:27
 */
public class RudderRole2permission implements AuditableEntity {
    /**
     *
     * {"name":"资源ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年5月7日 06:44:27
     */
    private Long id;

    /**
     *
     * {"name":"资源编码","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"RudderPermission","field":"rudderpermissionName","type":"SingleList"},"valid":true}
     * @generated 2017年5月7日 06:44:27
     */
    private Long rudderpermissionId;

    /**
     *
     * {"name":"角色","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"RudderRole","field":"rudderroleName","type":"SingleList"},"valid":true}
     * @generated 2017年5月7日 06:44:27
     */
    private Long rudderroleId;

    /**
     *
     * {"name":"是否显示","fieldType":"Bool","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年5月7日 06:44:27
     */
    private Boolean visible;

    /**
     *
     * {"name":"系统创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年5月7日 06:44:27
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"系统修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年5月7日 06:44:27
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"系统创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年5月7日 06:44:27
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"系统修改者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年5月7日 06:44:27
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"逻辑删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年5月7日 06:44:27
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 资源ID
     * @generated 2017年5月7日 06:44:27
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置资源ID
     *
     * @param id
     * @generated 2017年5月7日 06:44:27
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 rudderpermission_id 资源编码
     * @generated 2017年5月7日 06:44:27
     */
    public Long getRudderpermissionId() {
        
        return rudderpermissionId;
    }

    /**
     * 设置资源编码
     *
     * @param rudderpermissionId
     * @generated 2017年5月7日 06:44:27
     */
    public void setRudderpermissionId(Long rudderpermissionId) {
        this.rudderpermissionId = rudderpermissionId;
    }

    /**
     * 返回 rudderrole_id 角色
     * @generated 2017年5月7日 06:44:27
     */
    public Long getRudderroleId() {
        
        return rudderroleId;
    }

    /**
     * 设置角色
     *
     * @param rudderroleId
     * @generated 2017年5月7日 06:44:27
     */
    public void setRudderroleId(Long rudderroleId) {
        this.rudderroleId = rudderroleId;
    }

    /**
     * 返回 visible 是否显示
     * @generated 2017年5月7日 06:44:27
     */
    public Boolean getVisible() {
        
        return visible;
    }

    /**
     * 设置是否显示
     *
     * @param visible
     * @generated 2017年5月7日 06:44:27
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * 返回 created_at 系统创建时间
     * @generated 2017年5月7日 06:44:27
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置系统创建时间
     *
     * @param createdAt
     * @generated 2017年5月7日 06:44:27
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 系统修改时间
     * @generated 2017年5月7日 06:44:27
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置系统修改时间
     *
     * @param updatedAt
     * @generated 2017年5月7日 06:44:27
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 系统创建者
     * @generated 2017年5月7日 06:44:27
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置系统创建者
     *
     * @param creator
     * @generated 2017年5月7日 06:44:27
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 系统修改者
     * @generated 2017年5月7日 06:44:27
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置系统修改者
     *
     * @param lastModifier
     * @generated 2017年5月7日 06:44:27
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 逻辑删除标志
     * @generated 2017年5月7日 06:44:27
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置逻辑删除标志
     *
     * @param deleted
     * @generated 2017年5月7日 06:44:27
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}