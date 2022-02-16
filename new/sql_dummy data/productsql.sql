create table products (id int primary key auto_increment, productname varchar(15),description varchar(15),quantity int,price int(15));
alter table products modify id int NOT NULL DEFAULT 0;
select * from products;
desc products;
drop table product;