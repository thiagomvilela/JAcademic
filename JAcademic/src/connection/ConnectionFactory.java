package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory {

    //Passando porta de conexão com o banco de dados
    private static String URL = "jdbc:mysql://localhost";
    private static final String USER = "root";
    private static final String PASSWORD = "sidi2022";

    //Not Instance class
    private ConnectionFactory(){}

    public static Connection getConnectionDataBase(){
        
        try 
        {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } 
        
        catch ( SQLException e) 
        {            
            throw new RuntimeException("ERRO CONNECTION DATABASE: ", e);
        } 

    }

    public static void closeConnectionDataBase(Connection connection)
    {
        
        try 
        {

            if(connection != null)
            {
                connection.close();                    
            }

        } 

        catch (SQLException e) 
        {
            throw new RuntimeException("ERRO DISPOSE DATABASE: ", e);
        }    
            
    }

    public static void closeConnectionDataBase(Connection connection, PreparedStatement statement) 
    {

        closeConnectionDataBase(connection);

        try {

            if (statement != null) {

                statement.close();

            }

        }

        catch (SQLException e) {
            throw new RuntimeException("ERRO DISPOSE DATABASE: ", e);
        }

    }

    public static void closeConnectionDataBase(Connection connection, PreparedStatement statement, ResultSet rs) {

        closeConnectionDataBase(connection, statement);

        try {

            if (rs != null) {

                rs.close();

            }

        }

        catch (SQLException e) {
            throw new RuntimeException("ERRO DISPOSE DATABASE: ", e);
        }

    }

}
