package com.newhead.barablah.modules.barablahregion.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_region
 * @generated do_not_delete_during_merge 2018年1月25日 02:58:37
 */
public class BarablahRegion implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"主键","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"上级ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahRegion","field":"regionName","type":"SingleList"},"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    private Long parentId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"地区名称","checkName":true,"fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    @NotEmpty(message="地区名称不能为空")
    @Size(max=0,message = "地区名称长度无效")

    private String regionName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"地区路径，以分隔","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    @NotEmpty(message="地区路径，以分隔不能为空")
    @Size(max=0,message = "地区路径，以分隔长度无效")

    private String path;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"排序号","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    private Integer position;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"资源地址","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    @Size(max=0,message = "资源地址长度无效")

    private String url;

    /**
     * 返回 id 主键
     * @generated 2018年1月25日 02:58:37
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置主键
     *
     * @param id
     * @generated 2018年1月25日 02:58:37
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 parent_id 上级ID
     * @generated 2018年1月25日 02:58:37
     */
    public Long getParentId() {
        
        return parentId;
    }

    /**
     * 设置上级ID
     *
     * @param parentId
     * @generated 2018年1月25日 02:58:37
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 返回 region_name 地区名称
     * @generated 2018年1月25日 02:58:37
     */
    public String getRegionName() {
        
        return regionName;
    }

    /**
     * 设置地区名称
     *
     * @param regionName
     * @generated 2018年1月25日 02:58:37
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * 返回 path 地区路径，以分隔
     * @generated 2018年1月25日 02:58:37
     */
    public String getPath() {
        
        return path;
    }

    /**
     * 设置地区路径，以分隔
     *
     * @param path
     * @generated 2018年1月25日 02:58:37
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * 返回 position 排序号
     * @generated 2018年1月25日 02:58:37
     */
    public Integer getPosition() {
        
        return position;
    }

    /**
     * 设置排序号
     *
     * @param position
     * @generated 2018年1月25日 02:58:37
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年1月25日 02:58:37
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年1月25日 02:58:37
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年1月25日 02:58:37
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年1月25日 02:58:37
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年1月25日 02:58:37
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年1月25日 02:58:37
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年1月25日 02:58:37
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年1月25日 02:58:37
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年1月25日 02:58:37
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年1月25日 02:58:37
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 返回 url 资源地址
     * @generated 2018年1月25日 02:58:37
     */
    public String getUrl() {
        
        return url;
    }

    /**
     * 设置资源地址
     *
     * @param url
     * @generated 2018年1月25日 02:58:37
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}