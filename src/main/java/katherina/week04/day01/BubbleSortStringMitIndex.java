package katherina.week04.day01;

public class BubbleSortStringMitIndex {

    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        BubbleSortString.printWithForI(names);
        System.out.println(">> Dies ist eine Liste unsortierter Namen. <<");
        System.out.println();
        bubblesortNachAlphaHoch(names);
        System.out.println(">> Nach Alphabet sortiert, aufsteigend. <<");
        BubbleSortString.printWithForI(names);
        System.out.println();
        bubblesortNachAlphaRunter(names);
        System.out.println(">> Nach Alphabet sortiert, absteigend. <<");
        BubbleSortString.printWithForI(names);
        System.out.println();
        System.out.println("Danke!");
//        whichCharToSort(3);

    }

    public static void bubblesortNachAlphaHoch(String[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int jane = 0; jane < array.length - index - 1; jane++) {
                if (array[jane].compareTo(array[jane + 1]) > 0) {
                    String temp = array[jane];
                    array[jane] = array[jane + 1];
                    array[jane + 1] = temp;
                }
            }
        }
    }

    public static void bubblesortNachAlphaRunter(String[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int jane = 0; jane < array.length - index - 1; jane++) {
                if (array[jane].compareTo(array[jane + 1]) < 0) {
                    String temp = array[jane];
                    array[jane] = array[jane + 1];
                    array[jane + 1] = temp;
                }
            }
        }
    }

/*public static String whichCharToSort(int index) {

    String string = new String(names[index]);
    return string.charAt(index);
}
*/
}
