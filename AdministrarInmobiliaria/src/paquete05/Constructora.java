
package paquete05;

import java.io.Serializable;

public class Constructora implements Serializable{
    
    private String nomContructora;
    private String IDempresa;

    public Constructora(String nomContructora, String IDempresa) {
        this.nomContructora = nomContructora;
        this.IDempresa = IDempresa;
    }
    
    public void establecerNombreContructor(String f){
        nomContructora = f;
    }
    public void establecerIDContructora(String f){
        IDempresa = f;
    }
    public String obtenerNombreConstructora(){
        return nomContructora;
    }
    public String obtenerIDContructora(){
        return IDempresa;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre Constructora: %s ID de la "
                + "Constructora: %s", nomContructora, IDempresa);
        return cadena;
    }
}
