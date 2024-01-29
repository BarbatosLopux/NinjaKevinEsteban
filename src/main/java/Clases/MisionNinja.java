/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;



        
/**
 *
 * @author user
 */
public class MisionNinja extends Mision {

    
    private Date FechaInicio; 
    private Date FechaFinal; 
    private boolean Estado; 

    public MisionNinja(int Id_Mision, String Descripcion, String Rango, double Recompensa) {
        super(Id_Mision, Descripcion, Rango, Recompensa);
    }

    public MisionNinja(Date FechaInicio, Date FechaFinal, boolean Estado, int Id_Mision, String Descripcion, String Rango, double Recompensa) {
        super(Id_Mision, Descripcion, Rango, Recompensa);
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.Estado = Estado;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
}
