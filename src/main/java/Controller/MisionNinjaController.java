/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Clases.MisionNinja;
import DAO.MisionNinjaDAO;
import java.util.List;

/**
 *
 * @author user
 */
public class MisionNinjaController {
    private static final MisionNinjaDAO MISIONNINJADAO = new MisionNinjaDAO();
    
    public static List<MisionNinja> getAllMisionNinja(){
        return MISIONNINJADAO.getAllMisionNinja();
        
    }
    public static void addMisionNinja(MisionNinja misionNinja){ 
        MISIONNINJADAO.addMisionNinja(misionNinja);
    
    }
    public static void updateMisionNinja(MisionNinja misionNinja){ 
        MISIONNINJADAO.updateMisionNinja(misionNinja);
    }
}
