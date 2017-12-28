package com.newhead.balabala.modules.balabalamemberlesson.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 balabala_member_lesson
 * @generated do_not_delete_during_merge 2017年12月28日 06:54:51
 */
public class BalabalaMemberLesson implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"会员ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月28日 06:54:51
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"会员ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BalabalaMember","field":"nickname","type":"SingleTree"},"valid":true}
     * @generated 2017年12月28日 06:54:51
     */
    private Long memberId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"开班ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BalabalaClass","field":"className","type":"SingleTree"},"valid":true}
     * @generated 2017年12月28日 06:54:51
     */
    private Long classId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课时ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BalabalaClassLesson","field":"lessonName","type":"SingleTree"},"valid":true}
     * @generated 2017年12月28日 06:54:51
     */
    private Long lessonId;

    /**
     *
     * {"name":"开始时间","fieldType":"Date","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    private Date startAt;

    /**
     *
     * {"name":"结束时间","fieldType":"Date","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    private Date endAt;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 06:54:51
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 会员ID
     * @generated 2017年12月28日 06:54:51
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置会员ID
     *
     * @param id
     * @generated 2017年12月28日 06:54:51
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 member_id 会员ID
     * @generated 2017年12月28日 06:54:51
     */
    public Long getMemberId() {
        
        return memberId;
    }

    /**
     * 设置会员ID
     *
     * @param memberId
     * @generated 2017年12月28日 06:54:51
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 返回 class_id 开班ID
     * @generated 2017年12月28日 06:54:51
     */
    public Long getClassId() {
        
        return classId;
    }

    /**
     * 设置开班ID
     *
     * @param classId
     * @generated 2017年12月28日 06:54:51
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 返回 lesson_id 课时ID
     * @generated 2017年12月28日 06:54:51
     */
    public Long getLessonId() {
        
        return lessonId;
    }

    /**
     * 设置课时ID
     *
     * @param lessonId
     * @generated 2017年12月28日 06:54:51
     */
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * 返回 start_at 开始时间
     * @generated 2017年12月28日 06:54:51
     */
    public Date getStartAt() {
        
        return startAt;
    }

    /**
     * 设置开始时间
     *
     * @param startAt
     * @generated 2017年12月28日 06:54:51
     */
    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    /**
     * 返回 end_at 结束时间
     * @generated 2017年12月28日 06:54:51
     */
    public Date getEndAt() {
        
        return endAt;
    }

    /**
     * 设置结束时间
     *
     * @param endAt
     * @generated 2017年12月28日 06:54:51
     */
    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2017年12月28日 06:54:51
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2017年12月28日 06:54:51
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2017年12月28日 06:54:51
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2017年12月28日 06:54:51
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2017年12月28日 06:54:51
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2017年12月28日 06:54:51
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2017年12月28日 06:54:51
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2017年12月28日 06:54:51
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2017年12月28日 06:54:51
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2017年12月28日 06:54:51
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}