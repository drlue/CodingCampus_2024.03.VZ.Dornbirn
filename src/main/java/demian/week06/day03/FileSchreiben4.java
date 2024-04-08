package demian.week06.day03;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileSchreiben4 {

    public static void main(String[] args) {

        File path = new File("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/demian/week06/day03/files/output4.txt");
        String userinput = Userinput();
//        writeToFile();
    }

    public static String Userinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie hier ihren Text ein\n===>");
        String result = "";
        String line = sc.nextLine();
        while(!line.isEmpty()){
            result += line + "\n";
            line = sc.nextLine();
        }
        return result;
    }

//    public static void writeToFile(String path, String content){
//
//        FileWriter fw = new FileWriter(content);
//        BufferedWriter writer = new BufferedWriter(fw);
//        writer.write(path);
//    }


}
