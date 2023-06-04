package edu.ntudp.fit.Lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentInfoByMonth {
    private static final String URL = "jdbc:mysql://localhost:3306/students";
    private static final String USER = "root";
    private static final String PASSWORD = "Ariadna124-20-2";

    public static void main(String[] args) {
        try {
            // Establishing the database connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Getting the birth month from the user (input or hardcoded)
            int birthMonth = 2; // Specify the desired birth month (from 1 to 12)

            // SQL query
            String query = "SELECT * FROM studentsdata WHERE MONTH(`Date of birth`) = ?";

            // Creating a prepared statement
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, birthMonth);

            // Executing the query
            ResultSet resultSet = statement.executeQuery();

            // Processing the result
            while (resultSet.next()) {
                String id = resultSet.getString("ID");
                String firstName = resultSet.getString("First name");
                String lastName = resultSet.getString("Second name");
                String patronymic = resultSet.getString("Patronymic");
                String birthdate = resultSet.getString("Date of birth");
                String bookNumber = resultSet.getString("Book number");
                System.out.println("ID: " + id);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Patronymic: " + patronymic);
                System.out.println("Birthdate: " + birthdate);
                System.out.println("Book Number: " + bookNumber);
                System.out.println("-----------------------");
            }

            // Closing resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


