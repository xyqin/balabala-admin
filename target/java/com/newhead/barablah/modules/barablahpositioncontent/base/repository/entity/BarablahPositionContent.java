package com.newhead.barablah.modules.barablahpositioncontent.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_position_content
 * @generated do_not_delete_during_merge 2018年2月7日 04:00:56
 */
public class BarablahPositionContent implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"内容ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月7日 04:00:56
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"位置ID","fieldType":"Object","visible":true,"queryType":2,"displayOrder":0,"length":0,"ref":{"module":"BarablahPosition","field":"positionName","type":"SingleList"},"valid":true}
     * @generated 2018年2月7日 04:00:56
     */
    private Long positionId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"内容名称","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月7日 04:00:56
     */
    @NotEmpty(message="内容名称不能为空")
    @Size(max=0,message = "内容名称长度无效")

    private String contentName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"内容图片","fieldType":"Image","visible":true,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月7日 04:00:56
     */
    @NotEmpty(message="内容图片不能为空")
    @Size(max=0,message = "内容图片长度无效")

    private String image;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"内容链接地址","fieldType":"String","visible":true,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月7日 04:00:56
     */
    @NotEmpty(message="内容链接地址不能为空")
    @Size(max=0,message = "内容链接地址长度无效")

    private String link;

    /**
     *
     * {"name":"开始时间","fieldType":"Date","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 04:00:56
     */
    private Date startAt;

    /**
     *
     * {"name":"结束时间","fieldType":"Date","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 04:00:56
     */
    private Date endAt;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"排序号","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false,"orderkey":true,"remark":"大数优先"}
     * @generated 2018年2月7日 04:00:56
     */
    private Integer position;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 04:00:56
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 04:00:56
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 04:00:56
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 04:00:56
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 04:00:56
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 内容ID
     * @generated 2018年2月7日 04:00:56
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置内容ID
     *
     * @param id
     * @generated 2018年2月7日 04:00:56
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 position_id 位置ID
     * @generated 2018年2月7日 04:00:56
     */
    public Long getPositionId() {
        
        return positionId;
    }

    /**
     * 设置位置ID
     *
     * @param positionId
     * @generated 2018年2月7日 04:00:56
     */
    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    /**
     * 返回 content_name 内容名称
     * @generated 2018年2月7日 04:00:56
     */
    public String getContentName() {
        
        return contentName;
    }

    /**
     * 设置内容名称
     *
     * @param contentName
     * @generated 2018年2月7日 04:00:56
     */
    public void setContentName(String contentName) {
        this.contentName = contentName == null ? null : contentName.trim();
    }

    /**
     * 返回 image 内容图片
     * @generated 2018年2月7日 04:00:56
     */
    public String getImage() {
        
        return image;
    }

    /**
     * 设置内容图片
     *
     * @param image
     * @generated 2018年2月7日 04:00:56
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * 返回 link 内容链接地址
     * @generated 2018年2月7日 04:00:56
     */
    public String getLink() {
        
        return link;
    }

    /**
     * 设置内容链接地址
     *
     * @param link
     * @generated 2018年2月7日 04:00:56
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * 返回 start_at 开始时间
     * @generated 2018年2月7日 04:00:56
     */
    public Date getStartAt() {
        
        return startAt;
    }

    /**
     * 设置开始时间
     *
     * @param startAt
     * @generated 2018年2月7日 04:00:56
     */
    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    /**
     * 返回 end_at 结束时间
     * @generated 2018年2月7日 04:00:56
     */
    public Date getEndAt() {
        
        return endAt;
    }

    /**
     * 设置结束时间
     *
     * @param endAt
     * @generated 2018年2月7日 04:00:56
     */
    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    /**
     * 返回 position 排序号
     * @generated 2018年2月7日 04:00:56
     */
    public Integer getPosition() {
        
        return position;
    }

    /**
     * 设置排序号
     *
     * @param position
     * @generated 2018年2月7日 04:00:56
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年2月7日 04:00:56
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年2月7日 04:00:56
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年2月7日 04:00:56
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年2月7日 04:00:56
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年2月7日 04:00:56
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年2月7日 04:00:56
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年2月7日 04:00:56
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年2月7日 04:00:56
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年2月7日 04:00:56
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年2月7日 04:00:56
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}