package katherina.week04.day03;

import static data.Texts.getSimpleText;

public class ZeichenCounter {
    public static void main(String[] args) {
        String text = getSimpleText();
        System.out.println(text);
        System.out.println("Dieser Text enthält " + countUniqueLetters(text) + " unterschiedliche Zeichen.");
        System.out.println();
        System.out.println("Und zwar handelt es sich dabei um: ");
        eachUniqueLetter(text);
        System.out.println("Länge: " + text.length());


    }

    public static int countUniqueLetters(String text) {
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int index = 0; index < text.length(); index++) {
            isItThere[text.charAt(index)] = true;
        }
        int count = 0;
        for (int index = 0; index < isItThere.length; index++) {
            if (isItThere[index]) {
                count++;
            }
        }
        return count;
    }

    public static void eachUniqueLetter(String lettercount) {
        int[] count = new int[Character.MAX_VALUE];
        for (int index = 0; index < lettercount.length(); index++) {
            count[lettercount.charAt(index)] += 1;
        }
        for (char index = 0; index < count.length; index++) {
            if (count[index] > 0) {
                System.out.println("Zeichen: " + index + " Vorkommen: " + count[index]);
            }
        }

    }


}
