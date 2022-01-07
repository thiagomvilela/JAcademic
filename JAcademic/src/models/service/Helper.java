package models.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionFactory;
import models.dao.AcademicDAO;

public class Helper {
    
    public static String lerScriptSQL(String caminhoDoArquivo)
    {
        var sql = new String();

        Path path = Paths.get(caminhoDoArquivo);
    
        try 
        {
            List<String> linhasArquivo = Files.readAllLines(path);

            for (String linha : linhasArquivo) {
                sql += " " + linha + " ";
            }

        } catch (IOException e) {
            
            System.out.println("Erro na leitura do arquivo: " + caminhoDoArquivo + " => " + e);
        }

        
        return sql;
    }

    private void useDatabase() 
    {
        try 
        {
            var connectionDb = ConnectionFactory.getConnectionDataBase();

            PreparedStatement statement = connectionDb.prepareStatement("use " + AcademicDAO.getInstance());

            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro: use " + AcademicDAO.getInstance() + ": " + e);
        }
    }
}
