package AdvanceJava.Prepared_Statement;
import java.sql.*;

public class Update {

    private static final String url = "jdbc:mysql://localhost:3306/xabidb";
    private static final String username = "root";
    private static final String password = "Fuckyoubitch@9821";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "UPDATE students SET marks = ? WHERE id = ?";
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, 54);
            preparedStatement.setInt(2, 6);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Updated Successfully!");
            } else {
                System.out.println("Data not Updated!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}