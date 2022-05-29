
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Departamento {
    
    private Propietario dueno;
    private Barrio barrio;
    private Ciudad ciudad; 
    private String nomEdificio; 
    private String UBdepartamento;  
    private Constructora contrustora; 

    public Departamento(Propietario dueno, Barrio barrio,Ciudad cuidad,Constructora contrustora) {
        this.dueno = dueno;
        this.barrio = barrio;
        this.ciudad = cuidad;
        this.contrustora = contrustora;
    }
    public Departamento(String nomEdificio, String UBdepartamento) {
        this.nomEdificio = nomEdificio;
        this.UBdepartamento = UBdepartamento;
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
    @Override
    public String toString(){ 
        
        String cadena = String.format ("DEPARTAMENTO \n"); 
               cadena = String.format ("%s Nombre: %s\n Apellido %s\n"
                       + "Cedula: %s\n Barrio: %s\n Referencia "
                       + "del barrio: %s\n Cuidad: %s\n Provincia: %s\n Nombre "
                       + "de la contrustora: %s\n ID de la contrustora: %s\n", cadena, 
                       obtenerDueno().obtenerNomrbe(), obtenerDueno().obtenerApellido(), 
                       obtenerDueno().obtenerIdentificacion(), obtenerBarrio().obtenerNombreBarrio(),
                       obtenerBarrio().obtenerRefernecia(),obtenerCuidad().obtenerNombreCiudad(),
                       obtenerCuidad().obtenerNombreProvincia(),obtenerConstructora().obtenerNombreConstructora(),
                       obtenerConstructora().obtenerIDContructora());
        return cadena;
    }
}
