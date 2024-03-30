package demian.week05.day06;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MeinGeburtstag {

    public static void main(String[] args) {

        //Aufgabe:Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt
        // und mit Hilfe von SimpleDateFormat.parse() verarbeitet.
        // Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war.
        // Hierbei kann Calendar verwendet werden.


        Scanner sc = new Scanner(System.in);

        boolean correctUSERinput = false;
        while (correctUSERinput == false) {

            System.out.print("Geben Sie hier ihr Geburtstag ein: DD.MM.YYY: ");

            String UserInputBirtday = sc.nextLine();

            try {
                // Der String der vom User eingegeben wird hier in ein LocalDate-Objekt formatiert
                // und anschließend in die UserBirthday Variable gespeichert die auf eine neue Instanz der LocalDate-Klasse im Speicher zeigt
                LocalDate UserBirthday = LocalDate.parse(UserInputBirtday, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

                System.out.println("Ihr eingegebenes Datum lautet: " + UserBirthday);
                correctUSERinput = true;
                DateTimeFormatter Wochentag = DateTimeFormatter.ofPattern("EEEE");
                System.out.println("Ihr Geburstag ist ein: " + Wochentag.format(UserBirthday));
            } catch (DateTimeParseException e) {
                System.out.println("Ihr eingegebenes Datum stimmt nicht mit dem Format überein: DD.MM.YYYY");
            }



        }
    }
}
