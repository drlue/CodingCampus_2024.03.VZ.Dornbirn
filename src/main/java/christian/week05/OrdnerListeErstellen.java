package christian.week05;

import java.io.File;
import java.util.Arrays;

public class OrdnerListeErstellen {
    public static void main(String[] args) {
        File ordner = new File("C:\\Users\\schmi\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\christian\\week05");
        File [] arr = ordner.listFiles();

        for (File x : arr) {
            System.out.printf("Name: %25s" + "  |  Grösse: %10s \n" ,x.getName(),x.length());
        }
    }

}
