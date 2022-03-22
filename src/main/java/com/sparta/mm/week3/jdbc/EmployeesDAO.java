package com.sparta.mm.week3.jdbc;

import java.sql.*;

public class EmployeesDAO {
    private Connection connection;
    private Statement statement;

    public EmployeesDAO(Connection connection) throws SQLException {
        this.connection = connection;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void printAllEmployees() {
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `employees.employees`");
            while(resultSet.next());
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(int id, String username, String password){
        PreparedStatement preparedStatement = connection.preparedStatement(SQLQueries.INSERT_INTO_DB);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, email);
        preparedStatement.execute();

    }
}
