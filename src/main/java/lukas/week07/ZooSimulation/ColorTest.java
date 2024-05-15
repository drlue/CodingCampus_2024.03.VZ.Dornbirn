package lukas.week07.ZooSimulation;

import java.util.Collections;
import java.util.Vector;

public class ColorTest {

    public static void main(String[] args) {

        String name = "\033[38;2;0;125;255;48;2;155;0;0mSandro\033[0m";
        String name1 = "\033[0;34;51mLu\033[54mkas\033[0m";
        String name2 = "\033[38;2;0;255;0;1;48;2;155;0;0mGyula\033[0m";

        //String name = "Sandro";
        //String name1 = "Lukas";

        Vector<String> names = new Vector<>();
        names.add(name);
        names.add(name1);
        names.add(name2);
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);


    }

}
