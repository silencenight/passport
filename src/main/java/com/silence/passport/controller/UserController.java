package com.silence.passport.controller;

import com.google.gson.Gson;
import com.silence.passport.entity.User;
import com.silence.passport.service.UserService;
import com.silence.passport.util.ResultVOUtil;
import com.silence.passport.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Silence
 * @create 2019-01-17 17:11
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    //添加用户


    //查找所有用户
    @GetMapping("/list")
    public ResultVO<List<User>> list(){
       List<User> userList = userService.findAll();
        return ResultVOUtil.success(userList);
    }
}
