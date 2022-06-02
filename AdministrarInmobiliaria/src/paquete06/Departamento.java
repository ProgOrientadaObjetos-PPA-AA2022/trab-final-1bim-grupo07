
package paquete06;

import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Departamento implements Serializable{
    
    private Propietario dueno;
    private Barrio barrio;
    private Ciudad ciudad; 
    private String nomEdificio; 
    private String UBdepartamento;  
    private Constructora contrustora; 
    private double metrosCua; 
    private double precioMeCua;
    private double precioFin;
    private double aliCuota;

    public Departamento(Propietario dueno, double precioMeCua, double metrosCua, double aliCuota, 
             Barrio barrio,Ciudad ciudad, String nomEdificio, String UBdepartamento,
             Constructora contrustora) {
        this.dueno = dueno;
        this.precioMeCua = precioMeCua;
        this.metrosCua = metrosCua;
        this.aliCuota = aliCuota;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.nomEdificio = nomEdificio;
        this.UBdepartamento = UBdepartamento;
        this.contrustora = contrustora;
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
    public void esatblecerNomEficio (String f){
        nomEdificio = f;
    }
    public void establecerUBdepartamento(String f){
        UBdepartamento = f;
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
    public void establecerAliCuota(double g){
        aliCuota = g;
    }
    public void establecerPrecioFinal(){
        precioFin = metrosCua * precioMeCua *(aliCuota * 12); 
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
    public String obtenerNomEdificio(){
        return nomEdificio;
    }
    public String obtenerUDdepartamento(){
        return UBdepartamento;
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
    public double obtenerAliCuota(){
        return aliCuota;
    }
    public double obtenerPrecioFin(){
        return precioFin;
    }
    @Override
    public String toString(){ 
        
        String cadena = String.format ("DEPARTAMENTO \n"); 
               cadena = String.format ("%s Nombre: %s\n Apellido %s\n"
                       + "Cedula: %s\n Barrio: %s\n Referencia "
                       + "del barrio: %s\n Cuidad: %s\n Provincia: %s\n Nombre "
                       + "de la contrustora: %s\n ID de la contrustora: %s\n "
                       + "Metros Cuadrados: %.2f\n Precio del Metro Cuadrado: %.2f\n"
                       + "Mensualidad: %.2f\n Precio Final: %.2f\n", cadena, 
                       obtenerDueno().obtenerNomrbe(), obtenerDueno().obtenerApellido(), 
                       obtenerDueno().obtenerIdentificacion(), obtenerBarrio().obtenerNombreBarrio(),
                       obtenerBarrio().obtenerRefernecia(),obtenerCuidad().obtenerNombreCiudad(),
                       obtenerCuidad().obtenerNombreProvincia(),obtenerConstructora().obtenerNombreConstructora(),
                       obtenerConstructora().obtenerIDContructora(),obtenerMestrozCua(),obtenerPrecioMetroCua(),
                       obtenerAliCuota(),obtenerPrecioFin());
        return cadena;
    }
}
