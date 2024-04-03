package ardijanla.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VerzeichnisAuflisten {
    public static void main(String[] args) {
        // Erstellen eines File-Objekts, das auf eine spezifische Datei zeigt.
        // In diesem Fall zeigt es auf eine Datei namens "Hi..txt" auf dem Desktop des Benutzers "kaar".
        File fl = new File("C:\\Users\\kaar\\Desktop\\Hello.txt");

        // Ausgabe des Namens der Datei mit der Methode getName().
        // Das Ergebnis ist der einfache Dateiname, hier "Hi..txt".
        System.out.println(fl.getName());

        // Abrufen des übergeordneten Verzeichnisses der Datei als File-Objekt.
        // getParentFile() liefert das Verzeichnis, in dem die Datei liegt, hier der Desktop des Benutzers "kaar".
        File directory = fl.getParentFile();

        // Auflisten aller Dateien und Verzeichnisse im übergeordneten Verzeichnis mit der list()-Methode.
        // list() gibt ein Array von String zurück, wobei jeder String den Namen einer Datei oder eines Verzeichnisses im Elternverzeichnis darstellt.
        String[] fileList = directory.list();

        // Durchlaufen des Arrays fileList und Ausgabe jedes Eintrags.
        // Für jede Datei oder jedes Verzeichnis im Elternverzeichnis wird eine Zeile ausgegeben.
        for (String entry : fileList) {
            System.out.println("File: " + entry);
        }
    }

}
