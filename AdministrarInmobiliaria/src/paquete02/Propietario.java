
package paquete02;

import java.io.Serializable;

public class Propietario implements Serializable{

    private String nombre;
    private String apellido;
    private String identificacion;

    public Propietario(String nombre, String apellido, String identificacino) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacino;
    }
    
    public void establecerNomrbe (String g){
    nombre = g;
    }
    public void establecerApellido (String g){
    apellido = g;
    }
    public void establecerIdentificaicion (String g){
    identificacion = g;
    }
    public String obtenerNomrbe(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public String obtenerIdentificacion(){
        return identificacion;
    } 
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s Apeliido: %s Identificacion: %s\n",
                nombre, apellido, identificacion);
        return cadena; 
    }
}
