package franco.week04;

public class CountLettersString {
    public static void main(String[] args) {

        String text = "unconstitutionally";
        System.out.println(countLetterInSingleText(text));

       // String longText =lukas.data.Texts.getSimpleText();



    }

    public static int countLetterInSingleText(String text){
        int count=0;
        char[]charArray=text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            count++;

        }
        return count;

    }





}
