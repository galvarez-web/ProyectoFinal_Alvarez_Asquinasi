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
    public String getClase(){
        return clase;
    }
    public int getNivel(){
        return nivel;
    }
    public int getHp() {
         return hp; 
        }
    public void subirNivel(){
        nivel=nivel+1;
        hp=hp+10;
        System.out.println(nombre+" ha subido al nivel "+nivel+" y cuenta con "+hp+" HP");
    
    }
 
    
    public int calcularFuerza(){//Calcular en base al nivel de todos los personajes 
        if(hp<=0){ 
            return 0;
        }
         if (clase.equals("epsilon")) {
           return nivel*2;
         }else if (clase.equals("delta")) {
             return nivel*4;
         }else if (clase.equals("gamma")) {
              return nivel*8;
         }else if (clase.equals("beta")) {
               return nivel*16;
        }else if (clase.equals("alfa")) {
              return nivel*32;
        }else if (clase.equals("omega")) {
              return nivel*64;
          
          }
           return 0;
        }
        
   }
