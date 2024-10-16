create database piCrud;
use piCrud;
create table medico(
	crm int primary key,
	nome varchar(50) unique not null,
	cpf varchar(11) unique not null,
	especialidade varchar(80) not null,
	data_nascimento varchar(10) not null,
	cidade_atuacao varchar(80) not null,
	email varchar(80) unique not null,
	telefone varchar(12) unique,
	senha varchar(20) not null
);

create table paciente(
	id_paciente int primary key auto_increment,
	nome varchar(50) unique not null, 
	cpf varchar(11) unique not null,
	data_nascimento varchar(10) not null, 
	endereço varchar(80) not null, 
	email varchar(50) unique not null,
	telefone varchar(12) unique,
	senha varchar(20) not null
);

create table remedio(
	id_remedio int Primary key auto_increment,
	nome varchar(50) not null,
	quantidade int not null
);

create table consulta(
	id_consulta int primary key auto_increment,
	fk_id_paciente int, foreign key(fk_id_paciente) references paciente(id_paciente),
	fk_crm int, foreign key(fk_crm) references medico(crm),
	data_consulta varchar(15) not null
);

create table receita(
	id_receita int primary key auto_increment,
	fk_crm int, foreign key(fk_crm) references medico(crm),
	fk_id_paciente int, foreign key(fk_id_paciente) references paciente(id_paciente),
	fk_id_consulta int, foreign key(fk_id_consulta) references consulta(id_consulta),
	data_validade varchar(10) not null
);

insert into paciente(nome, cpf, data_nascimento, endereço, email, telefone, senha) values 
	('admin', '44858533816', '09/01/2005', 'Rua das flores, 0', 'admin@email.com', '40028922', '123');
    
insert into medico(crm, nome, cpf, especialidade, data_nascimento, cidade_atuacao, email, telefone, senha) values
	('777','admin', '44858533816', 'administrador', '09/01/2005', 'São Paulo', 'admin@email.com', '40028922', '123');
    
select * from medico;


