create database hospital;
use hospital;

create table pacientes (
	id_paciente int primary key auto_increment,
    nome varchar(30) not null,
    idade smallint,
    CPF varchar(11) not null,
    cidade varchar(30),
    doenca varchar(50) not null
);
create table medicos(
	crm int primary key auto_increment,
    nome varchar(30) not null,
    idade smallint,
    CPF varchar(11) not null,
    doenca varchar(50) not null,
    cidade varchar(30)
);
create table consultas(
	id_consulta int primary key auto_increment,
    d_consulta date not null,
    h_consulta time not null,
    fk_crm int not null, foreign key(fk_crm) references medicos(crm),
    fk_id_paciente int not null, foreign key(fk_id_paciente) references pacientes(id_paciente)
);
create table medicamentos(
	id_medicamento int primary key auto_increment,
    quantidade int not null,
    fk_crm int not null, foreign key(fk_crm) references medicos(crm),
    fk_id_paciente int not null, foreign key(fk_id_paciente) references pacientes(id_paciente)
);

