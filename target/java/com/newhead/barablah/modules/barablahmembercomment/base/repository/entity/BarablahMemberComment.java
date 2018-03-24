package com.newhead.barablah.modules.barablahmembercomment.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_member_comment
 * @generated do_not_delete_during_merge 2018年3月24日 04:28:55
 */
public class BarablahMemberComment implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"主键","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月24日 04:28:55
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"班级","fieldType":"Object","visible":true,"queryType":2,"displayOrder":0,"length":0,"ref":{"module":"BarablahClass","field":"className","type":"SingleList"},"valid":true}
     * @generated 2018年3月24日 04:28:55
     */
    private Long classId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"会员ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahMember","field":"nickname","type":"SingleList"},"valid":true}
     * @generated 2018年3月24日 04:28:55
     */
    private Long memberId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"教师ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahTeacher","field":"fullName","type":"SingleList"},"valid":true}
     * @generated 2018年3月24日 04:28:55
     */
    private Long teacherId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"评语内容","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年3月24日 04:28:55
     */
    @NotEmpty(message="评语内容不能为空")
    @Size(max=0,message = "评语内容长度无效")

    private String content;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"学生作业","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahMemberHomework","field":"homeworkName","type":"SingleList"},"valid":true}
     * @generated 2018年3月24日 04:28:55
     */
    private Long memberHomeworkId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"性别","fieldType":"Enum","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[{"label":"班级评论","value":"1"},{"label":"作业评论","value":"2"}],"valid":true}
     * @generated 2018年3月24日 04:28:55
     */
    @Size(max=0,message = "性别长度无效")

    private String commentType;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"积分","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月24日 04:28:55
     */
    private String score;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月24日 04:28:55
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月24日 04:28:55
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月24日 04:28:55
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月24日 04:28:55
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月24日 04:28:55
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 主键
     * @generated 2018年3月24日 04:28:55
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置主键
     *
     * @param id
     * @generated 2018年3月24日 04:28:55
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 class_id 班级
     * @generated 2018年3月24日 04:28:55
     */
    public Long getClassId() {
        
        return classId;
    }

    /**
     * 设置班级
     *
     * @param classId
     * @generated 2018年3月24日 04:28:55
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 返回 member_id 会员ID
     * @generated 2018年3月24日 04:28:55
     */
    public Long getMemberId() {
        
        return memberId;
    }

    /**
     * 设置会员ID
     *
     * @param memberId
     * @generated 2018年3月24日 04:28:55
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 返回 teacher_id 教师ID
     * @generated 2018年3月24日 04:28:55
     */
    public Long getTeacherId() {
        
        return teacherId;
    }

    /**
     * 设置教师ID
     *
     * @param teacherId
     * @generated 2018年3月24日 04:28:55
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 返回 content 评语内容
     * @generated 2018年3月24日 04:28:55
     */
    public String getContent() {
        
        return content;
    }

    /**
     * 设置评语内容
     *
     * @param content
     * @generated 2018年3月24日 04:28:55
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 返回 member_homework_id 学生作业
     * @generated 2018年3月24日 04:28:55
     */
    public Long getMemberHomeworkId() {
        
        return memberHomeworkId;
    }

    /**
     * 设置学生作业
     *
     * @param memberHomeworkId
     * @generated 2018年3月24日 04:28:55
     */
    public void setMemberHomeworkId(Long memberHomeworkId) {
        this.memberHomeworkId = memberHomeworkId;
    }

    /**
     * 返回 comment_type 性别
     * @generated 2018年3月24日 04:28:55
     */
    public String getCommentType() {
        
        return commentType;
    }

    /**
     * 设置性别
     *
     * @param commentType
     * @generated 2018年3月24日 04:28:55
     */
    public void setCommentType(String commentType) {
        this.commentType = commentType == null ? null : commentType.trim();
    }

    /**
     * 返回 score 积分
     * @generated 2018年3月24日 04:28:55
     */
    public String getScore() {
        
        return score;
    }

    /**
     * 设置积分
     *
     * @param score
     * @generated 2018年3月24日 04:28:55
     */
    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年3月24日 04:28:55
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年3月24日 04:28:55
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年3月24日 04:28:55
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年3月24日 04:28:55
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年3月24日 04:28:55
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年3月24日 04:28:55
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年3月24日 04:28:55
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年3月24日 04:28:55
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年3月24日 04:28:55
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年3月24日 04:28:55
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}