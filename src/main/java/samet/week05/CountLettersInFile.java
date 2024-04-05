package samet.week05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLettersInFile {

    public static void main(String[] args) {

        File input = new File("C:\\Users\\samet\\assets\\tmp//countletter.txt");
        printFileReader(input);



    }

    public static void printFileReader(File input) {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(input));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error occured!!!");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                
            }
        }
    }
    
    public static void countLetters(String[] arr) {
        
        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
//            count[arr.charAt(i)] ++;

            }
            
        }
        
    }

