package luki.week06;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

public class StreamsRehearsal {
    public static void main(String[] args) {
        System.out.println(new File("").getAbsolutePath());
        File input = new File("src" + File.separator + "main/resources/txt/simpleText.txt");
        printFileReader(input);

        File output = new File("src" + File.separator + "main/resources/txt/simpleText2.txt");
        writeFileWriter(output);
    }

    private static void printFileReader(File input) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(input));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error occured!!!111elf");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                //noop
            }
        }
    }

    private static void writeFileWriter(File output) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(output));
            writer.write("Hallo wie gehts");
            writer.flush();
            writer.newLine();
            writer.write("Hallo wie gehts1");
            writer.flush();
            writer.newLine();
            writer.write("Hallo wie gehts2");
            writer.flush();
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing file!!!111elf");
        } finally {
            if(writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void printFileScanner(File input) {
        try {
            Scanner sc = new Scanner(input);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("There was an error!11elf");
            e.printStackTrace();
        }
    }

    public static void main2(String[] args) throws FileNotFoundException {
        System.out.println(new File("").getAbsolutePath());
        File input = new File("src" + System.lineSeparator() + "main/resources/txt/simpleText.txt");

        Scanner sc = new Scanner(input);
    }
}
