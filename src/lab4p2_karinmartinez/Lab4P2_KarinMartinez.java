
package lab4p2_karinmartinez;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_KarinMartinez {
static Scanner entrada = new Scanner (System.in);
    
    public static void main(String[] args) {
        ArrayList <Zonas> zona =new ArrayList();
        ArrayList <Escuadron> escuadrones =new ArrayList();
        ArrayList <Soldados> soldados =new ArrayList();
        ArrayList <Armas> armamento =new ArrayList();
        
        escuadrones.add(new Escuadron("Alpha"));
        (escuadrones.get(0)).setZona(new Zonas("america",3,4,7));
        soldados.add(new Infanteriapesada("karin","oficial",18,4,300));
        soldados.add(new Infanterialigera("Elias","suboficial",24,7,200));
        zona.add(new Zonas("america",3,4,7));
        (escuadrones.get(0)).add(new Escuadron("america", soldados,zona.get(0)));
        System.out.println("1) Crear zona");
        System.out.println("2) Listar zonas");
        System.out.println("3) Crear escuadron");
        System.out.println("4) Listar escuadrones");
        System.out.println("5) Eliminar escuadron");
        System.out.println("6) Añadir soldado a escuadron");
        System.out.println("7) Listar soldados de escuadron");
        System.out.println("8) Listar soldados de escuadron por tipo");
        System.out.println("9) Eliminar soldados de escuadron");
        System.out.println("10) Pelear");
        System.out.println("11) Salida");
        int opcion = entrada.nextInt();
        
        while (opcion !=4){
            switch (opcion){
                case 1: {
                    System.out.println("Ingrese el nombre de la zona");
                    nombre = entrada.next();
                    System.out.println("Ingrese el tamaño de la zona");
                    int tamaño = entrada.nextInt();
                    System.out.println("Ingrese la coordenada x de la zona");
                    int x = entrada.nextInt();
                    System.out.println("Ingrese la coordenada y de la zona");
                    int y = entrada.nextInt();
                    zona.add(new Zonas(nombre,tamaño,x,y));
                }break;
                case 2:{
                    String salida="";
                    for (Object o: zona) {
                        salida += zona.indexOf(o)+"- "+o+"\n";
                    }
                    System.out.println(salida);
                }break;
                case 3:{
                    System.out.println("Ingrese el nombre del escuadron");
                }
            }
        }
    }
    
}
