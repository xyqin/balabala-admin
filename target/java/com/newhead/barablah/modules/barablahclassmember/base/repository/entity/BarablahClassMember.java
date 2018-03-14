package com.newhead.barablah.modules.barablahclassmember.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_class_member
 * @generated do_not_delete_during_merge 2018年3月13日 09:31:59
 */
public class BarablahClassMember implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"开班会员ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月13日 09:31:59
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"开班ID","fieldType":"Object","visible":true,"queryType":2,"displayOrder":0,"length":0,"ref":{"module":"BarablahClass","field":"className","type":"SingleList"},"valid":true}
     * @generated 2018年3月13日 09:31:59
     */
    private Long classId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"会员ID","fieldType":"Object","visible":true,"queryType":2,"displayOrder":0,"length":0,"ref":{"module":"BarablahMember","field":"nickname","type":"SingleList"},"valid":true}
     * @generated 2018年3月13日 09:31:59
     */
    private Long memberId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"状态","fieldType":"Enum","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[{"label":"审核中","value":"IN_REVIEW"},{"label":"审核被拒","value":"REJECTED"},{"label":"进行中","value":"ONGOING"},{"label":"已结束","value":"FINISHED"}],"valid":true}
     * @generated 2018年3月13日 09:31:59
     */
    @NotEmpty(message="状态不能为空")
    @Size(max=0,message = "状态长度无效")

    private String status;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月13日 09:31:59
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月13日 09:31:59
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月13日 09:31:59
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月13日 09:31:59
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月13日 09:31:59
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 开班会员ID
     * @generated 2018年3月13日 09:31:59
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置开班会员ID
     *
     * @param id
     * @generated 2018年3月13日 09:31:59
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 class_id 开班ID
     * @generated 2018年3月13日 09:31:59
     */
    public Long getClassId() {
        
        return classId;
    }

    /**
     * 设置开班ID
     *
     * @param classId
     * @generated 2018年3月13日 09:31:59
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 返回 member_id 会员ID
     * @generated 2018年3月13日 09:31:59
     */
    public Long getMemberId() {
        
        return memberId;
    }

    /**
     * 设置会员ID
     *
     * @param memberId
     * @generated 2018年3月13日 09:31:59
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 返回 status 状态
     * @generated 2018年3月13日 09:31:59
     */
    public String getStatus() {
        
        return status;
    }

    /**
     * 设置状态
     *
     * @param status
     * @generated 2018年3月13日 09:31:59
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年3月13日 09:31:59
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年3月13日 09:31:59
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年3月13日 09:31:59
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年3月13日 09:31:59
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年3月13日 09:31:59
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年3月13日 09:31:59
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年3月13日 09:31:59
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年3月13日 09:31:59
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年3月13日 09:31:59
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年3月13日 09:31:59
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}