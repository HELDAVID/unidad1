
package actividad_2_hub;
/*
Autores:
https://github.com/HELDAVID/unidad1.git
Jefferson Alexander Rojas Silva
Fabio Arturo Antolínez Sastoque
Helio Espinosa
 */
import java.util.Scanner;

public class Main {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        String modelo="",nombreMecanico="";
int nivelMecanico=0, opcion=0, tipoViaje=0;
        System.out.println("ingrese el modelo del avion");
     modelo = s.nextLine();
     Avion a = new Avion();
     a.setModelo(modelo);
        System.out.println("ingre el nombre del mecanico");
        nombreMecanico=s.nextLine();
        do{
            System.out.println("ingrese el nivel del mecanico (1.nivel 1/2.nivel 2)");
     nivelMecanico=Integer.parseInt(s.nextLine());
     
    }while(nivelMecanico!=1&&nivelMecanico!=2);
        Mecanico m=new Mecanico();
    m.setNombre(nombreMecanico);
    m.setNivel(nivelMecanico);
    a.setMecanico(m);
        System.out.println("avion y mecanico creados");
        System.out.println("menú de opciones, ingrese numero de opcion");
        do{
            System.out.println("1.realizar vuelo");
            System.out.println("2.cargar combustible");
            System.out.println("3.realizar mentención");
            System.out.println("4.ver cantidad de vuelos");
            System.out.println("5.ver cantidad de mantenciones");
            System.out.println("6.ver kilometraje");           
            System.out.println("7.ver nivel de combustible ");
            System.out.println("8.salir");
            opcion=Integer.parseInt(s.nextLine());
            switch(opcion){
                case 1:
                    do{
                        System.out.println("ingrese el tipo de viaje(1.nacional/2.internacional)");
                        tipoViaje=Integer.parseInt(s.nextLine());
                        
                    }while(tipoViaje<1&&tipoViaje>2);
                    a.realizarVuelo(tipoViaje);// retoma class avion
                    break;
                case 2:a.actualizarCombustible(m.cargadorCombustible());//primero hace lo del parentesis.dependiendo del parametro ...retoma
                break;
                case 3:a.recibirMantencion(m.relizarMantencion());
                break;
                case 4:System.out.println("la cantidad de vuelos es "+a.getCantidadVuelos());
                break;
                case 5:System.out.println("la cantidad de mantenciones "+a.getCantidadMantenciones());
                break;
                case 6: System.out.println("la cantidad de kilometraje es "+a.getKilometraje()+"Kms");
                break;
                case 7:System.out.println("el nivel se combustible es "+a.getCombustible());
                break;
            }
        }while(opcion!=8);
        System.out.println("fin aplicaion");
  }
}

