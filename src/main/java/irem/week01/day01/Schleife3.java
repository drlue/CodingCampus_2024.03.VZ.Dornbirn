package irem.week01.day01;

public class Schleife3 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter <= 10) {
            if (counter % 2 == 0) {
                System.out.println("Unsere straight counter:" + counter);
            }
            counter++;
        }

        counter = 0;
        while (counter <= 10) {
            System.out.println("Unsere straight counter:" + counter);
            counter = counter + 2;
        }
    }
}
