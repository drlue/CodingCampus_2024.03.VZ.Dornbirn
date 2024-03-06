package samet.week2.day1;

import java.util.Scanner;

public class ForWifey {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie ist dein Name?");
        String name = scanner.nextLine();

        System.out.println("Wie alt bist du?");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Wie heißen deine Katzen?");
        String katzen = scanner.nextLine();

        System.out.println("Hallo " + name);
        System.out.println("Du bist " + age +"Jahre alt");
        System.out.println(katzen +" heißen deine Katzen");



    }
}
