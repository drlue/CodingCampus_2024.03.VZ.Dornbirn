package irem.week05;

import ardijanla.ConsoleColors;

import java.io.File;
import java.nio.charset.CoderResult;

public class ListFilesByGyula {
    public static void main(String[] args) {
        String path = "C:\\Users\\Irem\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\irem";
        printDirectoryContent(path);
        System.out.println("======");
        System.out.println("Total size: " + sumFileSize(path));
    }

    public static void printDirectoryContent(String path){
        File f = new File(path);
        if (f.isDirectory()){
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()){
                    System.out.println(ConsoleColors.BLUE + files[i].getName() + ConsoleColors.RESET);
                } else {
                    System.out.println(files[i].getName() + " (" + files[i].length() + ")");
                }
            }
        } else {
            System.out.println(path + " is not a valid directory.");
        }
    }


    public static long sumFileSize(String path){
        long sum = 0L;
        File f = new File(path);
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    sum += files[i].length();
                }
            }
        } else if (f.isFile()){
            sum = f.length();
        } else {
            System.out.println(path + " is not a valid directory.");
        }
        return sum;
    }

}
