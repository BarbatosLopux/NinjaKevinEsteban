package Clases.Builder;

import Clases.Ninja;

public class NinjaConcreteBuilder implements Ninjabuilder {
    private Ninja ninja = new Ninja();

    @Override
    public Ninjabuilder Id_Ninja(int idNinja) {
        ninja.setId_Ninja(idNinja);
        return this;
    }

    @Override
    public Ninjabuilder Nombre(String nombre) {
        ninja.setNombre(nombre);
        return this;
    }

    @Override
    public Ninjabuilder Rango(String rango) {
        ninja.setRango(rango);
        return this;
    }

    @Override
    public Ninjabuilder Aldea(String aldea) {
        ninja.setAldea(aldea);
        return this;
    }

    @Override
    public Ninja build() {
        return ninja;
    }
}