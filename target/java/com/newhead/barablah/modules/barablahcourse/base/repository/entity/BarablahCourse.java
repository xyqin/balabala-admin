package com.newhead.barablah.modules.barablahcourse.base.repository.entity;

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
 * 表 barablah_course
 * @generated do_not_delete_during_merge 2018年3月10日 07:58:13
 */
public class BarablahCourse implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"课程ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月10日 07:58:13
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课程分类ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahCourseCategory","field":"categoryName","type":"SingleList"},"valid":true}
     * @generated 2018年3月10日 07:58:13
     */
    private Long categoryId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"教材二级分类ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahTextbookCategory","field":"categoryName","type":"SingleTree"},"valid":true}
     * @generated 2018年3月10日 07:58:13
     */
    private Long textbookCategoryId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课程名称","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年3月10日 07:58:13
     */
    @NotEmpty(message="课程名称不能为空")
    @Size(max=0,message = "课程名称长度无效")

    private String courseName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"线上授课次数","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月10日 07:58:13
     */
    private Short onlineLessons;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"线上授课时长","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月10日 07:58:13
     */
    private Short onlineDuration;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"线下授课次数","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月10日 07:58:13
     */
    private Short offlineLessons;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"线下授课时长","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月10日 07:58:13
     */
    private Short offlineDuration;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"总部抽取佣金（元/每位学生）","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月10日 07:58:13
     */
    private BigDecimal commission;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月10日 07:58:13
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月10日 07:58:13
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月10日 07:58:13
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月10日 07:58:13
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月10日 07:58:13
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 课程ID
     * @generated 2018年3月10日 07:58:13
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置课程ID
     *
     * @param id
     * @generated 2018年3月10日 07:58:13
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 category_id 课程分类ID
     * @generated 2018年3月10日 07:58:13
     */
    public Long getCategoryId() {
        
        return categoryId;
    }

    /**
     * 设置课程分类ID
     *
     * @param categoryId
     * @generated 2018年3月10日 07:58:13
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 返回 textbook_category_id 教材二级分类ID
     * @generated 2018年3月10日 07:58:13
     */
    public Long getTextbookCategoryId() {
        
        return textbookCategoryId;
    }

    /**
     * 设置教材二级分类ID
     *
     * @param textbookCategoryId
     * @generated 2018年3月10日 07:58:13
     */
    public void setTextbookCategoryId(Long textbookCategoryId) {
        this.textbookCategoryId = textbookCategoryId;
    }

    /**
     * 返回 course_name 课程名称
     * @generated 2018年3月10日 07:58:13
     */
    public String getCourseName() {
        
        return courseName;
    }

    /**
     * 设置课程名称
     *
     * @param courseName
     * @generated 2018年3月10日 07:58:13
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * 返回 online_lessons 线上授课次数
     * @generated 2018年3月10日 07:58:13
     */
    public Short getOnlineLessons() {
        
        return onlineLessons;
    }

    /**
     * 设置线上授课次数
     *
     * @param onlineLessons
     * @generated 2018年3月10日 07:58:13
     */
    public void setOnlineLessons(Short onlineLessons) {
        this.onlineLessons = onlineLessons;
    }

    /**
     * 返回 online_duration 线上授课时长
     * @generated 2018年3月10日 07:58:13
     */
    public Short getOnlineDuration() {
        
        return onlineDuration;
    }

    /**
     * 设置线上授课时长
     *
     * @param onlineDuration
     * @generated 2018年3月10日 07:58:13
     */
    public void setOnlineDuration(Short onlineDuration) {
        this.onlineDuration = onlineDuration;
    }

    /**
     * 返回 offline_lessons 线下授课次数
     * @generated 2018年3月10日 07:58:13
     */
    public Short getOfflineLessons() {
        
        return offlineLessons;
    }

    /**
     * 设置线下授课次数
     *
     * @param offlineLessons
     * @generated 2018年3月10日 07:58:13
     */
    public void setOfflineLessons(Short offlineLessons) {
        this.offlineLessons = offlineLessons;
    }

    /**
     * 返回 offline_duration 线下授课时长
     * @generated 2018年3月10日 07:58:13
     */
    public Short getOfflineDuration() {
        
        return offlineDuration;
    }

    /**
     * 设置线下授课时长
     *
     * @param offlineDuration
     * @generated 2018年3月10日 07:58:13
     */
    public void setOfflineDuration(Short offlineDuration) {
        this.offlineDuration = offlineDuration;
    }

    /**
     * 返回 commission 总部抽取佣金（元/每位学生）
     * @generated 2018年3月10日 07:58:13
     */
    public BigDecimal getCommission() {
        
        return commission;
    }

    /**
     * 设置总部抽取佣金（元/每位学生）
     *
     * @param commission
     * @generated 2018年3月10日 07:58:13
     */
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年3月10日 07:58:13
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年3月10日 07:58:13
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年3月10日 07:58:13
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年3月10日 07:58:13
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年3月10日 07:58:13
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年3月10日 07:58:13
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年3月10日 07:58:13
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年3月10日 07:58:13
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年3月10日 07:58:13
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年3月10日 07:58:13
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}