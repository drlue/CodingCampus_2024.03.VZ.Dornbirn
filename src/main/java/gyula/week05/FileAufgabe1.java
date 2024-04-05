package gyula.week05;

import ardijanla.ConsoleColors;

import java.io.File;

public class FileAufgabe1 {
    public static void main(String[] args) {
        String dirName = "/Users/gyula.horvath/";
        listDirectory(dirName);
        System.out.println(countFiles(dirName) + " files has found.");
        System.out.println(sumSizeFiles(dirName) + " files has found.");
    }

    public static long sumSizeFiles(String name){
        long size = 0;
        File f = new File(name);
        if (f.isDirectory()){
            for (File fi: f.listFiles()){
                if (fi.isFile()) {
                    size += fi.length();
                }
            }
        } else if (f.exists()){
            size += f.length();
        }
        return size;
    }


    public static int countFiles(String name){
        int count = 0;
        File f = new File(name);
        if (f.isDirectory()){
            for (File fi: f.listFiles()){
                if (fi.isFile()) {
                    ++count;
                }
            }
        } else if (f.exists()){
            ++count;
        }
        return count;
    }

    public static void listDirectory(String name){
        File f = new File(name);
        if (f.isDirectory()){
            File[] arrFile = f.listFiles();
            bubbleSortByFileSizeDesc(arrFile);
            for (File fi : arrFile){
                if (fi.isFile()) {
                    System.out.printf("%10d %s", fi.length(), fi.getName());
                } else {
                    System.out.print(ConsoleColors.BLUE);
                    System.out.printf("%10s %s", "", fi.getName());
                    System.out.print(ConsoleColors.RESET);
                }
                System.out.println();
            }
        } else {
            System.out.println(f.getAbsolutePath() + " is not a directory.");
        }
    }

    public static void bubbleSortByFileSizeDesc(File[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (
                        (arr[j].isFile() && !arr[j + 1].isFile()) || // Wenn 1 File und 1 Directory
                        (!arr[j].isFile() && !arr[j + 1].isFile() && arr[j].getName().compareToIgnoreCase(arr[j + 1].getName()) > 0) || // 2 Directories nach Name Alphabetisch
                        (arr[j].isFile() && arr[j + 1].isFile() && arr[j].length() < arr[j+1].length())) { // 2 Files nach Größe absteigend
                    File temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
