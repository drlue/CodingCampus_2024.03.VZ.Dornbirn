package christian.week06.tiergarten;

import java.util.List;

public class Gehege {
    private String name;
    public List<Tier> tierListe;

    public Gehege(String name){
        this.name= name;
        this.tierListe = null;
    }
    public String getName (){
        return name;
    }
}
