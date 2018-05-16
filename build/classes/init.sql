--mysql数据库初始化脚本
--classes
CREATE TABLE `classes` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(255) DEFAULT NULL,
  KEY `class_id` (`class_id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;

insert  into `classes`(`class_id`,`class_name`) values (1001,'一班'),(1002,'二班');
commit;

--student
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  KEY `student_id` (`student_id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=10004 DEFAULT CHARSET=utf8;

insert  into `student`(`student_id`,`name`,`age`,`class_id`) values (10001,'张三',20,1001),(10002,'李四',21,1001),(10003,'王五',22,1002);
commit;

---------------------------------------

--credit_limit
CREATE TABLE `credit_limit` (
  `id` bigint(18) NOT NULL COMMENT '授信额度ID',
  `credit_limit_num` varchar(128) DEFAULT NULL COMMENT '授信额度编号',
  `customer_name` varchar(80) DEFAULT NULL COMMENT '客户名称',
  `customer_id` varchar(12) DEFAULT NULL COMMENT '客户编号',
  `start_date` date DEFAULT NULL COMMENT '起始日期',
  `expiration_date` date DEFAULT NULL COMMENT '到期日期',
  `term` int(11) DEFAULT NULL COMMENT '期限',
  `term_unit_cd` varchar(6) DEFAULT NULL COMMENT '期限单位代码',
  `credit_limit` decimal(18,2) DEFAULT NULL COMMENT '总额度',
  `available_limit` decimal(18,2) DEFAULT NULL COMMENT '可用额度',
  `outstnd_limit` decimal(18,2) DEFAULT NULL COMMENT '已用额度',
  `currency_cd` varchar(3) DEFAULT NULL COMMENT '币种',
  `limit_status_cd` varchar(1) DEFAULT NULL COMMENT '额度状态代码',
  `channel_type` varchar(2) DEFAULT NULL COMMENT '渠道标识',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT NULL COMMENT '更新者',
  `modify_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(512) DEFAULT NULL COMMENT '备注',
  `old_credit_limit_num` varchar(128) DEFAULT NULL COMMENT '原额度编号',
  `invalid_term` int(11) DEFAULT NULL COMMENT '触发失效期限',
  `customer_type_cd` varchar(4) DEFAULT NULL COMMENT '客户类型代码',
  `identy_ind` varchar(4) DEFAULT NULL COMMENT '认定标志',
  `freeze_ind` varchar(4) DEFAULT NULL COMMENT '冻结状态',
  `freeze_amt` decimal(18,2) DEFAULT NULL COMMENT '冻结金额',
  `guarantee_method_cd` varchar(20) DEFAULT NULL COMMENT '担保方式代码',
  `guarantee_method_note` varchar(512) DEFAULT NULL COMMENT '担保方式说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='credit_limit : 授信信息表';


INSERT INTO `credit_limit` VALUES (1, 'SX000201708297162171567', '百度公司', '200000025228', '2017-10-22', '2036-5-22', 1, '2', 10000.00, 10000.00, 0.00, 'CNY', '1', '01', '张三', '2017-8-29 16:57:37', '李四', '2017-8-30 14:31:53', '备注', 'SX010201708232489854983', 3, '1000', '0', '1', 0.00, 'danbaocode', '担保说明');
INSERT INTO `credit_limit` VALUES (2, 'SX000201708297162000000', '腾讯公司', '200000025230', '2017-10-22', '2036-5-22', 1, '2', 10000.00, 10000.00, 0.00, 'CNY', '1', '01', '张三', '2017-8-29 16:57:37', '李四', '2017-8-30 14:31:53', '备注', 'SX010201708232489854983', 3, '1000', '0', '1', 0.00, 'danbaocode', '担保说明');
commit;

--credit_product_limit
CREATE TABLE `credit_product_limit` (
  `id` bigint(18) NOT NULL COMMENT '授信产品额度ID',
  `credit_limit_id` bigint(18) DEFAULT NULL COMMENT '授信额度ID',
  `credit_limit_num` varchar(128) DEFAULT NULL COMMENT '授信额度编号',
  `customer_id` varchar(12) DEFAULT NULL COMMENT '客户编号',
  `credit_product` varchar(12) DEFAULT NULL COMMENT '授信产品编号',
  `start_date` date DEFAULT NULL COMMENT '起始日期',
  `expiration_date` date DEFAULT NULL COMMENT '到期日期',
  `term` int(11) DEFAULT NULL COMMENT '期限',
  `term_unit_cd` varchar(6) DEFAULT NULL COMMENT '期限单位代码',
  `credit_limit` decimal(18,2) DEFAULT NULL COMMENT '总额度',
  `available_limit` decimal(18,2) DEFAULT NULL COMMENT '可用额度',
  `outstnd_limit` decimal(18,2) DEFAULT NULL COMMENT '已用额度',
  `currency_cd` varchar(3) DEFAULT NULL COMMENT '币种',
  `revolving_ind` varchar(1) DEFAULT NULL COMMENT '是否可循环',
  `credit_limit_type` varchar(1) DEFAULT NULL COMMENT '额度类型',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT NULL COMMENT '更新者',
  `modify_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(512) DEFAULT NULL COMMENT '备注信息',
  `identy_ind` varchar(4) DEFAULT NULL COMMENT '认定标志',
  `freeze_ind` varchar(4) DEFAULT NULL COMMENT '冻结状态',
  `freeze_amt` decimal(18,2) DEFAULT NULL COMMENT '冻结金额',
  `parent_product_limit_id` bigint(18) DEFAULT NULL COMMENT '父级产品额度编号',
  `limit_status_cd` varchar(4) DEFAULT NULL COMMENT '额度状态代码',
  `product_balance` decimal(18,2) DEFAULT NULL COMMENT '品种余额',
  `product_level` varchar(1) DEFAULT NULL COMMENT '产品分类级别',
  `guarantee_method_cd` varchar(20) DEFAULT NULL COMMENT '担保方式代码',
  `guarantee_method_note` varchar(512) DEFAULT NULL COMMENT '担保方式说明',
  `repayment_type` varchar(6) DEFAULT NULL COMMENT '还款方式',
  `rate` decimal(18,2) DEFAULT NULL COMMENT '最低利率',
  `loan_condition` varchar(400) DEFAULT NULL COMMENT '用款条件说明',
  `risk_rate` decimal(18,2) DEFAULT NULL COMMENT '风险定价',
  `apply_nature_cd` varchar(1) DEFAULT NULL COMMENT '申请性质代码 : 申请性质代码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='credit_product_limit : 授信产品额度';

INSERT INTO `credit_product_limit` VALUES (101, 1, 'SX000201708297162171567', '200000025228', '01', '2017-9-1', '2037-8-29', 1, '2', 10000.00, 10000.00, 0.00, 'CNY', '1', '1', '李1', '2017-9-1 16:59:04', '王1', '2017-8-30 15:06:16', '备注', '0', 'djzt', 0.00, NULL, '1', 0.00, '1', 'danbaocode', '担保说明', '分期', 0.05, '用款条件说明', 0.03, '1');
INSERT INTO `credit_product_limit` VALUES (102, 1, 'SX000201708297162171567', '200000025228', '02', '2017-9-2', '2037-8-29', 1, '2', 10000.00, 10000.00, 0.00, 'CNY', '1', '1', '李2', '2017-9-2 16:59:04', '王2', '2017-8-30 15:06:16', '备注', '1', 'djzt', 0.03, 101, '1', 0.00, '2', 'danbaocode2', '担保说明2', '分期2', 0.04, '用款条件说明2', 0.13, '1');
INSERT INTO `credit_product_limit` VALUES (103, 1, 'SX000201708297162171567', '200000025228', '03', '2017-9-3', '2037-8-29', 1, '2', 1000.00, 1000.00, 0.00, 'CNY', '1', '1', '李3', '2017-9-3 16:59:04', '王3', '2017-8-30 15:06:16', '备注', '2', 'djzt', 0.06, 101, '1', 0.00, '2', 'danbaocode3', '担保说明3', '分期3', 0.03, '用款条件说明3', 0.23, '1');
INSERT INTO `credit_product_limit` VALUES (104, 1, 'SX000201708297162171567', '200000025228', '04', '2017-9-4', '2037-8-29', 1, '2', 2000.00, 2000.00, 0.00, 'CNY', '1', '1', '李4', '2017-9-4 16:59:04', '王4', '2017-8-30 15:06:16', '备注', '2', 'djzt', 0.09, 101, '1', 0.00, '2', 'danbaocode4', '担保说明4', '分期4', 0.02, '用款条件说明4', 0.33, '1');
commit;

--tb_user
 CREATE TABLE `tb_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(18) DEFAULT NULL,
  `sex` CHAR(2) DEFAULT NULL,
  `age` INT(11) DEFAULT NULL,
  PRIMARY KEY  (`id`)
)

INSERT INTO `tb_user` VALUES (1, 'test', '男', 30);
INSERT INTO `tb_user` VALUES (2, 'test', '男', 30);
commit;