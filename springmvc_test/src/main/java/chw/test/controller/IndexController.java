package chw.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * <b>创建日期：</b> 2018-11-30 16:44
 * </p>
 *
 * @author 58dj.chw
 **/
@Controller
public class IndexController {

    @RequestMapping(value="/index")
    public String Register() {
        return "redirect:greeting";
    }
}
