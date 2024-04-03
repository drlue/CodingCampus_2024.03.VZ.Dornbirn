package demian.week06.day02;

import java.io.File;

public class DateienZaehlenundSummen {
    public static void main(String[] args) {

        System.out.println("\nTeilaufgabe 1:");
        printFilesCount("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/demian");
        System.out.println("\nTeilaufgabe 2:");
        printLargestFilesize("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/demian/week05/day04");
    }

    public static void printLargestFilesize(String Pfad){
        File directory = new File(Pfad);
        long largestfilesize = 0;
        if (directory.isDirectory()){
            File[] files = directory.listFiles();
            for (File file : files){
                if (file.isFile()){
                    if (file.length() > largestfilesize){
                        largestfilesize = file.length();
                    }
                }
            }
        }
        System.out.println("The largest file of the directory:\n" + directory + "\nis: "+ largestfilesize);
    }


    public static void printFilesCount(String pfad) {
        File directory = new File(pfad);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            int filecounter = 0;
            int directorycounter = 0;
            for (File file : files) {
                if (file.isFile()) {
                    filecounter++;
                } else if (file.isDirectory()) {
                    directorycounter++;
                }
            }
            System.out.println("Das Verzeichnis" + directory + "\nenthält " + filecounter + " files und " + directorycounter + " directories.");
        } else {
            System.out.println("Der angegebene Pfad ist kein Verzeichnis.");
        }
    }
}
