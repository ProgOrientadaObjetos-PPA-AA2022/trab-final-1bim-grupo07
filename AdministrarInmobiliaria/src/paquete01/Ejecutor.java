
package paquete01;

import java.util.Scanner;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;
//Importamos todo lo que vamos a usar en el ejecutor
        
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nomrbeEdificio, UBdificio;
        Casa casa; 
        Departamento departamento;
        Propietario propietario;
        Barrio barrio; 
        Ciudad ciudad; 
        Constructora constructora;
        double precioMetro, metrosCua, aliCuota;
        int op, numeroCuartos; 
        //Declaramos las variables que vamos a ocupar en el metodo main 
        
        do {
            op = eso();
            switch(op){ //Creamos un switch para que el usuario puda elegir 
                        //dentro del menu de eleciones
                
                case 1: //En el caso hacemos que ingrese el precio de metro 
                        //cuadrado y demas
                    propietario = buscarpropietario();
                    barrio = buscarBarrio();
                    ciudad = buscarCiudad();
                    constructora = buscarConstructora();
                    System.out.print("Precio del metro cuadrado: \n");
                    precioMetro = sc.nextDouble();
                    System.out.print("Metros cuadrados: \n");
                    metrosCua = sc.nextDouble();
                    System.out.print("Ingrese el numero de cuartos: \n");
                    numeroCuartos = sc.nextInt();
                    casa = new Casa(precioMetro, metrosCua, numeroCuartos, propietario
                        ,barrio, ciudad, constructora);
                    casa.establecerCostoFinal();
                    EscrituraArchivosSecuecialCasa archivo = new 
                        EscrituraArchivosSecuecialCasa("datos/casa.txt");
                    archivo.establecerRegistroCasa(casa);
                    archivo.establecerSalidaCasa();
                    break;
                    
                case 2: //En el caso dos los datos del metros cuadra y demas pero adicional 
                        //pedimos la aliCuota y datos del edicio para llenar el departemento
                    propietario = buscarpropietario();
                    barrio = buscarBarrio();
                    ciudad = buscarCiudad();
                    constructora = buscarConstructora();
                    System.out.print("Precio del metro cuadrado: \n");
                    precioMetro = sc.nextDouble();
                    System.out.print("Metros cuadrados: \n");
                    metrosCua = sc.nextDouble();
                    System.out.print("Mensualidad: \n");
                    aliCuota = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nombre edificio: \n");
                    nomrbeEdificio = sc.nextLine();
                    System.out.print("Ubicacion de departamento dentro del edificio: \n");
                    UBdificio = sc.nextLine();
                    departamento = new Departamento(propietario,precioMetro,
                        metrosCua,aliCuota,barrio,ciudad, nomrbeEdificio, UBdificio, 
                        constructora);
                    EscrituraArchivosSecuecialDepartamento archivo2 = new 
                        EscrituraArchivosSecuecialDepartamento ("datos/departamento.txt");
                    archivo2.establecerRegistroDepartamento(departamento);
                    archivo2.establecerSalidaDepartamento();
                    break;
                    
                case 3: //En le caso tres pidimos los datos del propietario
                    System.out.print("Ingrese el nombre del propiertario: \n");
                    String nombrePropietario = sc.nextLine();
                    System.out.print("Ingres el apellido del propietario: \n");
                    String apellidoPropietario = sc.nextLine();
                    System.out.print("Ingrese la ID del propietario: \n");
                    String idpropietario = sc.nextLine();
                    propietario = new Propietario(nombrePropietario, apellidoPropietario, 
                        idpropietario);
                    EscrituraArchivosSecuecialPropietario archivo3 = new 
                        EscrituraArchivosSecuecialPropietario("datos/propietario.txt");
                    System.out.println(propietario);
                    archivo3.establecerRegistroPropietario(propietario);
                    archivo3.establecerSalidaPropietario();
                    break;
                    
                case 4: //En le caso cuatro pidimos los datos del barrio
                    System.out.print("Nombre del barrio: \n");
                    String nomBarrio = sc.nextLine();
                    System.out.print("Referencia barrio: \n");
                    String nombBarrio = sc.nextLine();
                    barrio = new Barrio(nomBarrio, nombBarrio);
                    EscrituraArchivosSecuecialBarrio archivo4 = new 
                        EscrituraArchivosSecuecialBarrio("data/barrio.txt");
                    System.out.print(archivo4.toString());
                    archivo4.establecerRegistroBarrio(barrio);
                    archivo4.establecerSalidaBarrio();
                    break;
                    
                case 5: //En le caso cinco pidimos los datos del ciudad
                    System.out.print("Ciudad: \n");
                    String nomCiudad = sc.nextLine();
                    System.out.print("Provincia: \n");
                    String nomProvincia = sc.nextLine();
                    EscrituraArchivosSecuecialCuidad archivo5 = new 
                        EscrituraArchivosSecuecialCuidad("datos/ciudad.txt");
                    ciudad = new Ciudad(nomCiudad, nomProvincia);
                    archivo5.establecerRegistroCiudad(ciudad);
                    archivo5.establecerSalidaCiudad();
                    break;
                    
                case 6: //En le caso seis pidimos los datos del constructora
                    System.out.print("Nombre Constuctora: \n");
                    String nomConstructora = sc.nextLine();
                    System.out.print("ID Constructora: \n");
                    String nomIDConstructora = sc.nextLine();
                    constructora = new Constructora (nomConstructora, nomIDConstructora);
                    EscrituraArchivosSecuecialConstructora archivo6 = new 
                        EscrituraArchivosSecuecialConstructora("datos/constructora.txt");
                    archivo6.establecerRegistroConstructora(constructora);
                    archivo6.establecerSalidaConstructora();
                    break;
                case 7: 
                    do{
                        op = menu2();
                        mostarListas(op);
                    }while (op != 0);
                    op = 7;
                    break;
            }        
        }    
        while(op != 0);
    }
    
    public static int eso(){ //Del sup proceso retorna el valor para que el switch
                             // sepa donde llevarnos 
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.print("Ingresar nueva casa: (1)\n");
        System.out.print("Ingresar nuevo departamento: (2)\n");
        System.out.print("Ingresar nuevo propietario: (3)\n");
        System.out.print("Ingresar nuevo barrio: (4)\n");
        System.out.print("Ingresar nueva ciudad: (5)\n");
        System.out.print("Ingresar nueva constructora: (6)\n");
        System.out.print("Ver lista: (7)\n");
        System.out.print("Salir del programa: (8)\n");
        op = sc.nextInt();
        return op;
    }
    
    public static int menu2(){ //Del sub proceso menu2 retorna el dato para saber 
                               // que listar
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.print("Listar casas: (1)\n");
        System.out.print("Listar departamento: (2)\n");
        System.out.print("Listar propietario: (3)\n");
        System.out.print("Listar barrio: (4)\n");
        System.out.print("Listar ciudad: (5)\n");
        System.out.print("Listar construntora: (6)\n");
        System.out.print("Regresar al menu anterio: (7)\n");
        op = sc.nextInt();
        return op;
    }
    public static Propietario buscarpropietario(){
        Scanner sc =  new Scanner(System.in);
        String identificacion; 
        String nombres;       //En este sub proceso el programa busca en base a  
        String apellido;      //lo ingresado por el usuario
        String nombreArchivo = "datos/propietario.txt";
        System.out.println("Ingrese identificacion del propietario: ");
        identificacion = sc.nextLine();
        Propietario propietarioBuscar;
        LecturaArchivosSecuencial lectura = new LecturaArchivosSecuencial(nombreArchivo);
        lectura.establecerIdenticador(identificacion);
        lectura.establecerPropietarioBuscado();
        propietarioBuscar = lectura.obtenerPropietarioBuscado();
        if (propietarioBuscar != null){
            System.out.printf("Propietario hallado: %s", propietarioBuscar);
            return propietarioBuscar;
        }else {
            System.out.println("Propietario no hallado.");
            System.out.println("Ingrese los datos de un nuevo propietario");
            System.out.println("Nombre: ");
            nombres = sc.nextLine();
            System.out.println("Apellido: ");
            apellido = sc.nextLine();
            System.out.println("Identificacion: ");
            identificacion = sc.nextLine();
            Propietario prop = new Propietario(nombres, apellido, identificacion);
            EscrituraArchivosSecuecialPropietario archivo = new 
                EscrituraArchivosSecuecialPropietario(nombreArchivo);
            archivo.establecerRegistroPropietario(prop);
            archivo.establecerSalidaPropietario();
            return prop;
        }
    } 
    public static Barrio buscarBarrio(){
        Scanner sc =  new Scanner(System.in); 
        String nombreBarrio;
        String referencia;
        String nombreArchivo = "datos/barrio.txt";
        System.out.println("Ingrese nombre del barrio: ");
        nombreBarrio = sc.nextLine();
        Barrio BarrioBuscar;
        LecturaArchivosSecuencial lectura = new LecturaArchivosSecuencial(nombreArchivo);
        lectura.establecerIdenticador(nombreBarrio);
        lectura.establecerBarrioBuscado();
        BarrioBuscar = lectura.obtenerBarrioBuscado();
        if (BarrioBuscar != null){
            System.out.printf("Barrio hallado: %s", BarrioBuscar);
            return BarrioBuscar;
        }else {
            System.out.println("Barrio no hallado.");
            System.out.println("Ingrese los datos de un nuevo Barrio");
            System.out.println("Nombre: ");
            nombreBarrio = sc.nextLine();
            System.out.println("Apellido: ");
            referencia = sc.nextLine();
            Barrio bar = new Barrio(nombreBarrio,referencia);
            EscrituraArchivosSecuecialBarrio archivo2 = new 
                EscrituraArchivosSecuecialBarrio(nombreArchivo);
            archivo2.establecerRegistroBarrio(bar);
            archivo2.establecerSalidaBarrio();
            return bar;        
        }
    }
    public static Ciudad buscarCiudad(){
        Scanner sc =  new Scanner(System.in); 
        String nombreCuidad;
        String provincia;
        String nombreArchivo = "datos/ciudad.txt";
        System.out.println("Ingrese nombre del barrio: ");
        nombreCuidad = sc.nextLine();
        Ciudad CuidadBuscar;
        LecturaArchivosSecuencial lectura = new LecturaArchivosSecuencial(nombreArchivo);
        lectura.establecerIdenticador(nombreCuidad);
        lectura.establecerCuidadBuscado();
        CuidadBuscar = lectura.obtenerCiudadBuscado();
        if (CuidadBuscar != null){
            System.out.printf("Barrio hallado: %s", CuidadBuscar);
            return CuidadBuscar;
        }else {
            System.out.println("Ciudad no hallado.");
            System.out.println("Ingrese los datos de una nueva Ciuadad");
            System.out.println("Cuidad: ");
            nombreCuidad = sc.nextLine();
            System.out.println("Provincia: ");
            provincia = sc.nextLine();
            Ciudad cui = new Ciudad(nombreCuidad,provincia);
            EscrituraArchivosSecuecialCuidad archivo3 = new EscrituraArchivosSecuecialCuidad(nombreArchivo);
            archivo3.establecerRegistroCiudad(cui);
            archivo3.establecerSalidaCiudad();
            return cui;        
        }
    }
    public static Constructora buscarConstructora(){
        Scanner sc =  new Scanner(System.in); 
        String Constructora;
        String idConstructora;
        String nombreArchivo = "datos/constructora.txt";
        System.out.println("Ingrese id de la constructora: ");
        idConstructora = sc.nextLine();
        Constructora ConstructoraBuscar;
        LecturaArchivosSecuencial lectura = new LecturaArchivosSecuencial(nombreArchivo);
        lectura.establecerIdenticador(idConstructora);
        lectura.establecerConstructoraBuscado();
        ConstructoraBuscar = lectura.obtenerConstructoraBuscado();
        if (ConstructoraBuscar != null){
            System.out.printf("Constructora hallada: %s", ConstructoraBuscar);
            return ConstructoraBuscar;
        }else {
            System.out.println("Cuidad no hallado.");
            System.out.println("Ingrese los datos de una nueva Contructora");
            System.out.println("Nombre contructora: ");
            Constructora = sc.nextLine();
            System.out.println("Id contructora: ");
            idConstructora = sc.nextLine();
            Constructora cons = new Constructora(Constructora,idConstructora);
            EscrituraArchivosSecuecialConstructora archivo4 = new EscrituraArchivosSecuecialConstructora(nombreArchivo);
            archivo4.establecerRegistroConstructora(cons);
            archivo4.establecerSalidaConstructora();
            return cons;        
        }
    }
    public static void mostarListas(int ops2){
        switch (ops2){     //Este sub proceso ensena las listas que el ususario ingrese
            case 1: 
                LecturaArchivosSecuencial lectura = new LecturaArchivosSecuencial("datos/casa.txt");
                lectura.establerListaCasas();
                System.out.printf("%s", lectura.imprimirListaCasa());
                lectura.cerrarArchivo();
                break;
            case 2:
                LecturaArchivosSecuencial lectura2 = new LecturaArchivosSecuencial("datos/departamento.txt");
                lectura2.establecerListaDepartamento();
                System.out.printf("%s", lectura2.imprimirListaDepartamento());
                lectura2.cerrarArchivo();
                break;
            case 3:
                LecturaArchivosSecuencial lectura3 = new LecturaArchivosSecuencial("datos/propietario.txt");
                lectura3.establecerListaPropietario();
                System.out.printf("%s", lectura3.imprimirListaDepartamento());
                lectura3.cerrarArchivo();
                break;
            case 4:
                LecturaArchivosSecuencial lectura4 = new LecturaArchivosSecuencial("datos/barrio.txt");
                lectura4.establecerListaBarrio();
                System.out.printf("%s", lectura4.imprimitBarrio());
                lectura4.cerrarArchivo();
                break;
            case 5:
                LecturaArchivosSecuencial lectura5 = new LecturaArchivosSecuencial("datos/ciudad.txt");
                lectura5.establecerListaCiudad();
                System.out.printf("%s", lectura5.imprimirCiudad());
                lectura5.cerrarArchivo();
                break;
            case 6:
                LecturaArchivosSecuencial lectura6 = new LecturaArchivosSecuencial("datos/constructora.txt");
                lectura6.establecerListaConstructora();
                System.out.printf("%s", lectura6.imprimirConstructora());
                lectura6.cerrarArchivo();
                break;
        }
    }
} 