package christian.week05;

import java.io.*;

public class CountLetters {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\schmi\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\christian\\week05\\test.txt");
        System.out.println(countLetterInString(readToString(file), 'a'));
        char[] array = {'a', 's', 'x'};
        System.out.println(countMultipleLetterInString2(readToString(file), array));
    }

    public static String readToString(File file) {
        String temp;
        StringBuilder builder = new StringBuilder();
        try {
            Reader rd = new FileReader(file);
            BufferedReader reader = new BufferedReader(rd);
            while ((temp = reader.readLine()) != null) {
                builder.append(temp);
            }
        } catch (IOException e) {
            System.out.println("Datei wurde nicht gefunden oder Zugriffsrechte fehlen!");
            e.printStackTrace();
        }
        return builder.toString();
    }


    public static int countLetterInString(String str, char x) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static int countMultipleLetterInString(String str, char[] charArr) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < charArr.length; j++) {
                if (arr[i] == charArr[j]) {
                    count++;
                }
            }

        }
        return count;
    }

    public static int countMultipleLetterInString2(String str, char[] charArr) {
        int count = 0;
        for (char x : charArr) {
            count += countLetterInString(str, x); }
        return count;
    }
}
