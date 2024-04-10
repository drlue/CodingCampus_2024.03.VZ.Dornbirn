package ardijanla.week05;

import java.io.*;
import java.util.Scanner;

public class FileSchreiben {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\kaar\\Desktop\\Erster Ordner\\output.txt";
        String input;

        File file = new File(path);
        int choose = 0;
        try {
            while ( choose != 3) {

                if (!file.exists()) {
                    file.createNewFile();
                    System.out.println("File did not exist. File " + file.getName() + " was created");
                }

                if (choose == 0) {
                    System.out.println("what do you want to do? Press 1 for adding a line or 2 for showing text and 3 for exit");
                    choose = scanner.nextInt();
                    scanner.nextLine();
                }

                if (file.exists() && choose == 1) {

                    System.out.println("Enter Text");
                    input = scanner.nextLine();
                    FileOutputStream outputStream = new FileOutputStream(path, true);
                    PrintStream printStream = new PrintStream(outputStream);

                    printStream.println(input);
                    printStream.close();
                    choose = 0;

                }
                if (file.exists() && choose == 2) {
                    Scanner sc = new Scanner(new File(path));
                    while (sc.hasNext()){
                        String line = sc.nextLine();
                        System.out.println(line);
                    }

                    sc.close();
                    break;
                }


            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

