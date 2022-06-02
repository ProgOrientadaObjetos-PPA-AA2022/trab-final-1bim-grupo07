
package paquete01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete03.Barrio;

public class EscrituraArchivosSecuecialBarrio {
    
    private String nombreArchivo; 
    private ObjectOutputStream salida;
    private Barrio registroBarrio;
    private ArrayList<Barrio> listBarrio;
    
    public EscrituraArchivosSecuecialBarrio(String nombreArchivo){
        nombreArchivo = nombreArchivo;
        establecerListaBarrio();
        try{
            salida = new ObjectOutputStream (new FileOutputStream(nombreArchivo));
            if(obtenerListaBarrio().size() > 0){
                for(int i = 0; i <obtenerListaBarrio().size(); i++){
                    establecerRegistroBarrio(obtenerListaBarrio().get(i));
                    establecerSalidaBarrio();
                }
            }
        }catch (IOException ioException){
            System.err.print("Erros al abrir el archivo.");            
        }
    }
    public void establecerNombreArchivo(String h){
        nombreArchivo = h;
    }
    public void establecerRegistroBarrio(Barrio e){
        registroBarrio = e;
    }
    public void establecerSalidaBarrio(){
        try{
            salida.writeObject(registroBarrio);
        }catch(IOException ex){
            System.err.print("Erros al escribir el archivo.");
        }
    }
    public void establecerListaBarrio(){
        LecturaArchivosSecuencial l = new LecturaArchivosSecuencial
        (obtenerNombreArchivo());
        l.establecerListaBarrio();
        listBarrio = l.obtenerListaBarrio();
    }
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Barrio> obtenerListaBarrio(){
        return listBarrio; 
    }
    public ObjectOutputStream obtenerSalidaBarrio(){
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
