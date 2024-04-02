package christian.week05;

import java.io.File;

public class DateienZaehlenSummeGroessen {
    public static void main(String[] args) {

        File ordner = new File("C:\\Users\\schmi\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\christian");

        summeVonDateienUndGroessen(ordner);

    }

    public static void summeVonDateienUndGroessen(File ordner) {
        File[] ordnerArray = ordner.listFiles();
        int sum = 0;
        int sumOfFiles = 0;
        if (ordner.isDirectory()) {


            for (File x : ordnerArray) {
                if (x.isFile()) {
                    System.out.println("Datei: " + x.getName());
                    sum += x.length();
                    sumOfFiles += 1;
                } else {
                    System.out.println("directory: " + x.getName());
                    summeVonDateienUndGroessen(x);
                }

            }
            System.out.println("\nDie Anzahl der Dateien ist: " + sumOfFiles);
            System.out.println("\nDie Summe der Dateigroessen ist: " + sum);
        }
        else {
            System.out.println(ordner.getName() + "is not a directory");

        }


    }

}
