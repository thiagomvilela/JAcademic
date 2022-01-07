package models.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Helper {
    
    public static StringBuilder lerScriptSQL(String nomeDoArquivo)
    {
        var sql = new StringBuilder();

        String basePath = new File("").getAbsolutePath();
        basePath = basePath.concat("\\src\\script\\" + nomeDoArquivo);

        Path path = Paths.get(basePath);
    
        try 
        {
            List<String> linhasArquivo = Files.readAllLines(path);

            for (String linha : linhasArquivo) {

                sql.append(linha);

            }

        } catch (IOException e) {
            
            System.out.println("Erro na leitura do arquivo: " + nomeDoArquivo + " => " + e);
        }

        
        return sql;
    }
    
}
