package demian.week06.day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LukasRehearsal {

    public static void main(String[] args) {

        Path path = Paths.get("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/resources/txt/simpleText.txt");
        printFile(path);

        Path sourcePath = Paths.get("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/resources/txt/simpleText.txt"); // Quellpfad
        Path targetPath = Paths.get("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/demian/week06/day03/files/copyofSimple.txt"); // Zielpfad

        try {
            copyFile(sourcePath, targetPath);
            System.out.println("Datei erfolgreich kopiert.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void printFile(Path path) {
        if (!Files.exists(path)) {
            throw new IllegalArgumentException("Die angegebene Datei existiert nicht: " + path);
        }
        try {
            System.out.println(Files.readString(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyFile(Path sourcePath, Path targetPath) throws IOException {
        Files.copy(sourcePath, targetPath);
    }

}
