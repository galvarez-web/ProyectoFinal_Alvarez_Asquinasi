import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Gremio g1=new Gremio();
        int op;
        
    do { System.out.println("Bienvenido a Krakoa");
        System.out.println("¿Que desea hacer?");
        System.out.println("1.Agregar mutantes");
        System.out.println("2.Subir nivel");
        System.out.println("3.Verificar vida");
        System.out.println("4.Calcular fuerza total");
        System.out.println("5.Salir");
        System.out.println("");
        op=sc.nextInt();
    switch (op) {
        case 1:
                System.out.println("");
                System.out.println("Nombre del mutante:");
                String nom=sc.next();
                System.out.println("Clase:");
                String cla=sc.next();
                System.out.println("Nivel:");
                int niv=sc.nextInt();
                System.out.println("HP:");
                int hp=sc.nextInt();
                g1.add(new Heroe(nom,cla,niv,hp));
                System.out.println("Mutante agregado");
                System.out.println("");
            break;
        case 2:
                System.out.println("");
                h1.getSubirNivel();
                System.out.println("");
            break;
        case 3:
                System.out.println("");
                g1.verificarEstado(g1.getHeroes());
                System.out.println("");
            break;
        case 4:
                System.out.println("");
                System.out.println("Calcular fuerza");
                System.out.println("");
            break;
        case 5:
                System.out.println("");
                System.out.println("Saliendo de la isla...");
            break;
        default:
            System.out.println("Opcion Invalida");
    }
    } while (op!=5);
        
    }
}