drop table exchange_value if exists;

create table exchange_value (id bigint not null, conversion_multiple decimal(19,2), currency_from varchar(255), port integer, currency_to varchar(255), primary key (id));


Insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port) values(1001,'USD','COP',10,0);
Insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port) values(1002,'EUR','COP',10,0);
Insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port) values(1003,'AUD','COP',10,0);