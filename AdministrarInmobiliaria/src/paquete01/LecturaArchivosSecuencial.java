
package paquete01;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;

public class LecturaArchivosSecuencial {
 
    private ObjectInputStream entrada;
    private ArrayList<Casa> casas;
    private ArrayList<Departamento> departamento;
    private ArrayList<Constructora> constructora;
    private ArrayList<Ciudad> ciudad;
    private ArrayList<Barrio> barrio;
    private ArrayList<Propietario> propietario;
    private String nombreArchivo;
    private String identificador; 
    private Propietario propietarioBuscado;
    private Ciudad ciudadBuscado; 
    private Barrio barrioBuscado;
    private Constructora constructoraBuscado;
    
    public LecturaArchivosSecuencial(String n){
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()){
            try{
                entrada = new ObjectInputStream(new FileInputStream(n));
            }catch(IOException ioException){
                System.err.print("Error al abrir el archivo.");
            }
        }
    }
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    public void establerListaCasas(){
        casas = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if(f.exists()){
            while (true){
                try {
                    Casa registro = (Casa) entrada.readObject();
                    casas.add(registro);
                }catch(EOFException endoffFileException){
                    return;
                }catch (IOException ex){
                    System.err.print("Error al leer el archivo "+ex);
                }catch (ClassNotFoundException ex){
                    System.err.print("No se pudo creer el obejto "+ex);
                }catch(Exception ex){
                    
                }
            }
        }
    }
    public void establecerListaDepartamento(){
        departamento = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if(f.exists()){
            while (true){
                try {
                    Departamento registro = (Departamento) entrada.readObject();
                    departamento.add(registro);
                }catch(EOFException endoffFileException){
                    return;
                }catch (IOException ex){
                    System.err.print("Error al leer el archivo "+ex);
                }catch (ClassNotFoundException ex){
                    System.err.print("No se pudo creer el obejto "+ex);
                }catch(Exception ex){
                    
                }
            }
        }
    }
    public void establecerListaPropietario(){
        propietario = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if(f.exists()){
            while (true){
                try {
                    Propietario registro = (Propietario) entrada.readObject();
                    propietario.add(registro);
                }catch(EOFException endoffFileException){
                    return;
                }catch (IOException ex){
                    System.err.print("Error al leer el archivo "+ex);
                }catch (ClassNotFoundException ex){
                    System.err.print("No se pudo creer el obejto "+ex);
                }catch(Exception ex){
                    
                }
            }
        }
    }
    public void establecerListaBarrio(){
        barrio = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if(f.exists()){
            while (true){
                try {
                    Barrio registro = (Barrio) entrada.readObject();
                    barrio.add(registro);
                }catch(EOFException endoffFileException){
                    return;
                }catch (IOException ex){
                    System.err.print("Error al leer el archivo "+ex);
                }catch (ClassNotFoundException ex){
                    System.err.print("No se pudo creer el obejto "+ex);
                }catch(Exception ex){
                    
                }
            }
        }
    }
    public void establecerListaCiudad(){
        ciudad = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if(f.exists()){
            while (true){
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();
                    ciudad.add(registro);
                }catch(EOFException endoffFileException){
                    return;
                }catch (IOException ex){
                    System.err.print("Error al leer el archivo "+ex);
                }catch (ClassNotFoundException ex){
                    System.err.print("No se pudo creer el obejto "+ex);
                }catch(Exception ex){
                    
                }
            }
        }
    }
    public void establecerListaConstructora(){
        constructora = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if(f.exists()){
            while (true){
                try {
                    Constructora registro = (Constructora) entrada.readObject();
                    constructora.add(registro);
                }catch(EOFException endoffFileException){
                    return;
                }catch (IOException ex){
                    System.err.print("Error al leer el archivo "+ex);
                }catch (ClassNotFoundException ex){
                    System.err.print("No se pudo creer el obejto "+ex);
                }catch(Exception ex){
                    
                }
            }
        }
    }
    public ArrayList<Casa> obtenerListaCasa(){
        return casas; 
    }
    public ArrayList<Departamento> obtenerListaDeparmento(){
        return departamento; 
    }
    public ArrayList<Propietario> obtenerListaPropietario(){
        return propietario; 
    }
    public ArrayList<Barrio> obtenerListaBarrio(){
        return barrio; 
    }
    public ArrayList<Ciudad> obtenerListaCiudad(){
        return ciudad; 
    }
    public ArrayList<Constructora> obtenerListaConstructora(){
        return constructora; 
    }
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    public void cerrarArchivo(){
        try{
            if (entrada != null){
                entrada.close();
            }
            System.exit(0);
        }catch (IOException ioException){
            System.err.println("Error al cerrar el archivo");
            System.exit(1);
        }
    }
    public void establecerIdenticador(String f){
        identificador = f;
    }
    public void establecerPropietarioBuscado(){
        File f = new File(obtenerNombreArchivo());
        if (f.exists()){
            while (true){
                try{
                    Propietario registro = (Propietario) entrada.readObject();
                    if (registro.obtenerIdentificacion().equals(identificador)){
                        propietarioBuscado = registro;
                        break;
                    }
                }catch (EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.err.println("Error al leer el archivo: "+ ex);
                }catch(ClassNotFoundException ex){
                    System.err.println("No se pudo crear el objeto: "+ ex);
                }catch(Exception ex){
                    System.err.println("No hay datos en el archivo: " + ex);
                }
            }
        }
    }
    public void establecerBarrioBuscado(){
        File f = new File(obtenerNombreArchivo());
        if (f.exists()){
            while (true){
                try{
                    Barrio registro = (Barrio) entrada.readObject();
                    if (registro.obtenerNombreBarrio().equals(identificador)){
                        barrioBuscado = registro;
                        break;
                    }
                }catch (EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.err.println("Error al leer el archivo: "+ ex);
                }catch(ClassNotFoundException ex){
                    System.err.println("No se pudo crear el objeto: "+ ex);
                }catch(Exception ex){
                    System.err.println("No hay datos en el archivo: " + ex);
                }
            }
        }
    }
    public void establecerCuidadBuscado(){
        File f = new File(obtenerNombreArchivo());
        if (f.exists()){
            while (true){
                try{
                    Ciudad registro = (Ciudad) entrada.readObject();
                    if (registro.obtenerNombreCiudad().equals(identificador)){
                        ciudadBuscado = registro;
                        break;
                    }
                }catch (EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.err.println("Error al leer el archivo: "+ ex);
                }catch(ClassNotFoundException ex){
                    System.err.println("No se pudo crear el objeto: "+ ex);
                }catch(Exception ex){
                    System.err.println("No hay datos en el archivo: " + ex);
                }
            }
        }
    }
    public void establecerConstructoraBuscado(){
        File f = new File(obtenerNombreArchivo());
        if (f.exists()){
            while (true){
                try{
                    Constructora registro = (Constructora) entrada.readObject();
                    if (registro.obtenerNombreConstructora().equals(identificador)){
                        constructoraBuscado = registro;
                        break;
                    }
                }catch (EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.err.println("Error al leer el archivo: "+ ex);
                }catch(ClassNotFoundException ex){
                    System.err.println("No se pudo crear el objeto: "+ ex);
                }catch(Exception ex){
                    System.err.println("No hay datos en el archivo: " + ex);
                }
            }
        }
    }
    public String obtenerIdentificador(){
        return identificador; 
    }
    public Propietario obtenerPropietarioBuscado(){
        return propietarioBuscado; 
    }
    public Barrio obtenerBarrioBuscado(){
        return barrioBuscado; 
    }
    public Ciudad obtenerCiudadBuscado(){
        return ciudadBuscado; 
    }
    public Constructora obtenerConstructoraBuscado(){
        return constructoraBuscado; 
    }
    public String imprimirListaDepartamento(){
        String cadena = String.format ("DEPARTAMENTO \n");
        for(int i=0; i < departamento.size(); i++){
        Departamento dep = departamento.get(i); 
               cadena = String.format ("%s Nombre: %s\n Apellido %s\n"
                       + "Cedula: %s\n Barrio: %s\n Referencia "
                       + "del barrio: %s\n Cuidad: %s\n Provincia: %s\n Nombre "
                       + "de la contrustora: %s\n ID de la contrustora: %s\n "
                       + "Metros Cuadrados: %.2f\n Precio del Metro Cuadrado: %.2f\n"
                       + "Mensualidad: %.2f\n Precio Final: %.2f\n", cadena, dep.obtenerDueno().obtenerNomrbe(),
                       dep.obtenerDueno().obtenerApellido(),dep.obtenerDueno().obtenerIdentificacion(),
                       dep.obtenerBarrio().obtenerNombreBarrio(),dep.obtenerBarrio().obtenerRefernecia(),
                       dep.obtenerCuidad().obtenerNombreCiudad(),dep.obtenerCuidad().obtenerNombreProvincia(),
                       dep.obtenerConstructora().obtenerNombreConstructora(),dep.obtenerConstructora().obtenerIDContructora(),
                       dep.obtenerMestrozCua(),dep.obtenerPrecioMetroCua(),dep.obtenerAliCuota(),
                       dep.obtenerPrecioFin());
        }
        return cadena;              
    }
    public String imprimirListaCasa(){
        String cadena = String.format ("CASA! \n");
        for(int i=0; i < casas.size(); i++){
            Casa cas = casas.get(i);
               cadena = String.format ("%s Nombre del propietario: %s\n Apellido"
                + " del propietario: %s\n Cedula: %s\n Barrio: %s\n Referencia "
                       + "del barrio: %s\n Cuidad: %s\n Provincia: %s\n Nombre "
                       + "de la contrustora: %s\n ID de la contrustora: %s\n Metros"
                       + " cuadrados: %.2f\n Pecio del metro cuadrado: %.2f\n"
                       + "Pecio Final: %.2f\n",cadena ,cas.obtenerDueno().obtenerNomrbe(),cas.obtenerDueno()
                        .obtenerApellido(),cas.obtenerDueno().obtenerIdentificacion(),
                        cas.obtenerBarrio().obtenerNombreBarrio(),cas.obtenerBarrio()
                        .obtenerRefernecia(),cas.obtenerCuidad().obtenerNombreCiudad(),
                        cas.obtenerCuidad().obtenerNombreProvincia(),cas.obtenerConstructora()
                        .obtenerNombreConstructora(),cas.obtenerConstructora().obtenerIDContructora(),
                        cas.obtenerMestrozCua(),cas.obtenerPrecioMetroCua(),cas.obtenerPrecioFinal());
        }
        return cadena;
    }
    public String imprimirPropietario(){
        String cadena = "Propietario \n";
        for(int i=0; i<propietario.size(); i++){
            cadena = String.format("%s Nombre: %s\n Apellido: %s\n Identidiacacion: %s\n", cadena,
                    propietario.get(i).obtenerNomrbe(), propietario.get(i).obtenerApellido(),
                    propietario.get(i).obtenerIdentificacion());
        }
        return cadena; 
    }
    public String imprimitBarrio(){
        String cadena = "Barrio \n";
        for(int i=0;i< barrio.size();i++){
            cadena = String.format("%s Barrio: %s\n Referencia: %s\n", cadena,
                    barrio.get(i).obtenerNombreBarrio(),barrio.get(i).obtenerRefernecia());
        }
        return cadena;
    }
    public String imprimirCiudad(){
        String cadena = "Cuidad \n";
        for(int i=0;i< ciudad.size();i++){
            cadena = String.format("%s Nombre de la cuidad: $s\n Prvincia: %s\n", cadena, 
                    ciudad.get(i).obtenerNombreCiudad(),ciudad.get(i).obtenerNombreProvincia());
        }
        return cadena;
    }
    public String imprimirConstructora(){
        String cadena = "Constructora \n";
        for(int i=0;i< constructora.size();i++){
            cadena = String.format("%s Nombre de la cosntructora: %s\n Id de la constructora: %s\n"
                    ,cadena, constructora.get(i).obtenerNombreConstructora(),constructora.get(i)
                    .obtenerIDContructora());
        }
        return cadena;
    }
}
