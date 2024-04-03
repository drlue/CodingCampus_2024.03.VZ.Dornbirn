package franco.week05.day02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class WritingFile {
    public static void main(String[] args) {

        System.out.println("Enter a text");
        Scanner scan= new Scanner(System.in);
        String text= scan.nextLine();
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\vince\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\" +
                    "main\\java\\franco\\week05\\TestFile\\userInput.txt",true);
            PrintStream ps = new PrintStream(fos);
            ps.println(text);
            ps.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("ERROR!");

        }












    }


}
