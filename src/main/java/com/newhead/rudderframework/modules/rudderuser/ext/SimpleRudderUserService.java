package com.newhead.rudderframework.modules.rudderuser.ext;

import com.newhead.rudderframework.core.security.UserStatusEnum;
import com.newhead.rudderframework.core.utils.DigestsUtil;
import com.newhead.rudderframework.core.utils.EncodeUtil;
import com.newhead.rudderframework.modules.rudderuser.base.AbstractRudderUserService;
import com.newhead.rudderframework.modules.rudderuser.base.repository.dao.RudderUserMapper;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * RudderFramework 自动生成
 * 2017年04月21日 03:58:58
 */
@Service
public class SimpleRudderUserService extends AbstractRudderUserService  {
    public static final String HASH_ALGORITHM = "SHA-1";
    public static final int HASH_INTERATIONS = 1024;

    @Autowired
    private RudderUserMapper mapper;

    @Override
    protected RudderUserMapper getMapper() {
        return this.mapper;
    }

    @Override
    protected void saveOrUpdate(RudderUser entity) {
        if (entity.getId()!=null && entity.getId()>0) {
            entity.setStatus(UserStatusEnum.NORMAL.code());
        } else {
            entryptPassword(entity);
        }
    }


    /**
     * 依据用户名得到活动用户
     * @param loginName
     * @return
     */
    public RudderUser getActiveUserByLoginName(String loginName) {
        RudderUserExample rue = new RudderUserExample();
        rue.createCriteria().andRudderuserNameEqualTo(loginName).andStatusEqualTo(UserStatusEnum.NORMAL.code());
        List<RudderUser> uers = mapper.selectByExample(rue);

        if (uers!=null && uers.size()==1)
            return uers.get(0);
        return null;
    }


    public boolean isSysadmin(Long id) {
        if (id==1) {
            return true;
        }
        return false;
    }

    /**
     * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
     */
    protected void entryptPassword(RudderUser user) {
        byte[] salt = DigestsUtil.generateSalt(8);
        user.setSalt(EncodeUtil.encodeHex(salt));

        byte[] hashPassword = DigestsUtil.sha1(user.getPassword().getBytes(), salt, 1024);
        user.setPassword(EncodeUtil.encodeHex(hashPassword));
    }

    /**
     *
     * @param id
     * @return
     */
    public RudderUser getUserById(Long id) {
        RudderUserExample rue = new RudderUserExample();
        rue.createCriteria().andIdEqualTo(id);
        List<RudderUser> uers = mapper.selectByExample(rue);
        if (uers!=null && uers.size()==1)
            return uers.get(0);
        return null;
    }
}
