package lukas.week05;

import lukas.week04.PrintDataTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FilesPrintTable {

    public static void main(String[] args) {
        //DATA INPUT
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        //ADDITIONAL DATA
        String[] headerArr = {"First Name", "Last Name", "Age", "Place", "Distance from Capital"};
        String[] dataTypes = {"s", "s", "i", "s", "f"};

        //FILENAME
        String filePath = "C:\\Users\\LZE\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\lukas\\assets\\tmp\\output.txt";

        //PRINT TABLE TO FILE
        printDataTableToFile(filePath, headerArr, dataTypes, firstName, lastName, PrintDataTable.convertToStringArray(age), place, PrintDataTable.convertToStringArray(distanceFromCapital));

        //READ FILE
        System.out.println("Folgendes wurde in die Datei " + new File(filePath).getName() + " geschrieben:");
        readAndPrintFile(filePath);
    }

    //Idee siehe auch week04.PrintDataTable
    public static void printDataTableToFile(String filePath, String[] headerArr, String[] dataTypes, String[]... dataArrs) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            PrintStream ps = new PrintStream(fos);

            int tableWidth = 0;
            int padding = 0;
            int[] colWidths = PrintDataTable.getMaxColWidths(headerArr, dataArrs);
            String[] formatString = new String[headerArr.length];
            for (int col = 0; col < formatString.length; col++) {
                formatString[col] = String.format("| %%%s%ds ", dataTypes[col].matches("[fi]") ? "" : "-", colWidths[col] + padding);
            }

            //Header
            for (int i = 0; i < headerArr.length; i++) {
                ps.printf(formatString[i], headerArr[i]);
                tableWidth += colWidths[i] + padding + 3;
            }
            ps.println("|");
            ps.println("-".repeat(tableWidth + 1));

            //Datenzeilen
            for (int row = 0; row < dataArrs.length; row++) {
                for (int col = 0; col < dataArrs[row].length; col++) {
                    ps.printf(formatString[col], dataArrs[col][row]);
                }
                ps.println("|");
            }

            ps.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void readAndPrintFile(String filePath) {
        File f = new File(filePath);
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }


}
