package lukas.week05;

import ardijanla.ConsoleColors;

import java.io.File;

public class FilesListDirectory {
    public static void main(String[] args) {

        String path = "C:\\Users\\LZE\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java";
        printDirectoryV2(path);
        System.out.printf("%d Files in Directory\n", countFiles(path));
        System.out.printf("%d bytes\n", sumFileSize(path));


    }

    public static void printDirectory(String dirPath) {
        File dir = checkDirectory(dirPath);
        if (dir == null) {
            System.out.println("Directory not found");
        } else {
            File[] listOfFiles = dir.listFiles();
            if (listOfFiles != null) {
                for (File f : listOfFiles) {
                    System.out.printf("%-50s %10s\n", f.getName(), f.isDirectory() ? "<DIR>" : f.length());
                }
            }
        }
    }

    public static void printDirectoryV2(String dirPath) {
        File dir = checkDirectory(dirPath);
        if (dir == null) {
            System.out.println("Directory not found");
        } else {
            System.out.printf("%10s %s \n", "Size", "Name");
            File[] listOfFiles = dir.listFiles();
            if (listOfFiles != null) {
                //list directories
                for (File f : sortListOfFilesByFileSizeDesc(listOfFiles)) {
                    String color = f.isDirectory() ? ConsoleColors.BLUE : ConsoleColors.RESET;
                    System.out.printf("%s%10s %s%s\n", color, f.isDirectory() ? "<DIR>" : Long.toString(f.length()), f.getName(), ConsoleColors.RESET);
                }
                //list files, size descending
            }
        }
    }


    public static File checkDirectory(String dirPath) {
        File dir = new File(dirPath);
        //check if file exists
        if (!dir.exists()) {
            return null;
        }
        //check if is directory, else select parent directory
        dir = dir.isDirectory() ? dir : dir.getParentFile();
        return dir;

    }

    public static File[] sortListOfFilesByFileSizeDesc(File[] files) {
        File[] arr = files.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (
                        (arr[j].isDirectory() && arr[j + 1].isDirectory() && arr[j].getName().compareTo(arr[j + 1].getName()) > 0) ||
                                (arr[j].isFile() && arr[j + 1].isDirectory()) ||
                                (arr[j].isFile() && arr[j + 1].isFile() && arr[j].length() < arr[j + 1].length())
                ) {
                    File tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static int countFiles(String path) {
        File file = new File(path);
        int count = 0;
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File f : files) {
                        if (f.isFile()) {
                            count++;
                        }
                    }
                }
            } else {
                count++;
            }
        } else {
            System.out.println("File or directory does not exist!");
        }
        return count;
    }

    public static long sumFileSize(String path) {
        File file = new File(path);
        long size = 0;
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File f : files) {
                        if (f.isFile()) {
                            size += f.length();
                        }
                    }
                }
            } else {
                size += file.length();
            }
        } else {
            System.out.println("File or directory does not exist!");
        }
        return size;
    }
}

