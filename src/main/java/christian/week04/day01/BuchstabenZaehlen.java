package christian.week04.day01;

public class BuchstabenZaehlen {

    //Mit Gyulas Hilfe kompletiert und cleanup!
    public static void main(String[] args) {
        String text = data.Texts.getSimpleText();
        System.out.println(text);
        int[] count = new int[Character.MAX_CODE_POINT];

        for (int textIndex = 0; textIndex < text.length(); textIndex++) {
            count[text.codePointAt(textIndex)] += 1;
        }

        for (int codePoint = 0; codePoint < count.length; codePoint++) {
            if (count[codePoint] > 0) {
                System.out.println(new String(Character.toChars(codePoint)) + " (U+" + String.format("%04X", codePoint) + ") -- " + count[codePoint]);
            }
        }
    }
}
