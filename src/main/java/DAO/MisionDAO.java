/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.Mision;
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

public class MisionDAO implements ISaveDao<Mision> {

    
private static final String SELECT_MISION = "SELECT * FROM mision"; 
    
public List<Mision> getAllmisiones(){
    List<Mision> mision = new ArrayList<>();
      try (Connection connection = BDConnection.MySQLConnection(); PreparedStatement ps = connection.prepareStatement(SELECT_MISION)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Mision misione = new Mision();
                    misione.setId_Mision(rs.getInt("Id_Mision"));
                    misione.setDescripcion(rs.getString("descripcion"));
                    misione.setRango(rs.getString("rango").toUpperCase());
                    misione.setRecompensa(rs.getDouble("recompensa"));
                    misione.add(misione);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mision;
    
}    

private static final String SELECT_MISIONID = "SELECT * FROM mision WHERE Id_Mision= ?";

public Mision getMisionById(long misionId) {
    Mision mision = new Mision();
    try (Connection connection = BDConnection.MySQLConnection(); PreparedStatement ps = connection.prepareStatement(SELECT_MISIONID)) {
        ps.setLong(1, misionId);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                mision.setId_Mision(rs.getInt("Id_Mision")); 
                mision.setDescripcion(rs.getString("descripcion"));
                mision.setRango(rs.getString("rango").toUpperCase());
                mision.setRecompensa(rs.getDouble("recompensa"));
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return mision;
}



    @Override

    public void save(Mision mision) {
        String stmInsert = "INSERT INTO mision(Id_Mision, Descripcion, Recompensa) VALUES(?,?,?);";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setInt(1, mision.getId_Mision());
            ps.setString(2, mision.getDescripcion());
            ps.setString(3, mision.getRango());
            ps.setDouble(4, mision.getRecompensa());
            
            int rows = Operations.insert_update_delete_db(ps);
            if (rows <= 0) {
                System.out.println("No se pudo enviar a mision");
            } else {
                System.out.println("Mision guardada satisfactoriamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  

}
