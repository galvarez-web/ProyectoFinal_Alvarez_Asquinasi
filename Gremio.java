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
    public void mostrar(Heroe h){
        for(int i=0;i<getHeroes().size();i++){
            System.out.println(h);
        }
    }
    public void SubirNivel(int i){
        heroes.get(i-1).subirNivel();
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
          
            System.out.println("La fuerza de "+h+" es ");
        }
        return total;
     }
     }
 
    
