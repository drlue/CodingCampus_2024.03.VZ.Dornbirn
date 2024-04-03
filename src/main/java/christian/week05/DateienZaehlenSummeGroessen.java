package christian.week05;

import java.io.File;

public class DateienZaehlenSummeGroessen {
    public static void main(String[] args) {

        File ordner = new File("C:\\Users\\schmi\\Desktop\\test");

        dateienAuflisten(ordner);
        System.out.println(summeDateien(ordner));
        System.out.println(summeDateiGroessen(ordner));

    }

    public static void dateienAuflisten(File ordner) {
        File[] ordnerArray = ordner.listFiles();
        if (ordner.isDirectory()) {
            for (File x : ordnerArray) {
                if (x.isFile()) {
                    System.out.println("Datei: " + x.getName() +"  " + x.length());
                } else {
                    System.out.println("directory: " + x.getName());
                    dateienAuflisten(x);
                }
            }
        } else {
            System.out.println(ordner.getName() + "is not a directory");
        }
    }

    public static long summeDateien(File ordner) {
        long sum = 0;
        File[] ordnerArray = ordner.listFiles();
        if (ordner.isDirectory()) {
            for (File x : ordnerArray) {
                if (x.isFile()) {
                    sum++;
                } else {
                    sum += summeDateien(x);
                }
            }
        } else {
            System.out.println(ordner.getName() + "is not a directory");
        }
        return sum;
    }
    public static int summeDateiGroessen(File ordner) {
        int sum = 0;
        File[] ordnerArray = ordner.listFiles();
        if (ordner.isDirectory()) {
            for (File x : ordnerArray) {
                if (x.isFile()) {
                    sum += x.length();
                } else {
                    sum += summeDateiGroessen(x);
                }
            }
        } else {
            System.out.println(ordner.getName() + "is not a directory");
        }
        return sum;
    }
}
