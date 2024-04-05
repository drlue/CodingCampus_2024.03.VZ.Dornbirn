package katherina.week05.day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Tip zu 3)
//
//char[] charsToCount = new char[]{'a', 'z', 'e'};
//System.out.println(countChars(text, charsToCount));

public class AdvancedLettercounter {

    public static void main(String[] args) {
        System.out.println(new File("").getAbsolutePath());
        File input = new File("src" + File.separator + "main/resources/txt/simpleText.txt");
        String text = readFile(input);
        System.out.println("Text: "+text);

        System.out.println();
        System.out.println("Die Textlänge beträgt " + input.length()+" Zeichen.");
        System.out.println("So oft kommt das gesuchte Zeichen im Text vor: "+countChar('v',
               text)+ " mal!");
        System.out.println();
//        char[] charsToCount = new char[]{'a', 'z', 'e'};
//System.out.println(countChars(text, charsToCount));
    }

    private static String readFile(File fileinput) {
        BufferedReader reader = null;
        StringBuilder input = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(fileinput));
            String line;
            while ((line = reader.readLine()) != null) {
               input.append(line);
               //line druckt ja immer eine "Zeile" aus (informatische Zeile = alles vor einem hardcoded Umbruch.)
                //Wenn der ganze Text da rein soll, muss ich hier addieren. (Und dann wandelt der Computer es um!)
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
        return input.toString();
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

//    public static int countChars(char[] charsToCount, String sourcetext) {
//        int count = 0;
//        char[] chars = sourcetext.toCharArray();
//        for (int index = 0; index < sourcetext.length(); index++) {
//            if (charsToCount == chars[index]) {
//                count++;
//            }
//        }
//        return count;
//    }
//
}