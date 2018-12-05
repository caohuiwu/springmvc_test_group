package chw.test.controller;

import chw.test.model.po.generator.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * <p>
 * <b>创建日期：</b> 2018-11-30 10:58
 * </p>
 *
 * @author 58dj.chw
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 用户登录
     */
    @RequestMapping("login")
    public String login(User user, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        try {
            if(bindingResult.hasErrors()){
                return "login";
            }
            //使用权限工具进行认证，登录成功后跳到 shiroFilter bean 中定义的 successUrl
            SecurityUtils.getSubject().login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));
            return "redirect:index";
        } catch (AuthenticationException e) {
            redirectAttributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:login";
        }
    }
    /**
     * 注销登录
     */
    @RequestMapping("logout")
    public String logout(RedirectAttributes redirectAttributes ){
        SecurityUtils.getSubject().logout();
        return "redirect:login";
    }



}
