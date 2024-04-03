package christian.week05;

import java.io.*;
import java.util.Scanner;

public class FileSchreiben {
    public static Scanner sc = new Scanner(System.in);
    public static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        printInFile();

    }

    public static String getInput() {

        String text = "";
        sc.useDelimiter("\n \n");
        builder.append(sc.nextLine());
        text = builder.toString();


        return text;
    }

    public static void printInFile() {
        File file = new File("C:\\Users\\schmi\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\christian\\week05\\test.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintStream ps = new PrintStream(fos);
            ps.print(getInput());
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden oder Zugriffsrechte fehlen!");
        }

    }
}
