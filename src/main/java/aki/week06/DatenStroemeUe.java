package aki.week06;

import java.io.File;

public class DatenStroemeUe {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\aki");
        fileList(x);

    }

    public static void fileList(File x) {
        if (x.isDirectory()) {
            File[] f = x.listFiles();
            for (int i = 0; i < f.length; i++) {
                System.out.println(f[i].getName());
            }
        } else {
            System.out.println("File doesn't exist.");
        }
    }
}
