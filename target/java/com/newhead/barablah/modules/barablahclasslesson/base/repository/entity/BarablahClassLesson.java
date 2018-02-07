package com.newhead.barablah.modules.barablahclasslesson.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_class_lesson
 * @generated do_not_delete_during_merge 2018年2月7日 04:00:55
 */
public class BarablahClassLesson implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"课时ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年2月7日 04:00:55
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"开班ID","fieldType":"Object","visible":true,"queryType":2,"displayOrder":0,"length":0,"ref":{"module":"BarablahClass","field":"className","type":"SingleList"},"valid":true}
     * @generated 2018年2月7日 04:00:55
     */
    private Long classId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课程ID","fieldType":"Object","visible":false,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahCourse","field":"courseName","type":"SingleList"},"valid":true}
     * @generated 2018年2月7日 04:00:55
     */
    @JSONField(serialize=false)
    private Long courseId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"教师ID","fieldType":"Object","visible":false,"queryType":2,"displayOrder":0,"length":0,"ref":{"module":"BarablahTeacher","field":"fullName","type":"SingleList"},"valid":true}
     * @generated 2018年2月7日 04:00:55
     */
    @JSONField(serialize=false)
    private Long teacherId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"教材三级分类ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahTextbookCategory","field":"categoryName","type":"SingleTree"},"valid":true}
     * @generated 2018年2月7日 04:00:55
     */
    private Long categoryId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"外教教师ID","fieldType":"Object","visible":false,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahTeacher","field":"fullName","type":"SingleList"},"valid":true}
     * @generated 2018年2月7日 04:00:55
     */
    @JSONField(serialize=false)
    private Long englishTeacherId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课时名称","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月7日 04:00:55
     */
    @NotEmpty(message="课时名称不能为空")
    @Size(max=0,message = "课时名称长度无效")

    private String lessonName;

    /**
     *
     * {"name":"开始时间","fieldType":"Date","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 04:00:55
     */
    private Date startAt;

    /**
     *
     * {"name":"结束时间","fieldType":"Date","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年2月7日 04:00:55
     */
    private Date endAt;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课时视频缩略图","fieldType":"Image","visible":true,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月7日 04:00:55
     */
    @NotEmpty(message="课时视频缩略图不能为空")
    @Size(max=0,message = "课时视频缩略图长度无效")

    private String thumbnail;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"课时视频","fieldType":"String","visible":false,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月7日 04:00:55
     */
    @JSONField(serialize=false)
    private String video;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"网易云房间","fieldType":"String","visible":false,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年2月7日 04:00:56
     */
    @JSONField(serialize=false)
    private String room;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"是否备课","fieldType":"Bool","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true,"remark":"1已备课，0未备课"}
     * @generated 2018年2月7日 04:00:56
     */
    private Boolean prepared;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"类型","fieldType":"Enum","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[{"label":"线上","value":"ONLINE"},{"label":"线下","value":"OFFLINE"}],"valid":true}
     * @generated 2018年2月7日 04:00:56
     */
    @NotEmpty(message="类型不能为空")
    @Size(max=0,message = "类型长度无效")

    private String type;

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
     * 返回 id 课时ID
     * @generated 2018年2月7日 04:00:55
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置课时ID
     *
     * @param id
     * @generated 2018年2月7日 04:00:55
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 class_id 开班ID
     * @generated 2018年2月7日 04:00:55
     */
    public Long getClassId() {
        
        return classId;
    }

    /**
     * 设置开班ID
     *
     * @param classId
     * @generated 2018年2月7日 04:00:55
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 返回 course_id 课程ID
     * @generated 2018年2月7日 04:00:55
     */
    public Long getCourseId() {
        
        return courseId;
    }

    /**
     * 设置课程ID
     *
     * @param courseId
     * @generated 2018年2月7日 04:00:55
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * 返回 teacher_id 教师ID
     * @generated 2018年2月7日 04:00:55
     */
    public Long getTeacherId() {
        
        return teacherId;
    }

    /**
     * 设置教师ID
     *
     * @param teacherId
     * @generated 2018年2月7日 04:00:55
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 返回 category_id 教材三级分类ID
     * @generated 2018年2月7日 04:00:55
     */
    public Long getCategoryId() {
        
        return categoryId;
    }

    /**
     * 设置教材三级分类ID
     *
     * @param categoryId
     * @generated 2018年2月7日 04:00:55
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 返回 english_teacher_id 外教教师ID
     * @generated 2018年2月7日 04:00:55
     */
    public Long getEnglishTeacherId() {
        
        return englishTeacherId;
    }

    /**
     * 设置外教教师ID
     *
     * @param englishTeacherId
     * @generated 2018年2月7日 04:00:55
     */
    public void setEnglishTeacherId(Long englishTeacherId) {
        this.englishTeacherId = englishTeacherId;
    }

    /**
     * 返回 lesson_name 课时名称
     * @generated 2018年2月7日 04:00:55
     */
    public String getLessonName() {
        
        return lessonName;
    }

    /**
     * 设置课时名称
     *
     * @param lessonName
     * @generated 2018年2月7日 04:00:55
     */
    public void setLessonName(String lessonName) {
        this.lessonName = lessonName == null ? null : lessonName.trim();
    }

    /**
     * 返回 start_at 开始时间
     * @generated 2018年2月7日 04:00:55
     */
    public Date getStartAt() {
        
        return startAt;
    }

    /**
     * 设置开始时间
     *
     * @param startAt
     * @generated 2018年2月7日 04:00:55
     */
    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    /**
     * 返回 end_at 结束时间
     * @generated 2018年2月7日 04:00:55
     */
    public Date getEndAt() {
        
        return endAt;
    }

    /**
     * 设置结束时间
     *
     * @param endAt
     * @generated 2018年2月7日 04:00:55
     */
    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    /**
     * 返回 thumbnail 课时视频缩略图
     * @generated 2018年2月7日 04:00:55
     */
    public String getThumbnail() {
        
        return thumbnail;
    }

    /**
     * 设置课时视频缩略图
     *
     * @param thumbnail
     * @generated 2018年2月7日 04:00:55
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    /**
     * 返回 video 课时视频
     * @generated 2018年2月7日 04:00:55
     */
    public String getVideo() {
        
        return video;
    }

    /**
     * 设置课时视频
     *
     * @param video
     * @generated 2018年2月7日 04:00:56
     */
    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    /**
     * 返回 room 网易云房间
     * @generated 2018年2月7日 04:00:56
     */
    public String getRoom() {
        
        return room;
    }

    /**
     * 设置网易云房间
     *
     * @param room
     * @generated 2018年2月7日 04:00:56
     */
    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    /**
     * 返回 prepared 是否备课
     * @generated 2018年2月7日 04:00:56
     */
    public Boolean getPrepared() {
        
        return prepared;
    }

    /**
     * 设置是否备课
     *
     * @param prepared
     * @generated 2018年2月7日 04:00:56
     */
    public void setPrepared(Boolean prepared) {
        this.prepared = prepared;
    }

    /**
     * 返回 type 类型
     * @generated 2018年2月7日 04:00:56
     */
    public String getType() {
        
        return type;
    }

    /**
     * 设置类型
     *
     * @param type
     * @generated 2018年2月7日 04:00:56
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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