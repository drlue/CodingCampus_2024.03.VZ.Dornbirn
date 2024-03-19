package aki.week04;

import java.util.Scanner;

public class CharReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib einen Text ein:");
        String line = sc.nextLine();
        System.out.println("Reversed:");
        System.out.println(reverseString(line));
    }

    public static String reverseString(String text){
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return new String(arr);
    }
}
