package katherina.week04.day01;


public class BubbleSortString {

    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        printWithForI(names);
        System.out.println(">> Dies ist eine Liste unsortierter Namen. <<");
        System.out.println();
        bubblesortNachLengthHoch(names);
        System.out.println(">> Nach Länge sortiert, aufsteigend. <<");
        printWithForI(names);
        System.out.println();
        bubblesortNachLengthRunter(names);
        System.out.println(">> Nach Länge sortiert, absteigend. <<");
        printWithForI(names);
        System.out.println();
        bubblesortNachAlphaHoch(names);
        System.out.println(">> Nach Alphabet sortiert, aufsteigend. <<");
        printWithForI(names);
        System.out.println();
        bubblesortNachAlphaRunter(names);
        System.out.println(">> Nach Alphabet sortiert, absteigend. <<");
        printWithForI(names);
        System.out.println();
        System.out.println("Danke!");
    }

    public static void printWithForI(String[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print(arr[index] + ", ");
            }
            System.out.println(arr[arr.length - 1]);
        }
    }

    //Variable 'jane' heißt so aus Accessibility-Gründen. Ich kann sonst nicht gut sehen, ob etwas i oder j ist.
    public static void bubblesortNachLengthHoch(String[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int jane = 0; jane < array.length - index - 1; jane++) {
                if (array[jane].length() > array[jane + 1].length()) {
                    String temp = array[jane];
                    array[jane] = array[jane + 1];
                    array[jane + 1] = temp;
                }
            }
        }
    }

    public static void bubblesortNachLengthRunter(String[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int jane = 0; jane < array.length - index - 1; jane++) {
                if (array[jane].length() < array[jane + 1].length()) {
                    String temp = array[jane];
                    array[jane] = array[jane + 1];
                    array[jane + 1] = temp;
                }
            }
        }
    }

    public static void bubblesortNachAlphaHoch(String[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int jane = 0; jane < array.length - index - 1; jane++) {
                if (array[jane].compareTo(array[jane+1]) > 0) {
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
                if (array[jane].compareTo(array[jane+1]) < 0) {
                    String temp = array[jane];
                    array[jane] = array[jane + 1];
                    array[jane + 1] = temp;
                }
            }
        }
    }

}
