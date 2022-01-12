package models;

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

    public String getSituacao() 
    {   	    	    	
    	if(primeira_nota == 0 || segunda_nota == 0) 
    	{
    		situacao = "Cursando";
    		return situacao;
    	}    	
    	
		var media = (primeira_nota + segunda_nota) / 2;
    	
    	if(situacao.equals("Cursando")) 
    	{    		
    		if(media >= 7) 
    		{
    			situacao = "Aprovado";
    		}
    		else 
    		{    
    			situacao = "Recuperação";        			
    		} 
    		
    		return situacao;
    	}    	
    	
    	
    	if(media <= 7) 
    	{
    		if(nota_recuperacao == 0) 
    		{
    			situacao = "Recuperação";  
    		}
    		else 
    		{
    			var mediaRecuperacao = media + nota_recuperacao / 2;
    			
    			if(mediaRecuperacao >= 7) 
    			{
    				situacao = "Aprovado";
    			}
    			else 
    			{
    				situacao = "Reprovado";
    			}
    		}    		
    					
			return situacao;
    	}        	       
    	    
    	
        return situacao;
    }
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
        

    @Override
    public String toString() {
    	
    	var aluno = "|Aluno[" + matricula +": " + nome + "|\n";
    	aluno += "Av1: " + primeira_nota + "\n"; 
    	aluno += "Av2: " + segunda_nota + "\n";
    	aluno += "Recuperação: " + nota_recuperacao + "\n";
    	aluno += "Situação: " + getSituacao() + "\n";
    	
    	return aluno;
    }
    
    
}
