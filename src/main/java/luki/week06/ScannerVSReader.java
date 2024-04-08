package luki.week06;

import java.io.*;
import java.util.Scanner;

public class ScannerVSReader {
    public static void main(String[] args) {
        File f = new File(System.getProperty("java.io.tmpdir"), "largefile.txt");
        //Create tmp file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
            for (int i = 0; i < 1000000; i++) {
                writer.write("Das ist eine Testzeile!!!");
                writer.newLine();
            }
        } catch (IOException exc) {
            System.out.println("Writing tmp file failed");
            exc.printStackTrace();
            return;
        }

        System.out.println("File length: " + f.length() + "b");

        System.out.println("Reading file with scanner");
        long start = System.currentTimeMillis();
        System.out.println("Scanner, read bytes: " + readFileScanner(f));
        long end = System.currentTimeMillis();
        System.out.println("Reading file scanner took: " + (end - start) + "ms");

        System.out.println("Reading file with reader");
        start = System.currentTimeMillis();
        System.out.println("Reader, read bytes: " + readFileReader(f));
        end = System.currentTimeMillis();
        System.out.println("Reading file reader took: " + (end - start) + "ms");
    }

    private static long readFileScanner(File f) {
        long count = 0;
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                count += line.length();
            }
        } catch (IOException exc) {
            System.out.println("Reading file failed");
            exc.printStackTrace();
        }
        return count;
    }

    private static long readFileReader(File f) {
//        new FileReader(new File(""));
        long count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String input;
            while ((input = reader.readLine()) != null) {
                count += input.length();
            }
        } catch (IOException exc) {
            System.out.println("Reading file failed");
            exc.printStackTrace();
        }
        return count;
    }
}
