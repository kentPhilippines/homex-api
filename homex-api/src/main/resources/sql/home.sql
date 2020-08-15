/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.24 : Database - home
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`home` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `home`;

/*Table structure for table `home_about` */

DROP TABLE IF EXISTS `home_about`;

CREATE TABLE `home_about` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '数据id',
  `user_id` varchar(32) NOT NULL COMMENT '用户所属',
  `content` text COMMENT '介绍内容',
  `condoImgs` text COMMENT '介绍图片base64格式',
  `time` varchar(48) DEFAULT NULL COMMENT 'office时间',
  `phone` varchar(48) DEFAULT NULL COMMENT 'admin手机号',
  `email` varchar(72) DEFAULT NULL COMMENT '联系邮箱',
  `location` varchar(128) DEFAULT NULL COMMENT 'condo地址',
  `rule_id` varchar(32) DEFAULT NULL COMMENT 'rule唯一标识',
  `rule_text` text COMMENT 'rule内容',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(2) DEFAULT NULL COMMENT '数据状态:    1:数据有效  0  数据无效  【默认有效】',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `home_about` */

/*Table structure for table `home_code` */

DROP TABLE IF EXISTS `home_code`;

CREATE TABLE `home_code` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '数据id',
  `primary` varchar(48) NOT NULL COMMENT '手机号或者邮箱或者其他方式验证方式',
  `code` varchar(12) NOT NULL COMMENT '给用户发送的 code',
  `is_use` int(2) NOT NULL DEFAULT '0' COMMENT '是否被使用：1 使用   0 未使用',
  `root_use` varchar(32) DEFAULT NULL COMMENT 'code用途',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '数据状态:    1:数据有效  0  数据无效  【默认有效】',
  `remark` text,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `home_code` */

/*Table structure for table `home_condo` */

DROP TABLE IF EXISTS `home_condo`;

CREATE TABLE `home_condo` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '数据id',
  `condo_id` varchar(32) NOT NULL COMMENT '物业所属管理区域系统唯一编号',
  `condo_name` varchar(32) NOT NULL COMMENT '物业所属管理区域昵称',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updata_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '数据状态:    1:数据有效  0  数据无效  【默认有效】',
  `remark` text COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `home_condo` */

/*Table structure for table `home_condo_tower` */

DROP TABLE IF EXISTS `home_condo_tower`;

CREATE TABLE `home_condo_tower` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '数据id',
  `condo_id` varchar(32) NOT NULL COMMENT '物业所属管理区域系统唯一编号',
  `condo_name` varchar(32) NOT NULL COMMENT '物业所属管理区域昵称',
  `tower_id` varchar(32) NOT NULL COMMENT '物业所属tower系统唯一编号',
  `tower_name` varchar(32) NOT NULL COMMENT '物业所属towerName系统昵称',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updata_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '数据状态:    1:数据有效  0  数据无效  【默认有效】',
  `remark` text COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `home_condo_tower` */

/*Table structure for table `home_notice` */

DROP TABLE IF EXISTS `home_notice`;

CREATE TABLE `home_notice` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '数据ID',
  `notice_id` varchar(32) NOT NULL COMMENT 'notice_id【广播消息的唯一数据编号】',
  `author_id` varchar(32) NOT NULL COMMENT 'author_id【广播发布者的系统唯一编号，例如这条广播是 】',
  `condo_id` varchar(32) NOT NULL COMMENT 'condo_id【所属公寓的唯一标识，该标识权限为物业系统唯一标识】',
  `to_tower` varchar(24) NOT NULL COMMENT 'tower【该公寓下所属楼栋】',
  `unit_max` varchar(24) DEFAULT NULL COMMENT 'room_max【房间号最大范围】不填写默认为空',
  `unit_min` varchar(24) DEFAULT NULL COMMENT 'room_min【房间号最小范围】不填写为空',
  `subject` varchar(48) NOT NULL COMMENT 'notice标题',
  `content` text COMMENT 'notice内容',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '数据状态:    1:数据有效  0  数据无效  【默认有效】',
  `remark` text COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `home_notice` */

/*Table structure for table `home_query_map` */

DROP TABLE IF EXISTS `home_query_map`;

CREATE TABLE `home_query_map` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '数据id',
  `user_id` varchar(48) NOT NULL COMMENT '地图所属人',
  `condo` varchar(48) DEFAULT NULL COMMENT '公寓+物业【唯一】',
  `tower` varchar(48) DEFAULT NULL COMMENT '公寓+栋 【唯一】',
  `unit` varchar(48) DEFAULT NULL COMMENT '公寓+栋+房间+物业【唯一】',
  `type` int(2) DEFAULT NULL COMMENT '类型：0:account;1:todo;2:notice;3:unit',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '数据状态:    1:数据有效  0  数据无效  【默认有效】',
  `remark` text COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='查询地图';

/*Data for the table `home_query_map` */

/*Table structure for table `home_todo` */

DROP TABLE IF EXISTS `home_todo`;

CREATE TABLE `home_todo` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '数据ID',
  `todo_id` varchar(32) NOT NULL COMMENT 'todo_id【待办事项的唯一数据编号】',
  `author_id` varchar(32) NOT NULL COMMENT 'author_id【待办事项的作者系统唯一编号，例如这条广播是 】',
  `condo_id` varchar(32) NOT NULL COMMENT 'condo_id【所属公寓的唯一标识，该标识权限为物业系统唯一标识】',
  `to_tower` varchar(24) NOT NULL COMMENT 'tower【该公寓下所属楼栋】',
  `unit_max` varchar(24) DEFAULT NULL COMMENT 'room_max【房间号最大范围】不填写默认为空',
  `unit_min` varchar(24) DEFAULT NULL COMMENT 'room_min【房间号最小范围】不填写为空',
  `subject` varchar(48) NOT NULL COMMENT 'todo标题',
  `todo_status` int(2) NOT NULL DEFAULT '2' COMMENT '待办事项状态:    1已完成,0未完成,2计划中  【默认计划中】',
  `content` text COMMENT 'todo内容',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '数据状态:    1:数据有效  0  数据无效  【默认有效】',
  `remark` text COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `home_todo` */

/*Table structure for table `home_unit` */

DROP TABLE IF EXISTS `home_unit`;

CREATE TABLE `home_unit` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '数据id',
  `condo_id` varchar(32) NOT NULL COMMENT 'condoId',
  `tower_id` varchar(32) NOT NULL COMMENT 'towerId',
  `unit_id` varchar(32) NOT NULL COMMENT 'unitId',
  `unit_name` varchar(32) NOT NULL COMMENT 'unitName',
  `area` varchar(24) DEFAULT NULL COMMENT '房屋面积',
  `type` varchar(24) DEFAULT NULL COMMENT '房屋类型1居室，2居室',
  `parking` varchar(24) DEFAULT NULL COMMENT '停车场位置',
  `owner` varchar(42) NOT NULL COMMENT '房屋所有者',
  `owner_contact_no` varchar(32) DEFAULT NULL COMMENT '聯係方式',
  `owner_id_card` varchar(48) DEFAULT NULL COMMENT '房屋所有者ID',
  `owner_email` varchar(48) NOT NULL COMMENT '所屬人郵箱',
  `spa` varchar(24) DEFAULT NULL COMMENT '未知',
  `spa_id_card` varchar(48) DEFAULT NULL COMMENT 'spa的ID信息',
  `spa_contact_no` varchar(32) DEFAULT NULL,
  `spa_email` varchar(48) DEFAULT NULL,
  `tenant` varchar(42) DEFAULT NULL COMMENT '租客信息',
  `tenant_id_card` varchar(48) DEFAULT NULL,
  `tenant_contact_no` varchar(32) DEFAULT NULL,
  `tenant_email` varchar(48) DEFAULT NULL,
  `move_in` datetime DEFAULT NULL COMMENT '搬入日期',
  `move_out` datetime DEFAULT NULL COMMENT '搬出日期',
  `broker` varchar(32) DEFAULT NULL COMMENT '經濟人',
  `broker_contact_no` varchar(48) DEFAULT NULL COMMENT '經紀人聯係方式',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `home_unit` */

/*Table structure for table `home_user` */

DROP TABLE IF EXISTS `home_user`;

CREATE TABLE `home_user` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '数据ID',
  `user_id` varchar(32) NOT NULL COMMENT '用户ID',
  `user_name` varchar(32) NOT NULL COMMENT '用户名称',
  `user_email` varchar(32) NOT NULL COMMENT '用户邮箱【系统唯一】',
  `user_avtar` text COMMENT '用户头像ID',
  `user_phone` varchar(32) NOT NULL COMMENT '用户电话联系方式【系统唯一】',
  `user_role` int(3) NOT NULL COMMENT '用户角色：1超级管理员、2经理、3员工，4物业、5前台，6房东、7租客',
  `user_slat` varchar(24) NOT NULL COMMENT '加密盐',
  `user_password` varchar(72) NOT NULL COMMENT '密码',
  `create_by` varchar(32) DEFAULT NULL COMMENT '账号创建者',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `remark` text COMMENT '备注',
  `status` int(2) DEFAULT '1' COMMENT '数据状态:    1:数据有效  0  数据无效  【默认有效】',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `home_user` */

insert  into `home_user`(`id`,`user_id`,`user_name`,`user_email`,`user_avtar`,`user_phone`,`user_role`,`user_slat`,`user_password`,`create_by`,`create_time`,`update_time`,`remark`,`status`) values (1,'736570559076','kent.liu.philippines@gmail.com','kent.liu.philippines@gmail.com',NULL,'5303412312',1,'1138148882','a1696a0ace133137b104a31accfd03c2',NULL,'2020-08-15 11:06:15','2020-08-15 11:06:15',NULL,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
