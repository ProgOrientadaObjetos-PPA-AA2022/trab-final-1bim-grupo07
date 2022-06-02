
package paquete06;

import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Casa implements Serializable{
    
    private Propietario dueno;
    private Barrio barrio;
    private Ciudad ciudad;  
    private Constructora contrustora; 
    private double metrosCua; 
    private double precioMeCua;
    private int numCuartos;
    private double costoFinal;

    public Casa(double precioMeCua,double metrosCua, int numCuartos, Propietario dueno,
            Barrio barrio, Ciudad ciudad, Constructora contrustora) {
        this.dueno = dueno;
        this.barrio = barrio;
        this.ciudad = ciudad; 
        this.contrustora = contrustora;
        this.metrosCua = metrosCua;
        this.numCuartos = numCuartos;
        this.precioMeCua = precioMeCua;
    }
    public void establecerDueno (Propietario f){
        dueno = f;
    }
    public void establecerBarrio (Barrio f){
        barrio = f; 
    }
    public void establecerCuidad (Ciudad g){
        ciudad = g;
    }
    public void establecerConstructora (Constructora r){
        contrustora = r ;
    }
    public void establecerMetrozCuadrados(double r){
        metrosCua = r;
    }
    public void establecerPrecioMetroCuadrado(double g){
        precioMeCua = g;
    }
    public void establecerNumeroCuartos(int g){
        numCuartos = g;
    }
    public void establecerCostoFinal(){
        costoFinal =  metrosCua * precioMeCua;
    }
    public Propietario obtenerDueno (){
        return dueno;
    }    
    public Barrio obtenerBarrio() {
        return barrio;
    }
    public Ciudad obtenerCuidad() {
        return ciudad;  
    }
    public Constructora obtenerConstructora() {
        return contrustora;
    }
    public double obtenerMestrozCua(){
        return metrosCua;
    }
    public double obtenerPrecioMetroCua(){
        return precioMeCua;
    }
    public double obtenerNumCuartos(){
        return numCuartos;
    }
    public double obtenerPrecioFinal(){
        return costoFinal;
    }
    
    @Override
    public String toString(){ 
        
        String cadena = String.format ("CASA! \n"); 
               cadena = String.format ("%s Nombre del propietario: %s\n Apellido"
                + " del propietario: %s\n Cedula: %s\n Barrio: %s\n Referencia "
                       + "del barrio: %s\n Cuidad: %s\n Provincia: %s\n Nombre "
                       + "de la contrustora: %s\n ID de la contrustora: %s\n Metros"
                       + " cuadrados: %.2f\n Pecio del metro cuadrado: %.2f\n"
                       + "Pecio Final: %.2f\n",cadena,obtenerDueno().obtenerNomrbe(),
                       obtenerDueno().obtenerApellido(),obtenerDueno().obtenerIdentificacion(),
                       obtenerBarrio().obtenerNombreBarrio(),obtenerBarrio().obtenerRefernecia(),
                       obtenerCuidad().obtenerNombreCiudad(),obtenerCuidad().obtenerNombreProvincia(),
                       obtenerConstructora().obtenerNombreConstructora(),obtenerConstructora().obtenerIDContructora()
                       , obtenerMestrozCua(),obtenerPrecioMetroCua(),obtenerPrecioFinal());
        return cadena;
    }
}
