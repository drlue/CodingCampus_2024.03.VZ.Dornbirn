package christian.week06.zooEnglish;

import java.util.Vector;

public class Guardian {
    private String name;
    private Vector<Enclousure> guaEncVector;

    public Guardian(String name){
        this.name = name;
        guaEncVector = new Vector<>();
    }
}
