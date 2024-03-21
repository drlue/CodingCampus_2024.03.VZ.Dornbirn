package aki.week04;

import java.util.Random;
import java.util.Scanner;

public class CharRandomize {
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib einen Text ein:");
        String line = sc.nextLine();
        System.out.println("Output:");
        System.out.println(randomM(line));
    }


    public static String randomM(String text) {
        char[] arr = text.toCharArray();
        for (int count = 0; count < 10 + 2 * arr.length; count++) {
            int pos1 = random.nextInt(arr.length);
            int pos2 = random.nextInt(arr.length);
            //System.out.println("pos1: " + pos1 + " pos2: " + pos2);
            swap(arr, pos1, pos2);
        }
        return new String(arr);
    }

    public static void swap(char[] arr, int idx1, int idx2){
        char temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}

