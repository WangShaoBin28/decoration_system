package com.app.dao;

import com.app.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package com.app.dao
 * @ClassName UserMapper
 * @Author shaobin.wang
 * @Date 2019/02/13 16:44
 * @Version 1.0
 * @Description:
 **/
@Repository
@Mapper
public interface UserMapper {


    List<User> getUserList();

}
