package katherina.week05.day01;

import ardijanla.ConsoleColors;

import java.io.File;
import java.util.Objects;

public class RekursiveAuflistungCopy {
    //Ich habe mir die Datei aus unserer Gruppenarbeit bzw. deren Inhalt kopiert, um sie für mich als Lernobjekt zu kommentieren.
//Mit dem Klassennamen "Copy" möchte ich darauf hinweisen.
    public static void main(String[] args) {
        String path = "C:\\Users\\DCV\\Downloads";
        //Hier den lokalen Ordner auf dem Rechner einfügen, dessen Dateien abgefragt werden sollen. Aktuell steht hier
        //der Downloadordner meines Leihgeräts, weil dort zumindest *irgendwas* drin ist ^^.
        rekursiveDirectory("", path);
        System.out.println("Die Summe der Dateien in diesem Ordner beträgt: " + getSumOfSize(path) + " Bytes (?).");

    }


    public static void rekursiveDirectory(String prefix, String path) {
        File file = new File(path);

        if (file.isDirectory())
        //Falls der Dateipfad ein Ordner ist, dann führe die Operation durch, die unten steht.
        {
            for (File data : Objects.requireNonNull(file.listFiles())) {
                if (data.isFile()) {
                    System.out.printf("%7d bytes %s %s \n", data.length(), prefix, data.getName());
                    //Damit die Ausgabe hübsch und regelmäßig ist.
                } else {
                    System.out.println(ConsoleColors.BLUE + " ".repeat(14) + prefix + data.getName() + ConsoleColors.RESET);
                    //"Drucke die Dateinamen aus und färbe das, was keine Datei ist - also ein Ordner - blau."
                    rekursiveDirectory("|-" + prefix, data.getAbsolutePath());
                    //Ich bin mit der Lösung, die Ausgabe zu färben, nicht glücklich, aber lasse das jetzt vorerst so.
                }
            }
        } else {
            System.out.println("Nichts davon ist der Fall!");
        }
    }

    public static long getSumOfSize(String path) {
        File file = new File(path);
        long sum = 0;
        if (file.isDirectory()) {
            for (File x : Objects.requireNonNull(file.listFiles())) {
                if (x.isFile()) {
                    sum += x.length();
                } else {
                    sum += getSumOfSize(x.getAbsolutePath());
                }
            }
        }

        return sum;

    }
}
