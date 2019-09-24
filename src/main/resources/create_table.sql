create database Something;

use Something;


create table customer(
id bigint(20) not null auto_increment,
username varchar (20),
password varchar (20),
email varchar (20),
address varchar (20),
primary key (id)
);


create table customer_login(
id bigint(20) not null auto_increment,
username varchar (20),
password varchar (20),
cust_id bigint (20),
primary key (id),
foreign key (cust_id) references customers(id)
);

