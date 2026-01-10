package AdvanceJava.Statement;

import java.sql.*;

public class Update_Statement {

    private static final String url = "jdbc:mysql://localhost:3306/xabidb";
    private static final String username = "root";
    private static final String password = "Fuckyoubitch@9821"; // ️ Avoid exposing passwords publicly

    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Unable to load JDBC driver");
        }
        // Establish connection
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create SQL statement
            Statement statement = connection.createStatement();
            String query = String.format("UPDATE students SET marks = %f WHERE id = %d", 90.2, 1);


            // Execute the query
            int rowsAffected = statement.executeUpdate(query);

            // Check result
            if (rowsAffected > 0) {
                System.out.println("Data Updated successfully!");
            } else {
                System.out.println("Data Updating failed.");
            }
        }
        catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }

    }

}

