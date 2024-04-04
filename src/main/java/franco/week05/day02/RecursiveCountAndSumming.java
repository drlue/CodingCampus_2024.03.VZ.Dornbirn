package franco.week05.day02;

import ardijanla.ConsoleColors;

import java.io.File;

public class RecursiveCountAndSumming {
    public static void main(String[] args) {

        File directory = new File("C:\\Users\\vince\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java");
        printDirectoryAndFileRecursive(directory, "");
        System.out.println("Anzahl Dateien im Directory: " + directory + " ist: " + fileCount(directory));
        System.out.println("Die Summe der Dateigroessen im Verzeichnis : " + directory + " ist: " + sumofFileSizes(directory));
    }

    public static void printDirectoryAndFileRecursive(File directory, String prefix) {
        if (directory.isDirectory() || directory.isFile()) {
            File[] fileArray = directory.listFiles();
            if (fileArray != null) {
                fileArray = bubbleSortFile(fileArray);
                for (File file : fileArray) {
                    if (file.isFile()) {
                        int abstand = 45 - prefix.length();
                        System.out.printf("%s%-" + abstand + "s%10d bytes\n", prefix, file.getName(), file.length());
                    } else if (file.isDirectory()) {
                        int abstand = 50 - prefix.length();
                        System.out.printf("%s%s%s%" + abstand + "d files%s\n", prefix, ConsoleColors.BLUE, file.getName(),

                                fileCount(file), ConsoleColors.RESET);
                        printDirectoryAndFileRecursive(file, prefix + "|-");
                    }

                }

            } else if (directory.isFile()) {
                System.out.println("The path refer to a file...");
            }
            else{
                System.out.println("The path you've given do not exist or is unreachable....");
            }

        }

    }

    public static File[] bubbleSortFile(File[] files) {

        File[] fileArray = files.clone();
        for (int i = 0; i < fileArray.length; i++) {
            for (int j = 0; j < fileArray.length - i - 1; j++) {
                if (fileArray[j].getName().compareTo(fileArray[j + 1].getName()) > 0) {
                    File temp = fileArray[j];
                    fileArray[j + 1] = fileArray[j];
                }
            }
        }
        return fileArray;
    }
    public static int fileCount(File directory) {
        int counter = 0;
        if (directory.isDirectory()) {
            File[] fileArray = directory.listFiles();
            for (File file : fileArray) {
                if (file.isFile()) {
                    counter++;
                } else if (file.isDirectory()) {
                    counter += fileCount(file);
                }
            }
        } else {
            System.out.println("The path is not a directory...");
        }
        return counter;
    }
    public static long sumofFileSizes(File directory) {
        long fileSizeSum = 0;
        if (directory.isDirectory()) {
            File[] fileArray = directory.listFiles();
            for (File file : fileArray) {
                if (file.isFile()) {
                    fileSizeSum += file.length();
                } else if (file.isDirectory()) {
                    fileSizeSum += sumofFileSizes(file);
                }
            }
        } else {
            System.out.println("The path is not a directory");
        }
        return fileSizeSum;
    }
}
