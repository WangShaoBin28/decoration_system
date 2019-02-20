package com.app.service.impl;

import com.app.dao.UserMapper;
import com.app.entity.User;
import com.app.service.UserService;
import com.app.utils.ReturnInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package com.app.service.impl
 * @ClassName UserServiceImpl
 * @Author shaobin.wang
 * @Date 2019/02/13 16:46
 * @Version 1.0
 * @Description:
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public ReturnInfo<List<User>> getList() {
        return ReturnInfo.ofSuccess(userMapper.getUserList());
    }
}
