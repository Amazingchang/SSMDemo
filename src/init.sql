create table `user_info` (
  `id` int(11) not null auto_increment comment '用户id',
  `user_name` varchar(50)  null comment '用户名',
  `password` varchar(50)  null comment '密码',
	`photo` varchar(200) null comment '头像',
	`sex` varchar(10)  null comment '性别',
	`birth` date  null comment '生日',
	`email` varchar(50)  null comment '邮箱',
	`create_time`  timestamp  null comment '创建时间',
  primary key (`id`)
) engine=innodb auto_increment=1 default charset=utf8 comment='用户信息表';