package com.newhead.barablah.modules.barablahcountry.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_country
 * @generated do_not_delete_during_merge 2018年3月25日 10:55:18
 */
public class BarablahCountry implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"英文名称","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    @NotEmpty(message="英文名称不能为空")
    @Size(max=0,message = "英文名称长度无效")

    private String name;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"中文名称","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    @NotEmpty(message="中文名称不能为空")
    @Size(max=0,message = "中文名称长度无效")

    private String zhName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"缩写","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    @NotEmpty(message="缩写不能为空")
    @Size(max=0,message = "缩写长度无效")

    private String code;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"编码","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    @NotEmpty(message="编码不能为空")
    @Size(max=0,message = "编码长度无效")

    private String code2;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月25日 10:55:18
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月25日 10:55:18
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月25日 10:55:18
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月25日 10:55:18
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月25日 10:55:18
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id ID
     * @generated 2018年3月25日 10:55:18
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置ID
     *
     * @param id
     * @generated 2018年3月25日 10:55:18
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 name 英文名称
     * @generated 2018年3月25日 10:55:18
     */
    public String getName() {
        
        return name;
    }

    /**
     * 设置英文名称
     *
     * @param name
     * @generated 2018年3月25日 10:55:18
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 返回 zh_name 中文名称
     * @generated 2018年3月25日 10:55:18
     */
    public String getZhName() {
        
        return zhName;
    }

    /**
     * 设置中文名称
     *
     * @param zhName
     * @generated 2018年3月25日 10:55:18
     */
    public void setZhName(String zhName) {
        this.zhName = zhName == null ? null : zhName.trim();
    }

    /**
     * 返回 code 缩写
     * @generated 2018年3月25日 10:55:18
     */
    public String getCode() {
        
        return code;
    }

    /**
     * 设置缩写
     *
     * @param code
     * @generated 2018年3月25日 10:55:18
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 返回 code2 编码
     * @generated 2018年3月25日 10:55:18
     */
    public String getCode2() {
        
        return code2;
    }

    /**
     * 设置编码
     *
     * @param code2
     * @generated 2018年3月25日 10:55:18
     */
    public void setCode2(String code2) {
        this.code2 = code2 == null ? null : code2.trim();
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年3月25日 10:55:18
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年3月25日 10:55:18
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年3月25日 10:55:18
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年3月25日 10:55:18
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年3月25日 10:55:18
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年3月25日 10:55:18
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年3月25日 10:55:18
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年3月25日 10:55:18
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年3月25日 10:55:18
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年3月25日 10:55:18
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}