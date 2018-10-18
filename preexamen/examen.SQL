drop database if exists examen;
create database examen;
use examen;

create table Rol(
	Rol 	varchar(30),
    IdRol	int(3) primary key
);
insert into Rol values('Profesor',1);
insert into Rol values('Estudiante',2);
insert into Rol values('Visitante',3);

create table Usuario(
	Usua	varchar(30),
    Contra	varchar(30),
    Correo 	varchar(30),
    Nom		varchar(30),
    ApeP 	varchar(30),
    ApeM	varchar(30),
    Tel		varchar(30),
    Escuela varchar(60),
    MatFav 	varchar(30),
    DepFav	varchar(30),
    IdRol	int(3) null,
    
    foreign key (IdRol) references Rol(IdRol)
);
select * from Usuario;
