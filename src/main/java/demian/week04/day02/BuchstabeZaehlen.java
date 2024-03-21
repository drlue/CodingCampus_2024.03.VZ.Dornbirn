package demian.week04.day02;

public class BuchstabeZaehlen {

    //AUFGABE: In der folgenden Aufgabe sollen alle Buchstaben und Zeichen eines Texts gezählt werden.
    // Den Text erhältst du über lukas.data.Texts.getSimpleText().
    // Um die einzelnen Buchstaben und Zeichen zu zählen soll ein int[] verwendet werden.
    // Der entsprechende char kann für das Array als Index verwendet werden.
    // Gib am Schluss die Anzahl der einzelnen Zeichen (zb. A,a,ä,.) aus.

    // Konsolenausgabe:
    // A: 10
    // B: 20
    // C: 1

    public static void main(String[] args) {

        String text = "Hallo, was geht ab ??!! Kannst du überhaupt Zeichen zählen?";
        System.out.println("Text:" + text);
        char[] textarray = text.toCharArray();


        int[] buchstabenzaehler = new int[Character.MAX_VALUE];

        for(char element : textarray){
            buchstabenzaehler[element]++;
        }

        System.out.println("Anzahl im Text vorkommender Zeichen:");
        for (int idx = 0; idx < buchstabenzaehler.length; idx++) {
            if (buchstabenzaehler[idx] > 0){
                System.out.printf("%c : " , idx);
                System.out.println(buchstabenzaehler[idx]);
            }

        }

    }
}
