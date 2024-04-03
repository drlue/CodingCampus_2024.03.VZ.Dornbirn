package samet.week05;

import ardijanla.ConsoleColors;

import java.io.File;

public class ListDirectory {

    public static void main(String[] args) {


        File directory = new File("C:\\Users\\samet\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\samet\\week04");
        System.out.printf("Directory %s.\n", directory.exists() ? "exist" : "doesn't exist");



        File[] dirContent = directory.listFiles();
        for (File x : dirContent) {
            System.out.println("Directory: " + x.getName() + " Size -->" + ConsoleColors.BLUE + x.length() + ConsoleColors.RESET);
        }


    }
}




