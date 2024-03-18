package lukas.week04;

import java.util.Arrays;

public class StringStuff {

    public static void main(String[] args) {
        String str = "Hallo Lukas, wie geht es Dir?";
        System.out.println(str);

        int index1 = str.indexOf("L");
        System.out.println("index L = "+index1);

        System.out.println("str ist " + (!str.isEmpty() ? "nicht " : "") + "leer");

        boolean matchesLukas = str.matches("Lukas");
        System.out.println("Lukas ist in str "+ (!matchesLukas?"nicht ":"") + "enthalten");

        String str1 = str.replace("Lukas", "Daniela");
        System.out.println(str1);

        String[] arrStr = str.split(" ");
        System.out.println(Arrays.toString(arrStr));

        String substr = str.substring(6,11);
        System.out.println(substr);

        char[] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr));

        String str2 = str.toUpperCase();
        System.out.println(str1);

        System.out.println(str.trim());
        System.out.println(str.strip());

    }


}
