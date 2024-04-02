package gyula.week05;

import java.io.File;

public class FileSystemExample {
    public static void main(String[] args) {
        File f = new File("/Users/gyula.horvath/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/gyula/week05/FileSystemExample.java");

        System.out.printf("File %s.\n", f.exists()?"exist":"doesn't exist");
        System.out.printf("File Descriptor is %sa file.\n", f.isFile()?"":"not ");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println("Size: " + f.length()); // Mit Comment

        File directory = f.getParentFile();
        System.out.printf("Directory %s.\n", directory.exists()?"exist":"doesn't exist");
        System.out.printf("File Descriptor of the directory is %sa file.\n", directory.isFile()?"":"not ");
        System.out.printf("File Descriptor of the directory is %sa directory.\n", directory.isDirectory()?"":"not ");

        File[] dirContent = directory.listFiles();
        for (File x : dirContent){
            System.out.println("File: " + x.getName());
        }

    }
}
