package com.silence.passport.service.impl;

import com.silence.passport.entity.User;
import com.silence.passport.mapper.UserMapper;
import com.silence.passport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Silence
 * @create 2019-01-17 17:04
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
