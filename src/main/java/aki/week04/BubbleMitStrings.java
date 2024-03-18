package aki.week04;


import java.util.Arrays;

public class BubbleMitStrings {
    public static void main(String[] args) {
        bubbleNamesSortAsc(null);  //Ascending from A to Z
        bubbleNamesSortDesc(null);  //Descending from Z to A
    }

    public static void bubbleNamesSortDesc(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        String temp;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) < 0) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
    public static void bubbleNamesSortAsc(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        String temp;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
