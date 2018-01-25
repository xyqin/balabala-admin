package com.newhead.barablah.modules.barablahmember.base.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.newhead.rudderframework.core.domain.AuditableEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * RudderFramework框架自动生成，不允许修改！
 * 表 barablah_member
 * @generated do_not_delete_during_merge 2018年1月25日 02:58:37
 */
public class BarablahMember implements AuditableEntity {
    /**
     *
     * {"viewconfig":{"optype":"1","formid":"1"},"name":"会员ID","fieldType":"Id","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    private Long id;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"校区ID","fieldType":"Object","visible":true,"queryType":0,"displayOrder":0,"length":0,"ref":{"module":"BarablahCampus","field":"campusName","type":"SingleList"},"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    private Long campusId;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"昵称","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    @NotEmpty(message="昵称不能为空")
    @Size(max=0,message = "昵称长度无效")

    private String nickname;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"头像","fieldType":"String","visible":true,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    @NotEmpty(message="头像不能为空")
    @Size(max=0,message = "头像长度无效")

    private String avatar;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"英文名","fieldType":"String","visible":true,"checkName":false,"queryType":2,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    @NotEmpty(message="英文名不能为空")
    @Size(max=0,message = "英文名长度无效")

    private String englishName;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"性别","fieldType":"Enum","visible":true,"queryType":2,"displayOrder":0,"length":0,"types":[{"label":"男","value":"MALE"},{"label":"女","value":"FEMALE"}],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    @NotEmpty(message="性别不能为空")
    @Size(max=0,message = "性别长度无效")

    private String gender;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"生日","fieldType":"String","visible":true,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    @NotEmpty(message="生日不能为空")
    @Size(max=0,message = "生日长度无效")

    private String birthday;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"网易云ID","fieldType":"String","visible":true,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    @NotEmpty(message="网易云ID不能为空")
    @Size(max=0,message = "网易云ID长度无效")

    private String accid;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"网易云登录token","fieldType":"String","visible":true,"checkName":false,"queryType":0,"displayOrder”:0,”length":16,"types":[],"valid":true}
     * @generated 2018年1月25日 02:58:37
     */
    @NotEmpty(message="网易云登录token不能为空")
    @Size(max=0,message = "网易云登录token长度无效")

    private String token;

    /**
     *
     * {"viewconfig":{"optype":"3","formid":"1"},"name":"积分","fieldType":"Number","visible":true,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false,"orderkey":true,"remark":""}
     * @generated 2018年1月25日 02:58:37
     */
    private Integer points;

    /**
     *
     * {"name":"创建时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    @JSONField(serialize=false)
    private Date createdAt;

    /**
     *
     * {"name":"修改时间","fieldType":"Date","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    @JSONField(serialize=false)
    private Date updatedAt;

    /**
     *
     * {"name":"创建者","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    @JSONField(serialize=false)
    private Long creator;

    /**
     *
     * {"name":"修改人","fieldType":"Number","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    @JSONField(serialize=false)
    private Long lastModifier;

    /**
     *
     * {"name":"删除标志","fieldType":"Bool","visible":false,"queryType":0,"displayOrder":0,"length":0,"types":[],"valid":false}
     * @generated 2018年1月25日 02:58:37
     */
    @JSONField(serialize=false)
    private Boolean deleted;

    /**
     * 返回 id 会员ID
     * @generated 2018年1月25日 02:58:37
     */
    public Long getId() {
        
        return id;
    }

    /**
     * 设置会员ID
     *
     * @param id
     * @generated 2018年1月25日 02:58:37
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回 campus_id 校区ID
     * @generated 2018年1月25日 02:58:37
     */
    public Long getCampusId() {
        
        return campusId;
    }

    /**
     * 设置校区ID
     *
     * @param campusId
     * @generated 2018年1月25日 02:58:37
     */
    public void setCampusId(Long campusId) {
        this.campusId = campusId;
    }

    /**
     * 返回 nickname 昵称
     * @generated 2018年1月25日 02:58:37
     */
    public String getNickname() {
        
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname
     * @generated 2018年1月25日 02:58:37
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 返回 avatar 头像
     * @generated 2018年1月25日 02:58:37
     */
    public String getAvatar() {
        
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar
     * @generated 2018年1月25日 02:58:37
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 返回 english_name 英文名
     * @generated 2018年1月25日 02:58:37
     */
    public String getEnglishName() {
        
        return englishName;
    }

    /**
     * 设置英文名
     *
     * @param englishName
     * @generated 2018年1月25日 02:58:37
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * 返回 gender 性别
     * @generated 2018年1月25日 02:58:37
     */
    public String getGender() {
        
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender
     * @generated 2018年1月25日 02:58:37
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 返回 birthday 生日
     * @generated 2018年1月25日 02:58:37
     */
    public String getBirthday() {
        
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday
     * @generated 2018年1月25日 02:58:37
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 返回 accid 网易云ID
     * @generated 2018年1月25日 02:58:37
     */
    public String getAccid() {
        
        return accid;
    }

    /**
     * 设置网易云ID
     *
     * @param accid
     * @generated 2018年1月25日 02:58:37
     */
    public void setAccid(String accid) {
        this.accid = accid == null ? null : accid.trim();
    }

    /**
     * 返回 token 网易云登录token
     * @generated 2018年1月25日 02:58:37
     */
    public String getToken() {
        
        return token;
    }

    /**
     * 设置网易云登录token
     *
     * @param token
     * @generated 2018年1月25日 02:58:37
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * 返回 points 积分
     * @generated 2018年1月25日 02:58:37
     */
    public Integer getPoints() {
        
        return points;
    }

    /**
     * 设置积分
     *
     * @param points
     * @generated 2018年1月25日 02:58:37
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * 返回 created_at 创建时间
     * @generated 2018年1月25日 02:58:37
     */
    public Date getCreatedAt() {
        
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt
     * @generated 2018年1月25日 02:58:37
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 返回 updated_at 修改时间
     * @generated 2018年1月25日 02:58:37
     */
    public Date getUpdatedAt() {
        
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt
     * @generated 2018年1月25日 02:58:37
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 返回 creator 创建者
     * @generated 2018年1月25日 02:58:37
     */
    public Long getCreator() {
        
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator
     * @generated 2018年1月25日 02:58:37
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 返回 last_modifier 修改人
     * @generated 2018年1月25日 02:58:37
     */
    public Long getLastModifier() {
        
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier
     * @generated 2018年1月25日 02:58:37
     */
    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 返回 deleted 删除标志
     * @generated 2018年1月25日 02:58:37
     */
    public Boolean getDeleted() {
        
        return deleted;
    }

    /**
     * 设置删除标志
     *
     * @param deleted
     * @generated 2018年1月25日 02:58:37
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}