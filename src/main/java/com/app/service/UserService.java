package com.app.service;

import com.app.entity.User;
import com.app.utils.ReturnInfo;

import java.util.List;

/**
 * @Package com.app.service
 * @ClassName UserService
 * @Author shaobin.wang
 * @Date 2019/02/13 16:46
 * @Version 1.0
 * @Description:
 **/
public interface UserService {

    List<User> getUserList();

    ReturnInfo<List<User>> getList();

}
