package gyula.week08;

import gyula.week07.zoo.Veterian;
import gyula.week08.vererbung.DuesenJet;
import gyula.week08.vererbung.Flugzeug;
import gyula.week08.vererbung.LuftFahrtzeug;

import java.util.Vector;

public class VererbuungExample {
    public static void main(String[] args) {
        LuftFahrtzeug luft = new LuftFahrtzeug("LuFi", 1);
        Flugzeug flug = new Flugzeug("Papierflugzeug", 1, 10);
        DuesenJet jet = new DuesenJet("Bombardier C180", 130000, 21000, 99999);

        System.out.println(luft);
        System.out.println(flug);
        System.out.println(jet);

        LuftFahrtzeug l = luft;
        System.out.println(l);
        l = flug;
        System.out.println(l);
        l = jet;
        System.out.println(l);

        Flugzeug f = jet;
        System.out.println(f);
        f = flug;
        System.out.println(f);
        // f = luft; <-- geht nicht !!!
        //System.out.println(f);

        Vector<LuftFahrtzeug> vec = new Vector<>();
        vec.add(luft);
        vec.add(flug);
        vec.add(jet);
        System.out.println(vec);

        for (LuftFahrtzeug lf : vec){
            doSomeMagic(lf);
        }
        for (LuftFahrtzeug lf : vec){
            System.out.println(lf.getName());
        }
    }

    private static void doSomeMagic(LuftFahrtzeug lf){
        if (lf instanceof DuesenJet){
            DuesenJet dj = (DuesenJet)lf;
            System.out.println("Thrust: " + dj.getThrust());
        } else {
            System.out.println("Name: " + lf.getName());
        }
    }
}
