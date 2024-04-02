package christian.week05;

import java.io.File;
import java.util.Arrays;

public class FileSandbox {
    public static void main(String[] args) {
        File datei = new File("C:\\Users\\schmi\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\resources");

        System.out.println(datei.isDirectory());
        System.out.println(datei.isFile());
        System.out.println(datei.canRead());

        File ordner = new File(datei.getAbsolutePath()+"\\csv");
        String[]arr2 = ordner.list();
        System.out.println(Arrays.toString(arr2));


        String [] arr = datei.list();
        for(String x : arr){
            System.out.println("Datei: "+ x);
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
