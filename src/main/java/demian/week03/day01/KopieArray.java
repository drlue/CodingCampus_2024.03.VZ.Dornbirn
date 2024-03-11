package demian.week03.day01;

import java.util.Arrays;

public class KopieArray {

    public static void main(String[] args) {

        //AUFGABE:
        //Erstelle eine Funktion, die aus dem Parameter-Array eine Kopie erstellt.

        int[] originalArray = new int[10];
        for (int arrayIndex = 0; arrayIndex < 10; arrayIndex++) {
            originalArray[arrayIndex] = arrayIndex + 1;
        }
        System.out.println("Original Array = " + Arrays.toString(originalArray));
        System.out.println("Jetzt wird eine Kopie des Original Array mittels Methode erstellt (+Eine neue Laenge definiert)");
        int[] copy = makeANIntegerArrayCopyV3(originalArray,20);
        System.out.println("Kopie Array = " + Arrays.toString(copy));
        System.out.println("Jetzt wird das Kopierte Array mit 7er gefuellt:");
        for (int arrayIndex = 0; arrayIndex < copy.length; arrayIndex++) {
            copy[arrayIndex] = 7;
        }
        System.out.println("Angepasstes Kopie Array = " + Arrays.toString(copy));
        System.out.println("Zum Beweis das es nur eine Kopie gemacht wurde hier nochmal das Original Array:");
        System.out.println("Original Array = " + Arrays.toString(originalArray));

    }

        //HAENDISCH ARRAY KOPIEREN
    public static int[] makeAnIntegerArrayCopyV1(int[] originalARRAY) {
        int[] copyOfArray = new int[originalARRAY.length];
        for (int arrayIndex = 0; arrayIndex < copyOfArray.length; arrayIndex++) {
            copyOfArray[arrayIndex] = originalARRAY[arrayIndex];
        }
        return copyOfArray;
    }

    //ARRAY MITTELS clone()-Methode kopieren
    public static int[] makeAnIntegerArrayCopyV2(int[] originalARRAY) {
        int[] copyOfArray = originalARRAY.clone();
        return copyOfArray;
    }

    //KOPIE MIT ANDERER LAENGE ERSTELLEN: Arrays.copyOf() Methode

    public static int[] makeANIntegerArrayCopyV3(int[] originalARRAY, int newlength){
        int [] copyARRAY = Arrays.copyOf(originalARRAY, newlength);
        return copyARRAY;
    }


}
