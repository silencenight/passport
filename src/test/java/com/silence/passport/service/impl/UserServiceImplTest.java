package com.silence.passport.service.impl;

import com.silence.passport.entity.User;
import com.silence.passport.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void add() {
        User user = new User();
        user.setId("10002");
        user.setLoginName("xiao");
        user.setPasswd("123");
        user.setFullName("小明");
        user.setPhone("18910707824");
        user.setEmail("123@qq.com");
        user.setPic("http://127.0.0.1:80/pp.png");
        user.setCreateUser("admin");
        int result = userMapper.add(user);
        Assert.assertEquals(1,result);
    }

    @Test
    public void findAll() {
        List<User> userList = userMapper.findAll();
        Assert.assertNotEquals(0,userList.size());
    }
}