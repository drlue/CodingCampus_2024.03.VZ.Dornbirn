package katherina.week01.day04;

public class VerbessertesSchaltjahrscriptMitAbfrage {
    public static void main(String[] args) {
        System.out.println(schaltjahr(2004));
}
    public static boolean schaltjahr(int wert) {
        try {
            return ((wert % 4 == 0) && (wert % 100 != 0) || (wert % 400 == 0));
        } finally {
            System.out.println(wert);
        }
    }
}
