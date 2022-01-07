import models.bean.Aluno;
import models.dao.AcademicDAO;

public class App {
    public static void main(String[] args) throws Exception 
    {               
        
        AcademicDAO.getInstance().DeleteDatabase();
        AcademicDAO.getInstance().initializeDatabase();      

        mostrarAlunosENotas();
    }

    public static void mostrarAlunosENotas()
    {
        var listaDeAlunos = AcademicDAO.getInstance().findAll();

        for (Aluno aluno : listaDeAlunos) 
        {
            System.out.println(aluno.getNome());
        }
    }
    
}

