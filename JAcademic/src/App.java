import models.dao.AcademicDAO;
import models.dao.StudentDAO;

public class App {
    public static void main(String[] args) throws Exception 
    {       
                   
        AcademicDAO.getInstance().DeleteDatabase();
        AcademicDAO.getInstance().initializeDatabase();      
        
    }

    public static void mostrarAlunosENotas()
    {
        for (var s : StudentDAO.getInstance().findAll()) 
        {
            System.out.println(s);
        }
    }
    
}

