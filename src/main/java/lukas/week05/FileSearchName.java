package lukas.week05;

import lukas.Helper;

import java.io.File;
import java.util.regex.Matcher;

public class FileSearchName {
    public static void main(String[] args) {
        String pathInput = Helper.readStringFromConsole("Gib das gewünschte Verzeichnis ein:>>>");
        //String pathInput = "C:\\Users\\LZE\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java";
        String searchString = Helper.readStringFromConsole("Suchstring:>>>");
        searchDirectoryRec(pathInput, searchString);



    }

    public static void searchDirectoryRec(String path, String searchItem) {
        File dir = new File(path);
        StringBuilder sb = new StringBuilder();
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile() && f.getName().matches(".*" + searchItem + ".*")) {
                        System.out.println(f.getName());
                    } else if (f.isDirectory()) {
                        searchDirectoryRec(f.getAbsolutePath(), searchItem);
                    }
                }
            }
        } else {
            System.out.println("Verzeichnis nicht gefunden");
        }

    }

}
