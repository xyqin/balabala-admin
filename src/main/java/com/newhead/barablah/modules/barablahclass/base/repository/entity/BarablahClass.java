package com.newhead.barablah.modules.barablahclass.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_class
 * @generated do_not_delete_during_merge 2018年1月18日 06:52:57
 */
public class BarablahClass implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"开班ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年1月18日 06:52:57
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课程ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahCourse","field":"courseName","type":"SingleTree"},"valid":true}
     * @generated 2018年1月18日 06:52:57
     */
    private Long courseId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"教师ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahTeacher","field":"fullName","type":"SingleTree"},"valid":true}
     * @generated 2018年1月18日 06:52:57
     */
    private Long teacherId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"校区ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahCampus","field":"campusName","type":"SingleTree"},"valid":true}
     * @generated 2018年1月18日 06:52:57
     */
    private Long campusId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"外教教师ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahTeacher","field":"fullName","type":"SingleTree"},"valid":true}
     * @generated 2018年1月18日 06:52:57
     */
    private Long englishTeacherId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"班级名称","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年1月18日 06:52:57
     */
    @NotEmpty(message="班级名称不能为空")
    @Size(max=0,message = "班级名称长度无效")

    private String className;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"班长","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年1月18日 06:52:57
     */
    @NotEmpty(message="班长不能为空")
    @Size(max=0,message = "班长长度无效")

    private String monitor;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"班长电话","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年1月18日 06:52:57
     */
    @NotEmpty(message="班长电话不能为空")
    @Size(max=0,message = "班长电话长度无效")

    private String monitorPhoneNumber;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"状态","fieldType":"Enum","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[{"label":"审核中","value":"IN_REVIEW"},{"label":"审核被拒","value":"REJECTED"},{"label":"进行中","value":"ONGOING"},{"label":"已结束","value":"FINISHED"}],"valid":true}
     * @generated 2018年1月18日 06:52:57
     */
    @NotEmpty(message="状态不能为空")
    @Size(max=0,message = "状态长度无效")

    private String status;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月18日 06:52:57
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月18日 06:52:57
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月18日 06:52:57
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月18日 06:52:57
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月18日 06:52:57
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 开班ID
     * @generated 2018年1月18日 06:52:57
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置开班ID
     *
     * @param id
     * @generated 2018年1月18日 06:52:57
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 course_id 课程ID
     * @generated 2018年1月18日 06:52:57
     */
    public Long getCourseId() {
        
        return courseId;
    }

    /**
     * 设置课程ID
     *
     * @param courseId
     * @generated 2018年1月18日 06:52:57
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * 返回 teacher_id 教师ID
     * @generated 2018年1月18日 06:52:57
     */
    public Long getTeacherId() {
        
        return teacherId;
    }

    /**
     * 设置教师ID
     *
     * @param teacherId
     * @generated 2018年1月18日 06:52:57
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 返回 campus_id 校区ID
     * @generated 2018年1月18日 06:52:57
     */
    public Long getCampusId() {
        
        return campusId;
    }

    /**
     * 设置校区ID
     *
     * @param campusId
     * @generated 2018年1月18日 06:52:57
     */
    public void setCampusId(Long campusId) {
        this.campusId = campusId;
    }

    /**
     * 返回 english_teacher_id 外教教师ID
     * @generated 2018年1月18日 06:52:57
     */
    public Long getEnglishTeacherId() {
        
        return englishTeacherId;
    }

    /**
     * 设置外教教师ID
     *
     * @param englishTeacherId
     * @generated 2018年1月18日 06:52:57
     */
    public void setEnglishTeacherId(Long englishTeacherId) {
        this.englishTeacherId = englishTeacherId;
    }

    /**
     * 返回 class_name 班级名称
     * @generated 2018年1月18日 06:52:57
     */
    public String getClassName() {
        
        return className;
    }

    /**
     * 设置班级名称
     *
     * @param className
     * @generated 2018年1月18日 06:52:57
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * 返回 monitor 班长
     * @generated 2018年1月18日 06:52:57
     */
    public String getMonitor() {
        
        return monitor;
    }

    /**
     * 设置班长
     *
     * @param monitor
     * @generated 2018年1月18日 06:52:57
     */
    public void setMonitor(String monitor) {
        this.monitor = monitor == null ? null : monitor.trim();
    }

    /**
     * 返回 monitor_phone_number 班长电话
     * @generated 2018年1月18日 06:52:57
     */
    public String getMonitorPhoneNumber() {
        
        return monitorPhoneNumber;
    }

    /**
     * 设置班长电话
     *
     * @param monitorPhoneNumber
     * @generated 2018年1月18日 06:52:57
     */
    public void setMonitorPhoneNumber(String monitorPhoneNumber) {
        this.monitorPhoneNumber = monitorPhoneNumber == null ? null : monitorPhoneNumber.trim();
    }

    /**
     * 返回 status 状态
     * @generated 2018年1月18日 06:52:57
     */
    public String getStatus() {
        
        return status;
    }

    /**
     * 设置状态
     *
     * @param status
     * @generated 2018年1月18日 06:52:57
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年1月18日 06:52:57
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年1月18日 06:52:57
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年1月18日 06:52:57
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年1月18日 06:52:57
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年1月18日 06:52:57
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年1月18日 06:52:57
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年1月18日 06:52:57
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年1月18日 06:52:57
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年1月18日 06:52:57
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年1月18日 06:52:57
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}