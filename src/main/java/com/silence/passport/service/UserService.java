package com.silence.passport.service;

import com.silence.passport.entity.User;

import java.util.List;

/**
 * @author Silence
 * @create 2019-01-17 16:58
 */
public interface UserService {

    //添加用户
    int add(User user);

    //删除用户

    //修改用户

    //查询一个用户

    //查询所有用户
    List<User> findAll();
}
