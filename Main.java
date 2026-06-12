import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Heroe h1=new Heroe("Ciclope", "Alpha", 16, 100);
        int op;
        
    do { System.out.println("");
        System.out.println("1.Agregar");
        System.out.println("2.Subir nivel");
        System.out.println("3.Verificar vida");
        System.out.println("4.Calcular fuerza total");
        System.out.println("5.Salir");
        op=sc.nextInt();
    switch (op) {
        case 1:
            
            break;
        case 2:

            break;
        case 3:

            break;
        case 4:

            break;
        case 5:

            break;
        default:
            throw new AssertionError();
    }
    } while (op!=5);
        
    }
}