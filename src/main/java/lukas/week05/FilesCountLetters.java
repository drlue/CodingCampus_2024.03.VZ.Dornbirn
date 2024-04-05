package lukas.week05;

import lukas.Helper;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class FilesCountLetters {

    public static void main(String[] args) {
        //path to logfile
        Path pathLukas = Helper.getUserDirectory("lukas");
        Path pathToLogFile = Path.of(pathLukas.toString(), "assets", "tmp", "log.txt");
        File file = pathToLogFile.toFile();

        //count all letters total
        System.out.println(countLettersTotal(file) + " Buchstaben");
        //count all letters individually
        printCountArray(countLettersArray(file));
        //count particular char
        char c = 'e';
        System.out.printf("Der Buchstabe %s kommt %d mal vor!\n", c, countChar(file, c));
        //count particular chars
        char[] charArr = {'a', 'e', 'i'};
        System.out.printf("Die Buchstaben %s kommen insgesamt %d mal vor!\n", Arrays.toString(charArr), countChars(file, charArr));

    }

    public static int countLettersTotal(File file) {
        try (Scanner sc = new Scanner(file)) {
            int letterCount = 0;
            String word = "";
            while (sc.hasNext()) {
                word = sc.next();
                if (!word.isBlank()) {
                    letterCount += word.length();
                }
            }
            return letterCount;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }
    }

    public static int[] countLettersArray(File file) {
        int[] charCount = new int[Character.MAX_VALUE];
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                for (char c : sc.next().toCharArray()) {
                    charCount[c]++;
                }
            }
            return charCount;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }
    }


    public static void printCountArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.printf("%-6s %10d\n", String.valueOf((char) i), arr[i]);
                sum += arr[i];
            }

        }
        System.out.println("--------------------");
        System.out.printf("Total: %10d\n", sum);
    }

    public static int countChar(File file, char c) {
        try (Scanner sc = new Scanner(file)) {
            int letterCount = 0;
            while (sc.hasNext()) {
                for (char tmpCar : sc.next().toCharArray()) {
                    if (tmpCar == c) {
                        letterCount++;
                    }
                }
            }
            return letterCount;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }
    }

    public static int countChars(File file, char[] chars) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int sum = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    for (char lookUpChar : chars) {
                        if (c == lookUpChar) {
                            sum++;
                        }
                    }
                }
            }
            return sum;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
