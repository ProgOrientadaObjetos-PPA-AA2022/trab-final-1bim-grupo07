
package paquete03;

import java.io.Serializable;

public class Barrio implements Serializable{
    
    private String nombreBarrio; 
    private String referencia;

    public Barrio(String nombreBarrio, String referencia) {
        this.nombreBarrio = nombreBarrio;
        this.referencia = referencia;
    }
    
    public void establecerNombreBarrio(String g){
        nombreBarrio = g;
    }
    public void establecerReferencia(String g){
        referencia = g;
    }
    public String obtenerNombreBarrio(){
        return nombreBarrio;
    }
    public String obtenerRefernecia(){
        return referencia;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre del Barrio: %s Referencia: %s", 
                nombreBarrio,referencia);
        return cadena;
    }
}
