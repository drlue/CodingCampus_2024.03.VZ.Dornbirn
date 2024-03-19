package demian.week04.day01;

import demian.allmethods.AllMethods;

import java.util.Arrays;


public class SandboxString {

    public static void main(String[] args) {

        System.out.println("Berechnung der länge des kürzestens Strings in einem String Array:");
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        System.out.println(Arrays.toString(names));
        System.out.println(AllMethods.minLength(names));
    }
}
