package com.silence.passport.vo;

import lombok.Data;

/**
 * 返回前端的对象，包含：用户信息、数据权限、菜单权限
 * @author Silence
 * @create 2019-01-17 17:50
 */
@Data
public class UserVO {

    /** 用户id.*/
    private String id;

    /** 登录名称. */
    private String loginName;

    /** 登录密码. */
    private String passwd;

    /** 姓名. */
    private String fullName;

    /** 电话. */
    private String phone;

    /** 邮箱. */
    private String email;

    /** 头像. */
    private String pic;

    /** 创建人. */
    private String createUser;


    /** 数据权限. */
    /** 菜单权限. */

}
