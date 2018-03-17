package com.newhead.barablah.modules.barablahclasscategory.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_class_category
 * @generated do_not_delete_during_merge 2018年3月18日 02:48:14
 */
public class BarablahClassCategory implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"班级分类ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"分类名称","fieldType":"String","visible":true,"checkName":true,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年3月18日 02:48:14
     */
    @NotEmpty(message="分类名称不能为空")
    @Size(max=0,message = "分类名称长度无效")

    private String categoryName;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月18日 02:48:14
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 班级分类ID
     * @generated 2018年3月18日 02:48:14
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置班级分类ID
     *
     * @param id
     * @generated 2018年3月18日 02:48:14
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 category_name 分类名称
     * @generated 2018年3月18日 02:48:14
     */
    public String getCategoryName() {
        
        return categoryName;
    }

    /**
     * 设置分类名称
     *
     * @param categoryName
     * @generated 2018年3月18日 02:48:14
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年3月18日 02:48:14
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年3月18日 02:48:14
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年3月18日 02:48:14
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年3月18日 02:48:14
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年3月18日 02:48:14
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年3月18日 02:48:14
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年3月18日 02:48:14
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年3月18日 02:48:14
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年3月18日 02:48:14
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年3月18日 02:48:14
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}