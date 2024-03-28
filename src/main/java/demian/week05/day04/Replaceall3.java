package demian.week05.day04;

public class Replaceall3 {
    public static void main(String[] args) {

        //UEBUNG: Lösche im String
        //
        //"749813247132984712039487123049871204398712039487"
        //
        //Alle Zahlen von 0 bis 9 und gib ihn aus
        //Alle Zahlen von 1 bis 9 und gib ihn aus
        //Alle Zahlen von 2 bis 4 und gib ihn aus
        //Alle Zahlen von 1 bis 3 und 6 bis 9 und gib ihn aus

        String Numberstring = "749813247132984712039487123049871204398712039487";
        System.out.println(Numberstring);

        String Ohne0bis9 = Numberstring.replaceAll("[0-9]","");
        System.out.println(Ohne0bis9);

        String Ohne1bis9 = Numberstring.replaceAll("[1-9]","");
        System.out.println(Ohne1bis9);

        String Ohne2bis4 = Numberstring.replaceAll("[2-4]","");
        System.out.println(Ohne2bis4);

        String Ohne1bis3und6bis9 = Numberstring.replaceAll("[1-3,6-9]","");
        System.out.println(Ohne1bis3und6bis9);
    }
}
