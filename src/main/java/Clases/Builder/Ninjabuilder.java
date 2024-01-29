/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clases.Builder;

import Clases.Ninja;

/**
 *
 * @author user
 */
public interface Ninjabuilder {
     /**
     * Sets the product ID for the {@link Product} being built.
     *
     * @param idNinja 
     * @return The updated {@code ProductBuilder} instance.
     */
    Ninjabuilder Id_Ninja (int idNinja);

    /**
     * Sets the store ID for the {@link Product} being built.
     *
     * @param nombre 
     * @return The updated {@code ProductBuilder} instance.
     */
    Ninjabuilder Nombre(String nombre);

    /**
     * Sets the name of the product for the {@link Product} being built.
     *
     * @param rango nombre del rango.
     * @return The updated {@code ProductBuilder} instance.
     */
    Ninjabuilder Rango (String rango);

    /**
     * Sets the price of the product for the {@link Product} being built.
     *
     * @param aldea The price of the product.
     * @return The updated {@code ProductBuilder} instance.
     */
    Ninjabuilder Aldea(String aldea);
    Ninja build();

    

}
