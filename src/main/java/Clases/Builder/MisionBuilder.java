/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clases.Builder;

import Clases.Mision;
import Clases.Ninja;

/**
 *
 * @author user
 */
public interface MisionBuilder {
     /**
     * Sets the product ID for the {@link Product} being built.
     *
     * @param idMision 
     * @return The updated {@code ProductBuilder} instance.
     */
    MisionBuilder Id_Mision (int idMision);

    /**
     * Sets the store ID for the {@link Product} being built.
     *
     * @param descripcion 
     * @return The updated {@code ProductBuilder} instance.
     */
    MisionBuilder Descripcion(String descripcion);

    /**
     * Sets the name of the product for the {@link Product} being built.
     *
     * @param rango nombre del rango.
     * @return The updated {@code ProductBuilder} instance.
     */
    MisionBuilder Rango (String rango);

    /**
     * Sets the price of the product for the {@link Product} being built.
     *
     * @param recompensa The price of the product.
     * @return The updated {@code ProductBuilder} instance.
     */
    MisionBuilder Recompensa(Double recompensa);
    Mision build();

    

}
