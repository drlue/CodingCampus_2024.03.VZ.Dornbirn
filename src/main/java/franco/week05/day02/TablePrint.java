package franco.week05.day02;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import static franco.week04.PrintDataTable.floatToStringArray;
import static franco.week04.PrintDataTable.intToStringArray;

public class TablePrint {
    public static void main(String[] args) {
        String [] firstName = { "Alfonso" , "Beatrix-Eleonor" , "Cecil" , "Daniel" , "Elmar" };
        String [] lastName = { "Klein" , "Kinderdorfer" , "Al Elmenar" , "Schmidt" , "Simma" };
        int [] age = { 40 , 78 , 5 , 18 , 81 };
        String [] place = { "Wien" , "Schwarzach" , "Wiener Neudorf" , "Sankt Poelten" , "Sankt Poelten" };
        float [] distanceFromCapital = { 0f , 654.4f , 12.457634366f , 120.0f , 119.9999f };

        String[] header = {"First name", "Last Name", "Age", "Place", "Distance From City"};
        String[] strAge = new String[]{Arrays.toString(age)};
        strAge = intToStringArray(age);
        String[] strDistanceFromCapital = new String[distanceFromCapital.length];
        strDistanceFromCapital = floatToStringArray(distanceFromCapital);
       copyStringArrToFile(header,firstName,lastName,strAge,place,strDistanceFromCapital);
    }

    public static void copyStringArrToFile(String[]header,String[] firstName, String[]lastName,String []age,String[]place,String[]distance ){
        File file=new File("C:\\Users\\vince\\IdeaProjects\\" +
                "CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\franco\\week05\\TestFile\\Table.txt");
        try{
            FileOutputStream fos= new FileOutputStream(file,true);
            PrintStream ps=new PrintStream(fos);

            ps.printf("%-17s | %-17s | %5s | %-15s | %10s", header[0],header[1],header[2],header[3],header[4]);
            ps.println();
            ps.println("=".repeat(85));

            for (int i = 0; i < firstName.length; i++) {

                ps.printf("%-17s <> %-17s <> %5s <> %-15s <> %10s", firstName[i], lastName[i], age[i], place[i], distance[i]);
                ps.println();

            }
            ps.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("ERROR...");
        }





    }


}
