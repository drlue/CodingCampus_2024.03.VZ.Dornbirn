package samet.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountFiles {

    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\samet\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\samet\\week04\\day01\\BubblesortWithStrings.java"));
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        }catch (FileNotFoundException fnfe){
            System.out.println("This file doesn`t exist or is not readable!");


        }
    }
}
