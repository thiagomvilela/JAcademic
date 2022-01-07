package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import models.bean.Aluno;
import models.service.Helper;

public class AcademicDAO {
    
    private static boolean isInitialize = true;
    private final String nameDatabase;
    private Connection connectionDb;
    private PreparedStatement statement;    
    private ResultSet result;

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
            createTablealunos();
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

    private void createTablealunos() {
        try 
        {

            connectionDb = ConnectionFactory.getConnectionDataBase();

            useDatabase();            

            statement = connectionDb.prepareStatement(Helper.lerScriptSQL("InitializeDatabase.sql").toString());            
            statement.executeUpdate();

            statement = connectionDb.prepareStatement(Helper.lerScriptSQL("insertAlunos.sql").toString());
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

    public List<Aluno> findAll() 
    {

        var listalunos = new ArrayList<Aluno>();

        try 
        {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            statement = connectionDb.prepareStatement("use " + nameDatabase + ";");
            statement.executeUpdate();

            statement = connectionDb.prepareStatement("SELECT * from alunos");
            result = statement.executeQuery();

            while (result.next()) 
            {
                var aluno = new Aluno();

                aluno.setMatricula(result.getInt("matricula"));
                aluno.setNome(result.getString("nome"));
                aluno.setPrimeira_nota(result.getDouble("primeira_nota"));
                aluno.setSegunda_nota(result.getDouble("segunda_nota"));
                aluno.setNota_recuperacao(result.getDouble("nota_recuperacao"));
                aluno.setSituacao(result.getString("situacao"));             

                listalunos.add(aluno);
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

        return listalunos;

    }

    public Aluno findByMatricula(int matricula)
    {
        var aluno = new Aluno();

        try 
        {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            useDatabase();            

            statement = connectionDb.prepareStatement("SELECT * FROM alunos WHERE matricula = " + matricula);
            statement.executeQuery();

            result = statement.executeQuery();
            
            aluno.setMatricula(result.getInt("matricula"));
            aluno.setNome(result.getString("nome"));
            aluno.setPrimeira_nota(result.getDouble("primeira_nota"));
            aluno.setSegunda_nota(result.getDouble("segunda_nota"));
            aluno.setNota_recuperacao(result.getDouble("nota_recuperacao"));
            aluno.setSituacao(result.getString("situacao"));

        } 
        catch (SQLException e) 
        {
            System.out.println("Erro no findByMatricula: " + e);
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement,result);
        }

        return aluno;
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