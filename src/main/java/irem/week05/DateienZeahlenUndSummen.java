package irem.week05;

import java.io.File;

public class DateienZeahlenUndSummen {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\Irem\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\irem\\week03";

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            // Initialisiere die Zähler
            int fileCount = 0;
            long totalSize = 0;

            // Liste alle Dateien und Verzeichnisse im angegebenen Verzeichnis auf
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    // Überprüfe, ob das File-Objekt eine Datei ist (und kein Verzeichnis)
                    if (file.isFile()) {
                        fileCount++;
                        totalSize += file.length(); // Addiere die Größe der Datei zur Gesamtgröße
                    }
                }
            }
            System.out.println("Anzahl der Dateien: " + fileCount);
            System.out.println("Summe der Dateigrößen: " + totalSize + " Bytes");
        } else {
            System.out.println("Das angegebene Verzeichnis existiert nicht oder ist kein Verzeichnis.");
        }
    }
}

