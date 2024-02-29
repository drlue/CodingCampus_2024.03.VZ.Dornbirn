package irem;

public class Schleifen3 {
    public static void main(String[] args) {

        for (int counter = 0; counter <= 10; counter++) {
            System.out.println("Unsere Counter " + counter);
            if (counter % 2 == 0){
                System.out.println("gerade");
            } else {
                System.out.println("ungerade");
            }
            counter++;
        }


        }


    }