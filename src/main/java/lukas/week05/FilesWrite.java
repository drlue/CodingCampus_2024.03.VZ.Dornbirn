package lukas.week05;

import lukas.Helper;
import luki.week02.day04.Input;

import java.io.*;

public class FilesWrite {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\LZE\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\lukas\\assets\\tmp\\output.txt";
        getInputAndWriteToFile(filePath);


    }

    public static void getInputAndWriteToFile(String filePath){
        boolean isEmptyLine = false;
        while (!isEmptyLine) {
            String input = Helper.readStringFromConsole("Text Eingeben (zum Beenden leere Zeile mit Return) >>>");
            if (!input.isEmpty()) {
                writeToFile(filePath, input);
                //writeToFileV2(filePath, input);
            } else {
                isEmptyLine = true;
            }
        }
    }


    public static void writeToFile(String filePath, String input) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath, true);
            PrintStream ps = new PrintStream(fos);
            ps.println(input);
            ps.close();

        } catch (FileNotFoundException e) {
            System.out.println("File " + filePath + " not found!");
        }

    }

    public static void writeToFileV2(String filePath, String input) {
        try {
            FileWriter fw = new FileWriter(filePath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(input);
            pw.close();

        } catch (IOException e) {
            System.out.println("File " + filePath + " not found!");
        }

    }
}
