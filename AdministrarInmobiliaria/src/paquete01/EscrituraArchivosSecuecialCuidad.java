
package paquete01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete04.Ciudad;

public class EscrituraArchivosSecuecialCuidad {
    
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Ciudad resgistroCiudad; 
    private ArrayList<Ciudad> listaCiudades;
    
    public EscrituraArchivosSecuecialCuidad(String nombreArchivos){
        nombreArchivo = nombreArchivos;
        establecerListaCiudad();
        try {
            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            if (obtenerListaCiudad().size() > 0){
                for (int i = 0; i < obtenerListaCiudad().size(); i++){
                    establecerRegistroCiudad(obtenerListaCiudad().get(i));
                    establecerSalidaCiudad();
                }
            }
        }catch(IOException ioException){
            System.err.println("Erros la abrir el archivo.");
        }
    }
    public void establecerNombreArchivo(String g){
        nombreArchivo = g;
    }
    public void establecerRegistroCiudad(Ciudad c){
        resgistroCiudad = c;
    }
    public void establecerSalidaCiudad(){
        try {
            salida.writeObject(resgistroCiudad);
        }catch(IOException ex){
            System.err.println("Error al escribir en el archivo");
        }
    }
    public void establecerListaCiudad(){
        LecturaArchivosSecuencial l = new LecturaArchivosSecuencial(obtenerNombreArchivo());
        l.establecerListaCiudad();
        listaCiudades = l.obtenerListaCiudad();
    }
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Ciudad> obtenerListaCiudad(){
        return listaCiudades; 
    }
    public ObjectOutputStream obtenerSalida(){
        return salida; 
    }
    public void cerrarArchivo(){
        try{
            if(salida != null){
                salida.close();
            }
        }catch(IOException ioException){
            System.err.println("Error al cerrar el archivo.");
        }
    }
    
    
}
