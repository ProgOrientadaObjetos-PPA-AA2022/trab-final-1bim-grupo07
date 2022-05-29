
package paquete01;

import java.util.Scanner;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;
//Importamos todos los paquetes para poder usalos dentro del ejecutor. 
        
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g;
        
        System.out.print("-------------------------------------\n");
        System.out.print("|              Bienvenido            |\n");
        System.out.print("-------------------------------------\n");
        System.out.print("Selecione si desea casa o departameto \n");
        System.out.print("Marque 1 si desea Casa y 2 si desea departamento\n");
        g = sc.nextInt();
        switch (g){ //Añadimos un switch para que el usuario tenga opcion a escoger.
        case 1: System.out.print("CASA! \n"); //En el caso de 1 le salta todas
                                              // las opciones de Casa. 
                System.out.print("A conticunacion le solicitamos algunos datos \n");
                System.out.print("Nombre del propietario: \n");
                String nombre = sc.nextLine();
                System.out.print("Apellido del propietario: \n");
                String apellido = sc.nextLine();
                System.out.print("Cedula del propietario: \n");
                String cedula = sc.nextLine();
                Propietario ac = new Propietario(nombre,apellido,cedula);
                System.out.print("Barrio: \n");
                String barrio = sc .nextLine();
                System.out.print("Referencia del barrio: \n");
                String referencia = sc.nextLine();
                Barrio df = new Barrio(barrio,referencia);
                System.out.print("Ciudad: \n");
                String ciudad = sc.nextLine();
                System.out.print("Provincia: \n");
                String provincia = sc.nextLine();
                Ciudad ed = new Ciudad(ciudad,provincia);
                System.out.print("Nombre de la contructora: \n");
                String constructora = sc.nextLine();
                System.out.print("ID de la constructora: \n");
                String IDconstructora = sc.nextLine();
                Constructora ir = new Constructora(constructora,IDconstructora);
                Casa casa1 = new Casa(ac, df, ed, ir);
                System.out.print(casa1);
                
                break;
        case 2: 
                System.out.print("DEPARTAMENTO! \n");//En el caso de 2 le salta todas
                                              // las opciones de Departamento.
                System.out.print("A conticunacion le solicitamos algunos datos \n");
                System.out.print("Nombre del propietario: \n");
                String nombreD = sc.nextLine();
                System.out.print("Apellido del propietario: \n");
                String apellidoD = sc.nextLine();
                System.out.print("Cedula del propietario: \n");
                String cedulaD = sc.nextLine();
                Propietario tp = new Propietario(nombreD,apellidoD,cedulaD);
                System.out.print("Barrio: \n");
                String barrioD = sc .nextLine();
                System.out.print("Referencia del barrio: \n");
                String referenciaD = sc.nextLine();
                Barrio eo = new Barrio(barrioD,referenciaD);
                System.out.print("Ciudad: \n");
                String ciudadD = sc.nextLine();
                System.out.print("Provincia: \n");
                String provinciaD = sc.nextLine();
                Ciudad we = new Ciudad(ciudadD,provinciaD);
                System.out.print("Nombre del eficio: \n");
                String edificio = sc.nextLine();
                System.out.println("Ubicacion del departamento en le eficio: ");
                String referedificio = sc.nextLine();
                Departamento tv = new Departamento(edificio,referedificio); 
                System.out.print("Nombre de la contructora: \n");
                String constructoraD = sc.nextLine();
                System.out.print("ID de la constructora: \n");
                String IDconstructoraD = sc.nextLine();
                Constructora er = new Constructora(constructoraD,IDconstructoraD);
                Departamento qw = new Departamento(tp, eo ,we ,er ,tv);
                System.out.print(qw);
                
                
            
                break;
        case 3: //En el caso 3 al no ser un numerp valido los saldra un notificacion inficando.
                System.out.print("Numero no valido.");
                break;
        }
    }
}
