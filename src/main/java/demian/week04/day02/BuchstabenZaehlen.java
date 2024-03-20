package demian.week04.day02;

import java.util.Arrays;

public class BuchstabenZaehlen {

    public static void main(String[] args) {

        //AUFGABE: In der folgenden Aufgabe sollen alle Buchstaben und Zeichen eines Texts gezählt werden.
        // Den Text erhältst du über lukas.data.Texts.getSimpleText().
        // Um die einzelnen Buchstaben und Zeichen zu zählen soll ein int[] verwendet werden.
        // Der entsprechende char kann für das Array als Index verwendet werden.
        // Gib am Schluss die Anzahl der einzelnen Zeichen (zb. A,a,ä,.) aus.

        // Konsolenausgabe:
        // A: 10
        // B: 20
        // C: 1


        String simpleText = "abbcccddddeeeeeffffffggggggghhhhhhhhiiiiiiiiijjjjjjjjjjkkkkkkkkkkkllllllllllllmmmmmmmmmmmmmnnnnnnnnnnnnnnoooooöööööÖÖÖÖÖ";
        int[] characterCounts = countCharacters(simpleText);
        printCharacterCounts(characterCounts);
    }

    public static int[] countCharacters(String text) {
        int[] characterCounts = new int[256]; // Für alle ASCII-Zeichen
        char[] simpleTextasCharArray = text.toCharArray();
        for (char element : simpleTextasCharArray) {
            // Inkrementiere den Zähler für das entsprechende Zeichen
            characterCounts[element]++;
        }
        return characterCounts;
    }

    public static void printCharacterCounts(int[] characterCounts) {
        for (int i = 0; i < characterCounts.length; i++) {
            if (characterCounts[i] > 0) {
                // Zeichen ist im Text vorhanden, gib die Anzahl aus
                System.out.println("Character: " + (char) i + ", Count: " + characterCounts[i]);
            }
        }

    }
}
