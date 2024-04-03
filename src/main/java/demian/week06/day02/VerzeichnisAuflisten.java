package demian.week06.day02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VerzeichnisAuflisten {
    public static void main(String[] args) {
        //Aufgabe: Mit der Hilfe von java.io.File lese den Inhalt des definierten Verzeichnisses und
        // erstelle einen Ausdruck mit der Liste der Dateien.
        //
        //Dokumentation von File
        //
        //Erweiterung: Liste die Dateien in der Rheinfolge:
        // Unterverzeichnisse, Dateien nach Größe absteigend

        // Verwende dazu die Datei simpleText.txt im resources/txt/ Ordner.

        printDirectoryContent("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/demian");

    }

    public static void printDirectoryContent(String name) {
        File directory = new File(name);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Der angegebene Pfad ist kein Verzeichnis.");
        }
    }
}
