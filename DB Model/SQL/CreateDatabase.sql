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

create table if not exists note(
	`id_student` int not null,
    `first_note` decimal(4,2),
    `second_note` decimal(4,2),
    `recuperation_note` decimal(4,2),
    `status` varchar(20) default "Cursando",
    foreign key (`id_student`) references student(`id_student`),
    primary key (`id_student`)
);
