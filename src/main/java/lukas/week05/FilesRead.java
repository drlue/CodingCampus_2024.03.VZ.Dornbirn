package lukas.week05;

import lukas.Helper;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesRead {

    public static void main(String[] args) {

        //path to logfile
        Path pathLukas = Helper.getUserDirectory("lukas");
        Path pathToLogFile = Path.of(pathLukas.toString(), "assets", "tmp", "log.txt");
        File file = pathToLogFile.toFile();

        //print log
        printFileScanner(file);
        //printFileScannerV1(file);
        //printFileReader(file);
        //printFileReaderV1(file);


    }

    public static void printFileScanner(File file) {
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found!");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public static void printFileScannerV1(File file) {
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public static void printFileReader(File file) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
        }
    }


    public static void printFileReaderV1(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }


}
