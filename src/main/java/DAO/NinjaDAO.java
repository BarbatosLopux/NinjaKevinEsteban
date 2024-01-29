/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.Ninja;
import conexion.BDConnection;
import conexion.Operations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */

public class NinjaDAO implements ISaveDao<Ninja> {

    
private static final String SELECT_NINJA = "SELECT * FROM ninja"; 
    
public List<Ninja> getAllNinjas(){
    List<Ninja> ninjas = new ArrayList<>();
      try (Connection connection = BDConnection.MySQLConnection(); PreparedStatement ps = connection.prepareStatement(SELECT_NINJA)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Ninja ninja = new Ninja();
                    ninja.setId_Ninja(rs.getInt("Id_Ninja"));
                    ninja.setNombre(rs.getString("nombre"));
                    ninja.setRango(rs.getString("rango").toUpperCase());
                    ninja.setAldea(rs.getString("aldea"));
                    ninjas.add(ninja);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ninjas;
    
}    

private static final String SELECT_NINJABYID = "SELECT * FROM ninja WHERE ID_Ninja = ?";

public Ninja getNinjaById(long ninjaId) {
    Ninja ninja = new Ninja();
    try (Connection connection = BDConnection.MySQLConnection(); PreparedStatement ps = connection.prepareStatement(SELECT_NINJABYID)) {
        ps.setLong(1, ninjaId);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                ninja.setId_Ninja(rs.getInt("Id_Ninja")); // Corrected column name
                ninja.setNombre(rs.getString("nombre"));
                ninja.setRango(rs.getString("rango").toUpperCase());
                ninja.setAldea(rs.getString("aldea"));
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return ninja;
}



    
    @Override
    public void save(Ninja ninja) {
        String stmInsert = "INSERT INTO ninja(Id_Ninja, Nombre, Rango, Aldea) VALUES(?,?,?,?);";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setInt(1, ninja.getId_Ninja());
            ps.setString(2, ninja.getNombre());
            ps.setString(3, ninja.getRango());
            ps.setString(4, ninja.getAldea());
            
            int rows = Operations.insert_update_delete_db(ps);
            if (rows <= 0) {
                System.out.println("No se pudo enviar ninja");
            } else {
                System.out.println("Ninja guardado satisfactoriamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
