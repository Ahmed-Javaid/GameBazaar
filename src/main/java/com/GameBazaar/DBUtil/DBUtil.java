package com.GameBazaar.DBUtil;

import java.sql.*;

public class DBUtil {

    private static Connection connection= null;

    public static Connection getConnection() throws SQLException {

        if(connection!= null){
            return connection;
        } else {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/GameBazaar?useSSL=false";
            String user = "root";
            String password = "susman5";

            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

        }
        return connection;

    }
}
