package chw.test.security;

import chw.test.model.po.generator.User;
import chw.test.model.vo.ShiroUser;
import chw.test.model.vo.SysUser;
import chw.test.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * <b>创建日期：</b> 2018-11-30 10:41
 * </p>
 *
 * @author 58dj.chw
 **/
public class MyRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;

    /**
     * 验证权限
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String loginName = SecurityUtils.getSubject().getPrincipal().toString();
        if (loginName != null) {
            String userId = SecurityUtils.getSubject().getSession().getAttribute("userSessionId").toString();
            // 权限信息对象,用来存放查出的用户的所有的角色及权限
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            // 用户的角色集合
            ShiroUser shiroUser = (ShiroUser) principalCollection.getPrimaryPrincipal();
            info.setRoles(shiroUser.getRoles());
            info.addStringPermissions(shiroUser.getUrlSet());
            return info;
        }
        return null;
    }

    /**
     * 认证回调函数,登录时调用
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) {
        String username = (String) token.getPrincipal();
        User user = new User();
        SysUser sysUser = new SysUser();
        sysUser.setUsername(username);

        try {
            List<SysUser> users = userService.findByNames(user);
            List<String> roleList = userService.selectRoleNameListByUserId(users.get(0).getId());
            if (users.size() != 0) {
                String pwd = users.get(0).getPassword();
                // 当验证都通过后，把用户信息放在 session 里
                Session session = SecurityUtils.getSubject().getSession();
                session.setAttribute("userSession", users.get(0));
                session.setAttribute("userSessionId", users.get(0).getId());
                session.setAttribute("userRoles", StringUtils.join(roleList, ","));
//                return new SimpleAuthenticationInfo(username, users.get(0).getPassword());
            } else {
                // 没找到该用户
                throw new UnknownAccountException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * 更新用户授权信息缓存.
     */
    @Override
    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
    }

    /**
     * 更新用户信息缓存.
     */
    @Override
    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
        super.clearCachedAuthenticationInfo(principals);
    }

    /**
     * 清除用户授权信息缓存.
     */
    public void clearAllCachedAuthorizationInfo() {
        getAuthorizationCache().clear();
    }

    /**
     * 清除用户信息缓存.
     */
    public void clearAllCachedAuthenticationInfo() {
        getAuthenticationCache().clear();
    }

    /**
     * 清空所有缓存
     */
    @Override
    public void clearCache(PrincipalCollection principals) {
        super.clearCache(principals);
    }

    /**
     * 清空所有认证缓存
     */
    public void clearAllCache() {
        clearAllCachedAuthenticationInfo();
        clearAllCachedAuthorizationInfo();
    }

}
