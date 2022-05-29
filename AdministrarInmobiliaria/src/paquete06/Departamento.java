
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Departamento {
    
    private Propietario dueno;
    private double precioMetroCua;
    private double metrosCuadrados; 
    private double mensualidad;
    private double costFinal; 
    private Barrio barrio;
    private Ciudad ciudad; 
    private String nomEdificio; 
    private String UBdepartamento;  
    private Constructora contrustora; 

    public Departamento(Propietario dueno, double precioMetroCua, int numCuadras, 
            double mensualidad, double costFinal, Barrio barrio, Ciudad cuidad, 
            String nomEdificio, String UBdepartamento, Constructora contrustora) {
        this.dueno = dueno;
        this.precioMetroCua = precioMetroCua;
        this.metrosCuadrados = numCuadras;
        this.mensualidad = mensualidad;
        this.costFinal = costFinal;
        this.barrio = barrio;
        this.ciudad = cuidad;
        this.nomEdificio = nomEdificio;
        this.UBdepartamento = UBdepartamento;
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
    public void establecerMensualidad (double f){
        mensualidad = f;
    }
    public void establecerCostoFinal (){
        costFinal = precioMetroCua * metrosCuadrados + mensualidad;
    }
    public void establecerBarrio (Barrio f){
        barrio = f; 
    }
    public void establecerCuidad (Ciudad g){
        ciudad = g;
    }
    public void esatblecerNomEficio (String f){
        nomEdificio = f;
    }
    public void establecerUBdepartamento(String f){
        UBdepartamento = f;
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
    public double obtenerMensualidad(){
        return mensualidad;
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
    public String obtenerNomEdificio(){
        return nomEdificio;
    }
    public String obtenerUDdepartamento(){
        return UBdepartamento;
    }
    public Constructora obtenerConstructora() {
        return contrustora;
    }
}
