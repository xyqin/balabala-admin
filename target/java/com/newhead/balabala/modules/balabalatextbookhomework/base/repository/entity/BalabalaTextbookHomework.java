package com.newhead.balabala.modules.balabalatextbookhomework.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 balabala_textbook_homework
 * @generated do_not_delete_during_merge 2017年12月28日 12:00:27
 */
public class BalabalaTextbookHomework implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"主键","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 12:00:27
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"教材ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BalabalaTextbook","field":"textbookName","type":"SingleTree"},"valid":true}
     * @generated 2017年12月28日 12:00:27
     */
    private Long textbookId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"作业名称","checkName":true,"fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月28日 12:00:27
     */
    @NotEmpty(message="作业名称不能为空")
    @Size(max=0,message = "作业名称长度无效")

    private String homeworkName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"作业类型","fieldType":"Enum","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[{"label":"选择题","value":"CHOICE"},{"label":"填空题","value":"FILLIN"},{"label":"听写题","value":"LISTEN"},{"label":"看图造句","value":"SENTENCE"},{"label":"图词对应","value":"CONNECT"},{"label":"认词拼读","value":"WORD"},{"label":"看图读词","value":"PICTURE"},{"label":"阅读文章","value":"ARTICLE"}],"valid":true}
     * @generated 2017年12月28日 12:00:27
     */
    @NotEmpty(message="作业类型不能为空")
    @Size(max=0,message = "作业类型长度无效")

    private String type;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"问题","checkName":true,"fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月28日 12:00:27
     */
    @NotEmpty(message="问题不能为空")
    @Size(max=0,message = "问题长度无效")

    private String question;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"正确答案","checkName":true,"fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月28日 12:00:27
     */
    @NotEmpty(message="正确答案不能为空")
    @Size(max=0,message = "正确答案长度无效")

    private String correct;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"图片","checkName":true,"fieldType":"String","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2017年12月28日 12:00:27
     */
    @NotEmpty(message="图片不能为空")
    @Size(max=0,message = "图片长度无效")

    private String image;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 12:00:27
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 12:00:27
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 12:00:27
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 12:00:27
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2017年12月28日 12:00:27
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 主键
     * @generated 2017年12月28日 12:00:27
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置主键
     *
     * @param id
     * @generated 2017年12月28日 12:00:27
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 textbook_id 教材ID
     * @generated 2017年12月28日 12:00:27
     */
    public Long getTextbookId() {
        
        return textbookId;
    }

    /**
     * 设置教材ID
     *
     * @param textbookId
     * @generated 2017年12月28日 12:00:27
     */
    public void setTextbookId(Long textbookId) {
        this.textbookId = textbookId;
    }

    /**
     * 返回 homework_name 作业名称
     * @generated 2017年12月28日 12:00:27
     */
    public String getHomeworkName() {
        
        return homeworkName;
    }

    /**
     * 设置作业名称
     *
     * @param homeworkName
     * @generated 2017年12月28日 12:00:27
     */
    public void setHomeworkName(String homeworkName) {
        this.homeworkName = homeworkName == null ? null : homeworkName.trim();
    }

    /**
     * 返回 type 作业类型
     * @generated 2017年12月28日 12:00:27
     */
    public String getType() {
        
        return type;
    }

    /**
     * 设置作业类型
     *
     * @param type
     * @generated 2017年12月28日 12:00:27
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 返回 question 问题
     * @generated 2017年12月28日 12:00:27
     */
    public String getQuestion() {
        
        return question;
    }

    /**
     * 设置问题
     *
     * @param question
     * @generated 2017年12月28日 12:00:27
     */
    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    /**
     * 返回 correct 正确答案
     * @generated 2017年12月28日 12:00:27
     */
    public String getCorrect() {
        
        return correct;
    }

    /**
     * 设置正确答案
     *
     * @param correct
     * @generated 2017年12月28日 12:00:27
     */
    public void setCorrect(String correct) {
        this.correct = correct == null ? null : correct.trim();
    }

    /**
     * 返回 image 图片
     * @generated 2017年12月28日 12:00:27
     */
    public String getImage() {
        
        return image;
    }

    /**
     * 设置图片
     *
     * @param image
     * @generated 2017年12月28日 12:00:27
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2017年12月28日 12:00:27
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2017年12月28日 12:00:27
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2017年12月28日 12:00:27
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2017年12月28日 12:00:27
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2017年12月28日 12:00:27
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2017年12月28日 12:00:27
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2017年12月28日 12:00:27
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2017年12月28日 12:00:27
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2017年12月28日 12:00:27
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2017年12月28日 12:00:27
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}