package com.app.controller;

import com.app.entity.User;
import com.app.service.UserService;
import com.app.utils.ReturnInfo;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Package com.app.controller
 * @ClassName ApiController
 * @Author shaobin.wang
 * @Date 2019/02/20 10:48
 * @Version 1.0
 * @Description:
 **/
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUserList")
    public ReturnInfo<List<User>> getList() {

        return userService.getList();
    }
}
