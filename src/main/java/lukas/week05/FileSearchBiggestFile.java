package lukas.week05;

import lukas.Helper;

import java.io.File;

public class FileSearchBiggestFile {

    public static void main(String[] args) {

        String pathInput = Helper.readStringFromConsole("Gib das gewünschte Verzeichnis ein:>>>");
        //String pathInput = "C:\\Users\\LZE\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java";
        File maxFile = getFileWithMaxSize(pathInput);
        if(maxFile != null) {
            System.out.printf("%s%20d bytes", maxFile.getAbsolutePath(), maxFile.length());
        }


    }

    public static File getFileWithMaxSize(String pathInput){
        long maxSize = 0;
        File maxFile = null;

        File dir = new File(pathInput);
        if(dir.isDirectory()) {
            File[] files = dir.listFiles();
            if(files != null){
                for(File f : files) {
                    if(f.isFile() && f.length() > maxSize) {
                        maxSize = f.length();
                        maxFile = f;
                    } else if (f.isDirectory()) {
                        File file2 = getFileWithMaxSize(f.getAbsolutePath());
                        if(file2 != null && file2.isFile() && file2.length() > maxSize) {
                            maxSize = file2.length();
                            maxFile = file2;
                        }
                    }
                }
            }
        } else {
            System.out.println("Pfad konnte nicht gefunden werden");
        }
        return maxFile;
    }

}
