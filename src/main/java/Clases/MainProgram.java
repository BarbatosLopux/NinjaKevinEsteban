package Clases;

import Clases.Builder.NinjaConcreteBuilder;
import Clases.Builder.Ninjabuilder;
import Controller.MisionController;
import Controller.NinjaController;
import conexion.BDConnection;
import conexion.Operations;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) throws SQLException, Exception {
        System.out.println("Bienvenido Al gestor de Nijas y misiones ");
        System.out.println("Seleccione 1 para entrar al gestor de ninjas ");
        System.out.println("Seleccione 2 para entrar al gestor de misiones");
                
                
        System.out.println("Seleccione 4 para Mostrar las misiones completadas para un ninja especifico ");
        System.out.println("Seleccione 5 para registrar la mision a un ninja");
        System.out.println("Seleccione 6 para mostrar todas las misiones completadas ");
        
        Scanner scaner = new Scanner(System.in);
        int u = scaner.nextInt();
        switch (u){
            case 1:
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido al gestor de ninjas");
            System.out.println("Seleccione 1 para ingresar un nuevo ninja ");
            System.out.println("Selecicone 2 para mostrar a todos los ninjas"); 
            System.out.println("Seleccione 3 para seleccionar a un ninja por su id");
            System.out.println("Seleccione 4 para listar todos los ninjas con sus habilidades ");


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
               
               case 2:
                List<Ninja> ninjas = NinjaController.getAllNinjas();
                for (Ninja ninje : ninjas) {
                    System.out.println("ID: " + ninje.getId_Ninja());
                    System.out.println("Nombre: " + ninje.getNombre());
                    System.out.println("Rango: " + ninje.getRango());
                    System.out.println("Aldea: " + ninje.getAldea());
                    System.out.println("------------------------");
                }
                break;
               case 3: 
                   System.out.println("Ingrese el ID del ninja: ");
                        long ninjaId = scanner.nextLong();
                        scanner.nextLine();

                        NinjaController ninjacontroller = new NinjaController();
                        Ninja ninje = ninjacontroller.getNinjaById(ninjaId);

                        if (ninje.getId_Ninja() != 0) {
                            System.out.println("Información del ninja:");
                            System.out.println("ID: " + ninje.getId_Ninja());
                            System.out.println("Nombre: " + ninje.getNombre());
                            System.out.println("Rango: " + ninje.getRango());
                            System.out.println("Aldea: " + ninje.getAldea());
                        } else {
                            System.out.println("No se encontró un ninja con el ID especificado.");
                        }

                default:
                    System.out.println("Opción inválida seleccionada.");
                    break;

            }
        
            case 2: 
                
                
            Scanner scanne = new Scanner(System.in);
            System.out.println("Bienvenido al gestor de ninjas");
            System.out.println("Seleccione 1 para ingresar un nuevo ninja ");
            System.out.println("Selecicone 2 para mostrar a todos los ninjas"); 
            System.out.println("Seleccione 3 para seleccionar a un ninja por su id");
            System.out.println("Seleccione 4 para listar todos los ninjas con sus habilidades ");


            int x = scanne.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Ingrese el ID de la mision: ");
                    int id = scanne.nextInt();
                    scanne.nextLine();

                    System.out.println("Ingrese la descripcion de la mision: ");
                    String descripcion = scanne.nextLine();

                    System.out.println("Ingrese el rango de la mision: ");
                    String rango = scanne.nextLine();

                    System.out.println("Ingrese la recompensa de la mision");
                    String recompensa = scanne.nextLine();

                    Operations.setConnection(BDConnection.MySQLConnection());
//
////                    MisionController misionController = new MisionController();
////                    MisionBuilder misionBuilder = new MisionConcreteBuilder();
////                    Ninja ninja = ninjaBuilder.Id_Ninja(id).Nombre(descripcion).Rango(rango).Aldea(recompensa).build();
////                    ninjaController.insertNinja(ninja);
////                    break;
//                default:
//                    System.out.println("Opción inválida seleccionada.");
//                    break;
//               case 2:
//                List<Ninja> ninjas = NinjaController.getAllNinjas();
//                for (Ninja ninje : ninjas) {
//                    System.out.println("ID: " + ninje.getId_Ninja());
//                    System.out.println("Nombre: " + ninje.getNombre());
//                    System.out.println("Rango: " + ninje.getRango());
//                    System.out.println("Aldea: " + ninje.getAldea());
//                    System.out.println("------------------------");
//                }
//                break;
//               case 3: 
//                   System.out.println("Ingrese el ID del ninja: ");
//                        long ninjaId = scanner.nextLong();
//                        scanner.nextLine();
//
//                        NinjaController ninjacontroller = new NinjaController();
//                        Ninja ninje = ninjacontroller.getNinjaById(ninjaId);
//
//                        if (ninje.getId_Ninja() != 0) {
//                            System.out.println("Información del ninja:");
//                            System.out.println("ID: " + ninje.getId_Ninja());
//                            System.out.println("Nombre: " + ninje.getNombre());
//                            System.out.println("Rango: " + ninje.getRango());
//                            System.out.println("Aldea: " + ninje.getAldea());
//                        } else {
//                            System.out.println("No se encontró un ninja con el ID especificado.");
//                        }
//
//
//
            }
           
        }
        
      }
}
