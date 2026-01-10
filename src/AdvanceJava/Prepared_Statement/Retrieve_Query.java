package AdvanceJava.Prepared_Statement;
import java.sql.*;

public class Retrieve_Query {

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
            String query = "SELECT marks FROM students WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, 5);

           ResultSet resultSet = preparedStatement.executeQuery();
           if(resultSet.next()) {
               double marks = resultSet.getDouble("marks");
               System.out.println("Marks: " + marks);

           } else{
               System.out.println("No marks found");
           }

        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
