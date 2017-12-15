package com.newhead.sc.modules.scdevice.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 sc_device
 * @generated do_not_delete_during_merge 2017年12月13日 12:17:47
 */
public class ScDevice implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"设备名称","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    @NotEmpty(message="设备名称不能为空")
    @Size(max=0,message = "设备名称长度无效")

    private String deviceName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"设备厂家","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    @Size(max=0,message = "设备厂家长度无效")

    private String vendor;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"设备型号","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    @Size(max=0,message = "设备型号长度无效")

    private String model;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"设备图片","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    @Size(max=0,message = "设备图片长度无效")

    private String image;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"设备安装位置","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    @Size(max=0,message = "设备安装位置长度无效")

    private String installLocation;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"设备配置","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    @Size(max=0,message = "设备配置长度无效")

    private String config;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"设备类型","fieldType":"Enum","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[{"label":"门禁","value":"ACCESS"},{"label":"视频","value":"CAMERA"}],"valid":true}
     * @generated 2017年12月13日 12:17:47
     */
    @Size(max=0,message = "设备类型长度无效")

    private String type;

    /**
     *
     * {"name":"系统创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月13日 12:17:47
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"系统修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月13日 12:17:47
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"系统创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月13日 12:17:47
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"系统修改者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月13日 12:17:47
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"逻辑删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月13日 12:17:47
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id ID
     * @generated 2017年12月13日 12:17:47
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置ID
     *
     * @param id
     * @generated 2017年12月13日 12:17:47
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 device_name 设备名称
     * @generated 2017年12月13日 12:17:47
     */
    public String getDeviceName() {
        
        return deviceName;
    }

    /**
     * 设置设备名称
     *
     * @param deviceName
     * @generated 2017年12月13日 12:17:47
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * 返回 vendor 设备厂家
     * @generated 2017年12月13日 12:17:47
     */
    public String getVendor() {
        
        return vendor;
    }

    /**
     * 设置设备厂家
     *
     * @param vendor
     * @generated 2017年12月13日 12:17:47
     */
    public void setVendor(String vendor) {
        this.vendor = vendor == null ? null : vendor.trim();
    }

    /**
     * 返回 model 设备型号
     * @generated 2017年12月13日 12:17:47
     */
    public String getModel() {
        
        return model;
    }

    /**
     * 设置设备型号
     *
     * @param model
     * @generated 2017年12月13日 12:17:47
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * 返回 image 设备图片
     * @generated 2017年12月13日 12:17:47
     */
    public String getImage() {
        
        return image;
    }

    /**
     * 设置设备图片
     *
     * @param image
     * @generated 2017年12月13日 12:17:47
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * 返回 install_location 设备安装位置
     * @generated 2017年12月13日 12:17:47
     */
    public String getInstallLocation() {
        
        return installLocation;
    }

    /**
     * 设置设备安装位置
     *
     * @param installLocation
     * @generated 2017年12月13日 12:17:47
     */
    public void setInstallLocation(String installLocation) {
        this.installLocation = installLocation == null ? null : installLocation.trim();
    }

    /**
     * 返回 config 设备配置
     * @generated 2017年12月13日 12:17:47
     */
    public String getConfig() {
        
        return config;
    }

    /**
     * 设置设备配置
     *
     * @param config
     * @generated 2017年12月13日 12:17:47
     */
    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }

    /**
     * 返回 type 设备类型
     * @generated 2017年12月13日 12:17:47
     */
    public String getType() {
        
        return type;
    }

    /**
     * 设置设备类型
     *
     * @param type
     * @generated 2017年12月13日 12:17:47
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 返回 created_at 系统创建时间
     * @generated 2017年12月13日 12:17:47
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置系统创建时间
     *
     * @param createdAt
     * @generated 2017年12月13日 12:17:47
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 系统修改时间
     * @generated 2017年12月13日 12:17:47
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置系统修改时间
     *
     * @param updatedAt
     * @generated 2017年12月13日 12:17:47
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 系统创建者
     * @generated 2017年12月13日 12:17:47
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置系统创建者
     *
     * @param creator
     * @generated 2017年12月13日 12:17:47
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 系统修改者
     * @generated 2017年12月13日 12:17:47
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置系统修改者
     *
     * @param lastModifier
     * @generated 2017年12月13日 12:17:47
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 逻辑删除标志
     * @generated 2017年12月13日 12:17:47
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置逻辑删除标志
     *
     * @param deleted
     * @generated 2017年12月13日 12:17:47
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}