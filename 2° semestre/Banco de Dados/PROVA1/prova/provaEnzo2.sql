create database hospital;
use hospital;

create table paciente(
	id_paciente int primary key auto_increment,
    nome varchar(30) not null,
    idade smallint,
    CPF varchar(11) not null,
    cidade varchar(30),
    doenca varchar(50) not null
);
create table medico(
	crm int primary key auto_increment,
    nome varchar(30) not null,
    idade smallint,
    CPF varchar(11) not null,
    especialidade varchar(50) not null,
    cidade varchar(30)
);

create table consulta(
	id_consulta int primary key auto_increment,
    d_consulta date not null,
    h_consulta time not null,
    fk_crm int, foreign key(fk_crm) references medico(crm),
    fk_id_paciente int, foreign key(fk_id_paciente) references paciente(id_paciente)
);
create table medicamento(
	id_medicamento int primary key,
    quantidade int not null,
    fk_crm int, foreign key(fk_crm) references medico(crm),
    fk_id_paciente int, foreign key(fk_id_paciente) references paciente(id_paciente)
);

insert into paciente (nome, idade, CPF, cidade, doenca) values
('Paulo', 20, '22222222222', 'Maringá', 'doencadecoracao'),
('Enzo', 19, '11111111111', 'São Paulo', 'neurose'),
('Souza', 26, '33333333333', 'Parati', 'dengue'),
('Kaik', 18, '44444444444', 'Florianópolis', 'gonorréia' ),
('Guilherme', 21, '55555555555', 'Rio de Janeiro', 'cárie');

insert into medico (crm, nome, idade, CPF, especialidade, cidade) values
(1610, 'Bruno', 69, '23456782345', 'cardiologista', 'São Paulo'),
(2401, 'Rebeca', 22, '12345678910', 'neurologista', 'Mogi Guaçu'),
(2403, 'Jackeline', 25, '01987654321', 'clínico geral','Valinhos'),
(1808, 'Inácio', 23, '77777777777', 'urologista', 'Abaíra'),
(1102,'João Augusto', 21, '55555555555', 'odontologista', 'Jamelão');

insert into consulta (d_consulta, h_consulta, fk_crm, fk_id_paciente) values
('2024-04-05', '09:00', 1610, 1),
('2024-05-06', '10:00', 2401, 2),
('2024-06-07', '11:00', 2403, 3),
('2024-07-08', '8:30', 1808, 4),
('2024-08-09', '9:30', 1102, 5);

insert into medicamento (id_medicamento, quantidade, fk_crm, fk_id_paciente) values
(1, 5, 1610, 1),
(2, 1, 2401, 2),
(3, 3, 2403, 3),
(4, 5, 1808, 4),
(5, 2, 1102, 5);

