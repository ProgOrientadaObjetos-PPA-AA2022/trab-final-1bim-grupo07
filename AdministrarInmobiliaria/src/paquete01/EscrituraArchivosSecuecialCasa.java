/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;
import paquete06.Casa;

/**
 *
 * @author camil
 */
public class EscrituraArchivosSecuecialCasa {
    
    private String nombreArchivo; 
    private ObjectOutputStream salida;
    private Casa registroCasa;
    private ArrayList<Casa> listCasa;
    
    public EscrituraArchivosSecuecialCasa(String nombreArchivos){
        nombreArchivo = nombreArchivos;
        establecerListaCasa();
        try{
            salida = new ObjectOutputStream (new FileOutputStream(nombreArchivo));
            if(obtenerListaCasa().size() > 0){
                for(int i = 0; i <obtenerListaCasa().size(); i++){
                    establecerRegistroCasa(obtenerListaCasa().get(i));
                    establecerSalidaCasa();
                }
            }
        }catch (IOException ioException){
            System.err.print("Erros al abrir el archivo.");            
        }
    }
    public void establecerNombreArchivo(String h){
        nombreArchivo = h;
    }
    public void establecerRegistroCasa(Casa e){
        registroCasa = e;
    }
    public void establecerSalidaCasa(){
        try{
            salida.writeObject(registroCasa);
        }catch(IOException ex){
            System.err.print("Erros al escribir el archivo.");
        }
    }
    public void establecerListaCasa(){
        LecturaArchivosSecuencial l = new LecturaArchivosSecuencial
        (obtenerNombreArchivo());
        l.establerListaCasas();
        listCasa = l.obtenerListaCasa();
    }
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Casa> obtenerListaCasa(){
        return listCasa; 
    }
    public ObjectOutputStream obtenerSalidaCasa(){
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
