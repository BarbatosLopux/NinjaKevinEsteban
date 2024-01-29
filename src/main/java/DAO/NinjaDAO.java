/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.Ninja;
import conexion.Operations;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class NinjaDAO implements ISaveDao<Ninja> {

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
