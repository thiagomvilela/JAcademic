/* Table */

CREATE TABLE alunos(
	matricula INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    primeira_nota DECIMAL(4,2),
    segunda_nota DECIMAL(4,2),
    nota_recuperacao DECIMAL(4,2),
    situacao VARCHAR(20) DEFAULT "Cursando"
);
