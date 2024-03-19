package lukas.week04;

public class PrintDataTable {
    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};




        System.out.println(firstName.getClass().toString());

        //printDataTable(firstName,lastName,age,place,distanceFromCapital);

    }

    public static void printDataTable(String[] firstName, String[] lastName,int[] age, String[] place, float[] distanceFromCapital ) {
            System.out.printf("%-20s | %-20s |  %-20s | %-20s | %-25s\n", "First Name", "Last Name", "Age", "Place", "Distance from Capital");
            System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-20s | %-20s |  %-20s | %-20s | %-25s\n",firstName[i] , lastName[i], age[i], place[i], distanceFromCapital[i]);

        }



    }

    public static void getMaxColumnNr(Object[] myData) {


    }
}

