package com.newhead.rudderframework.core.security;

import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import com.newhead.rudderframework.modules.rudderuser.ext.SimpleRudderUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ling on 2017/4/7.
 */
@RestController
@RequestMapping("/security")
public class SecurityController extends WebController {

    private static final Logger logger = LoggerFactory.getLogger(SecurityController.class);

    @Autowired
    private SimpleRudderUserService userService;

    @ApiOperation(value = "用户登录", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ApiEntity<UserDTO> login(
            @ApiParam(required = true, name = "loginName", value = "登录名") @RequestParam(required = true) String loginName,
            @ApiParam(required = true, name = "password", value = "密码") @RequestParam(required = true) String password,
            HttpServletRequest request
    ) {
        UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
//        token.setRememberMe(true);
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(token);
            currentUser.getSession().setTimeout(60 * 60 * 1000); // Session一小时超时
            if (logger.isDebugEnabled()) {
                logger.debug("User with login name '{}' tried to login but failed.", loginName);
            }
        } catch (AuthenticationException ae) {
            if (logger.isInfoEnabled()) {
                logger.info("User with login name '{}' tried to login but failed.", loginName);
            }
            return new ApiEntity<>(EnumUserError.认证失败.code, EnumUserError.认证失败.msg);
        }
        UserDTO user = new UserDTO();
        BeanUtils.copyProperties((ShiroAuthorizingRealm.ShiroUser) currentUser.getPrincipal(),user);
        user.setAccessToken(request.getSession().getId()); // 以sessionId为AccessToken
        return new ApiEntity<>(user);
    }

    // 用户登录失败时shiro只能跳登录页面，所以配到这里
    @RequestMapping(value = "login-failed", method = RequestMethod.GET)
    public ApiEntity loginFailed() {
        return new ApiEntity(ApiStatus.STATUS_401);
    }

    @ApiOperation(value = "用户登出", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public ApiEntity<UserDTO> logout() {
        Subject me = SecurityUtils.getSubject();
        if (me != null) {
            me.logout();
        }
        return new ApiEntity<>();
    }

    /**
     * 检查用户当前的登录是否有效。
     * 在严格模式下，总是去数据库中查询用户当前的最新状态；否则以session中的状态为准。
     */
    @ApiOperation(value = "检查用户的登录状态", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "check-login", method = RequestMethod.GET)
    public ApiEntity<Boolean> checkLogin(
            @ApiParam(required = true, name = "strict", value = "是否为严格模式") @RequestParam(required = false, defaultValue = "false") boolean strict
    ) {
        ShiroAuthorizingRealm.ShiroUser me = getCurrentUser();
        if (strict && me != null) {
            RudderUser user = userService.getUserById(me.id);
            return new ApiEntity<>(user != null && user.getStatus() == UserStatusEnum.NORMAL.name());
        } else {
            return new ApiEntity<>(me != null && me.status == UserStatusEnum.NORMAL.name());
        }
    }

    // 授权检查未通过时shiro只能跳页面，所以配到这里
    @RequestMapping(value = "access-denied", method = RequestMethod.GET)
    public ApiEntity accessDenied() {
        return new ApiEntity(ApiStatus.STATUS_403);
    }

}
