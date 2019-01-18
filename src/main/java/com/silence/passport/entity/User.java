package com.silence.passport.entity;

import lombok.Data;

/**
 * @author Silence
 * @create 2019-01-17 11:30
 */
@Data
public class User {

    /** 用户id.**/
    private String id;

    /** 登录名称. **/
    private String loginName;

    /** 登录密码. **/
    private String passwd;

    /** 姓名. **/
    private String fullName;

    /** 电话. **/
    private String phone;

    /** 邮箱. **/
    private String email;

    /** 头像. **/
    private String pic;

    /** 创建人. **/
    private String createUser;
}
