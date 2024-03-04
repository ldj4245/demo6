SET foreign_key_checks = 0;

DROP TABLE IF EXISTS products;


create table products(
    product_id int not null auto_increment,
    name varchar(100) not null,
    description varchar(200) null,
    price decimal(10,2)not null,
    primary key(product_id)
);


drop table if exists orders;

create table orders(
    order_id int not null auto_increment,
    customer_id int not null,
    ordered_at datetime not null,
    primary key (order_id)
);


drop table if exists order_items;

create table order_items(
    order_item_id int not null auto_increment,
    product_id int not null,
    order_id int not null,
    order_quantity int not null,
    primary key(order_item_id),
    foreign key (order_id) references orders(order_id)
);


drop table if exists customers;

create table customers(
    customer_id int not null auto_increment,
    name varchar(100) not null,
    phone_number varchar(100) null,
    address varchar(100) not null,
    primary key (customer_id)
);







