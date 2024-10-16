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
    endereco varchar(80) not null,
	cidade varchar(80) not null, 
	email varchar(50) unique not null,
	telefone varchar(12) unique,
	senha varchar(20) not null
);


create table consulta(
	id_consulta int primary key auto_increment,
	fk_id_paciente int, foreign key(fk_id_paciente) references paciente(id_paciente),
    fk_nome_medico varchar(50), foreign key(fk_nome_medico) references medico(nome),
	data_consulta varchar(50) not null,
	hora_consulta varchar(10)
);




















insert into paciente(nome, cpf, data_nascimento, endereco, cidade, email, telefone, senha) values 
	('adm', '111', '01/01/2024', 'rua abc, 1', 'São Paulo', 'adm@email.com', '11111111111', '123'),
('enzo', '222', '02/01/2024', 'rua def, 2', 'Rio de Janeiro', 'enzo@email.com', '22222222222', '123'),
('inácio', '333', '03/01/2024', 'rua ghi, 3', 'Belo Horizonte', 'inácio@email.com', '333333333333', '123'),
('teruel', '444', '04/01/2024', 'rua jkl, 4', 'São Paulo', 'teruel@email.com', '44444444444', '123'),
('bruce wayne', '555', '05/01/2024', 'rua mno, 5', 'Rio de Janeiro', 'batman@email.com', '55555555555', '123'),
('tony stark', '666', '06/01/2024', 'rua pqr, 6', 'Belo Horizonte', 'ironman@email.com', '666666666666', '123'),
('mary jane', '777', '07/01/2024', 'rua stu, 7', 'São Paulo', 'mary@email.com', '77777777777', '123'),
('peter parker', '888', '08/01/2024', 'rua vwx, 8', 'Rio de Janeiro', 'spiderman@email.com', '88888888888', '123'),
('olivia palito', '999', '09/01/2024', 'rua yz, 9', 'Belo Horizonte', 'popeye@email.com', '9999999999', ''),
('michelle obama', '101010', '10/01/2024', 'rua obama, 10', 'São Paulo', 'obama@email.com', '12345678912', '123');
    
insert into medico(crm, nome, cpf, especialidade, data_nascimento, cidade_atuacao, email, telefone, senha) values
	('111','adm', '12121212121', 'administrador', '01/01/2024', 'São Paulo', 'admin@email.com', '40028922', '123'),
('222','souza da costa', '23232323232', 'cardiologista', '02/01/2024', 'Rio de Janeiro', 'souza@email.com', '27839253', '123'),
('333','claudia maria', '45454545454', 'neurologista', '03/01/2024', 'Belo Horizonte', 'claudia@email.com', '13014534', '123'),
('444','rebeca bonasera', '56565656565', 'cardiologista', '04/01/2024', 'São Paulo', 'rebeca@email.com', '40028923', '123'),
('555','henrico ventura', '78787878787', 'pediatra', '05/01/2024', 'Rio de Janeiro', 'henrico@email.com', '27839254', '123'),
('666','root romulo', '89898989898', 'ortopedista', '06/01/2024', 'Belo Horizonte', 'rromulo@email.com', '13014535', '123'),
('777','cassio ramos', '34343434343', 'otorrinolaringologista', '07/01/2024', 'São Paulo', 'corinthians@email.com', '40028924', '123'),
('888','jessica jones', '67676767676', 'pediatra', '08/01/2024', 'Rio de Janeiro', 'jjones@email.com', '27839255', '123'),
('999','drauzio varella', '19191919191', 'clínico geral', '09/01/2024', 'Belo Horizonte', 'drvarella@email.com', '13014536', '123'),
('101010','gracyanne belo', '37373737373', 'clínico geral', '10/01/2024', 'São Paulo', 'personal@email.com', '40028925', '123');

insert into consulta(fk_id_paciente, fk_nome_medico, data_consulta, hora_consulta) values
(6, 'henrico ventura', '22/05/2024', '12:30'),
(5, 'root romulo', '27/05/2024', '8:30');

insert into medico(crm, nome, cpf, especialidade, data_nascimento, cidade_atuacao, email, telefone, senha) values
('796','João Vitor','796796','fortnite','29/08/1920','Mogi Guaçu','palmeiras1951@mundial.com','79613528','3008');

