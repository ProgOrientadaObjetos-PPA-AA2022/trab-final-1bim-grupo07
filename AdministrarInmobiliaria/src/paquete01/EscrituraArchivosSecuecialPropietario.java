
package paquete01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete02.Propietario;


public class EscrituraArchivosSecuecialPropietario {
    
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Propietario registroPropietario;
    private ArrayList<Propietario> listPropietario;

    public EscrituraArchivosSecuecialPropietario(String nombreArchivos){
        nombreArchivo = nombreArchivos;
        establecerListaPropietario();
        try{
            salida = new ObjectOutputStream (new FileOutputStream(nombreArchivo));
            if(obtenerListaPropietario().size() > 0){
                for(int i = 0; i <obtenerListaPropietario().size(); i++){
                    establecerRegistroPropietario(obtenerListaPropietario().get(i));
                    establecerSalidaPropietario();
                }
            }
        }catch (IOException ioException){
            System.err.print("Erros al abrir el archivo.");            
        }
    }
    public void establecerNombreArchivo(String h){
        nombreArchivo = h;
    }
    public void establecerRegistroPropietario(Propietario e){
        registroPropietario = e;
    }
    public void establecerSalidaPropietario(){
        try{
            salida.writeObject(registroPropietario);
        }catch(IOException ex){
            System.err.print("Erros al escribir el archivo.");
        }
    }
    public void establecerListaPropietario(){
        LecturaArchivosSecuencial l = new LecturaArchivosSecuencial
        (obtenerNombreArchivo());
        l.establecerListaPropietario();
        listPropietario = l.obtenerListaPropietario();
    }
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Propietario> obtenerListaPropietario(){
        return listPropietario; 
    }
    public ObjectOutputStream obtenerSalidaPropietario(){
        return salida;
    }
    public void cerrarArchivo(){
        try{
            if(salida != null){
                salida.close();
            }
        }catch(IOException ioException){
                System.err.print("Erros al cerrar el archivo.");
        }
    }
}
