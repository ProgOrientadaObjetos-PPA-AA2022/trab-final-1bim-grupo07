
package paquete04;

import java.io.Serializable;

public class Ciudad implements Serializable{
    
    private String nombreCuidad;
    private String nombreProvincia;

    public Ciudad(String nombreCuidad, String nombreProvincia) {
        this.nombreCuidad = nombreCuidad;
        this.nombreProvincia = nombreProvincia;
    }
    
    public void establecerNombreCiudad(String f){
        nombreCuidad = f;
    } 
    public void establecerNombreProvincia(String f){
        nombreProvincia = f;
    }
    public String obtenerNombreCiudad(){
        return nombreCuidad;
    }
    public String obtenerNombreProvincia(){
        return nombreProvincia;
    }
    @Override
    public String toString(){
        String cadena = String.format("Ciudad: %s Provincia: %s", nombreCuidad,
                nombreProvincia);
        return cadena;
    }
}
