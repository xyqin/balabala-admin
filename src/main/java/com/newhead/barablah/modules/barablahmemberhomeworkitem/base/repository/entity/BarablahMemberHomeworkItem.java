package com.newhead.barablah.modules.barablahmemberhomeworkitem.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_member_homework_item
 * @generated do_not_delete_during_merge 2018年3月25日 10:55:18
 */
public class BarablahMemberHomeworkItem implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"主键","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月25日 10:55:18
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"会员ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahMember","field":"nickname","type":"SingleList"},"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    private Long memberId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"会员作业ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahMemberHomework","field":"homeworkName","type":"SingleList"},"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    private Long homeworkId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"题目ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahTextbook","field":"textbookName","type":"SingleList"},"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    private Long textbookId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"答案","checkName":true,"fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月25日 10:55:18
     */
    @NotEmpty(message="答案不能为空")
    @Size(max=0,message = "答案长度无效")

    private String answer;

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
     * 返回 id 主键
     * @generated 2018年3月25日 10:55:18
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置主键
     *
     * @param id
     * @generated 2018年3月25日 10:55:18
     */
    public void setId(Long id) {
        this.id = id;
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
     * 返回 homework_id 会员作业ID
     * @generated 2018年3月25日 10:55:18
     */
    public Long getHomeworkId() {
        
        return homeworkId;
    }

    /**
     * 设置会员作业ID
     *
     * @param homeworkId
     * @generated 2018年3月25日 10:55:18
     */
    public void setHomeworkId(Long homeworkId) {
        this.homeworkId = homeworkId;
    }

    /**
     * 返回 textbook_id 题目ID
     * @generated 2018年3月25日 10:55:18
     */
    public Long getTextbookId() {
        
        return textbookId;
    }

    /**
     * 设置题目ID
     *
     * @param textbookId
     * @generated 2018年3月25日 10:55:18
     */
    public void setTextbookId(Long textbookId) {
        this.textbookId = textbookId;
    }

    /**
     * 返回 answer 答案
     * @generated 2018年3月25日 10:55:18
     */
    public String getAnswer() {
        
        return answer;
    }

    /**
     * 设置答案
     *
     * @param answer
     * @generated 2018年3月25日 10:55:18
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
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
}