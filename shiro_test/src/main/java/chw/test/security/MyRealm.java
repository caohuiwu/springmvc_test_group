package chw.test.security;

import chw.test.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * <b>创建日期：</b> 2018-12-07 10:57
 * </p>
 *
 * @author 58dj.chw
 **/
@Service
public class MyRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;

    private static Logger logger = Logger.getLogger(MyRealm.class);


    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String currentUsername = (String)super.getAvailablePrincipal(principals);
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
        if(StringUtils.isNotEmpty(currentUsername)){
            //添加一个角色,不是配置意义上的添加,而是证明该用户拥有admin角色
            String roleName=userService.getRoleByUserName(currentUsername);
            if(StringUtils.isNotEmpty(roleName)){
                simpleAuthorInfo.addRole(roleName);
                logger.info("已为用户["+currentUsername+"]赋予了["+roleName+"]角色");
            }
            //添加权限
            //simpleAuthorInfo.addStringPermission("admin:manage");
            return simpleAuthorInfo;
        }
        return simpleAuthorInfo;
    }
    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取基于用户名和密码的令牌
        //实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
        UsernamePasswordToken authToken = (UsernamePasswordToken)token;
        logger.info("MyRealm.doGetAuthenticationInfo.token="+token);
        //此处无需比对,比对的逻辑Shiro会做,我们只需返回一个和令牌相关的正确的验证信息
        //第一个参数填登录用户名,第二个参数填合法的登录密码
        String username=authToken.getUsername();
        if(StringUtils.isEmpty(username)==false) {
            String password = userService.login(username);
            if(StringUtils.isEmpty(password)==false){
                AuthenticationInfo authInfo = new SimpleAuthenticationInfo(username, password, this.getName());
                return authInfo;
            }
        }
        //没有返回登录用户名对应的SimpleAuthenticationInfo对象时,就会在LoginController中抛出UnknownAccountException异常
        return null;
    }
}