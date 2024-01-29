package conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consultas {
    private Connection connection;

    public Consultas(Connection connection) {
        this.connection = connection;
    }

    public void realizarConsulta() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ninja");

            while (resultSet.next()) {
                int columna1 = resultSet.getInt("Id_Ninja");
                String columna2 = resultSet.getString("Nombre");

                System.out.println(columna1);
                System.out.println(columna2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}