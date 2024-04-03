package ardijanla.GruppenArbeit;

import ardijanla.ConsoleColors;

import java.io.Console;
import java.io.FileWriter;
import java.io.File;

public class RekursiveAuflistung {
    public static void main(String[] args) {
        String path = "C:\\Users\\kaar\\Desktop\\Erster Ordner";
        rekursiveDirectory("", path);
        System.out.println(getSumOfSize(path));

    }


    public static void rekursiveDirectory(String prefix, String path) {
        File file = new File(path);

        if (file.isDirectory()) {
            for (File x : file.listFiles()) {
                if (x.isFile()) {
                    System.out.printf("%7d bytes %s %s \n", x.length(), prefix, x.getName());
                } else {
                    System.out.println(ConsoleColors.BLUE + " ".repeat(14) + prefix + x.getName() + ConsoleColors.RESET);
                    rekursiveDirectory("|-" + prefix, x.getAbsolutePath());
                }
            }
        } else {
            System.out.println("passt nöd");
        }
    }

    public static long getSumOfSize(String path) {
        File file = new File(path);
        long sum = 0;
        if (file.isDirectory()) {
            for (File x : file.listFiles()) {
                if (x.isFile()) {
                    sum += x.length();
                } else {
                    sum += getSumOfSize(x.getAbsolutePath());
                }
            }
        }

        return sum;

    }
}
