package katherina.week04.day01;

public class BubbleSortStringMitIndex{

    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula" };
        BubbleSortString.printWithForI(names);
        System.out.println(">> Dies ist eine Liste unsortierter Namen. <<");
        System.out.println();
        BubbleSortString.bubblesortNachAlphaHoch(names);
        System.out.println(">> Nach Alphabet sortiert, aufsteigend. <<");
        BubbleSortString.printWithForI(names);
        System.out.println();
        System.out.println("Danke!");
    }




}
