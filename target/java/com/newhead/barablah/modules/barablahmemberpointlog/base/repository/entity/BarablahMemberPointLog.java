package com.newhead.barablah.modules.barablahmemberpointlog.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_member_point_log
 * @generated do_not_delete_during_merge 2018年3月6日 04:53:26
 */
public class BarablahMemberPointLog implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"会员ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年3月6日 04:53:26
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"会员ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahMember","field":"nickname","type":"SingleList"},"valid":true}
     * @generated 2018年3月6日 04:53:26
     */
    private Long memberId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"积分","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false,"orderkey":true,"remark":""}
     * @generated 2018年3月6日 04:53:26
     */
    private Integer points;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"类型","fieldType":"Enum","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[{"label":"奖杯","value":"TROPHY"},{"label":"鼓掌","value":"CLAPPING"},{"label":"开心","value":"SMILING"}],"valid":true}
     * @generated 2018年3月6日 04:53:26
     */
    @NotEmpty(message="类型不能为空")
    @Size(max=0,message = "类型长度无效")

    private String type;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月6日 04:53:26
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月6日 04:53:26
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月6日 04:53:26
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月6日 04:53:26
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年3月6日 04:53:26
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 会员ID
     * @generated 2018年3月6日 04:53:26
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置会员ID
     *
     * @param id
     * @generated 2018年3月6日 04:53:26
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 member_id 会员ID
     * @generated 2018年3月6日 04:53:26
     */
    public Long getMemberId() {
        
        return memberId;
    }

    /**
     * 设置会员ID
     *
     * @param memberId
     * @generated 2018年3月6日 04:53:26
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 返回 points 积分
     * @generated 2018年3月6日 04:53:26
     */
    public Integer getPoints() {
        
        return points;
    }

    /**
     * 设置积分
     *
     * @param points
     * @generated 2018年3月6日 04:53:26
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * 返回 type 类型
     * @generated 2018年3月6日 04:53:26
     */
    public String getType() {
        
        return type;
    }

    /**
     * 设置类型
     *
     * @param type
     * @generated 2018年3月6日 04:53:26
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年3月6日 04:53:26
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年3月6日 04:53:26
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年3月6日 04:53:26
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年3月6日 04:53:26
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年3月6日 04:53:26
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年3月6日 04:53:26
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年3月6日 04:53:26
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年3月6日 04:53:26
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年3月6日 04:53:26
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年3月6日 04:53:26
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}