create table Company(
    Company_id int(10),
    Company_name varchar(100) not null ,
    Company_type varchar(50),
    Company_introduce varchar(500),
    set_time DATE,
    The_registered_capital int(13),
    Legal_representative varchar (20),
    phone_number int(13),
    status int(2),
    primary key (Company_id)
);

create table member(
    member_id int(10),
    member_name varchar(20),
    member_phone int(13),
    member_password varchar(20),
    sex varchar(10),
    set_time DATE,
    Role_id int(10),
    Company_id int(10),
    status int(2),
    primary key (member_id)
);

CREATE TABLE Role(
    Role_id int (10),
    Role_name varchar(20),
    status int(2),
    primary key (Role_id)
);
insert into member values(null,'njq',2132132,'1234','男',now(),1,1,0);
insert into member values(null,'njq',33333333,'1234','男',now(),1,'1');
insert into Company values(null,'瓜皮公司','卖假药','卖老鼠药',now(),1,'njq',1111111);
insert into Company values(null,'傻子公司','卖樟脑丸','卖樟脑丸',now(),2,'zbx',2222222);
create table users(
    id int(11);
    user_name varchar(20),
    password varchar(20),
    flag int(11),
    primary key (user_name)
);
insert into users values (1,'pzh','1234',1);

create table log
(
    log_id            int(10),
    log_name          varchar(20),
    status            int(2),
    log_time          DATE,
    operating_content varchar(30),
    primary key (log_id)
)
insert into log values (null,'修改',0,now(),'商品id:1','pzh')
insert into log values (null,'删除',0,now(),'商品id:1','pzh')
insert into log values (null,'添加',0,now(),'商品','pzh')

CREATE TABLE Adress(
          Adress_id int (10),
          Detailed_address varchar(100),
          phone_number varchar(20),
          name varchar(20),
          primary key (Adress_id)
);




