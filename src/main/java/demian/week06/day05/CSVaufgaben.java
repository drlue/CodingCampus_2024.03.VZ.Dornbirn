package demian.week06.day05;

import ardijanla.ConsoleColors;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CSVaufgaben {
    public static void main(String[] args) {

        //Aufgabe: Lies die CSV Datei ein und speichere diese in einem String. Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][], ein zweidimensionales Array. Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.
        File file = new File("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/resources/csv/sales_100.csv");

        String array = readCSV(file);
        String[][] csv = stringTo2Darray(readCSV(file));
        print2DstringArray(csv);



    }

    public static String readCSV(File file) {
        StringBuilder csv = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                csv.append(line + "\n");
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return csv.toString();
    }

    public static String[][] stringTo2Darray(String input) {
        String[] lines = input.split("\\n");
        String[][] result = new String[lines.length][];
        for (int row = 0; row < lines.length; row++) {
            result[row] = lines[row].split(",");
        }
        return result;
    }

    public static void print2DstringArray(String[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row == 0) {
                    System.out.printf("%s%-" + getColumnWidth(arr)[col] + "s | %s", ConsoleColors.BLUE_BOLD, arr[row][col], ConsoleColors.RESET);
                } else if (arr[row][col].matches("[0-9]+.[0-9]+")) {
                    System.out.printf("%" + getColumnWidth(arr)[col] + "s | ", arr[row][col]);
                } else if (arr[row][col].matches("[0-9]+/[0-9]+/[0-9]+")) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
                    LocalDate date = LocalDate.parse(arr[row][col],formatter);
                    DateTimeFormatter formatteGERMAN = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                    System.out.printf("%" + getColumnWidth(arr)[col] + "s | ", date.format(formatteGERMAN));
                } else {
                    System.out.printf("%-" + getColumnWidth(arr)[col] + "s | ", arr[row][col]);
                }
            }
            System.out.println();
        }
    }

    public static int[] getColumnWidth(String[][] arr) {
        int[] result = new int[arr[0].length];
        for (int col = 0; col < arr[0].length; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < arr.length; row++) {
                int temp = arr[row][col].length();
                if (temp > max) {
                    max = temp;
                }
                result[col] = max;
            }
        }
        return result;
    }


}
