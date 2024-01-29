package conexion;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BDConnection {
    private static String url = "jdbc:mysql://localhost:3306/";
    private static String user = "root";
    private static String password = "campus2023";
    public static Connection con = null;

    public static Connection MySQLConnection() {
        url = "jdbc:mysql://localhost:3306/naruto_kevinesteban";
        user = "root";
        password = "campus2024";
        return getConnection(url, user, password);
    }

    private static Connection getConnection(String url, String user, String password) {
        try {
            // Realizar la conexion
            con = DriverManager.getConnection(url, user, password);
            if (con != null) {
                DatabaseMetaData meta = con.getMetaData();
                System.out.println("Database connected " + meta.getDriverName());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }

}
