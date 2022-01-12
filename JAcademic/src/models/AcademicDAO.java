package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import connection.ConnectionFactory;

public class AcademicDAO {
    
    private static boolean isInitialize = true;
    private final String nameDatabase;
    private Connection connectionDb;
    private PreparedStatement statement;    
    private ResultSet result;

    // Singleton
    private static AcademicDAO _academicDAO;

    public static AcademicDAO getInstance() 
    {      
        
		if(_academicDAO == null)
		{
			_academicDAO = new AcademicDAO();
		}
		
		return _academicDAO;

    }

    private AcademicDAO() 
    {
        connectionDb = ConnectionFactory.getConnectionDataBase();
        nameDatabase = "dbAcademicNotes";
    }    
    
    private void createDataBase() 
    {
        try 
        {
            connectionDb = ConnectionFactory.getConnectionDataBase();
            statement = connectionDb.prepareStatement("CREATE DATABASE " + nameDatabase + ";");
            statement.executeUpdate();            
        } 
        catch (SQLException e) 
        {
            // SE DATABASE EXISTIR, NÃO INICIAREMOS ELE NOVAMENTE
            isInitialize = false;
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }
    }

    private void createTablealunos() 
    {
        try 
        {

            connectionDb = ConnectionFactory.getConnectionDataBase();

            useDatabase();            

            statement = connectionDb.prepareStatement(Helper.lerScriptSQL("InitializeDatabase.sql").toString());            
            statement.executeUpdate();

            statement = connectionDb.prepareStatement(Helper.lerScriptSQL("insertAlunos.sql").toString());
            statement.executeUpdate();
            
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao criar Table Alunos: " + e, "Mensagem de Erro Academic Notes", JOptionPane.ERROR_MESSAGE); 
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
            JOptionPane.showMessageDialog(null, "Erro: no use " + nameDatabase + ": " + e, "Mensagem de Erro Academic Notes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void DeleteDatabase() 
    {
        try 
        {
            statement = connectionDb.prepareStatement("DROP DATABASE IF EXISTS " + nameDatabase);
            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o Banco de dados: " + nameDatabase + "\nERRO: " + e, "Mensagem de Erro Academic Notes", JOptionPane.ERROR_MESSAGE);            
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement);
        }

    }
    
    public void initializeDatabase() {

        createDataBase();

        if (isInitialize) 
        {
            createTablealunos();
        }
    }
    
    public String getNameDatabase() 
    {
        return nameDatabase;
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
            JOptionPane.showMessageDialog(null, "Erro ao listar Alunos: " + e, "Mensagem de Erro Academic Notes", JOptionPane.ERROR_MESSAGE); 
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
            result.next();
            
            aluno.setMatricula(result.getInt("matricula"));
            aluno.setNome(result.getString("nome"));
            aluno.setPrimeira_nota(result.getDouble("primeira_nota"));
            aluno.setSegunda_nota(result.getDouble("segunda_nota"));
            aluno.setNota_recuperacao(result.getDouble("nota_recuperacao"));
            aluno.setSituacao(result.getString("situacao"));

        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Erro no findByMatricula: " + e, "Mensagem de Erro Academic Notes", JOptionPane.ERROR_MESSAGE); 
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement,result);
        }

        return aluno;
    }

    public void InserirNota(Aluno aluno) 
    {
    	var _aluno = aluno;

        try 
        {
            connectionDb = ConnectionFactory.getConnectionDataBase();

            useDatabase();            

            statement = connectionDb.prepareStatement(
            		"UPDATE alunos SET\r\n"
            		+ "    primeira_nota = ? ,\r\n"
            		+ "    segunda_nota = ? ,\r\n"
            		+ "    nota_recuperacao = ?,\r\n"
            		+ "    situacao = ?\r\n"
            		+ "    where matricula = ? ;");
            
            statement.setDouble(1, _aluno.getPrimeira_nota());
            statement.setDouble(2, _aluno.getSegunda_nota());
            statement.setDouble(3, _aluno.getNota_recuperacao());
            statement.setString(4, _aluno.getSituacao());
            statement.setInt(5, _aluno.getMatricula());
            
            statement.executeUpdate();          

        } 
        catch (SQLException e) 
        {                       
            JOptionPane.showMessageDialog(null, "Erro no Inserir notas: " + e, "Mensagem de Erro Academic Notes", JOptionPane.ERROR_MESSAGE);
        } 
        finally 
        {
            ConnectionFactory.closeConnectionDataBase(connectionDb, statement,result);
        }

    }
    
    
}