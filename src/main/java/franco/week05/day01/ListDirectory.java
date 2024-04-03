package franco.week05.day01;

import java.io.File;

public class ListDirectory {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\vince\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\franco\\week02");
        File[] listOfDirectory = file.listFiles();
        for (File f : listOfDirectory) {
            if (f.isDirectory()) {
                System.out.println("name=>> " + f.getName() + " size=>> " + f.length());
            }
            else{
                System.out.println("THe directory you are looking for does not exist or not reachable");
            }
        }








    }
}
