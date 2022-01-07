package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.ConnectionFactory;
import models.service.Helper;

public class AcademicDAO {
    private static boolean isInitialize = true;
    private final String nameDatabase;
    private Connection connectionDb;
    private PreparedStatement statement;

    // Singleton
    private static final AcademicDAO INSTANCE = new AcademicDAO();

    public static AcademicDAO getInstance() {
        return INSTANCE;
    }

    private AcademicDAO() {
        connectionDb = ConnectionFactory.getConnectionDataBase();
        nameDatabase = "dbAcademicNotes";
    }

    public void initializeDatabase() {

        createDataBase();

        if (isInitialize) 
        {
            createTableStudents();
        }
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
            // SE DATA EXISTS NÂO INICIAREMOS ELE NOVAMENTE
            isInitialize = false;
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }
    }

    private void createTableStudents() {
        try 
        {

            connectionDb = ConnectionFactory.getConnectionDataBase();

            useDatabase();            

            statement = connectionDb.prepareStatement(Helper.lerScriptSQL("InitializeDatabase.sql").toString());
            statement.executeUpdate();

            System.out.println("Table Alunos criada com Sucesso");
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao criar Table Alunos: " + e);
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }
    }    

    public void DeleteDatabase() 
    {
        try 
        {
            statement = connectionDb.prepareStatement("DROP DATABASE IF EXISTS " + nameDatabase);
            statement.executeUpdate();

            System.out.println("Banco deletado com Sucesso: " + nameDatabase);
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao deletar o Banco de dados: " + nameDatabase + "\nERRO: " + e);
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }

    }

    public String getNameDatabase() 
    {
        return nameDatabase;
    }

    private void useDatabase() {
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


}