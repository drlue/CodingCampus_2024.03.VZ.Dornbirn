package demian.week06.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Telefonbuch {
    public static void main(String[] args) {

        File source = new File("/Users/demian/IdeaProjects/CodingCampus_2024.03.VZ.Dornbirn/src/main/java/demian/week06/day04/files/Den svenska Arbetareskyddslagstiftningen och Yrkesinspektionen by Georg Stjernstedt.txt");
        wordCaptureAndCounter(source);
    }

    public static void wordCaptureAndCounter(File source) {
        try {
            Scanner sc = new Scanner(source);
            Map<String, Integer> map = new HashMap<>();

            while (sc.hasNext()) {
                String word = sc.next().toLowerCase();

                if (!map.containsKey(word)) {
                    map.put(word, 1);
                } else {
                    map.put(word, map.get(word) + 1);
                }
            }

            // Umwandlung der Map in eine Liste von Map-Einträgen
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

            // Sortieren der Liste nach der Häufigkeit der Wörter
            Collections.sort(entryList, (a, b) -> b.getValue().compareTo(a.getValue()));

            // Ausgabe der sortierten Liste
            for (Map.Entry<String, Integer> entry : entryList) {
                System.out.println("Wort: " + entry.getKey() + ", Häufigkeit: " + entry.getValue());
            }


        } catch (FileNotFoundException fnfe) {
            System.out.println("File nicht gefunden");
        }


    }
}
