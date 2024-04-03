package demian.week06.day03;

import ardijanla.ConsoleColors;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileSchreiben2 {
    public static void main(String[] args) {

        String Userinput = Userinput();
        String filepath = "/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/demian/week06/day03/files/output1.txt";

        writeToFile(Userinput,filepath);

    }

    public static String Userinput() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Bitte geben Sie hier einen Text ein (Zum Beenden 2x Enter druecken)\n%s===>%s", ConsoleColors.BLUE_BRIGHT, ConsoleColors.RESET);
        String result = "";
        String line = "";
        while (!(line = sc.nextLine()).isEmpty()) {
            result += line + "\n";
        }
        return result;
    }

    public static void writeToFile (String Userinput, String path){
        Path directory = Paths.get(path);
        try {
            Files.write(directory,Userinput.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
