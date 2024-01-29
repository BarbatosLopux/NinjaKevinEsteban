/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Clases.Mision;
import DAO.MisionDAO;
import java.util.List;


/**
 *
 * @author user
 */
public class MisionController {
      
    
    private static MisionDAO misionDao = new MisionDAO();

   public static List<Mision> getAllmisiones(){
    return misionDao.getAllmisiones(); } 
   
   public static Mision getMisionById(long misionId){
       return misionDao.getMisionById(misionId);
   }
    
    public static void insertMision (Mision mision) {
        misionDao.save(mision);
    }

    
    
    
}
