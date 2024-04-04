package samet.week05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileWrite {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\samet\\assets\\tmp\\output.txt", true);
            PrintStream ps = new PrintStream(fos);

            System.out.println("What do you want to write in the File? ");
            String text = scanner.nextLine();
            while (!text.isEmpty()){
                ps.println(text);
                text = scanner.nextLine();
            }
            System.out.println("Game Over!");
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("The file is not writable...");
        }
    }
}
