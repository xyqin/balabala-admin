package com.newhead.barablah.modules.barablahmemberlessonlog.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_member_lessonlog
 * @generated do_not_delete_during_merge 2018年3月25日 10:55:18
 */
public class BarablahMemberLessonlog implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"会员ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"开班ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahClass","field":"className","type":"SingleList"},"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    private Long classId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课时ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahClassLesson","field":"lessonName","type":"SingleList"},"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    private Long lessonId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"会员ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahMember","field":"nickname","type":"SingleList"},"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    private Long memberId;

    /**
     *
     * {"name":"动作时间","fieldType":"Date","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月25日 10:55:18
     */
    private Date eventAt;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"类型","fieldType":"Enum","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[{"label":"签到","value":"ONLINE"},{"label":"退出","value":"OFFLINE"}],"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    @NotEmpty(message="类型不能为空")
    @Size(max=0,message = "类型长度无效")

    private String action;

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
     *
     * {"name":"签到","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月25日 10:55:18
     */
    @JSONField(serialize=false)
    private Date signTime;

    /**
     *
     * {"name":"退出时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月25日 10:55:18
     */
    @JSONField(serialize=false)
    private Date leaveTime;

    /**
     * 返回 id 会员ID
     * @generated 2018年3月25日 10:55:18
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置会员ID
     *
     * @param id
     * @generated 2018年3月25日 10:55:18
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 class_id 开班ID
     * @generated 2018年3月25日 10:55:18
     */
    public Long getClassId() {
        
        return classId;
    }

    /**
     * 设置开班ID
     *
     * @param classId
     * @generated 2018年3月25日 10:55:18
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 返回 lesson_id 课时ID
     * @generated 2018年3月25日 10:55:18
     */
    public Long getLessonId() {
        
        return lessonId;
    }

    /**
     * 设置课时ID
     *
     * @param lessonId
     * @generated 2018年3月25日 10:55:18
     */
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * 返回 member_id 会员ID
     * @generated 2018年3月25日 10:55:18
     */
    public Long getMemberId() {
        
        return memberId;
    }

    /**
     * 设置会员ID
     *
     * @param memberId
     * @generated 2018年3月25日 10:55:18
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 返回 event_at 动作时间
     * @generated 2018年3月25日 10:55:18
     */
    public Date getEventAt() {
        
        return eventAt;
    }

    /**
     * 设置动作时间
     *
     * @param eventAt
     * @generated 2018年3月25日 10:55:18
     */
    public void setEventAt(Date eventAt) {
        this.eventAt = eventAt;
    }

    /**
     * 返回 action 类型
     * @generated 2018年3月25日 10:55:18
     */
    public String getAction() {
        
        return action;
    }

    /**
     * 设置类型
     *
     * @param action
     * @generated 2018年3月25日 10:55:18
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
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

    /**
     * 返回 sign_time 签到
     * @generated 2018年3月25日 10:55:18
     */
    public Date getSignTime() {
        
        return signTime;
    }

    /**
     * 设置签到
     *
     * @param signTime
     * @generated 2018年3月25日 10:55:18
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * 返回 leave_time 退出时间
     * @generated 2018年3月25日 10:55:18
     */
    public Date getLeaveTime() {
        
        return leaveTime;
    }

    /**
     * 设置退出时间
     *
     * @param leaveTime
     * @generated 2018年3月25日 10:55:18
     */
    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }
}