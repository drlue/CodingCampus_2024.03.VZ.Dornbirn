package samet.week04.day03;

import data.Texts;

public class StringCountTest {

    public static void main(String[] args) {


        String str = Texts.HESSE;
        // counter array to store frequency of each character.
        int[] frequency = new int[str.length()];

        // iterate through the string
        for (int i = 0; i < str.length(); i++) {
            // increase count by 1 in the array
            // at index based on the character
            frequency[str.charAt(i)]++;
        }

        // traverse through the counter array
        for (int i = 0; i < frequency.length; i++) {
            // if frequency of the character is not 0
            if (frequency[i] != 0) {
                // print the character along with its frequency
                System.out.println((char) i + " - " + frequency[i]);
            }
        }
    }
}



