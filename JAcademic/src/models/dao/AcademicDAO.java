package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.ConnectionFactory;
import models.bean.Student;
import models.service.Helper;

public class AcademicDAO 
{    
    private static boolean isInitialize = true;
    private final String nameDatabase; 
    private Connection connectionDb;
    private PreparedStatement statement;       

    // Singleton
    private static final AcademicDAO INSTANCE = new AcademicDAO();

    public static AcademicDAO getInstance()
    {
        return INSTANCE;
    }

    private AcademicDAO() {
        connectionDb = ConnectionFactory.getConnectionDataBase();
        nameDatabase = "dbAcademicNotes";
    }

    public void initializeDatabase()
    {
        createDataBase();

        if(isInitialize)
        {           
            createTableStudent();
            createTableNote();

            var studentDAO = StudentDAO.getInstance();
            studentDAO.addStudent(new Student("Vinícius Lima"));
            studentDAO.addStudent(new Student("Roberto Braga"));
            studentDAO.addStudent(new Student("Samanta Santos"));
            studentDAO.addStudent(new Student("Thiago Oliveira"));
            studentDAO.addStudent(new Student("Rebeca Andrade"));
            studentDAO.addStudent(new Student("Neymar Francisco"));
            studentDAO.addStudent(new Student("Pedro Lucas"));
            studentDAO.addStudent(new Student("Mateus Silva"));
            studentDAO.addStudent(new Student("Lucas Matos"));
            studentDAO.addStudent(new Student("Letícia Beatriz"));
            studentDAO.addStudent(new Student("Maria Clara"));
            studentDAO.addStudent(new Student("Ana Gabriela"));
            studentDAO.addStudent(new Student("Samantha Araújo"));
            studentDAO.addStudent(new Student("Felipe Santos"));            
        }
    }    

    public String getNameDatabase()
    {
        return nameDatabase;
    }

    private void createDataBase() 
    {        
        try 
        {
            connectionDb = ConnectionFactory.getConnectionDataBase();
            statement = connectionDb.prepareStatement("CREATE DATABASE " + nameDatabase + ";");
            statement.executeUpdate();

            System.out.println("Banco Criado com Sucesso: " + nameDatabase);
        } 
        catch (SQLException e) 
        {
            //SE DATA EXISTS NÂO INICIAREMOS ELE NOVAMENTE
            isInitialize = false;
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);            
        }
    }

    private void createTableStudent()
    {
        try 
        {
            connectionDb = ConnectionFactory.getConnectionDataBase();            
            useDatabase();

            var sql = new StringBuilder();
            sql.append("CREATE TABLE IF NOT EXISTS STUDENT (ID_STUDENT INT NOT NULL AUTO_INCREMENT, NAME_STUDENT VARCHAR(60) NOT NULL, PRIMARY KEY (ID_STUDENT));");

            statement = connectionDb.prepareStatement(sql.toString());
            
            statement.executeUpdate();
            
            System.out.println("Table Student criada com Sucesso");
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao criar Table Student: " +  e);
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }
    }

    private void createTables() 
    {        
        try 
        {

            connectionDb = ConnectionFactory.getConnectionDataBase();
            useDatabase();

            String sql = Helper.lerScriptSQL("");

            statement = connectionDb.prepareStatement(sql.toString());
            statement.executeUpdate();

            System.out.println("Table Note criada com Sucesso");
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao criar Table Note: " + e);
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }
    }

    private void useDatabase()
    {
        try 
        {
            statement = connectionDb.prepareStatement("use " + nameDatabase);
            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro: use " + nameDatabase + ": " + e);
        }
    }

    public void DeleteDatabase() {
        try {
            statement = connectionDb.prepareStatement("DROP DATABASE IF EXISTS " + nameDatabase);
            statement.executeUpdate();

            System.out.println("Banco deletado com Sucesso: " + nameDatabase);
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o Banco de dados: " + nameDatabase + "\nERRO: " + e);
        } finally {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }

    }
}
