# 项目开发过程中，对数据库的操作不要使用鼠标操作方式，变更困难
# 缺陷依赖于执行的当前环境
# create database hd;

# 如果已存在hd这个数据库则先删除
drop database if exists hd;
# 如果不存在hd数据库则创建
create database  if not exists hd;

# 使hd作为当前数据库
use hd;

#  创建表结构
# 创建部门表
drop table if exists department;
create table if not exists department(
                                         did integer auto_increment comment '部门编号',
                                         dname varchar(20) not null unique comment '部门名称',
    duptime timestamp default current_timestamp on update current_timestamp,
    primary key (`did`)
    ) comment '部门表';
# 创建表的约束条件
# alter table department add constraint `pk_dep` primary key (`did`); #创建主键约束

insert into department (dname) values ('财务部'),
                                      ('市场部'),
                                      ('研发部'),
                                      ('后勤部')
                                      ;



drop table if exists employee;
create table if not exists employee(
                                       eid integer auto_increment comment '员工编号',
                                       ename varchar(20) not null unique comment '员工姓名',
    epass varchar(128) not null comment '登录密码',
    edid integer comment '所属部门id',
    euptime timestamp default current_timestamp on update current_timestamp,
    primary key (`eid`)
    ) comment '员工表';
# 创建表的约束条件
# alter table employee add constraint `pk_emp` primary key (`eid`); #创建主键约束
alter table employee add constraint `fk_emp_to_dep` foreign key (`edid`) references department(`did`); #创建外键约束

insert into employee (ename, epass, edid) values ('zs','123',2),
                                                 ('ls','123',2),
                                                 ('ww','123',1),
                                                 ('ml','123',1),
                                                 ('zq','123',1),
                                                 ('qb','123',3)
                                                 ;



drop table if exists info;
create table if not exists info(
                                   iid integer auto_increment comment '员工信息编号',
                                   iphone varchar(11) not null unique comment '电话号码',
    ieid integer comment '所属员工id',
    iuptime timestamp default current_timestamp on update current_timestamp,
    primary key (`iid`)
    ) comment '员工信息表';
# 创建表的约束条件
# alter table employee add constraint `pk_emp` primary key (`eid`); #创建主键约束
alter table info add constraint `fk_inf_to_emp` foreign key (`ieid`) references employee(`eid`); #创建外键约束

insert into info (iphone, ieid) values ('1366666',1),
                                       ('1388888',3),
                                       ('1399999',5)
                                       ;


drop table if exists project;
create table if not exists project(
                                      pid integer auto_increment comment '项目编号',
                                      pname varchar(20) not null unique comment '项目名称',
    puptime timestamp default current_timestamp on update current_timestamp,
    primary key (`pid`)
    ) comment '项目表';
# 创建表的约束条件
# alter table employee add constraint `pk_emp` primary key (`eid`); #创建主键约束

insert into project (pname) values ('java商城'),
                                   ('java外卖'),
                                   ('C++媒体播放器')
                                   ;


drop table if exists matchep;
create table if not exists matchep(
                                      mid integer auto_increment comment 'mid',
                                      meid integer comment '所属员工id',
                                      mpid integer comment '所属项目id',
                                      muptime timestamp default current_timestamp on update current_timestamp,
                                      primary key (`mid`)
    ) comment '员工和项目中间表';
# 创建表的约束条件
# alter table employee add constraint `pk_emp` primary key (`eid`); #创建主键约束
alter table matchep add constraint `fk_mat_to_emp` foreign key (`meid`) references employee(`eid`); #创建外键约束
alter table matchep add constraint `fk_mat_to_pro` foreign key (`mpid`) references project(`pid`); #创建外键约束

insert into matchep (meid, mpid) values (1,2),
                                        (1,3),
                                        (2,2),
                                        (2,1),
                                        (5,1),
                                        (5,2),
                                        (5,3)
                                        ;