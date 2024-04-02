package irem.week05;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class VerzeichnisAuflisten {

    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\Irem\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\irem\\week01\\day01";
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            String[] fileList = directory.list();
            if (fileList != null) {
                System.out.println("Inhalt von " + directoryPath + ":");
                for (String fileName : fileList) {
                    System.out.println(fileName);
                    File[] files = new File[0];

                    Arrays.sort(files,new Comparator<File>() {
                        public int compare(File file1, File file2) {
                            // Sortiere zuerst Verzeichnisse, dann Dateien
                            if (file1.isDirectory() && !file2.isDirectory()) {
                                return -1;
                            } else if (!file1.isDirectory() && file2.isDirectory()) {
                                return 1;
                            } else {
                                // Wenn beide Dateien oder Verzeichnisse sind, sortiere nach Größe absteigend
                                return Long.compare(file2.length(), file1.length());
                            }
                        }
                    });
                    // Ausgabe der sortierten Dateien und Verzeichnisse
                    System.out.println("Inhalt von " + directoryPath + " (sortiert):");
                    for (File file : files) {
                        System.out.println(file.getName() + " - " + (file.isDirectory() ? "Verzeichnis" : "Datei: " + file.length() + " Bytes"));
                    }
                }
            } else {
                System.out.println("Das Verzeichnis ist leer oder es gab ein Problem beim Lesen.");
            }
        }
    }
}


