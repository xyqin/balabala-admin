package com.newhead.balabala.modules.balabalacourse.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 balabala_course
 * @generated do_not_delete_during_merge 2017年12月23日 02:12:57
 */
public class BalabalaCourse implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"课程ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课程分类ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BalabalaCourseCategory","field":"categoryName","type":"SingleTree"},"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    private Long categoryId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课程名称","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    @NotEmpty(message="课程名称不能为空")
    @Size(max=0,message = "课程名称长度无效")

    private String courseName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"线上授课次数","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    private Short onlineLessons;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"线上授课时长","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    private Short onlineDuration;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"线下授课次数","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    private Short offlineLessons;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"线下授课时长","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    private Short offlineDuration;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"总部抽取佣金","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月23日 02:12:57
     */
    private BigDecimal commission;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月23日 02:12:57
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 课程ID
     * @generated 2017年12月23日 02:12:57
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置课程ID
     *
     * @param id
     * @generated 2017年12月23日 02:12:57
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 category_id 课程分类ID
     * @generated 2017年12月23日 02:12:57
     */
    public Long getCategoryId() {
        
        return categoryId;
    }

    /**
     * 设置课程分类ID
     *
     * @param categoryId
     * @generated 2017年12月23日 02:12:57
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 返回 course_name 课程名称
     * @generated 2017年12月23日 02:12:57
     */
    public String getCourseName() {
        
        return courseName;
    }

    /**
     * 设置课程名称
     *
     * @param courseName
     * @generated 2017年12月23日 02:12:57
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * 返回 online_lessons 线上授课次数
     * @generated 2017年12月23日 02:12:57
     */
    public Short getOnlineLessons() {
        
        return onlineLessons;
    }

    /**
     * 设置线上授课次数
     *
     * @param onlineLessons
     * @generated 2017年12月23日 02:12:57
     */
    public void setOnlineLessons(Short onlineLessons) {
        this.onlineLessons = onlineLessons;
    }

    /**
     * 返回 online_duration 线上授课时长
     * @generated 2017年12月23日 02:12:57
     */
    public Short getOnlineDuration() {
        
        return onlineDuration;
    }

    /**
     * 设置线上授课时长
     *
     * @param onlineDuration
     * @generated 2017年12月23日 02:12:57
     */
    public void setOnlineDuration(Short onlineDuration) {
        this.onlineDuration = onlineDuration;
    }

    /**
     * 返回 offline_lessons 线下授课次数
     * @generated 2017年12月23日 02:12:57
     */
    public Short getOfflineLessons() {
        
        return offlineLessons;
    }

    /**
     * 设置线下授课次数
     *
     * @param offlineLessons
     * @generated 2017年12月23日 02:12:57
     */
    public void setOfflineLessons(Short offlineLessons) {
        this.offlineLessons = offlineLessons;
    }

    /**
     * 返回 offline_duration 线下授课时长
     * @generated 2017年12月23日 02:12:57
     */
    public Short getOfflineDuration() {
        
        return offlineDuration;
    }

    /**
     * 设置线下授课时长
     *
     * @param offlineDuration
     * @generated 2017年12月23日 02:12:57
     */
    public void setOfflineDuration(Short offlineDuration) {
        this.offlineDuration = offlineDuration;
    }

    /**
     * 返回 commission 总部抽取佣金
     * @generated 2017年12月23日 02:12:57
     */
    public BigDecimal getCommission() {
        
        return commission;
    }

    /**
     * 设置总部抽取佣金
     *
     * @param commission
     * @generated 2017年12月23日 02:12:57
     */
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2017年12月23日 02:12:57
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2017年12月23日 02:12:57
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2017年12月23日 02:12:57
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2017年12月23日 02:12:57
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2017年12月23日 02:12:57
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2017年12月23日 02:12:57
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2017年12月23日 02:12:57
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2017年12月23日 02:12:57
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2017年12月23日 02:12:57
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2017年12月23日 02:12:57
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}