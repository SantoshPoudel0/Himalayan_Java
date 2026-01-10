package AdvanceJava.Prepared_Statement;
import java.sql.*;
import java.sql.DriverManager;

public class Insertion {

    private static final String url = "jdbc:mysql://localhost:3306/xabidb";
    private static final String username = "root";
    private static final String password = "Fuckyoubitch@9821";

    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "Narayan");
            preparedStatement.setInt(2, 30);
            preparedStatement.setInt(3, 76);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Data not inserted");
            }

        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }

}
