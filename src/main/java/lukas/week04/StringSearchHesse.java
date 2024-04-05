package lukas.week04;

import data.Texts;

import javax.sound.midi.Soundbank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSearchHesse {

    public static void main(String[] args) {
        printSearchResultsV1("Hesse", Texts.HESSE);
        printSearchResultsPerLine("Hesse", Texts.HESSE);
    }

    public static void printSearchResultsV1(String searchTerm, String txt) {
        StringBuilder sb = new StringBuilder();
        int startPos = 0;
        int endPos = 0;
        int counter = 0;
        boolean isEndOfString = false;
        while (!isEndOfString) {
            startPos = txt.indexOf(searchTerm, endPos);
            endPos = startPos + searchTerm.length();
            if (startPos > -1) {
                counter++;
                sb.append(String.format("%3d: %7d - %7d\n", counter, startPos, endPos));
            } else {
                isEndOfString = true;
            }
        }
        System.out.printf("Anzahl Vorkommen \"%s\" im String: %2s\n", searchTerm, counter);
        System.out.printf("%3s: %7s - %7s\n", "Pos", "Pos Von", "Pos Bis");
        System.out.println(sb.toString());
    }

    public static void printSearchResultsV2(String searchTerm, String txt) {
        Pattern pattern = Pattern.compile(searchTerm);
        Matcher matcher = pattern.matcher(txt);

        int counter = 0;
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            counter++;
            sb.append(String.format("%3d: %7d - %7d\n", counter, matcher.start(), matcher.end()));
        }

        System.out.printf("Anzahl Vorkommen \"%s\" im String: %2s\n", searchTerm, counter);
        System.out.printf("%3s: %7s - %7s\n", "Pos", "Pos Von", "Pos Bis");
        System.out.println(sb.toString());
    }

    public static void printSearchResultsPerLine(String searchTerm, String txt) {
        StringBuilder sb = new StringBuilder();
        String[] lines = txt.split("\\n");
        for (int i = 0; i < lines.length; i++) {
            int counter = 0;
            int pos = 0;
            int endpos = 0;

            while (true) {
                pos = lines[i].indexOf(searchTerm, endpos);
                endpos = pos + searchTerm.length();
                if (pos > -1) {
                    counter++;
                } else {
                    break;
                }
            }
            if (counter > 0) {
                sb.append(String.format("Zeile %2d: %3d\n", i, counter));
            }
        }
        System.out.println("Vorkommen von \"" + searchTerm + "\" in String je Zeile:");
        System.out.println(sb.toString());
    }
}
