package com.sparta.mm.week3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionsManager {
    private static Connection connection;

    public static Connection getConnection() {
        String url = PropertiesLoader.getProperties().getProperty("url");
        String username = PropertiesLoader.getProperties().getProperty("root");
        String password = PropertiesLoader.getProperties().getProperty("root");

        try{
            connection = DriverManager.getConnection(url, name, password);
        } catch(SQLException e){
            return connection;
        }
    }
    public static void closeConnection(){
        try{
            connection.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

}