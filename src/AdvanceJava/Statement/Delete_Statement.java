package AdvanceJava.Statement;

import java.sql.*;

public class Delete_Statement {

    private static final String  url = "jdbc:mysql://localhost:3306/xabidb";
    private static final String username = "root";
    private static final String password = "Fuckyoubitch@9821";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query = "DELETE FROM students WHERE ID = 4";

            int rowsAffected = statement.executeUpdate(query);
            if (rowsAffected > 0) {
                System.out.println("Deleted successfully");
            } else {
                System.out.println("Not deleted successfully");
            }

        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
