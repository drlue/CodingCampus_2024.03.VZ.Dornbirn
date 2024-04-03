package irem.week05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileSchreiben {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie Text ein");
        String outputPath = "C:\\Users\\Irem\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\resources\\tmp\\output.txt";

        try {
            FileOutputStream luffy = new FileOutputStream(outputPath, true);
            PrintStream zoro = new PrintStream(luffy);

            String line = scanner.nextLine();
            while (!line.isEmpty()) {
                zoro.println(line);
                line = scanner.nextLine();
            }
            zoro.close();
        } catch (FileNotFoundException istmiregal){
            istmiregal.printStackTrace();
            System.out.println("Aki!!!!!");

        }
    }
}
