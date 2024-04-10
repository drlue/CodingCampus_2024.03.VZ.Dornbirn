package ardijanla.week05;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEinlesenUndAusgeben {
    public static void main(String[] args) {


        Path path = Paths.get("C:\\Users\\kaar\\Desktop\\Erster Ordner\\output1.txt");


        String line = null;
        try {
            line = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(line);


    }
}
