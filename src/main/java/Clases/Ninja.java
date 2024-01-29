/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Clases;

/**
 *
 * @author user
 */
public class Ninja {
    
    private int Id_Ninja; 
    private String Nombre; 
    private String Rango; 
    private String Aldea; 

    public Ninja() {
    }

    
    
    //constructor 
    public Ninja(int Id_Ninja, String Nombre, String Rango, String Aldea) {
        this.Id_Ninja = Id_Ninja;
        this.Nombre = Nombre;
        this.Rango = Rango;
        this.Aldea = Aldea;
    }
    // getters and setters
    public int getId_Ninja() {
        return Id_Ninja;
    }

    public void setId_Ninja(int Id_Ninja) {
        this.Id_Ninja = Id_Ninja;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
    }

    public String getAldea() {
        return Aldea;
    }

    public void setAldea(String Aldea) {
        this.Aldea = Aldea;
    }
    
    
    
    
    
}
