package com.newhead.barablah.modules.barablahteacher.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_teacher
 * @generated do_not_delete_during_merge 2018年2月6日 03:58:37
 */
public class BarablahTeacher implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"主键","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 03:58:37
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"校区ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahCampus","field":"campusName","type":"SingleList"},"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    private Long campusId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"账号","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    @NotEmpty(message="账号不能为空")
    @Size(max=0,message = "账号长度无效")

    private String username;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"密码","fieldType":"String","visible":false,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    @JSONField(serialize=false)
    private String password;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"头像","fieldType":"Image","visible":true,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    @NotEmpty(message="头像不能为空")
    @Size(max=0,message = "头像长度无效")

    private String avatar;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"姓名","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    @NotEmpty(message="姓名不能为空")
    @Size(max=0,message = "姓名长度无效")

    private String fullName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"手机号","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    @NotEmpty(message="手机号不能为空")
    @Size(max=0,message = "手机号长度无效")

    private String phoneNumber;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"专业","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    @NotEmpty(message="专业不能为空")
    @Size(max=0,message = "专业长度无效")

    private String major;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"来自哪里","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    @NotEmpty(message="来自哪里不能为空")
    @Size(max=0,message = "来自哪里长度无效")

    private String comeFrom;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"状态","fieldType":"Enum","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[{"label":"审核中","value":"IN_REVIEW"},{"label":"审核被拒","value":"REJECTED"},{"label":"启用","value":"ENABLED"},{"label":"禁用","value":"DISABLED"}],"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    @NotEmpty(message="状态不能为空")
    @Size(max=0,message = "状态长度无效")

    private String status;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"网易云ID","fieldType":"String","visible":false,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    @JSONField(serialize=false)
    private String accid;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"网易云登录token","fieldType":"String","visible":false,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月6日 03:58:37
     */
    @JSONField(serialize=false)
    private String token;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 03:58:37
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 03:58:37
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 03:58:37
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 03:58:37
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月6日 03:58:37
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 主键
     * @generated 2018年2月6日 03:58:37
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置主键
     *
     * @param id
     * @generated 2018年2月6日 03:58:37
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 campus_id 校区ID
     * @generated 2018年2月6日 03:58:37
     */
    public Long getCampusId() {
        
        return campusId;
    }

    /**
     * 设置校区ID
     *
     * @param campusId
     * @generated 2018年2月6日 03:58:37
     */
    public void setCampusId(Long campusId) {
        this.campusId = campusId;
    }

    /**
     * 返回 username 账号
     * @generated 2018年2月6日 03:58:37
     */
    public String getUsername() {
        
        return username;
    }

    /**
     * 设置账号
     *
     * @param username
     * @generated 2018年2月6日 03:58:37
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 返回 password 密码
     * @generated 2018年2月6日 03:58:37
     */
    public String getPassword() {
        
        return password;
    }

    /**
     * 设置密码
     *
     * @param password
     * @generated 2018年2月6日 03:58:37
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 返回 avatar 头像
     * @generated 2018年2月6日 03:58:37
     */
    public String getAvatar() {
        
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar
     * @generated 2018年2月6日 03:58:37
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 返回 full_name 姓名
     * @generated 2018年2月6日 03:58:37
     */
    public String getFullName() {
        
        return fullName;
    }

    /**
     * 设置姓名
     *
     * @param fullName
     * @generated 2018年2月6日 03:58:37
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * 返回 phone_number 手机号
     * @generated 2018年2月6日 03:58:37
     */
    public String getPhoneNumber() {
        
        return phoneNumber;
    }

    /**
     * 设置手机号
     *
     * @param phoneNumber
     * @generated 2018年2月6日 03:58:37
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 返回 major 专业
     * @generated 2018年2月6日 03:58:37
     */
    public String getMajor() {
        
        return major;
    }

    /**
     * 设置专业
     *
     * @param major
     * @generated 2018年2月6日 03:58:37
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * 返回 come_from 来自哪里
     * @generated 2018年2月6日 03:58:37
     */
    public String getComeFrom() {
        
        return comeFrom;
    }

    /**
     * 设置来自哪里
     *
     * @param comeFrom
     * @generated 2018年2月6日 03:58:37
     */
    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom == null ? null : comeFrom.trim();
    }

    /**
     * 返回 status 状态
     * @generated 2018年2月6日 03:58:37
     */
    public String getStatus() {
        
        return status;
    }

    /**
     * 设置状态
     *
     * @param status
     * @generated 2018年2月6日 03:58:37
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 返回 accid 网易云ID
     * @generated 2018年2月6日 03:58:37
     */
    public String getAccid() {
        
        return accid;
    }

    /**
     * 设置网易云ID
     *
     * @param accid
     * @generated 2018年2月6日 03:58:37
     */
    public void setAccid(String accid) {
        this.accid = accid == null ? null : accid.trim();
    }

    /**
     * 返回 token 网易云登录token
     * @generated 2018年2月6日 03:58:37
     */
    public String getToken() {
        
        return token;
    }

    /**
     * 设置网易云登录token
     *
     * @param token
     * @generated 2018年2月6日 03:58:37
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年2月6日 03:58:37
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年2月6日 03:58:37
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年2月6日 03:58:37
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年2月6日 03:58:37
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年2月6日 03:58:37
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年2月6日 03:58:37
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年2月6日 03:58:37
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年2月6日 03:58:37
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年2月6日 03:58:37
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年2月6日 03:58:37
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}