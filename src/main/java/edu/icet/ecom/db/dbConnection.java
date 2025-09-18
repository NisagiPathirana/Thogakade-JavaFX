package edu.icet.ecom.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    private static dbConnection instance;

    private Connection connection;

    private dbConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade","root","1234");
    }

    public Connection getConnection(){return connection; }

    public static dbConnection getInstance() throws SQLException {
        if(instance==null){
            instance = new dbConnection();
        }
        return instance;
    }


}
