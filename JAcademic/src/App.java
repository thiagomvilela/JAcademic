import java.util.Scanner;
import models.dao.AcademicDAO;
import models.dao.StudentDAO;

public class App {
    public static void main(String[] args) throws Exception 
    {

        AcademicDAO.getInstance().initializeDatabase();
        
        mostrarAlunosENotas();
    }

    public static void mostrarAlunosENotas()
    {
        for (var s : StudentDAO.getInstance().findAll()) 
        {
            System.out.println(s);
        }
    }

    public static void alterarStatusDoAluno()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("ESCOLHA O ID DO ALUNO QUE DESEJA ALTERAR: ");
        var id_student = s.nextInt();

        System.out.println("ESCOLHA [1] APROVADO [0] REPROVADO: ");

        String status;

        if (s.nextInt() == 1) 
        {
            status = "Aprovado";
        }
        else 
        {
            status = "Reprovado";
        }

        StudentDAO.getInstance().alterStatus(status, id_student);
    }

    public static void deletarAluno()
    {
        System.out.println("QUAL ID DO ALUNO QUE DESEJA DELETAR: ");
        StudentDAO.getInstance().deleteStudent(new Scanner(System.in).nextInt());
    }

    public static void adicionarNotas()
    {
        int id_student;
        double first_note, second_note, recuperation_note;
        String status;

        System.out.println("QUAL ID DO ALUNO QUE DESEJA ADICIONAR NOTAS: ");
        id_student = new Scanner(System.in).nextInt();

        System.out.println("PRIMEIRA NOTA: " );
        first_note = new Scanner(System.in).nextDouble();
        
        System.out.println("SEGUNDA NOTA: " );
        second_note = new Scanner(System.in).nextDouble();  

        System.out.println("PRIMEIRA NOTA: " );
        recuperation_note = new Scanner(System.in).nextDouble();  

        System.out.println("PRIMEIRA NOTA: " );
        status = new Scanner(System.in).next();  

        StudentDAO.getInstance().addNotes(id_student, first_note, second_note, recuperation_note, status);
    }
}
