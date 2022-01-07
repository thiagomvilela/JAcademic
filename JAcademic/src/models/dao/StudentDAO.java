package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;

public class StudentDAO
{       
    private final String nameDatabase;
    private Connection connectionDb;
    private PreparedStatement statement;

    //Singleton
    private static final StudentDAO INSTANCE = new StudentDAO();

    public static StudentDAO getInstance() 
    {

        return INSTANCE;

    }

    private StudentDAO() 
    {
        var academicDAO = AcademicDAO.getInstance();        
        nameDatabase = academicDAO.getNameDatabase();
        connectionDb = ConnectionFactory.getConnectionDataBase();
    }
    

    public void addNotes(int id_student, double first_note, double second_note, double recuperation_note, String status)
    {       
        try {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            statement = connectionDb.prepareStatement("use " + nameDatabase + ";");
            statement.executeUpdate();

            var sql = new StringBuilder();
            sql.append("INSERT INTO NOTE (ID_STUDENT, FIRST_NOTE, SECOND_NOTE, RECUPERATION_NOTE, STATUS) VALUES (?, ?, ?, ?, ?)");

            statement.setInt(1, id_student);
            statement.setDouble(2, first_note);
            statement.setDouble(3, second_note);
            statement.setDouble(4, recuperation_note);
            statement.setString(5, status);

            statement = connectionDb.prepareStatement(sql.toString());
            statement.executeUpdate();

            System.out.println("Notas adicionadas com sucesso ");
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao adicionar notas: " + e);
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }
    }

    public void alterStatus(String status, int id_student)
    {
        try {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            statement = connectionDb.prepareStatement("use " + nameDatabase + ";");
            statement.executeUpdate();

            var sql = "UPDATE NOTE SET STATUS = ? WHERE ID_STUDENT = ?";

            statement = connectionDb.prepareStatement(sql);
            statement.setString(1, status);
            statement.setInt(2, id_student);

            statement.executeUpdate();

            System.out.println("Mudança de status realizada com sucesso");
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro na Mudança de status");
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }
        
    }

    public void deleteStudent(int id_student) 
    {
        try 
        {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            statement = connectionDb.prepareStatement("use " + nameDatabase + ";");
            statement.executeUpdate();

            var sql = "DELETE FROM STUDENT WHERE STUDENT_ID = ?";

            statement = connectionDb.prepareStatement(sql);
            statement.setInt(1, id_student);

            statement.executeUpdate();

            System.out.println("Deletado com sucesso");
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao Deletar");
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }
        
    }
   

}
