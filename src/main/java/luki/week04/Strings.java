package luki.week04;

public class Strings {
    public static void main(String[] args) {
        String tmp = "Österreich";
        String tmp1 = "Österreich";

        System.out.println(tmp == tmp1);

        String tmp2 = "Österreic";
        tmp2 += "h";

        System.out.println(tmp == tmp2);
        System.out.println(tmp.equals(tmp2));

        char[] letters = tmp2.toCharArray();
        for(int i = 0; i<letters.length; i++) {
            System.out.println(letters[i]);
        }
        System.out.println("---");
        for(char element : letters) {
            System.out.println(element);
        }

        String a = "A";
        String b = "B";

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));

        String aa = "AA";
        System.out.println("AA compared with A: " + aa.compareTo(a));

        String aaa = "AAA";
        System.out.println("AAA compared with A: " + aaa.compareTo(a));

        String aaab = "AAAB";
        System.out.println("AAAB compared with A: " + aaab.compareTo(a));

        System.out.println("AAAB compared with BX: " + aaab.compareTo("BX"));


        System.out.println(tmp.toLowerCase());

        String firstAustrianHalf = tmp.substring(0, tmp.length()/2);
        System.out.println(firstAustrianHalf);


    }
}
