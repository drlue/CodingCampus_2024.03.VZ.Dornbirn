package aki.week02;

import aki.week01.day01.AufgabeChar;

import java.util.Scanner;

public class InputMenue {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to my Domain Expansion: Learning Phase!");
        int frage1 = InputUebung.userNumbers("What would you like to draw?\n 1) Christbaum (Sold Out)\n 2) Empty Quader\n 3) Dreieck\n", 1, 3);

        if (frage1 == 1) {
            System.out.println("If you could read the menü again, you'll see it is sold out... Have a Nice day");
        } else if (frage1 == 2) {
            int big = InputUebung.userNumbers("How big should the Empty Quader be?\n", 4, 25);
            String zeichen = InputUebung.userName("What character should it have? Any Symbol!\n");
            AufgabeChar.printEmptySquare(zeichen, big);
        } else {
            int big = InputUebung.userNumbers("How big should the Dreieck be?\n", 4, 25);
            String zeichen = InputUebung.userName("What character should it have? Any Symbol!\n");
            AufgabeChar.printTriangle(zeichen, big);
        }
        int frage2 = InputUebung.userNumbers("Do you wanna draw again?\n 1)Yes\n 2)No\n", 1, 2);
        System.out.println("Nuh uh, have a nice day. One drawing per Customer!");
    }
}
