/* Table */

CREATE TABLE IF NOT EXISTS alunos(
	matrícula INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    primeira_nota DECIMAL(4,2),
    segunda_nota DECIMAL(4,2),
    nota_recuperação DECIMAL(4,2),
    situação VARCHAR(20) DEFAULT "Cursando"
)DEFAULT CHARSET=utf8 ENGINE=InnoDB;

/* Insert Into */

INSERT INTO alunos (`nome`) VALUES ('Arthur Vinícius Bezerra Da Silva');
INSERT INTO alunos (`nome`) VALUES ('Beatriz Gonçalves Fontes');
INSERT INTO alunos (`nome`) VALUES ('Bruno Cesar Soares Dos Santos');
INSERT INTO alunos (`nome`) VALUES ('Camila Pâmela Bacelar Barbosa Farias ');
INSERT INTO alunos (`nome`) VALUES ('Camila Siqueira Lins');
INSERT INTO alunos (`nome`) VALUES ('Carlos Eduardo Da Silva');
INSERT INTO alunos (`nome`) VALUES ('Clodoaldo Braga Batista Dos Santos');
INSERT INTO alunos (`nome`) VALUES ('Eduardo Henrique Guerra Coitinho ');
INSERT INTO alunos (`nome`) VALUES ('Elton Emanuel Soares Santos');
INSERT INTO alunos (`nome`) VALUES ('Eridiana Angelica Dias Do Nascimento');
INSERT INTO alunos (`nome`) VALUES ('Estevão Lucas Ramos Da Silva');
INSERT INTO alunos (`nome`) VALUES ('Ismael Silva');
INSERT INTO alunos (`nome`) VALUES ('Ítalo Silva');
INSERT INTO alunos (`nome`) VALUES ('Joelma Ceciliana De Sena ');
INSERT INTO alunos (`nome`) VALUES ('Leandro José Da Silva Filho');
INSERT INTO alunos (`nome`) VALUES ('Luciana Carla Alves Costa De Araújo');
INSERT INTO alunos (`nome`) VALUES ('Marcos André Monteiro De Barros');
INSERT INTO alunos (`nome`) VALUES ('Maria Letícia Da Silva Manguinho');
INSERT INTO alunos (`nome`) VALUES ('Meydson Lenyerge Lima Baracho');
INSERT INTO alunos (`nome`) VALUES ('Paulo Carlos Da Silva Filho');
INSERT INTO alunos (`nome`) VALUES ('Rackel Ramos');
INSERT INTO alunos (`nome`) VALUES ('Robert França ');
INSERT INTO alunos (`nome`) VALUES ('Ryan Silva De Menezes');
INSERT INTO alunos (`nome`) VALUES ('Tarcisio Varjão Gomes Da Silva Filho');
INSERT INTO alunos (`nome`) VALUES ('Thayná Ribeiro Parahyba');
INSERT INTO alunos (`nome`) VALUES ('Thiago Vilela');
INSERT INTO alunos (`nome`) VALUES ('Vinicius Ferreira De Lima');
INSERT INTO alunos (`nome`) VALUES ('Vitória Carla Costa De Lira');
INSERT INTO alunos (`nome`) VALUES ('Wagner Vidal Xavier Da Silva');
INSERT INTO alunos (`nome`) VALUES ('Yuri Pereira ');
