package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static Connection connection;

    public Util(Connection connection) {
        this.connection = connection;
    }

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydbtest",
                    "root",
                    "ramones1988");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
