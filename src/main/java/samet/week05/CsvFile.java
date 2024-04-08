package samet.week05;

import gyula.week05.ReadCSV;

import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class CsvFile {

    public static void main(String[] args) {

        String csvContent = readTextFile("csv/sales_100.csv");
        String[] lines = csvContent.split("\n");
        String[][] csv = splitColumns(lines);
        printCSV(csv);
    }
    public static int[] calculateOptimalWidth(String[][] csv){
        if (csv.length == 0) return new int[]{};
        int[] width = new int[csv[0].length];
        for (int i = 0; i < csv.length; i++) {
            for (int j = 0; j < csv[i].length; j++) {
                if (csv[i][j].length() > width[j]){
                    width[j] = csv[i][j].length();
                }
            }
        }
        return width;
    }

    public static void printCSV(String[][] csv){
        int[] colWidth = calculateOptimalWidth(csv);
        for (int i = 0; i < csv.length; i++) {
            for (int j = 0; j < csv[i].length; j++) {
                String formatString = String.format("| %%-%ds ", colWidth[j]);
                System.out.printf(formatString, csv[i][j]);
            }
            System.out.println("|");
            if (i == 0){
                for (int j = 0; j < colWidth.length; j++) {
                    String formatString = String.format("|%%-%ds", 2 + colWidth[j]);
                    System.out.printf(formatString, "-".repeat(2 + colWidth[j]));
                }
            }
        }
    }


    public static String[][] splitColumns(String[] lines){
        String[][] result = new String[lines.length][];
        for (int i = 0; i < lines.length; i++) {
            result[i] = lines[i].split(",");
        }
        return result;
    }

    public static String readTextFile(String ressourceName) {
        InputStream inputStream = Objects.requireNonNull(ReadCSV.class.getClassLoader().getResourceAsStream(ressourceName));
        Scanner sc = new Scanner(inputStream);
        StringBuilder result = new StringBuilder();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            result.append(line);
            result.append("\n");
        }
        sc.close();

        return result.toString();

    }
}
