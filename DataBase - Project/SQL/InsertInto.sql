/* Insert Into - Student */

INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Arthur Vinícius Bezerra Da Silva');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Beatriz Gonçalves Fontes');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Bruno Cesar Soares Dos Santos');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Camila Pâmela Bacelar Barbosa Farias');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Camila Siqueira Lins');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Carlos Eduardo Da Silva');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Clésio Salles');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Clodoaldo Braga Batista Dos Santos');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Ednilson Vicente Calixto');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Eduardo Henrique Guerra Coitinho');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Elton Emanuel Soares Santos');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Eridiana Angelica Dias Do Nascimento');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Estevão Lucas Ramos Da Silva');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Everton Pedrosa');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Ismael Silva');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Ítalo Silva');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Janderson Araujo');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Joelma Ceciliana De Sena');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Jose Junior');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Larissa Silva');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Leandro José Da Silva Filho');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Luciana Carla Alves Costa De Araújo');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Marcos André Monteiro De Barros');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Maria Letícia Da Silva Manguinho');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Matheus Bezerra');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Matheus Trajano Costa');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Meydson Lenyerge Lima Baracho');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Paulo Carlos Da Silva Filho');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Pedro Moura');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Rackel Ramos');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Reyvson Albuquerque');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Robert França');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Ryan Silva De Menezes');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Tarcisio Varjão Gomes Da Silva Filho');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Thayná Ribeiro Parahyba');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Thiago Vilela');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Vanik Lima');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Vinicius Ferreira De Lima');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Vitória Carla Costa De Lira');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Wagner Vidal Xavier Da Silva');
INSERT INTO `jacademic`.`student` (`name_student`) VALUES ('Yuri Pereira');

/* Insert Into - Teacher*/

INSERT INTO `jacademic`.`teacher` (`name_teacher`) VALUES ('Anderson Apolinio Lira Queiroz');
INSERT INTO `jacademic`.`teacher` (`name_teacher`) VALUES ('Antônio Correia de Sá Barreto Neto');
INSERT INTO `jacademic`.`teacher` (`name_teacher`) VALUES ('Bruno Falcão de Souza Cartaxo');
INSERT INTO `jacademic`.`teacher` (`name_teacher`) VALUES ('Danilo Farias Soares da Silva');
INSERT INTO `jacademic`.`teacher` (`name_teacher`) VALUES ('Flávio Rosendo da Silva Oliveira');
INSERT INTO `jacademic`.`teacher` (`name_teacher`) VALUES ('Jéssica Priscila Rivas dos Santos');
INSERT INTO `jacademic`.`teacher` (`name_teacher`) VALUES ('Mércio Antônio Oliveira de Andrade');

/* Insert Into - Note*/

INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('1', '1', '10', '9', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('2', '1', '8.5', '8.5', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('3', '1', '9', '8', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `final_note`, `status`) VALUES ('4', '1', '5.5', '6', '7.5', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('5', '1', '10', '7.5', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `final_note`, `status`) VALUES ('6', '1', '5', '4', '6.5', 'Reprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('7', '1', '9.5', '7.5', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `final_note`, `status`) VALUES ('8', '1', '6.5', '4', '6', 'Reprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `final_note`, `status`) VALUES ('9', '1', '5.5', '7.5', '8', 'Aprovado');

INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('1', '2', '8.5', '10', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('2', '2', '7.5', '7.5', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('3', '2', '6.5', '7.5', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('4', '2', '7', '8', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `final_note`, `status`) VALUES ('5', '2', '5.5', '7.5', '6.5', 'Reprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `final_note`, `status`) VALUES ('6', '2', '3.5', '2.5', '7', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('7', '2', '4.5', '10', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('8', '2', '6', '8', 'Aprovado');
INSERT INTO `jacademic`.`note` (`id_student`, `id_teacher`, `first_note`, `second_note`, `status`) VALUES ('9', '2', '10', '9', 'Aprovado');
