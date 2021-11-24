package fr.epsi.b3.bdd;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourcePgSQL {
    static Connection conn;

    public static Connection initializationConnection(DataSource dataSource){
        if(conn == null){
            try {
                conn = dataSource.getConnection();
                System.out.println("Connected to the PostgreSQL server successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
    public static Connection initializationConnection(){
        return initializationConnection(null);
    }
}
