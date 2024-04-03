package franco.week05;

import java.io.*;
import java.util.Date;

public class TextFileWrite {
    public static void main(String[] args) {
        String[] names = {"Kiyan", "Franco", "Azaya", "Belinda"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("writing to a file");
            writer.write("\nHere is another line");
            for (String name : names)
                writer.write("\n" + name);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\vince\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\franco\\week05\\TestFile\\hello.txt",true);
            PrintStream ps= new PrintStream(fos);
            ps.println("Hello world "+new Date().toString());
            ps.close();

        }catch (FileNotFoundException fnfe){
            System.out.println("The file is not writable...");
        }


    }

}
