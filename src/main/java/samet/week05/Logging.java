package samet.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logging {

    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            log(1, "ERROR");
            log(2, "WARNING");
            log(3, "INFO");
        }
    }

    public static void log(int severity, String message){

        File file = new File("C:\\Users\\samet\\assets\\tmp\\output2.txt");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy.MM.dd. kk:mm:ss");

        try {
            FileOutputStream fos = new FileOutputStream(file,true);
            PrintStream ps = new PrintStream(fos);
            if (severity == 1){
                ps.println(df.format(LocalDateTime.now()) + " | CPU DAMAGE |-->" + message);
            } else if (severity == 2) {
                ps.println(df.format(LocalDateTime.now()) + " | RAM DAMAGE |-->" + message);
            } else if (severity == 3) {
                ps.println(df.format(LocalDateTime.now()) + " | WORKS GREAT |-->" + message );
            }else {
                ps.println(df.format(LocalDateTime.now()));


        }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
