package com.silence.passport.mapper;

import com.silence.passport.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setId("10002");
        user.setLoginName("xiao");
        user.setPasswd("123");
        user.setFullName("小明");
        user.setPhone("18910707822");
        user.setEmail("123@qq.com");
        user.setPic("http://127.0.0.1:80/xx.png");
        user.setCreateUser("admin");
        int result = userMapper.add(user);
        Assert.assertEquals(1,result);
    }

    @Test
    public void findAll() {
        List<User> userList = userMapper.findAll();
        Assert.assertNotEquals(0,userList.size());
    }

    @Test
    public void findOne(){
        User user = userMapper.findByPrimaryKey("10001");
        Assert.assertEquals("10001",user.getId());
    }

    @Test
    public void updateTest(){
        User user = new User();
        user.setId("10001");
        user.setLoginName("silence");
        user.setPasswd("123");
        user.setFullName("silence");
        user.setPhone("18910707823");
        user.setEmail("456@qq.com");
        user.setCreateUser("junit test");
        int result = userMapper.updateByPrimaryKey(user);
        Assert.assertEquals(1,result);
    }

    @Test
    public void delTest(){
        int result = userMapper.deleteByPrimaryKey("10002");
        Assert.assertEquals(1,result);
    }
}