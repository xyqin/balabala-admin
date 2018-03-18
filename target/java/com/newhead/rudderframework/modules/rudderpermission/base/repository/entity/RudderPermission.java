package com.newhead.rudderframework.modules.rudderpermission.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 rudder_permission
 * @generated do_not_delete_during_merge 2018年3月18日 05:08:22
 */
public class RudderPermission implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"资源ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月18日 05:08:22
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"资源名称","fieldType":"String","checkName":true,"visible":true,"queryType":2,"displayOrder":0,"length":16,"types":[],"valid":true}
     * @generated 2018年3月18日 05:08:22
     */
    @NotEmpty(message="资源名称不能为空")
    @Size(max=16,message = "资源名称长度无效")

    private String rudderpermissionName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"2"},"name":"资源描述","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":255,"types":[],"valid":true}
     * @generated 2018年3月18日 05:08:22
     */
    @Size(max=255,message = "资源描述长度无效")

    private String rudderpermissionDesc;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"资源地址","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月18日 05:08:22
     */
    @Size(max=0,message = "资源地址长度无效")

    private String url;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"上级资源","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"RudderPermission","field":"rudderpermissionName","type":"SingleTree"},"valid":true}
     * @generated 2018年3月18日 05:08:22
     */
    private Long parentId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"是否显示","fieldType":"Bool","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月18日 05:08:22
     */
    private Boolean visible;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"排序号","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 05:08:22
     */
    private Integer orderNumber;

    /**
     *
     * {"name":"系统创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 05:08:22
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"系统修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 05:08:22
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"系统创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 05:08:22
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"系统修改者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 05:08:22
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"逻辑删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 05:08:22
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     *
     * {"viewconfig":{"optype":"0","formid":"1"},"name":"leaf","fieldType":"Bool","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 05:08:22
     */
    private Byte leaf;

    /**
     * 返回 id 资源ID
     * @generated 2018年3月18日 05:08:22
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置资源ID
     *
     * @param id
     * @generated 2018年3月18日 05:08:22
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 rudderpermission_name 资源名称
     * @generated 2018年3月18日 05:08:22
     */
    public String getRudderpermissionName() {
        
        return rudderpermissionName;
    }

    /**
     * 设置资源名称
     *
     * @param rudderpermissionName
     * @generated 2018年3月18日 05:08:22
     */
    public void setRudderpermissionName(String rudderpermissionName) {
        this.rudderpermissionName = rudderpermissionName == null ? null : rudderpermissionName.trim();
    }

    /**
     * 返回 rudderpermission_desc 资源描述
     * @generated 2018年3月18日 05:08:22
     */
    public String getRudderpermissionDesc() {
        
        return rudderpermissionDesc;
    }

    /**
     * 设置资源描述
     *
     * @param rudderpermissionDesc
     * @generated 2018年3月18日 05:08:22
     */
    public void setRudderpermissionDesc(String rudderpermissionDesc) {
        this.rudderpermissionDesc = rudderpermissionDesc == null ? null : rudderpermissionDesc.trim();
    }

    /**
     * 返回 url 资源地址
     * @generated 2018年3月18日 05:08:22
     */
    public String getUrl() {
        
        return url;
    }

    /**
     * 设置资源地址
     *
     * @param url
     * @generated 2018年3月18日 05:08:22
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 返回 parent_id 上级资源
     * @generated 2018年3月18日 05:08:22
     */
    public Long getParentId() {
        
        return parentId;
    }

    /**
     * 设置上级资源
     *
     * @param parentId
     * @generated 2018年3月18日 05:08:22
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 返回 visible 是否显示
     * @generated 2018年3月18日 05:08:22
     */
    public Boolean getVisible() {
        
        return visible;
    }

    /**
     * 设置是否显示
     *
     * @param visible
     * @generated 2018年3月18日 05:08:22
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * 返回 order_number 排序号
     * @generated 2018年3月18日 05:08:22
     */
    public Integer getOrderNumber() {
        
        return orderNumber;
    }

    /**
     * 设置排序号
     *
     * @param orderNumber
     * @generated 2018年3月18日 05:08:22
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 返回 created_at 系统创建时间
     * @generated 2018年3月18日 05:08:22
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置系统创建时间
     *
     * @param createdAt
     * @generated 2018年3月18日 05:08:22
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 系统修改时间
     * @generated 2018年3月18日 05:08:22
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置系统修改时间
     *
     * @param updatedAt
     * @generated 2018年3月18日 05:08:22
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 系统创建者
     * @generated 2018年3月18日 05:08:22
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置系统创建者
     *
     * @param creator
     * @generated 2018年3月18日 05:08:22
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 系统修改者
     * @generated 2018年3月18日 05:08:22
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置系统修改者
     *
     * @param lastModifier
     * @generated 2018年3月18日 05:08:22
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 逻辑删除标志
     * @generated 2018年3月18日 05:08:22
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置逻辑删除标志
     *
     * @param deleted
     * @generated 2018年3月18日 05:08:22
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 返回 leaf leaf
     * @generated 2018年3月18日 05:08:22
     */
    public Byte getLeaf() {
        
        return leaf;
    }

    /**
     * 设置leaf
     *
     * @param leaf
     * @generated 2018年3月18日 05:08:22
     */
    public void setLeaf(Byte leaf) {
        this.leaf = leaf;
    }
}