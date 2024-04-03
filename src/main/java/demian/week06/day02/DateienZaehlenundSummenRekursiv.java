package demian.week06.day02;

import java.io.File;

public class DateienZaehlenundSummenRekursiv {
    public static void main(String[] args) {
        int filescounter = filesCountRecursive("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/aki");
        System.out.println(filescounter);
    }
    public static int filesCountRecursive (String dir){
        File directory = new File(dir);
        int filecounter = 0;
        File[] files = directory.listFiles();
        for (File file : files){
            if (file.isFile()){
                filecounter++;
            } else if (file.isDirectory()) {
                filecounter += filesCountRecursive(file.getAbsolutePath());
            }
        }
        return filecounter;
    }

}
