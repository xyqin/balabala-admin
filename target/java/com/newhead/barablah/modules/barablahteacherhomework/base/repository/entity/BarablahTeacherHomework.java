package com.newhead.barablah.modules.barablahteacherhomework.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_teacher_homework
 * @generated do_not_delete_during_merge 2018年1月25日 03:24:33
 */
public class BarablahTeacherHomework implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"主键","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 03:24:33
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"教师ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahTeacher","field":"fullName","type":"SingleList"},"valid":true}
     * @generated 2018年1月25日 03:24:33
     */
    private Long teacherId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"作业名称","checkName":true,"fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年1月25日 03:24:33
     */
    @NotEmpty(message="作业名称不能为空")
    @Size(max=0,message = "作业名称长度无效")

    private String homeworkName;

    /**
     *
     * {"name":"截止时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 03:24:33
     */
    @JSONField(serialize=false)
    private Date closingAt;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 03:24:33
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 03:24:33
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 03:24:33
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 03:24:33
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 03:24:33
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 主键
     * @generated 2018年1月25日 03:24:33
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置主键
     *
     * @param id
     * @generated 2018年1月25日 03:24:33
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 teacher_id 教师ID
     * @generated 2018年1月25日 03:24:33
     */
    public Long getTeacherId() {
        
        return teacherId;
    }

    /**
     * 设置教师ID
     *
     * @param teacherId
     * @generated 2018年1月25日 03:24:33
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 返回 homework_name 作业名称
     * @generated 2018年1月25日 03:24:33
     */
    public String getHomeworkName() {
        
        return homeworkName;
    }

    /**
     * 设置作业名称
     *
     * @param homeworkName
     * @generated 2018年1月25日 03:24:33
     */
    public void setHomeworkName(String homeworkName) {
        this.homeworkName = homeworkName == null ? null : homeworkName.trim();
    }

    /**
     * 返回 closing_at 截止时间
     * @generated 2018年1月25日 03:24:33
     */
    public Date getClosingAt() {
        
        return closingAt;
    }

    /**
     * 设置截止时间
     *
     * @param closingAt
     * @generated 2018年1月25日 03:24:33
     */
    public void setClosingAt(Date closingAt) {
        this.closingAt = closingAt;
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年1月25日 03:24:33
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年1月25日 03:24:33
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年1月25日 03:24:33
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年1月25日 03:24:33
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年1月25日 03:24:33
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年1月25日 03:24:33
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年1月25日 03:24:33
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年1月25日 03:24:33
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年1月25日 03:24:33
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年1月25日 03:24:33
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}