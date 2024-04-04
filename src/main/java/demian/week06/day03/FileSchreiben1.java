package demian.week06.day03;

import ardijanla.ConsoleColors;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileSchreiben1 {
    public static void main(String[] args) {

        String userinput = Userinput();
        System.out.println("Userinput: " + userinput);
        File path = new File("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/demian/week06/day03/files/output1.txt");
        writeToFile(userinput, path);
    }

    public static String Userinput() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Bitte geben Sie hier einen Text ein (Zum Beenden 2x Enter druecken)\n%s===>%s", ConsoleColors.BLUE_BRIGHT, ConsoleColors.RESET);
        String result = "";
        String line;
        while (!(line = sc.nextLine()).isEmpty()) {
            result += line + "\n";
        }
        return result;
    }

    public static void writeToFile(String userinput, File path) {
        try (FileOutputStream fos = new FileOutputStream(path);
             OutputStreamWriter osw = new OutputStreamWriter(fos)) {
            osw.write(userinput);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
