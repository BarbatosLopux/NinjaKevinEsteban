package Clases;

import Clases.Builder.NinjaConcreteBuilder;
import Clases.Builder.Ninjabuilder;
import Controller.NinjaController;
import conexion.BDConnection;
import conexion.Operations;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al gestor de ninjas y misiones");
        System.out.println("Seleccione 1 para ingresar un nuevo ninja ");
        System.out.println("Seleccione 2 para listar todos los ninjas con sus habilidades ");
        System.out.println("Seleccione 3 para Mostrar las misiones completadas para un ninja especifico ");
        System.out.println("Seleccione 4 para registrar la mision a un ninja");
        System.out.println("Seleccione 5 para mostrar todas las misiones completadas ");

        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("Ingrese el ID del ninja: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el nombre del ninja: ");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese el rango del ninja: ");
                String rango = scanner.nextLine();

                System.out.println("Ingrese la aldea del ninja: ");
                String aldea = scanner.nextLine();

                Operations.setConnection(BDConnection.MySQLConnection());

                NinjaController ninjaController = new NinjaController();
                Ninjabuilder ninjaBuilder = new NinjaConcreteBuilder();
                Ninja ninja = ninjaBuilder.Id_Ninja(id).Nombre(nombre).Rango(rango).Aldea(aldea).build();
                ninjaController.insertNinja(ninja);
                break;
            default:
                System.out.println("Opción inválida seleccionada.");
                break;
//            case 2: 
//          
//                Operations.setConnection(BDConnection.MySQLConnection());
//
//                Statement stmt = Operations.getConnection().createStatement();
//
//                String sql = "SELECT Ninja.Id_Ninja, Ninja.Nombre, Habilidad.Nombre FROM Ninja INNER JOIN Habilidad ON Ninja.Id_Ninja = Habilidad.Id_Ninja";
//                ResultSet rs = stmt.executeQuery(sql);
//
//               while (rs.next()) {
//                    int id = rs.getInt(1); // Índice de la columna Id_Ninja
//                    String nombre = rs.getString(2); // Índice de la columna Nombre
//                    String habilidad = rs.getString(3); // Índice de la columna Habilidad.Nombre
//
//                    System.out.println("ID: " + id + ", Nombre: " + nombre + ", Habilidad: " + habilidad);
//}
//                rs.close();
//                stmt.close();
//                break; NO SIRVE 
                
        }
    }
}
