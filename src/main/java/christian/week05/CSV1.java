package christian.week05;

import java.io.File;
import java.util.Arrays;

public class CSV1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\schmi\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\resources\\csv\\sales_100.csv");
        String csvString = CountLetters.readToString(file);
        csvStringPrintFormated(csvString );
    }

    public static void csvStringPrintFormated(String csv) {
        String [] rowArray = csv.split("\n");
        System.out.println(Arrays.toString(rowArray));
        for (int i = 0; i < rowArray.length; i++) {
            String [] colArray = rowArray[i].split(",");
            System.out.println(colArray[i]);
        }


    }
}
