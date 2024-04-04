package katherina.week05.day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AdvancedLettercounter {

    public static void main(String[] args) {
        System.out.println(new File("").getAbsolutePath());
        File input = new File("src" + File.separator + "main/resources/txt/simpleText.txt");
        printFileReader(input);
        String text = String.valueOf(input);

        System.out.println();
        System.out.println("Die Textlänge beträgt " + input.length()+" Zeichen.");
        System.out.println("So oft kommt das gesuchte Zeichen im Text vor: "+countChar('v',
               text)+ " mal!");
    }

    private static void printFileReader(File input) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(input));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Es ist ein Fehler aufgetreten!");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
    }


    public static int countChar(char charToCount, String sourcetext) {
        int count = 0;
        char[] chars = sourcetext.toCharArray();
        for (int index = 0; index < sourcetext.length(); index++) {
            if (charToCount == chars[index]) {
                count++;
            }
        }
        return count;
    }

}
