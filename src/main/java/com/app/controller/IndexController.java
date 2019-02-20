package com.app.controller;


import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @Package com.app.controller
 * @ClassName IndexController
 * @Author shaobin.wang
 * @Date 2019/02/13 16:40
 * @Version 1.0
 * @Description: 首页
 **/
//@RestController 该注解用于直接返回json数据
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String hello(ModelMap modelMap) {
        modelMap.addAttribute("list", userService.getUserList());
        return "index";
    }
}
