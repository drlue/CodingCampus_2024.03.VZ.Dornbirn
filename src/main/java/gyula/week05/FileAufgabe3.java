package gyula.week05;

import ardijanla.ConsoleColors;

import java.io.File;

public class FileAufgabe3 {
    public static void main(String[] args) {
        String dirName = "/Users/gyula.horvath/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/";
        listDirectoryRecursive("", dirName);

    }

    public static void listDirectoryRecursive(String prefix, String name){
        File f = new File(name);
        if (f.isDirectory()){
            File[] arrFile = f.listFiles();
            FileAufgabe1.bubbleSortByFileSizeDesc(arrFile);
            for (File fi : arrFile){
                if (fi.isFile()) {
                    System.out.printf("%s%s\n", prefix,fi.getName());
                } else {
                    System.out.printf("%s%s%s%s\n", prefix, ConsoleColors.BLUE, fi.getName(), ConsoleColors.RESET);
                    listDirectoryRecursive(prefix + " |- ", fi.getAbsolutePath());
                }
            }
        } else {
            System.out.println(f.getAbsolutePath() + " is not a directory.");
        }
    }
}
