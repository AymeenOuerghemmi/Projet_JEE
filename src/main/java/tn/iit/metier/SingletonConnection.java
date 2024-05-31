package tn.iit.metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
    private static Connection connection;
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projet_jee?useSSL=false&serverTimezone=UTC", 
                "root", 
                "password"
            );
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection to database failed.");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
