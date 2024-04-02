package irem.week05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriteEx {
    public static void main(String[] args) {
        try {
            //BufferedWriter:bietet schnelles Lesen durch Puffern von Daten

            BufferedWriter writer = new BufferedWriter(new FileWriter("output txt"));
            writer.write("Luffy hat das One piece in mubo gefunden");
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
