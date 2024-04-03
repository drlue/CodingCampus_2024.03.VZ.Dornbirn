package ardijanla.week05;

import java.io.File;

public class CountDataEntrys {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\kaar\\Desktop\\Erster Ordner");

        if (file.isDirectory() && file.exists()) {
            File[] fileList = file.listFiles();
            System.out.println("There are " + (fileList.length - 1) + " Files");
            long sumOfSpace = 0;
            for (File x : fileList) {
                sumOfSpace += x.length();
            }
            System.out.println("The Data uses " + sumOfSpace + " Bytes");

        } else {
            System.out.println("this is not a Direcotiry");
        }
    }
}
