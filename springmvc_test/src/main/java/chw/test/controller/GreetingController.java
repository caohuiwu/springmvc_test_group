package chw.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * <b>创建日期：</b> 2018-11-30 15:49
 * </p>
 *
 * @author 58dj.chw
 **/
@Controller
public class GreetingController {

    /**
     * RequestMapping 用来映射一个请求和请求的方法
     * value="/greeting" 表示请求由 greeting 方法进行处理
     */
    @RequestMapping(value="/greeting")
    public String Register(Model model) {  // user:视图层传给控制层的表单对象；model：控制层返回给视图层的对象
        // 在 model 中添加一个名为 "user" 的 user 对象
        Map<String, String> map = new HashMap<>();
        map.put("username", "chw");
        map.put("password", "12432542");
        map.put("age", "1243");
        model.addAttribute("user", map);
        // 返回一个字符串 " success" 作为视图名称
        return "success";
    }

    @RequestMapping(value="/login")
    public String login(Model model) {  // user:视图层传给控制层的表单对象；model：控制层返回给视图层的对象
        // 在 model 中添加一个名为 "user" 的 user 对象
        Map<String, String> map = new HashMap<>();
        map.put("username", "login");
        map.put("password", "login");
        map.put("age", "login");
        model.addAttribute("user", map);
        // 返回一个字符串 " success" 作为视图名称
        return "success";
    }
}
