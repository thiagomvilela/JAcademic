package models.bean;

public class Aluno {
    
    private int matricula;
    private String nome;
    private double primeira_nota;
    private double segunda_nota;
    private double nota_recuperacao;
    private String situacao;

    //Aplicando Encapsulamento

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrimeira_nota() {
        return primeira_nota;
    }
    public void setPrimeira_nota(double primeira_nota) {
        this.primeira_nota = primeira_nota;
    }

    public double getSegunda_nota() {
        return segunda_nota;
    }
    public void setSegunda_nota(double segunda_nota) {
        this.segunda_nota = segunda_nota;
    }

    public double getNota_recuperacao() {
        return nota_recuperacao;
    }
    public void setNota_recuperacao(double nota_recuperacao) {
        this.nota_recuperacao = nota_recuperacao;
    }

    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
