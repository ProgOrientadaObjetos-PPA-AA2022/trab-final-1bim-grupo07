
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Casa {
    
    private Propietario dueno;
    private double precioMetroCua;
    private double metrosCuadrados; 
    private double costFinal; 
    private Barrio barrio;
    private Ciudad ciudad; 
    private int numCuartos; 
    private Constructora contrustora; 

    public Casa(Propietario dueno, double precioMetroCua, int numCuadras, double 
            costFinal, Barrio barrio, Ciudad cuidad, int numCuartos, 
            Constructora contrustora) {
        this.dueno = dueno;
        this.precioMetroCua = precioMetroCua;
        this.metrosCuadrados = numCuadras;
        this.costFinal = costFinal;
        this.barrio = barrio;
        this.ciudad = cuidad;
        this.numCuartos = numCuartos;
        this.contrustora = contrustora;
    }
    
    public void establecerDueno (Propietario f){
        dueno = f;
    }
    public void establecerPrecioMetroCua (double f){
          precioMetroCua = f;
    }
    public void establecerNumCuadras (double f){
          metrosCuadrados = f;
    }
    public void establecerCostoFinal (){
        costFinal = precioMetroCua * metrosCuadrados;
    }
    public void establecerBarrio (Barrio f){
        barrio = f; 
    }
    public void establecerCuidad (Ciudad g){
        ciudad = g;
    }
    public void establecerNumeroCuartos (int r){
        numCuartos = r;
    }
    public void establecerConstructora (Constructora r){
        contrustora = r ;
    }
    public Propietario obtenerDueno (){
        return dueno;
    }
    public double obetnerPrecioMetroCua(){
        return precioMetroCua;
    }
    public double obtenerMetrozCuadrados(){
        return metrosCuadrados;
    }
    public double obtenerCostoFinal() {
        return costFinal; 
    }
    public Barrio obtenerBarrio() {
        return barrio;
    }
    public Ciudad obtenerCuidad() {
        return ciudad;  
    }
    public int obtenerNumeroCuartos (){
        return numCuartos;
    }
    public Constructora obtenerConstructora() {
        return contrustora;
    }
}
