/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Clases.Ninja;
import DAO.NinjaDAO;


/**
 *
 * @author user
 */
public class NinjaController {
      
    
    private static NinjaDAO ninjaDao = new NinjaDAO();

   
    
    public static void insertNinja (Ninja ninja) {
        ninjaDao.save(ninja);
    }

    
}
