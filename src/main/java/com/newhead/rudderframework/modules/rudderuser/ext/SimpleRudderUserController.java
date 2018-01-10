package com.newhead.rudderframework.modules.rudderuser.ext;

import com.newhead.rudderframework.core.utils.DigestsUtil;
import com.newhead.rudderframework.core.utils.EncodeUtil;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.modules.rudderuser.base.AbstractRudderUserController;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import com.newhead.rudderframework.modules.rudderuser.ext.protocol.SimpleRudderUserUpdateRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 2017年04月21日 03:58:58
 */
@Api(tags = "", description = "相关的API")
@RestController
@RequestMapping(value = "/rudderuser", method = RequestMethod.GET)
public class SimpleRudderUserController extends AbstractRudderUserController {
    @Autowired
    private SimpleRudderUserService service;

    @Override
    public SimpleRudderUserService getService() {
        return service;
    }

    /**
     * 更新
     *
     * @param entityDto
     * @return
     */
    @ApiOperation(value = "修改密码", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "updatepwd", method = RequestMethod.POST)
    public ApiEntity updatepwd(@RequestBody UpdatePasswordVo entityDto) {
        RudderUser user = service.getUserById(entityDto.getUserId());
        if (user == null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(), "该用户不存在！");

        }
        byte[] hashPassword = DigestsUtil.sha1(entityDto.getOldpwd().getBytes(), EncodeUtil.decodeHex(user.getSalt()), 1024);
        String pwd = EncodeUtil.encodeHex(hashPassword);
        if (pwd.equals(user.getPassword())) {
            user.setPassword(entityDto.getNewpwd());
            service.entryptPassword(user);
            service.getMapper().updateByPrimaryKey(user);
        } else {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(), "用户密码错误！");
        }
        return new ApiEntity<>();
    }

}
