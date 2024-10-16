use estudo_aulas;
CREATE TABLE Vendas (
 ID int Primary Key,
 Nome_Vendedor Varchar(20),
 Quantidade Int,
 Produto Varchar(20),
 Cidade Varchar(20) );
 INSERT INTO Vendas (ID, Nome_Vendedor, Quantidade, Produto, 
Cidade) VALUES 
(10,'Jorge',1400,'Mouse','São Paulo'),
 (12,'Tatiana',1220,'Teclado','São Paulo'),
 (14,'Ana',1700,'Teclado','Rio de Janeiro'),
 (15,'Rita',2120,'Webcam','Recife'),
 (18,'Marcos',980,'Mouse','São Paulo'),
 (19,'Carla',1120,'Webcam','Recife'),
 (22,'Roberto',3145,'Mouse','São Paulo');
select * from vendas;
select cidade, sum(quantidade) as total_vendas_teclado from vendas where produto = 'teclado' group by cidade;
select cidade, sum(quantidade) as total_vendas_rio_sp from vendas where cidade = 'São Paulo' or cidade = 'Rio de Janeiro' group by cidade; 
select avg(quantidade) as media_vendas_sp from vendas where cidade = 'São Paulo';
select max(quantidade) from vendas;
select produto, max(quantidade) as maior_venda from vendas group by produto;
use estudo_aulas;
select nome_vendedor, max(quantidade) as maior_venda from vendas group by nome_vendedor order by max(quantidade) desc;
select * from vendas;
select produto, max(quantidade) as maior_venda from vendas group by produto order by max(quantidade) desc;

use sakila;
select first_name as Nome,last_name as Sobrenome from customer where first_name like 'M%'
order by first_name;
select count(*) from customer where first_name like 'm%';
select first_name as Nome,last_name as Sobrenome from customer where first_name like 'M%'
order by first_name limit 5;
select * from customer where first_name like 'mary';
select * from payment;
select first_name, last_name, payment_id, amount, payment_date from customer, payment where first_name like 'mary';
select first_name, amount from customer,payment where first_name = 'Mary';
select * from category;
select * from film_category;
select * from film;
select category.name, film.title, film.film_id, category.category_id from film, film_category, category
where film.film_id = film_category.film_id and category.category_id = film_category.category_id
order by category.name;


