package lukas.week07.AutomatTest;

import static lukas.Helper.sleep;

public class Automat {

    public static void main(String[] args) {
        daySimulation();
    }




    //Schleife über 7 Tage
    public static void daySimulation() {
        for (int i = 0; i < 7; i++) {
            System.out.println("TAG " +i);
            for (int j = 0; j < 24; j++) {
                System.out.println("|-- " + j + " UHR");
                sleep(200);
            }
        }
    }


}
