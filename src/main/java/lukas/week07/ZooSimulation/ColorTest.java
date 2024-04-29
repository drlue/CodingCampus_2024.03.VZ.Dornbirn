package lukas.week07.ZooSimulation;

import java.util.Collections;
import java.util.Vector;

public class ColorTest {

    public static void main(String[] args) {

//        String name = "\033[0;31mSandro\033[0m";
//        String name1 = "\033[0;34mLukas\033[0m";

        String name = "Sandro";
        String name1 = "Lukas";

        Vector<String> names = new Vector<>();
        names.add(name);
        names.add(name1);
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);


    }

}
