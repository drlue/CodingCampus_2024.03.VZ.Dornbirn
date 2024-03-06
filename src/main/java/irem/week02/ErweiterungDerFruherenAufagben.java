package irem.week02;


import irem.week01.day01.PrintTriangleTopRight;

public class ErweiterungDerFruherenAufagben {

    public static void main(String[] args) {
        System.out.println("Wir machen einen Dreiceck.");
        String text = UserInput.getTextFromConsole("Gib bitte eine Buchstabe: ");
        int size = UserInput.getIntFromConsole("Wie groß muss es sein?", 1, 25);

        PrintTriangleTopRight.printTriangleTopRight(text, size);
    }
}