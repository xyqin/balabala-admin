package com.newhead.rudderframework.modules.ruddermenu.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 rudder_menu
 * @generated do_not_delete_during_merge 2018年1月26日 03:43:28
 */
public class RudderMenu implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"菜单ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年1月26日 03:43:28
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"菜单名称","fieldType":"String","visible":true,"checkName":true,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年1月26日 03:43:28
     */
    @NotEmpty(message="菜单名称不能为空")
    @Size(max=0,message = "菜单名称长度无效")

    private String ruddermenuName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"2"},"name":"菜单描述","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":255,"types":[],"valid":true}
     * @generated 2018年1月26日 03:43:28
     */
    @Size(max=255,message = "菜单描述长度无效")

    private String ruddermenuDesc;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"菜单链接","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年1月26日 03:43:28
     */
    @NotEmpty(message="菜单链接不能为空")
    @Size(max=0,message = "菜单链接长度无效")

    private String url;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"是否显示","fieldType":"Bool","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年1月26日 03:43:28
     */
    private Boolean visible;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"排序号","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月26日 03:43:28
     */
    private Integer orderNumber;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"上级菜单","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"RudderMenu","field":"ruddermenuName","type":"SingleTree"},"valid":true}
     * @generated 2018年1月26日 03:43:28
     */
    private Long parentId;

    /**
     *
     * {"name":"系统创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月26日 03:43:28
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"系统修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月26日 03:43:28
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"系统创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月26日 03:43:28
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"系统修改者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月26日 03:43:28
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"逻辑删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月26日 03:43:28
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"上级资源","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"RudderPermission","field":"rudderpermissionName","type":"SingleTree"},"valid":true}
     * @generated 2018年1月26日 03:43:28
     */
    private Long resourceId;

    /**
     * 返回 id 菜单ID
     * @generated 2018年1月26日 03:43:28
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置菜单ID
     *
     * @param id
     * @generated 2018年1月26日 03:43:28
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 ruddermenu_name 菜单名称
     * @generated 2018年1月26日 03:43:28
     */
    public String getRuddermenuName() {
        
        return ruddermenuName;
    }

    /**
     * 设置菜单名称
     *
     * @param ruddermenuName
     * @generated 2018年1月26日 03:43:28
     */
    public void setRuddermenuName(String ruddermenuName) {
        this.ruddermenuName = ruddermenuName == null ? null : ruddermenuName.trim();
    }

    /**
     * 返回 ruddermenu_desc 菜单描述
     * @generated 2018年1月26日 03:43:28
     */
    public String getRuddermenuDesc() {
        
        return ruddermenuDesc;
    }

    /**
     * 设置菜单描述
     *
     * @param ruddermenuDesc
     * @generated 2018年1月26日 03:43:28
     */
    public void setRuddermenuDesc(String ruddermenuDesc) {
        this.ruddermenuDesc = ruddermenuDesc == null ? null : ruddermenuDesc.trim();
    }

    /**
     * 返回 url 菜单链接
     * @generated 2018年1月26日 03:43:28
     */
    public String getUrl() {
        
        return url;
    }

    /**
     * 设置菜单链接
     *
     * @param url
     * @generated 2018年1月26日 03:43:28
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 返回 visible 是否显示
     * @generated 2018年1月26日 03:43:28
     */
    public Boolean getVisible() {
        
        return visible;
    }

    /**
     * 设置是否显示
     *
     * @param visible
     * @generated 2018年1月26日 03:43:28
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * 返回 order_number 排序号
     * @generated 2018年1月26日 03:43:28
     */
    public Integer getOrderNumber() {
        
        return orderNumber;
    }

    /**
     * 设置排序号
     *
     * @param orderNumber
     * @generated 2018年1月26日 03:43:28
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 返回 parent_id 上级菜单
     * @generated 2018年1月26日 03:43:28
     */
    public Long getParentId() {
        
        return parentId;
    }

    /**
     * 设置上级菜单
     *
     * @param parentId
     * @generated 2018年1月26日 03:43:28
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 返回 created_at 系统创建时间
     * @generated 2018年1月26日 03:43:28
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置系统创建时间
     *
     * @param createdAt
     * @generated 2018年1月26日 03:43:28
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 系统修改时间
     * @generated 2018年1月26日 03:43:28
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置系统修改时间
     *
     * @param updatedAt
     * @generated 2018年1月26日 03:43:28
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 系统创建者
     * @generated 2018年1月26日 03:43:28
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置系统创建者
     *
     * @param creator
     * @generated 2018年1月26日 03:43:28
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 系统修改者
     * @generated 2018年1月26日 03:43:28
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置系统修改者
     *
     * @param lastModifier
     * @generated 2018年1月26日 03:43:28
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 逻辑删除标志
     * @generated 2018年1月26日 03:43:28
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置逻辑删除标志
     *
     * @param deleted
     * @generated 2018年1月26日 03:43:28
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 返回 resource_id 上级资源
     * @generated 2018年1月26日 03:43:28
     */
    public Long getResourceId() {
        
        return resourceId;
    }

    /**
     * 设置上级资源
     *
     * @param resourceId
     * @generated 2018年1月26日 03:43:28
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }
}