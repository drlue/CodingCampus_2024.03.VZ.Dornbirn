package ardijanla.week4.day02;

public class CountLetters {

    public static void main(String[] args) {
        System.out.println("\nString Count Alphabet");
        String Text = "SAJDSAJDJSADJSAdsakjdkjsahdksajgdjsad";
        int[] b = BuchstabenZaehlen(Text);
        printLettersCount(b);

    }

    public static int[] BuchstabenZaehlen(String txt) {
        int[] letterStorage = new int[266];
        char[] txtInChar = txt.toCharArray();
        //im array letterstorage an plat char value z.b 97 und mache dort ++ an stelle 97 +1

        for (char c : txtInChar) {
            letterStorage[c]++;
        }
        return letterStorage;
    }

    public static void printLettersCount(int[] lettersStored) {

        for (int i = 0; i < lettersStored.length; i++) {
            char theChar = (char) i;
            if (lettersStored[i] > 0) {
                //letterstored[i] zeigt den Wert von dem Index in lettersStored;
                System.out.println(theChar + ": " + lettersStored[i]);
            }
        }
    }


}
