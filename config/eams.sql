/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50704
Source Host           : localhost:3306
Source Database       : eams

Target Server Type    : MYSQL
Target Server Version : 50704
File Encoding         : 65001

Date: 2016-11-01 19:41:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL COMMENT '用户的姓名',
  `age` int(10) DEFAULT NULL COMMENT '年龄',
  `sex` tinyint(2) DEFAULT '1' COMMENT '性别：1表示男，2表示女',
  `origo` varchar(20) DEFAULT NULL COMMENT '籍贯',
  `id_card` varchar(20) DEFAULT NULL COMMENT '身份证',
  `birthdate` date DEFAULT NULL COMMENT '出生日期',
  `company_phone` varchar(20) DEFAULT NULL COMMENT '办公电话',
  `email` varchar(30) DEFAULT NULL COMMENT '电子邮件',
  `mobile_phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `address` varchar(255) DEFAULT NULL COMMENT '家庭地址',
  `qq` varchar(20) DEFAULT NULL COMMENT 'QQ',
  `entry_date` date DEFAULT NULL COMMENT '入职时间',
  `education_level` tinyint(2) DEFAULT NULL COMMENT '教育水平：0：本科（默认），1：硕士，2：博士',
  `employee_type` tinyint(2) DEFAULT NULL COMMENT '员工类型：0：默认为普通员工，参照role_info表中的角色',
  `note` varchar(255) DEFAULT NULL COMMENT '备注',
  `account` varchar(50) NOT NULL COMMENT '登录系统的帐号',
  `password` varchar(50) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `account` (`account`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='员工信息表，根据角色来区分用户类别。';

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '张崇羿', '21', '1', '甘肃', '1234567890', '1995-03-02', '0934-5291031', '1520789@qq.com', '15207986548', '湖北武汉', '1595162753', '2014-09-01', '1', '2', '按时', 'zhang', '123456');

-- ----------------------------
-- Table structure for role_info
-- ----------------------------
DROP TABLE IF EXISTS `role_info`;
CREATE TABLE `role_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `role_num` int(2) NOT NULL DEFAULT '0' COMMENT '角色编码',
  `role_name` varchar(30) NOT NULL COMMENT '角色名',
  `role_description` varchar(255) DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色码：\r\n      0：默认访客\r\n      1：表示管理员\r\n      2：表示老师\r\n      3：表示学生';

-- ----------------------------
-- Records of role_info
-- ----------------------------
