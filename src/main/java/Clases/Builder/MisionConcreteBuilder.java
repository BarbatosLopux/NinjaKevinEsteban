package Clases.Builder;

import Clases.Mision;

public class MisionConcreteBuilder implements MisionBuilder {
    private Mision mision = new Mision();

 
/////////////////////////

    @Override
    public MisionBuilder Id_Mision(int idMision) {
        mision.setId_Mision(idMision);
        return this; 
    }

    @Override
    public MisionBuilder Descripcion(String descripcion) {
        mision.setDescripcion(descripcion);
        return this; 
    }

    @Override
    public MisionBuilder Rango(String rango) {
        mision.setRango(rango);
        return this; 
    }

    @Override
    public MisionBuilder Recompensa(Double recompensa) {
        mision.setRecompensa(recompensa);
        return this; 
    }

    @Override
    public Mision build() {
        return mision; 
    }
  

}