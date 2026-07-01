import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Gremio g1=new Gremio();
        g1.add(new Heroe("Ciclope","Alfa",16,100));
        int op;
        
    do { System.out.println("Bienvenido a Krakoa");
        System.out.println("¿Que desea hacer?");
        System.out.println("1.Agregar mutantes");
        System.out.println("2.Mostrar mutantes");
        System.out.println("3.Subir nivel");
        System.out.println("4.Verificar vida");
        System.out.println("5.Calcular fuerza total");
        System.out.println("6.Salir");
        System.out.println("");
        op=sc.nextInt();
    switch (op) {
        case 1:{
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
            }
        case 2:{
                
        }
        case 3:{
                System.out.println("");
                System.out.println("Seleccione el mutante que desea subir");
                int i=sc.nextInt();
                g1.SubirNivel(i);
                System.out.println("");
            break;
            }
        case 4:{
                System.out.println("");
                g1.verificarEstado(g1.getHeroes());
                System.out.println("");
            break;
            }
        case 5:{
                 int sumaTotal = 0; // Variable para guardar la suma
                System.out.println("\n--- Calculando Poder de la Isla ---");
                
                for (int i = 0; i < g1.getHeroes().size(); i++) {
                    // Sumamos el resultado que devuelve cada héroe
                    sumaTotal += g1.getHeroes().get(i).calcularFuerza(); 
                }
                
                // Mostramos el texto final fuera del for
                System.out.println("-----------------------------------");
                System.out.println("EL PODER TOTAL DE KRAKOA ES: " + sumaTotal);
                break;
            }
        case 6:{
                System.out.println("");
                System.out.println("Saliendo de la isla...");
            break;
            }
        default:
            System.out.println("Opcion Invalida");
    }
    } while (op!=5);
        
    }
}