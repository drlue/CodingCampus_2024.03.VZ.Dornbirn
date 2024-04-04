package demian.week06.day03;

import ardijanla.ConsoleColors;

import java.io.File;
import java.util.Arrays;

public class RekursivAusgeben {

    public static void main(String[] args) {

        File directory = new File("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java");
        printDirectoryRecursiv(directory, "");
        System.out.println("Anzahl Dateien im Directory: " + directory + " ist: " + filecount(directory));
        System.out.println("Die Summe der Dateigroessen im Verzeichnis : " + directory + " ist: " + sumofFileSizes(directory));
        System.out.println(maxDepth(directory));
    }

    public static void printDirectoryRecursiv(File directory, String prefix) {

        if (directory.isDirectory() || directory.isFile()) {
            File[] files = directory.listFiles();
            if (files != null) {
                files = sortFiles(files);
                for (File file : files) {
                    if (file.isFile()) {
                        int abstand = 45 - prefix.length();
                        System.out.printf("%s%-" + abstand + "s%10d bytes\n", prefix, file.getName(), file.length());
                    } else if (file.isDirectory()) {
                        int abstand = 50 - prefix.length();
                        System.out.printf("%s%s%s%" + abstand + "d files%s\n", prefix, ConsoleColors.BLUE, file.getName(), filecount(file),ConsoleColors.RESET);
                        printDirectoryRecursiv(file, prefix + "|-");
                    }
                }
            } else if (directory.isFile()) {
                System.out.println("Der Pfad bezieht sich auf eine Datei");
            } else {
                System.out.println("Der angegebene Pfad existiert nicht!");
            }
        }

    }

    public static int filecount(File directory) {
        int counter = 0;
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    counter++;
                } else if (file.isDirectory()) {
                    counter += filecount(file);
                }
            }
        } else {
            System.out.println("Der angegebene Pfad ist kein Verzeichnis");
        }
        return counter;
    }

    public static long sumofFileSizes(File directory) {
        long fileSIZEsum = 0;
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    fileSIZEsum += file.length();
                } else if (file.isDirectory()) {
                    fileSIZEsum += sumofFileSizes(file);
                }
            }
        } else {
            System.out.println("Der angegebene Pfad ist kein Verzeichnis");
        }
        return fileSIZEsum;
    }

    public static File[] sortFiles(File[] files) {
        File[] arr = files.clone();
        for (int idx = 0; idx < arr.length; idx++) {
            for (int j = 0; j < arr.length - idx - 1; j++) {
                if (arr[j].getName().compareTo(arr[j + 1].getName()) > 0) {
                    File temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    public static int maxDepth(File directory) {
        int depth = 0;
        int maxdepth = Integer.MIN_VALUE;
        if (directory.isDirectory()) {
            File[] arr = directory.listFiles();
            if (arr != null) {
                for (File file : arr) {
                    if (file.isDirectory()) {
                        String Pfad = file.toString();
                        String[] array = Pfad.split("/");
                        System.out.println(Arrays.toString(array));
                        depth = array.length;
                        if (depth > maxdepth) {
                            maxdepth = depth;
                        }
                        maxDepth(file);
                    }
                }
            }
        }
        return maxdepth;
    }
}
