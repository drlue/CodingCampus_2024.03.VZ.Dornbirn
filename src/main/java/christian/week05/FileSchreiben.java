package christian.week05;

import java.io.*;
import java.util.Scanner;

public class FileSchreiben {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printInput();

    }

    public static void printInput() {
        File file = new File("C:\\Users\\schmi\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\christian\\week05\\test.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintStream ps = new PrintStream(fos);

            String text = sc.nextLine();
            while (!text.isEmpty()) {
                ps.println(text);
                text = sc.nextLine();
            }
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden oder Zugriffsrechte fehlen!");
        }
    }
}
