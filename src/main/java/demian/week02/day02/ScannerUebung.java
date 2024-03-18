package demian.week02.day02;


public class ScannerUebung {


    public static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        String username = consoleTEXTinput("========================================\nHallo!\n\nBitte geben Sie hier ihren Namen ein ==> ");
        int age = consoleINTEGERinputV1("Bitte geben Sie hier ihr Alter ein ==> ", 8, 120);
        int weight = getINT("Bitte geben Sie hier Gewicht in kg ein ==> ", 20, 300);
        System.out.printf("Hallo %s (%d Jahre, %d kg)", username, age, weight);


    }
    //Wiederverwendbare Usereingaben:

    //Texteingabe
    public static String consoleTEXTinput(String messageTOuser) {
        System.out.print(messageTOuser);

        return sc.nextLine();
    }

    public static int consoleINTEGERinputV1(String messageTOuser, int minVAL, int maxVAL) {
        System.out.print(messageTOuser);
        int val = Integer.MIN_VALUE;
        while (val < minVAL || val > maxVAL) {
            while (!sc.hasNextInt()) {
                System.out.println("Bitte keine Buchstaben oder Sonderzeichen");
                sc.nextLine();
                System.out.print(messageTOuser);
            }
            val = sc.nextInt();
            sc.nextLine();
            if (val < minVAL || val > maxVAL) {
                System.out.printf("Nur Werte zwischen %d und %d gültig", minVAL, maxVAL);
                System.out.print(messageTOuser);

            }

        }
        return val;
    }

    public static int getINT(String messageTOuser, int minVAL, int maxVAL) {
        int result = Integer.MIN_VALUE;
        String txt;
        while (result == Integer.MIN_VALUE) {
            try {
                System.out.print(messageTOuser);
                txt = sc.nextLine();
                result = Integer.parseInt(txt);
                if (result < minVAL || result > maxVAL) {
                    System.out.printf("Nur Werte zwischen %d und %d sind zulaessig \n", minVAL, maxVAL);
                    result = Integer.MIN_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Eingegebener Wert ist keine Zahl");
            }
        }
        return result;
    }
}
