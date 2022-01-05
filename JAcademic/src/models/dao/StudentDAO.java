package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import models.bean.Student;

public class StudentDAO
{       
    private final String nameDatabase;
    private Connection connectionDb;
    private PreparedStatement statement;
    private ResultSet result;

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

    public void add(Student student)
    {
        try 
        {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            statement = connectionDb.prepareStatement("use " + nameDatabase + ";");
            statement.executeUpdate();

            statement = connectionDb.prepareStatement("INSERT INTO STUDENTS ( STUDENT_NAME , STUDENT_STATUS ) VALUES (?,?)");

            statement.setString(1, student.getName());
            statement.setBoolean(2, student.isStatus());

            statement.executeUpdate();

            System.out.println("Salvo com sucesso o Aluno: " + student.getName());
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao salvar o Aluno: " + student.getName() + "\nERRO: " + e);
        }
        finally
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }
    }    

    public void addNotes(int id, List<Double> notes)
    {       
        try {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            statement = connectionDb.prepareStatement("use " + nameDatabase + ";");
            statement.executeUpdate();

            String sql = "INSERT INTO NOTES ( NOTE_VALUE, STUDENT_ID) VALUES ";
            for (double note : notes) 
            {            
                sql += " (" + note + " , " + id + "),";                
            }
            sql = sql.substring(0, sql.length()-1);
            statement = connectionDb.prepareStatement(sql);
            statement.executeUpdate();

            System.out.println("Notas adionadas com sucesso ");
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao adionar notas: " + e);
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }
    }

    public void alterStatus(int id, boolean status)
    {
        try {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            statement = connectionDb.prepareStatement("use " + nameDatabase + ";");
            statement.executeUpdate();

            var sql = "UPDATE STUDENTS SET ";
            sql += " STUDENT_STATUS = ?";
            sql += " WHERE STUDENT_ID = ? ;";

            statement = connectionDb.prepareStatement(sql);
            statement.setBoolean(1, status);
            statement.setInt(2, id);

            statement.executeUpdate();

            System.out.println("Mudança de status com realizada com sucesso");
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

    public void delete(int id) 
    {
        try 
        {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            statement = connectionDb.prepareStatement("use " + nameDatabase + ";");
            statement.executeUpdate();

            var sql = "DELETE FROM STUDENTS";
            sql += " WHERE STUDENT_ID = ? ;";

            statement = connectionDb.prepareStatement(sql);
            statement.setInt(1, id);

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

    public List<Student> findAll() {

        var listStudents = new ArrayList<Student>();

        try 
        {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            statement = connectionDb.prepareStatement("use " + nameDatabase + ";");
            statement.executeUpdate();

            statement = connectionDb.prepareStatement("SELECT * FROM STUDENTS");
            result = statement.executeQuery();

            while (result.next()) {
                var student = new Student();

                student.setId(result.getInt("STUDENT_ID"));
                student.setName(result.getString("STUDENT_NAME"));
                student.setStatus(result.getBoolean("STUDENT_STATUS"));

                //Adicionando Notas do Aluno
                statement = connectionDb.prepareStatement("SELECT * FROM NOTES WHERE STUDENT_ID = " + student.getId());
                ResultSet resultQuery2 = statement.executeQuery();

                
                while (resultQuery2.next()) 
                {
                    Double nota = resultQuery2.getDouble("NOTE_VALUE");
                    if(nota != null)
                    {
                        student.notes.add(nota);
                    }                        
                }              

                listStudents.add(student);
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao listar Alunos: " + e);
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement, result);
        }

        return listStudents;

    }

}
