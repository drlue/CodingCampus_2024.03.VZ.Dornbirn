package ardijanla.week05;

import java.io.*;
import java.nio.file.Files;

public class BuschtabenZaehlen {
    public static void main(String[] args) {

        System.out.println(readText("C:\\Users\\kaar\\Desktop\\Erster Ordner\\CountWords.txt"));
    }


    private static String readText(String path) {

        StringBuilder sB;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String tmp = bufferedReader.readLine();
            sB = new StringBuilder();

            while (tmp != null) {
                sB.append(tmp);
                tmp = bufferedReader.readLine();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sB.toString();
    }


    private static int getCharsInString(String str) {
        int count = 0;
        for (char x : str.toCharArray()) {

            count++;
        }
        return count;
    }


}
