package com.newhead.rudderframework.modules.rudderuser.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 rudder_user
 * @generated do_not_delete_during_merge 2018年2月6日 05:24:54
 */
public class RudderUser implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"资源ID","fieldType":"Id","refs":[{"remark":"所属角色","displayType":"ListSelect","type":"3","r2prj":"rudderframework","rnprj":"rudderframework","r2":"rudderUser2role","rmid":"rudderuserId","rnid":"rudderroleId","rnref":"rudderRole","rnname":"rudderroleName","rndata":3}],"visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"账号名称","checkName":true,"fieldType":"String","visible":true,"queryType":2,"displayOrder":0,"length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    @NotEmpty(message="账号名称不能为空")
    @Size(max=16,message = "账号名称长度无效")

    private String rudderuserName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"备注","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":255,"types":[],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    @Size(max=255,message = "备注长度无效")

    private String rudderuserDesc;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"3"},"name":"密码","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    @Size(max=0,message = "密码长度无效")

    private String password;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"用户状态","fieldType":"Enum","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[{"label":"正常","value":"1"},{"label":"登录锁定","value":"2"},{"label":"禁用","value":"3"}],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    @Size(max=0,message = "用户状态长度无效")

    private String status;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"昵称","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    @Size(max=16,message = "昵称长度无效")

    private String nickname;

    /**
     *
     * {"viewconfig":{"optype":"0","formid":"1"},"name":"salt","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    private String salt;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"email","fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    @Size(max=0,message = "email长度无效")

    private String email;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"是否显示","fieldType":"Bool","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    private Boolean visible;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"校区ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahCampus","field":"campusName","type":"SingleList"},"valid":true}
     * @generated 2018年2月6日 05:24:54
     */
    private Long campusId;

    /**
     *
     * {"name":"系统创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"系统修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"系统创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"系统修改者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"逻辑删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 05:24:54
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 资源ID
     * @generated 2018年2月6日 05:24:54
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置资源ID
     *
     * @param id
     * @generated 2018年2月6日 05:24:54
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 rudderuser_name 账号名称
     * @generated 2018年2月6日 05:24:54
     */
    public String getRudderuserName() {
        
        return rudderuserName;
    }

    /**
     * 设置账号名称
     *
     * @param rudderuserName
     * @generated 2018年2月6日 05:24:54
     */
    public void setRudderuserName(String rudderuserName) {
        this.rudderuserName = rudderuserName == null ? null : rudderuserName.trim();
    }

    /**
     * 返回 rudderuser_desc 备注
     * @generated 2018年2月6日 05:24:54
     */
    public String getRudderuserDesc() {
        
        return rudderuserDesc;
    }

    /**
     * 设置备注
     *
     * @param rudderuserDesc
     * @generated 2018年2月6日 05:24:54
     */
    public void setRudderuserDesc(String rudderuserDesc) {
        this.rudderuserDesc = rudderuserDesc == null ? null : rudderuserDesc.trim();
    }

    /**
     * 返回 password 密码
     * @generated 2018年2月6日 05:24:54
     */
    public String getPassword() {
        
        return password;
    }

    /**
     * 设置密码
     *
     * @param password
     * @generated 2018年2月6日 05:24:54
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 返回 status 用户状态
     * @generated 2018年2月6日 05:24:54
     */
    public String getStatus() {
        
        return status;
    }

    /**
     * 设置用户状态
     *
     * @param status
     * @generated 2018年2月6日 05:24:54
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 返回 nickname 昵称
     * @generated 2018年2月6日 05:24:54
     */
    public String getNickname() {
        
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname
     * @generated 2018年2月6日 05:24:54
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 返回 salt salt
     * @generated 2018年2月6日 05:24:54
     */
    public String getSalt() {
        
        return salt;
    }

    /**
     * 设置salt
     *
     * @param salt
     * @generated 2018年2月6日 05:24:54
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 返回 email email
     * @generated 2018年2月6日 05:24:54
     */
    public String getEmail() {
        
        return email;
    }

    /**
     * 设置email
     *
     * @param email
     * @generated 2018年2月6日 05:24:54
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 返回 visible 是否显示
     * @generated 2018年2月6日 05:24:54
     */
    public Boolean getVisible() {
        
        return visible;
    }

    /**
     * 设置是否显示
     *
     * @param visible
     * @generated 2018年2月6日 05:24:54
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * 返回 campus_id 校区ID
     * @generated 2018年2月6日 05:24:54
     */
    public Long getCampusId() {
        
        return campusId;
    }

    /**
     * 设置校区ID
     *
     * @param campusId
     * @generated 2018年2月6日 05:24:54
     */
    public void setCampusId(Long campusId) {
        this.campusId = campusId;
    }

    /**
     * 返回 created_at 系统创建时间
     * @generated 2018年2月6日 05:24:54
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置系统创建时间
     *
     * @param createdAt
     * @generated 2018年2月6日 05:24:54
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 系统修改时间
     * @generated 2018年2月6日 05:24:54
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置系统修改时间
     *
     * @param updatedAt
     * @generated 2018年2月6日 05:24:54
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 系统创建者
     * @generated 2018年2月6日 05:24:54
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置系统创建者
     *
     * @param creator
     * @generated 2018年2月6日 05:24:54
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 系统修改者
     * @generated 2018年2月6日 05:24:54
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置系统修改者
     *
     * @param lastModifier
     * @generated 2018年2月6日 05:24:54
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 逻辑删除标志
     * @generated 2018年2月6日 05:24:54
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置逻辑删除标志
     *
     * @param deleted
     * @generated 2018年2月6日 05:24:54
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}