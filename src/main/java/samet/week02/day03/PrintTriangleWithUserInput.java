package samet.week02.day03;


import samet.week01.day01.Methoden;
import samet.week02.day02.UserInputTest;

public class PrintTriangleWithUserInput {
    public static void main(String[] args) {
        System.out.println("Erstellen eines Dreiecks!");
        int size = UserInputTest.getIntFromConsole("Gib die Größe ein: ", 10, 20);
        Methoden.printTriangle("A ", size);
    }
}
