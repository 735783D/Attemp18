package com.example.attemp18;
import javafx.scene.chart.StackedAreaChart;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String protocol = "jdbc";
    private static final String vendorName = ":mysql:";
    private static final String ipAddress = "//localhost:3306";
    private static final String dbName = "usersdb";
    
    private static final String jdbcURL = protocol + vendorName + ipAddress + dbName;
    
    private static final String MYSQLJBCDriver = "com.mysql.jdbc.Driver";
    
    private static final String username = "root";
    private static final String password = "toor";
    private static Connection conn = null;
    
    public static Connection ConnectDb(){

            try {
                Class.forName(MYSQLJBCDriver);

                conn = DriverManager.getConnection(jdbcURL, username, password);
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs");
                System.out.println("Connection Successful");
            }catch (SQLException e){
                e.printStackTrace();

            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            return conn;
        }
}
