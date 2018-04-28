create table todo(
id int primary key,
title varchar(20),
todoclassid int,
state int,
create_dt datetime,
modify_dt datetime
);

drop table todoclass;
create table todoclass(
id int primary key,
name varchar(50),
parentid int
);