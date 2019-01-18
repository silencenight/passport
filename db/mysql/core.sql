# Host: localhost  (Version 5.7.21)
# Date: 2019-01-18 09:08:05
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "sys_user"
#
---系统用户表
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(64) NOT NULL COMMENT '用户id',
  `login_name` varchar(16) NOT NULL DEFAULT '' COMMENT '登录名称',
  `passwd` varchar(16) NOT NULL COMMENT '密码',
  `full_name` varchar(16) DEFAULT NULL COMMENT '姓名',
  `phone` varchar(16) NOT NULL COMMENT '手机号',
  `email` varchar(32) NOT NULL COMMENT '邮箱',
  `pic` varchar(128) DEFAULT NULL COMMENT '头像url',
  `create_user` varchar(64) NOT NULL COMMENT '创建人',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统-用户表';

#
# Data for table "sys_user"
#

INSERT INTO `sys_user` VALUES ('10000','zlg','123','zlg','18910707000','123@qq.com','http://127.0.0.1:80/xx.png','admin','2019-01-17 15:59:35','2019-01-17 15:59:35'),('10001','silence','123','silence','18910707023','456@qq.com',NULL,'junit test','2019-01-17 16:00:51','2019-01-17 16:53:36'),('10002','xiao','123','小明','18910707824','123@qq.com','http://127.0.0.1:80/pp.png','admin','2019-01-17 17:11:23','2019-01-17 17:11:23');
