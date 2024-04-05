package irem.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;



public class DatenTabellarischDarstellen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String outputPath = "C:\\Users\\Irem\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\resources\\tmp\\output.txt";

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromTheCity = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};



        try {
            FileOutputStream luffy = new FileOutputStream(outputPath, true);
            PrintStream zoro = new PrintStream(luffy);
            zoro.printf("%-20s %-20s %-5s %-20s %-20s%n", "firstName", "lastName", "Age", "Place", "Distance from the City(km)");
            zoro.printf("%-20s %-20s %-5s %-20s %-20s%n", "--------------------", "--------------------", "-----", "--------------------", "------------------------------");

            for (int i = 0; i < firstName.length; i++) {
                zoro.printf("%-20s %-20s %-5d %-20s %-20.2f%n", firstName[i], lastName[i], age[i], place[i], distanceFromTheCity[i]);
            }
            zoro.close();
        } catch (FileNotFoundException istmiregal) {
            istmiregal.printStackTrace();

            System.out.println("Aki!!!!!");

        }
    }
}








