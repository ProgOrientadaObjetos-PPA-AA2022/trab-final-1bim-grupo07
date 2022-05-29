
package paquete01;

import java.util.Scanner;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;
        
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
        switch (g){
        case 1: System.out.print("Casa! \n");
                System.out.print("A conticunacion le solicitamos algunos datos \n");
                System.out.print("Nombre del propietario: \n");
                String nombre = sc.nextLine();
                System.out.print("Apellido del propietario: \n");
                String apellido = sc.nextLine();
                System.out.print("Cedula del propietario: \n");
                String cedula = sc.nextLine();
                System.out.print("");
                
                
                break;
        case 2: 
        
        
        
                break;
        case 3: 
                
                
                
                
                break;
        }
    }
}
