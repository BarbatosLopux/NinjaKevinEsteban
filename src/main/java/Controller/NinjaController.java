/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Clases.Ninja;
import DAO.NinjaDAO;
import java.util.List;


/**
 *
 * @author user
 */
public class NinjaController {
      
    
    private static NinjaDAO ninjaDao = new NinjaDAO();

   public static List<Ninja> getAllNinjas(){
    return ninjaDao.getAllNinjas(); } 
   
   public static Ninja getNinjaById(long ninjaId){
       return ninjaDao.getNinjaById(ninjaId);
   }
    
    public static void insertNinja (Ninja ninja) {
        ninjaDao.save(ninja);
    }

    
    
    
}
