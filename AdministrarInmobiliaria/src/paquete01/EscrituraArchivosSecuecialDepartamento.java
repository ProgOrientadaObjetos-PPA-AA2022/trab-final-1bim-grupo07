
package paquete01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete06.Departamento;

public class EscrituraArchivosSecuecialDepartamento {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Departamento registroDepartamento;
    private ArrayList<Departamento> listDepartamento;

    public EscrituraArchivosSecuecialDepartamento(String nombreArchivos){
        nombreArchivo = nombreArchivos;
        establecerListaDepartamento();
        try{
            salida = new ObjectOutputStream (new FileOutputStream(nombreArchivo));
            if(obtenerListaDepartamento().size() > 0){
                for(int i = 0; i <obtenerListaDepartamento().size(); i++){
                    establecerRegistroDepartamento(obtenerListaDepartamento().get(i));
                    establecerSalidaDepartamento();
                }
            }
        }catch (IOException ioException){
            System.err.print("Erros al abrir el archivo.");            
        }
    }
    public void establecerNombreArchivo(String h){
        nombreArchivo = h;
    }
    public void establecerRegistroDepartamento(Departamento e){
        registroDepartamento = e;
    }
    public void establecerSalidaDepartamento(){
        try{
            salida.writeObject(registroDepartamento);
        }catch(IOException ex){
            System.err.print("Erros al escribir el archivo.");
        }
    }
    public void establecerListaDepartamento(){
        LecturaArchivosSecuencial l = new LecturaArchivosSecuencial
        (obtenerNombreArchivo());
        l.establecerListaDepartamento();
        listDepartamento = l.obtenerListaDeparmento();
    }
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Departamento> obtenerListaDepartamento(){
        return listDepartamento; 
    }
    public ObjectOutputStream obtenerSalidaDepartamento(){
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