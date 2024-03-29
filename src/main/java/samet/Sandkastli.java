package samet;
import java.time.Duration;
import java.time.LocalDateTime;


public class Sandkastli {

    //Test für die Geschwingigkeit des Computers
    public static void main(String[] args) {
        long begin = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            double x = Math.sin(i);

        }
        long ende = System.nanoTime();
        System.out.println(ende - begin);


        LocalDateTime test = java.time.LocalDateTime.now();
        for (int i = 0; i < 500000; i++) {
            double x = Math.sin(i);

        }
        LocalDateTime test2 = LocalDateTime.now();
        System.out.println(Duration.between(test, test2).toNanos());


        // beste ergebnisse  9063400,      11009700

    }

}





