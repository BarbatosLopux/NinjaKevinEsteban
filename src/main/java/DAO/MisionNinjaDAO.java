package DAO;


import Clases.MisionNinja;
import conexion.BDConnection;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MisionNinjaDAO {

    private static final String SELECT_MISIONNINJA = "SELECT * FROM mision_ninja";
    private static final String INSERT_MISIONNINJA = "INSERT INTO mision_ninja (Id_Ninja, Id_Mision, Fecha_Inicio, Fecha_Fin) VALUES (?, ?, ?, ?)";
    private static final String UPDATE_MISIONNINJA = "UPDATE mision_ninja SET Fecha_Fin = ? WHERE Id_Ninja = ? AND Id_Mision = ?";


    public List<MisionNinja> getAllMisionNinja() {
        List<MisionNinja> misionesNinja = new ArrayList<>();
        try (Connection connection = BDConnection.MySQLConnection(); PreparedStatement ps = connection.prepareStatement(SELECT_MISIONNINJA)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    MisionNinja misionNinja = new MisionNinja();
                    misionNinja.setId_Ninja(rs.getInt("ninjaId"));
                    misionNinja.setMisionId(rs.getInt("misionId"));
                    misionNinja.setFechaInicio(LocalDate.parse(rs.getString("fechaInicio")));
                    misionNinja.setFechaFin(rs.getString("fechaFin") == null ? null : LocalDate.parse(rs.getString("fechaFin")));
                    misionesNinja.add(misionNinja);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return misionesNinja;
    }

    public void addMisionNinja(MisionNinja misionNinja) {
        try (Connection connection = ConnectionDB.MySQConnection(); PreparedStatement ps = connection.prepareStatement(INSERT_MISIONNINJA)) {
            ps.setLong(1, misionNinja.getNinjaId());
            ps.setLong(2, misionNinja.getMisionId());
            ps.setString(3, misionNinja.getFechaInicio().toString());
            ps.setObject(4, null);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateMisionNinja(MisionNinja misionNinja) {
        try (Connection connection = ConnectionDB.MySQConnection(); PreparedStatement ps = connection.prepareStatement(UPDATE_MISIONNINJA)) {
            ps.setString(1, misionNinja.getFechaFin().toString());
            ps.setLong(2, misionNinja.getNinjaId());
            ps.setLong(3, misionNinja.getMisionId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAllMisionNinja() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
