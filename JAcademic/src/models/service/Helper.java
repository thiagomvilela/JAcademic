package models.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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
}
