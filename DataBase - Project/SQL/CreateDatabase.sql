/* Database */

create database if not exists jacademic;

/* Drop */

drop database if exists jacademic;

/* Use */

use jacademic;

/* Tables */

create table if not exists student (
	`id_student` int not null auto_increment,
    `name_student` varchar(60) not null,
	primary key (`id_student`)
);

create table if not exists teacher(
	`id_teacher` int not null auto_increment,
    `name_teacher` varchar(60) not null,
    primary key (`id_teacher`)
);

create table if not exists note(
	`id_student` int not null,
    `id_teacher` int not null,
    `first_note` decimal(4,2) not null,
    `second_note` decimal(4,2) not null,
    `final_note` decimal(4,2),
    `status` varchar(20) not null,
    foreign key (`id_student`) references student(`id_student`),
    foreign key (`id_teacher`) references teacher(`id_teacher`),
    primary key (`id_student`, `id_teacher`)
);
