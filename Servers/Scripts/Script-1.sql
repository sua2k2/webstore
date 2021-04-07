DROP TABLE IF exists customers;

CREATE TABLE customers (
ID VARCHAR(25) PRIMARY KEY,
NAME VARCHAR(50),
address VARCHAR(250),
noOfOrdersMade INT
);


select * from customers;

INSERT INTO customers VALUES (
'C001', 'Park', 'Seoul', 1);
INSERT INTO customers VALUES (
'C002', '김길동', '부산시', 100);
INSERT INTO customers VALUES (
'C003', '최숙자', '충청도', 10000);

select * from products;
