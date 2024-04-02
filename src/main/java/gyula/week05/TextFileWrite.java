package gyula.week05;

import gyula.week03.PrintArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class TextFileWrite {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/gyula.horvath/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/gyula/week05/aaaaaa/hello.txt", true);
            PrintStream ps = new PrintStream(fos);

            ps.println("Hello World! " + new Date().toString());
            ps.close();
        } catch (FileNotFoundException fnfe){
            System.out.println("The file is not writable...");
        }
    }
}
