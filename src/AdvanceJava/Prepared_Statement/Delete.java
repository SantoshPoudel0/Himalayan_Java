package AdvanceJava.Prepared_Statement;
import java.sql.*;

public class Delete{

    private static final String url = "jdbc:mysql://localhost:3306/xabidb";
    private static final String username = "root";
    private static final String password = "Fuckyoubitch@9821";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM students WHERE id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, 6);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Delete Successfully!");
            } else {
                System.out.println("Delete Failed!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}