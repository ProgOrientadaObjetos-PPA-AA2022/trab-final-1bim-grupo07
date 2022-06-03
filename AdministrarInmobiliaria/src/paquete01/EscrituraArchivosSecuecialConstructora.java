
package paquete01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete05.Constructora;


public class EscrituraArchivosSecuecialConstructora {
    
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Constructora resgistroConstructora; 
    private ArrayList<Constructora> listaConstructora;
    
    public EscrituraArchivosSecuecialConstructora(String nombreArchivos){
        nombreArchivo = nombreArchivos;
        establecerListaConstructora();
        try {
            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            if (obtenerListaConstructora().size() > 0){
                for (int i = 0; i < obtenerListaConstructora().size(); i++){
                    establecerRegistroConstructora(obtenerListaConstructora().get(i));
                    establecerSalidaConstructora();
                }
            }
        }catch(IOException ioException){
            System.err.println("Erros la abrir el archivo.");
        }
    }
    public void establecerNombreArchivo(String g){
        nombreArchivo = g;
    }
    public void establecerRegistroConstructora(Constructora c){
        resgistroConstructora = c;
    }
    public void establecerSalidaConstructora(){
        try {
            salida.writeObject(resgistroConstructora);
        }catch(IOException ex){
            System.err.println("Error al escribir en el archivo");
        }
    }
    public void establecerListaConstructora(){
        LecturaArchivosSecuencial l = new LecturaArchivosSecuencial(obtenerNombreArchivo());
        l.establecerListaCiudad();
        listaConstructora = l.obtenerListaConstructora();
    }
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Constructora> obtenerListaConstructora(){
        return listaConstructora; 
    }
    public ObjectOutputStream obtenerSalidaConstructora(){
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
