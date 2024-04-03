package christian.week05;

import java.io.File;

public class GroessteDateisuchen {
    public static void main(String[] args) {
        String path = "C:\\Users\\schmi\\Desktop\\test";
        File bestOf = groessteDatei(path);
        if (bestOf != null) {
            System.out.println(bestOf.getAbsolutePath().substring(path.length()));
        } else {
            System.out.println("Kein Datei gefunden...");
        }

    }
// mit Gyulas Hilfe
    public static File groessteDatei(String path) {
        File file = new File(path);
        File result = null;

        if (file.isDirectory()) {
            for (File x : file.listFiles()) {
                if (x.isFile()) {
                    if (result == null || result.length() < x.length()) {
                        result = x;
                    }
                } else {
                    File candidate = groessteDatei(x.getAbsolutePath());
                    if (result == null || result.length() < candidate.length()) {
                        result = candidate;
                    }
                }
            }
        } else {
            System.out.println("Der eingegebene Pfad stimmt nicht!");
        }
        return result;
    }
}
