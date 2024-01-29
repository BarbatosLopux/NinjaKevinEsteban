/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author user
 */
public class Mision {

    private int Id_Mision; 
    private String Descripcion; 
    private String Rango; 
    private double Recompensa; 

    public Mision(int Id_Mision, String Descripcion, String Rango, double Recompensa) {
        this.Id_Mision = Id_Mision;
        this.Descripcion = Descripcion;
        this.Rango = Rango;
        this.Recompensa = Recompensa;
    }

    public int getId_Mision() {
        return Id_Mision;
    }

    public void setId_Mision(int Id_Mision) {
        this.Id_Mision = Id_Mision;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
    }

    public double getRecompensa() {
        return Recompensa;
    }

    public void setRecompensa(double Recompensa) {
        this.Recompensa = Recompensa;
    }
    
    
    
    

    
}
