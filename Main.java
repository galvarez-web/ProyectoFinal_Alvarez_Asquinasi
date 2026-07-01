import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Gremio g1=new Gremio();
        g1.add(new Heroe("Ciclope","alfa",16,100));
        int op=0;
        
    do { System.out.println("Bienvenido a Krakoa");
        System.out.println("¿Que desea hacer?");
        System.out.println("1.Agregar mutantes");
        System.out.println("2.Mostrar mutantes");
        System.out.println("3.Subir nivel");
        System.out.println("4.Verificar vida");
        System.out.println("5.Calcular fuerza total");
        System.out.println("6.Salir");
        System.out.println(""); 
       while (true) {
          try{
             op=sc.nextInt();
             break;
        }catch(Exception e){
            System.out.println("Debe ingresar una opcion numerica");
            sc.nextLine();
        }
       }  
    switch (op) {
        case 1:{
                System.out.println("");
                System.out.println("Nombre del mutante:");
                String nom=sc.nextLine();
                while (nom.trim().isEmpty()) {
                    System.out.println("Ingrese un nombre valido");
                    nom=sc.nextLine();
                }     
                System.out.println("Clase:");
                String cla=sc.next().toLowerCase();
                while (
                    !cla.equalsIgnoreCase("epsilon")&&
                    !cla.equalsIgnoreCase("delta")&&
                    !cla.equalsIgnoreCase("gamma")&&
                    !cla.equalsIgnoreCase("beta")&&
                    !cla.equalsIgnoreCase("alfa")&&
                    !cla.equalsIgnoreCase("omega")
                ) {
                    System.out.println("Clase invalida");
                    cla=sc.nextLine().toLowerCase();
                }
                System.out.println("Nivel:");
                int niv=0;
                 while (true) {
                     try{
                         niv=sc.nextInt();
                         while (niv<=0 || niv>=100) {
                              System.out.println("Nivel invalido, permitido solo del 1 al 99");
                              niv=sc.nextInt();
                 } break;
                } catch(Exception e){
                    System.out.println("Debe introducir un numero");
                    sc.nextLine();
                }
              }     
                int hp=0;
                while (true) {
                     try {
                        System.out.println("HP:");
                        hp=sc.nextInt();
                        while (hp>750) {
                            System.out.println("Parametro invalido de vida");
                            hp=sc.nextInt();
                }break;
            } catch (Exception e) {
                       System.out.println("Debe escribir un numero");
                       sc.nextLine();
                }
            }  
                g1.add(new Heroe(nom,cla,niv,hp));
                System.out.println("Mutante agregado");
                System.out.println("");
            break;
            }
        case 2:{
                System.out.println("");
                g1.mostrar();
                System.out.println("");
            break;
        }
        case 3:{
                System.out.println("");
                System.out.println("Seleccione el mutante que desea subir");
                System.out.println("");
                g1.mostrar();
                int i=0;
                while (true) {
                     try{
                          i=sc.nextInt();
                          while (i<=0 || i>g1.getHeroes().size()) {
                              System.out.println("Seleccione un personaje de la lista");
                             i=sc.nextInt();
                } break;
            }catch(Exception e){
                System.out.println("Debe de escribir un numero");
                sc.nextLine();
             } 
            }
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
             
            for(Heroe h : g1.getHeroes()){
            int fuerza = h.calcularFuerza();
              System.out.println("La fuerza de "+ h.getNombre() + " es "+ fuerza);
            }
            System.out.println("");
            System.out.println("El poder total de Krakoa es de " + g1.fuerzaTotal()+ " unidades ");
            System.out.println("");
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
    } while (op!=6);
        sc.close();
    }
  
}