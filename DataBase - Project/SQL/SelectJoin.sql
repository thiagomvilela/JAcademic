/* Select Join */

-- Tabela Completa (txt)
select name_student, first_note, second_note, final_note, status, name_teacher from note
join student on student.id_student = note.id_student
join teacher on teacher.id_teacher = note.id_teacher
order by name_student asc, name_teacher asc;

-- Estudantes e seus professores
select student.name_student, teacher.name_teacher from note
join student on student.id_student = note.id_student
join teacher on teacher.id_teacher = note.id_teacher
order by student.name_student asc, teacher.name_teacher asc;

-- Estudantes de um determiado professor
select name_student from note
join student on student.id_student = note.id_student
join teacher on teacher.id_teacher = note.id_teacher
where note.id_teacher = 1
order by name_student asc;

-- A quantidade de estudantes Aprovados ou Reprovados em um determinado professor
select note.status, count(*) from note
join student on student.id_student = note.id_student
join teacher on teacher.id_teacher = note.id_teacher
where note.id_teacher = 2 group by note.status
order by note.status asc;

-- Notas dos estudantes em um determinado professor
select student.name_student, first_note, second_note from note
join student on student.id_student = note.id_student
join teacher on teacher.id_teacher = note.id_teacher
where note.id_teacher = 1
order by student.name_student asc;

-- Estudantes que foram para a recuperação em um determinado professor
select student.name_student, first_note, second_note, final_note, status from note
join student on student.id_student = note.id_student
join teacher on teacher.id_teacher = note.id_teacher
where note.id_teacher = 1 and note.final_note is not null
order by student.name_student asc;

-- Estudantes que reprovaram
select student.name_student, teacher.name_teacher from note
join student on student.id_student = note.id_student
join teacher on teacher.id_teacher = note.id_teacher
where note.status = "Reprovado"
order by student.name_student asc, teacher.name_teacher asc;

-- Estudantes que foram para a recuperação, mas passaram
select student.name_student, teacher.name_teacher from note
join student on student.id_student = note.id_student
join teacher on teacher.id_teacher = note.id_teacher
where note.status = "Aprovado" and note.final_note is not null
order by student.name_student asc, teacher.name_teacher asc;

-- Média de notas
select avg(first_note) from note
where note.id_teacher = 1;

select avg(first_note) from note
where note.id_teacher = 2;
