--create database customer;
--use customer;
create table t_customer(
	id varchar(32) primary key, 
	name varchar(20) not null, 
	gender varchar(6), 
	phone varchar(11),
	email varchar(20),
	description varchar(200)
	);