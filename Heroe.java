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
    public void subirNivel(){//elegir de que personaje subir el nievl
        nivel=nivel+1;
        System.out.println(nombre+" ha subido al nivel "+nivel);
    
    }
    public int getverificarEstado(){//Encontrar como hacer para poder usar esto con todos mediante un for
        
        }
    
    public void calcularFuerza(){//Calcular en base al nivel de todos los personajes

    }
}