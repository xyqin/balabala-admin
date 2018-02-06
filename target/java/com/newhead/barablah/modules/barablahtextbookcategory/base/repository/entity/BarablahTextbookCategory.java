package com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_textbook_category
 * @generated do_not_delete_during_merge 2018年2月6日 05:24:54
 */
public class BarablahTextbookCategory implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"主键","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"父ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahTextbookCategory","field":"categoryName","type":"SingleTree"},"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    private Long parentId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"分类名称","checkName":true,"fieldType":"String","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    @NotEmpty(message="分类名称不能为空")
    @Size(max=0,message = "分类名称长度无效")

    private String categoryName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"分类路径","checkName":true,"fieldType":"String","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private String path;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"排序号","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false,"orderkey":true,"remark":"大数优先"}
     * @generated 2018年2月6日 05:24:54
     */
    private Integer position;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"资源地址","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    @Size(max=0,message = "资源地址长度无效")

    private String url;

    /**
     * 返回 id 主键
     * @generated 2018年2月6日 05:24:54
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置主键
     *
     * @param id
     * @generated 2018年2月6日 05:24:54
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 parent_id 父ID
     * @generated 2018年2月6日 05:24:54
     */
    public Long getParentId() {
        
        return parentId;
    }

    /**
     * 设置父ID
     *
     * @param parentId
     * @generated 2018年2月6日 05:24:54
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 返回 category_name 分类名称
     * @generated 2018年2月6日 05:24:54
     */
    public String getCategoryName() {
        
        return categoryName;
    }

    /**
     * 设置分类名称
     *
     * @param categoryName
     * @generated 2018年2月6日 05:24:54
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 返回 path 分类路径
     * @generated 2018年2月6日 05:24:54
     */
    public String getPath() {
        
        return path;
    }

    /**
     * 设置分类路径
     *
     * @param path
     * @generated 2018年2月6日 05:24:54
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * 返回 position 排序号
     * @generated 2018年2月6日 05:24:54
     */
    public Integer getPosition() {
        
        return position;
    }

    /**
     * 设置排序号
     *
     * @param position
     * @generated 2018年2月6日 05:24:54
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年2月6日 05:24:54
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年2月6日 05:24:54
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年2月6日 05:24:54
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年2月6日 05:24:54
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年2月6日 05:24:54
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年2月6日 05:24:54
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年2月6日 05:24:54
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年2月6日 05:24:54
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年2月6日 05:24:54
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年2月6日 05:24:54
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 返回 url 资源地址
     * @generated 2018年2月6日 05:24:54
     */
    public String getUrl() {
        
        return url;
    }

    /**
     * 设置资源地址
     *
     * @param url
     * @generated 2018年2月6日 05:24:54
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}