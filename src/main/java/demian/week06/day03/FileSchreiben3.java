package demian.week06.day03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileSchreiben3 {
    public static void main(String[] args) {

        String content = Userinput();
        String path = "/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/demian/week06/day03/files/output1.txt";

        try {
            writeToFile(content, path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String Userinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie hier einen Text ein (Zum Beenden 2xENTER)\n==>");
        String result = "";
        String line = sc.nextLine();
        while (!line.isEmpty()){
            result += line + "\n";
            line = sc.nextLine();
        }
        return result;
    }

    public static void writeToFile(String content, String path) throws IOException {
        Path file = Paths.get(path);
        try {
            Files.writeString(file, content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
