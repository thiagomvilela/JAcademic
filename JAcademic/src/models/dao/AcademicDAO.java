package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.ConnectionFactory;
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
        if(isInitialize)
        {           
            try 
            {
                var sql = "CREATE DATABASE " + nameDatabase
                        + " default character set utf8 default collate utf8_general_ci; ";

                sql = Helper.lerScriptSQL(" ");

                connectionDb = ConnectionFactory.getConnectionDataBase();
                statement = connectionDb.prepareStatement(sql);

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
    }    

    public String getNameDatabase()
    {
        return nameDatabase;
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
