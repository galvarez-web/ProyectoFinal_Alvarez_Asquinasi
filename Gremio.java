import java.util.ArrayList;
public class Gremio{
    private ArrayList<Heroe>heroes;
    public Gremio(){
        this.heroes=new ArrayList<>();
    }   
    public ArrayList<Heroe> getHeroes(){
        return heroes;
    }
    public void add(Heroe h){
        heroes.add(h);
    }   
    public void mostrar(){
        for(int i=0;i<getHeroes().size();i++){
            Heroe act=heroes.get(i);
            if (act.getHp()>0) {
                  System.out.println((i+1)+".Nombre: "+act.getNombre()+" Clase: "+act.getClase());
            }else{
                 System.out.println((i+1)+".Nombre:"+act.getNombre()+" Clase:"+act.getClase()+"  (DERROTADO)");
            }
          
        }
    }
    public void SubirNivel(int i){
        Heroe act=heroes.get(i-1);
        if (act.getHp()>0) {
               heroes.get(i-1).subirNivel();
        }else{
            System.out.println("No se puede subir de nivel a los derrotados");
        }
    
    }
    public void verificarEstado(ArrayList<Heroe> getHeroes){

        for(int i=0;i<getHeroes.size();i++){
            Heroe act=getHeroes.get(i);
            if (act.getHp()<=0) {
                System.out.println(act.getNombre()+" ha sido derrotado");
            }else{
                System.out.println(act.getNombre()+" tiene "+act.getHp()+" de vida");
            }     
        }
     }
     public int fuerzaTotal(){
        int total=0;
        for(Heroe h:heroes){
            int fuerza=h.calcularFuerza();
             total=total+fuerza;
        }
        return total;
     }
     }
 
    
