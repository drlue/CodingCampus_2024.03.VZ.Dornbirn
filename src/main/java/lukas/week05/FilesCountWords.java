package lukas.week05;

import lukas.Helper;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesCountWords {
    public static void main(String[] args) {
        //path to logfile
        Path pathLukas = Helper.getUserDirectory("lukas");
        Path pathToLogFile = Path.of(pathLukas.toString(), "assets", "tmp", "log.txt");
        File file = pathToLogFile.toFile();

        System.out.println(wordCountScanner(file) + " Wörter");
        System.out.println(wordCountReader(file) + " Wörter");

    }

    public static int wordCountScanner(File file) {
        try (Scanner sc = new Scanner(file)) {
            int wordCount = 0;
            while (sc.hasNext()) {
                if (!sc.next().isBlank()) {
                    wordCount++;
                }
            }
            return wordCount;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }
    }

    public static int wordCountReader(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int wordCount = 0;
            String line = reader.readLine();
            while (line != null) {
                String[] arr = line.trim().split("\\s+");
                wordCount += arr.length;
                line = reader.readLine();
            }
            return wordCount;
        } catch (IOException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
    }


}
