drop table if exists tb_springboot_demo;
create table tb_springboot_demo
(
    id             int   not null comment 'ID' primary key,
    user_name       varchar(64)   not null comment '命令',
    password       varchar(64)   not null comment '密码'
)
    comment '测试表';
