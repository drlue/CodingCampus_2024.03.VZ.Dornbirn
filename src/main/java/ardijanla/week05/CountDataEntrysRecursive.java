package ardijanla.week05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountDataEntrysRecursive {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\kaar\\Desktop\\Hello.txt");
        System.out.println("subpath: " + path.subpath(0, 4));
        System.out.println("get name with index: " + path.getName(2));
        System.out.println("Name count: " + path.getNameCount());
        System.out.println("Root: " + path.getRoot());

        try {
            List<String> lines = Files.readAllLines(path);

            for (String x : lines) {
                System.out.println(x);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void TestingClass() throws IOException {


    }


}
