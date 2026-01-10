package AdvanceJava.Statement;
// using statement interface and retrieve the data from database connecting JDBC

import java.sql.*;

public class Query_Statement {

    private static final String url = "jdbc:mysql://localhost:3306/xabidb";
    private static final String username = "root";
    private static final String password = "Fuckyoubitch@9821";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try
        {
            Connection connection = DriverManager.getConnection(url, username, password);
            java.sql.Statement statement = connection.createStatement();
            String query = "select * from students";
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");
                System.out.println("ID: " + id);
                System.out.println("NAME: " + name);
                System.out.println("AGE: " + age);
                System.out.println("MARKS: " + marks);
             }
        }
            catch (SQLException e)
            {
                  System.out.println(e.getMessage());

            }

    }
}