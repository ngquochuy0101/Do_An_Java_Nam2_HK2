package DAO;

import DTO.SQLConnection;
import java.sql.Connection;
import java.sql.*;


public class DatabaseConnection {

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    public Connection connect() {
    SQLConnection sqlConnection = new SQLConnection();
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");
        if (connection != null) {
            System.out.println("Kết nối thành công đến cơ sở dữ liệu.");
            return connection;
        } else {
            System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
            return null;
        }
    } catch (SQLException e) {
        System.out.println("Lỗi kết nối cơ sở dữ liệu: " + e.getMessage());
        return null;
    }
}
}