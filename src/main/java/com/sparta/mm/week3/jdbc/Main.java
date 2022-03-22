package com.sparta.mm.week3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionsManager.getConnection();
        EmployeesDAO employeesDAO = new EmployeesDAO(ConnectionsManager.getConnection());
        employeesDAO.insert(2,"Neil", "neilweightman@gmail.com");
        employeesDAO.printAllEmployees();
        ConnectionsManager.closeConnection();
}
}


