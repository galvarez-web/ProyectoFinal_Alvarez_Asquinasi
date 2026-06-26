

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
    public void getSubirNivel(){
        //elegir de que personaje subir el nievl
        //hacer un minimenu que me permita elegir a que heroe subir
        nivel=nivel+1;
        System.out.println(nombre+" ha subido al nivel "+nivel);
    
    }
 
    
    public void calcularFuerza(){//Calcular en base al nivel de todos los personajes
        
    }
}