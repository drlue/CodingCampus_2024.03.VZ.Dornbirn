package lukas.week04;

public class StringReverse {


    public static void main(String[] args) {

        String txt = lukas.Helper.readStringFromConsole("Reverseprogramm\nBitte Text eingeben >>>");
        System.out.println(reverseString(txt));


    }

    public static String reverseString(String txt) {
        char[] cArr = txt.toCharArray();
        char[] revArr = new char[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            revArr[cArr.length - 1 - i] = cArr[i];
        }
        return new String(revArr);
    }


}
