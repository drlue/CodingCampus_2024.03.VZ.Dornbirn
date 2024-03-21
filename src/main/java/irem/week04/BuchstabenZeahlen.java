package irem.week04;

//NICHT FERTIG
public class BuchstabenZeahlen {


    public static void main(String[] args){

        String text = data.Texts.getSimpleText();
        System.out.println("So oft kommen die Zeichen vor");
        eachLetter(text);
        System.out.println("Länge:"+ text.length());
    }

    public static void eachLetter(String lettercount) {
        int[] count = new int[Character.MAX_VALUE];
        for (int i = 0; i < lettercount.length(); i++) {
            count[lettercount.charAt(i)] += 1;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("Zeichen: " + i + "Vorkommen:" + count[i]);
            }

        }
    }
}

