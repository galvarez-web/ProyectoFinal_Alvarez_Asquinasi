

public class Heroe{
    private String nombre;
    private String clase;
    private int nivel;
    private int hp;
    public Heroe(String nombre, String clase, int nivel, int hp){
        this.nombre=nombre;
        this.clase=clase;
        this.nivel=nivel;
        this.hp=hp;
     }
     public String getNombre() {
         return nombre; 
        }
    public int getHp() {
         return hp; 
        }
    public void subirNivel(){
        //elegir de que personaje subir el nievl
        //hacer un minimenu que me permita elegir a que heroe subir
        nivel=nivel+1;
        hp=hp+10;
        System.out.println(nombre+" ha subido al nivel "+nivel+" y cuenta con "+hp+" HP");
    
    }
 
    
    public int calcularFuerza(){//Calcular en base al nivel de todos los personajes
        int fuerza=0; 
        if(hp>=0){ 
            if (clase.equals("epsilon")) {
                fuerza=nivel*2;
                System.out.println("La fuerza de "+nombre+" es "+fuerza);
            }else if (clase.equals("delta")) {
                fuerza=nivel*4;
                 System.out.println("La fuerza de "+nombre+" es "+fuerza);
            }else if (clase.equals("gamma")) {
                fuerza=nivel*8;
                 System.out.println("La fuerza de "+nombre+" es "+fuerza);
            }else if (clase.equals("beta")) {
                fuerza=nivel*16;
                 System.out.println("La fuerza de "+nombre+" es "+fuerza);
            }else if (clase.equals("alfa")) {
                fuerza=nivel*32;
                 System.out.println("La fuerza de "+nombre+" es "+fuerza);
            }else if (clase.equals("omega")) {
                fuerza=nivel*64;
                 System.out.println("La fuerza de "+nombre+" es "+fuerza);
          
            }

        }
         return fuerza;
   }
}