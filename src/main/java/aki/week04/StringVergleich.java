package aki.week04;


import java.util.Scanner;

public class StringVergleich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie String 1 ein:");
        String word = sc.nextLine();
        System.out.println("Geben Sie String 2 ein:");
        String word2 = sc.nextLine();
        String word3 = word;

        System.out.println("== " + (word == word2)); // Compares the Address
        System.out.println("equals " + (word.equals(word2)));//Compares the Content

        //Bonus:
        System.out.println("== " + (word == word3)); //Because (word3) has the variable (word) in it which means it has the same Address so == is true
        System.out.println("equals " + (word.equals(word3)));//This is true if the Content is the same, the address doesn't matter in this case
    }
}
