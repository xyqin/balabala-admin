package com.newhead.balabala.modules.balabalacampus.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 balabala_campus
 * @generated do_not_delete_during_merge 2017年12月28日 06:54:51
 */
public class BalabalaCampus implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"校区ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月28日 06:54:51
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"地区ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BalabalaRegion","field":"regionName","type":"SingleTree"},"valid":true}
     * @generated 2017年12月28日 06:54:51
     */
    private Long regionId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"校区名称","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2017年12月28日 06:54:51
     */
    @NotEmpty(message="校区名称不能为空")
    @Size(max=0,message = "校区名称长度无效")

    private String campusName;

    /**
     *
     * {"name":"系统创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"系统修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"系统创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"系统修改者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"逻辑删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 校区ID
     * @generated 2017年12月28日 06:54:51
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置校区ID
     *
     * @param id
     * @generated 2017年12月28日 06:54:51
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 region_id 地区ID
     * @generated 2017年12月28日 06:54:51
     */
    public Long getRegionId() {
        
        return regionId;
    }

    /**
     * 设置地区ID
     *
     * @param regionId
     * @generated 2017年12月28日 06:54:51
     */
    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 返回 campus_name 校区名称
     * @generated 2017年12月28日 06:54:51
     */
    public String getCampusName() {
        
        return campusName;
    }

    /**
     * 设置校区名称
     *
     * @param campusName
     * @generated 2017年12月28日 06:54:51
     */
    public void setCampusName(String campusName) {
        this.campusName = campusName == null ? null : campusName.trim();
    }

    /**
     * 返回 created_at 系统创建时间
     * @generated 2017年12月28日 06:54:51
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置系统创建时间
     *
     * @param createdAt
     * @generated 2017年12月28日 06:54:51
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 系统修改时间
     * @generated 2017年12月28日 06:54:51
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置系统修改时间
     *
     * @param updatedAt
     * @generated 2017年12月28日 06:54:51
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 系统创建者
     * @generated 2017年12月28日 06:54:51
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置系统创建者
     *
     * @param creator
     * @generated 2017年12月28日 06:54:51
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 系统修改者
     * @generated 2017年12月28日 06:54:51
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置系统修改者
     *
     * @param lastModifier
     * @generated 2017年12月28日 06:54:51
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 逻辑删除标志
     * @generated 2017年12月28日 06:54:51
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置逻辑删除标志
     *
     * @param deleted
     * @generated 2017年12月28日 06:54:51
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}