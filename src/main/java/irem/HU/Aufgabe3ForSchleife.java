package irem.HU;

import java.awt.*;

import static java.awt.SystemColor.text;

public class Aufgabe3ForSchleife {
    public static void main(String[] args) {
        int i = 0; // Initialisiere die Zählvariable
        while (i <= 10) { // Bedingung für die Fortsetzung der Schleife
            System.out.print(i); // Gibt die aktuelle Zahl aus
            if (i > 5) {
                System.out.print("\n\n"); // Fügt zwei Zeilenumbrüche hinzu, wenn die Zahl größer als 5 ist
            } else {
                System.out.println(); // Fügt sonst einen einfachen Zeilenumbruch hinzu
            }
            i++; // Inkrementiert die Zählvariable
        }
    }
}



