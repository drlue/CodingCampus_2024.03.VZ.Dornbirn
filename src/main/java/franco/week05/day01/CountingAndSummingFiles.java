package franco.week05.day01;

import java.io.File;

public class CountingAndSummingFiles {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\vince\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java";
        File directory = new File(directoryPath);
        totalDataAndSize(directory);
    }

    public static void totalDataAndSize(File file) {
        File[] fileArray = file.listFiles();
        int fileCount = 0;
        long total = 0;
        if (file.isDirectory() && file.exists()) {
            if (fileArray != null) {
                for (File x : fileArray) {
                    System.out.println("name=>> " + x.getName() + " size=>> " + x.length());
                    total += x.length();
                    fileCount++;
                }
            }
            System.out.println("Number of data: " + fileCount);
            System.out.println("Total size of data: " + total + " bytes");
        } else {
            System.out.println("The data you are looking for does not exist or is unreachable...");
        }
    }
}

