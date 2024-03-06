package samet.week2.day3;


import samet.week01.day01.Methoden;
import samet.week2.day2.UserInputTest;

public class PrintTriangleWithUserInput {
    public static void main(String[] args) {
        System.out.println("Erstellen eines Dreiecks!");
        int size = UserInputTest.getIntFromConsole("Gib die Größe ein: ", 10, 20);
        Methoden.printTriangle("A ", size);
    }
}
