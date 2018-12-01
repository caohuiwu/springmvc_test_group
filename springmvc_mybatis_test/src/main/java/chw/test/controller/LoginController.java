package chw.test.controller;

import chw.test.model.po.User;
import chw.test.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * <p>
 * <b>创建日期：</b> 2018-11-30 17:09
 * </p>
 *
 * @author 58dj.chw
 **/
@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user, Model model){
        boolean login = userService.login(user.getUsername(), user.getPassword());
        if (login){
            model.addAttribute("user", user);
            return "success";
        }
        return "failure";
    }
}
