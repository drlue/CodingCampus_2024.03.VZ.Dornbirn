package gyula.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileRead {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("/Users/gyula.horvath/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/gyula/week05/FileSystemExample.java"));
            while (sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException fnfe){
            System.out.println("This file doesn't exists or not readable...");
        }
    }
}
