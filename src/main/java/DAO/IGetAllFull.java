/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author user
 */
import java.util.List;

/**
 * An interface extending IDao, providing a method to retrieve all entities with full details.
 * This interface is generic, suitable for any type of entity collection.
 *
 * @param <T> The type of the entities in the list to be retrieved.
 */
public interface IGetAllFull <T> extends IDao {

    /**
     * Retrieves a list of all entities of type T, potentially including all detailed information for each entity.
     * 
     * @return A List of entities of type T, which may include comprehensive details for each entity.
     */
    List<T> getAllFull();
}
