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
    public void verificarEstado(ArrayList<Heroe> getHeroes){
        //Encontrar como hacer para poder usar esto con todos mediante un for
       //poder ver si elegir el mutante
        for(int i=0;i<getHeroes.size();i++){
            Heroe act=getHeroes.get(i);
            if (act.getHp()<=0) {
                System.out.println(act.getNombre()+" ha sido derrotado");
            }else{
                System.out.println(act.getNombre()+" tiene "+act.getHp()+" de vida");
            }     
        }
     }
}