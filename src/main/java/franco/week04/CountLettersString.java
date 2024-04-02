package franco.week04;

public class CountLettersString {
    public static void main(String[] args) {

        String text = "unconstitutionally";
        System.out.println(countLetterInSingleText(text));


        String longText =data.Texts.getSimpleText();
        System.out.println(longText);

        //Dr Google did most of it
        //so calm down
        int[]count=new int[Character.MAX_CODE_POINT];
        int textIndex=0;
        //loop continue as long as there is character left to count
        //textIndex is zero as initial declaration
        while(textIndex<longText.length()){
            //this will allow me to get each character
            //then be stored in codePoint(unicode code point)
            int codePoint=longText.codePointAt(textIndex);
            count[codePoint]+=1;
            // It updates textIndex by adding the number of char values
            // required to represent the current code point.
            textIndex+=Character.charCount(codePoint);//move to next code point
        }
        //int codePoint = 0;: It initializes codePoint to iterate over the possible code points.
        //while (codePoint < count.length) { ... }: This loop iterates over the count array.
        //if (count[codePoint] > 0) { ... }: It checks if the count for the current code point is greater than zero.
        int codePoint=0;
        while(codePoint<count.length){
            if (count[codePoint]>0){
                System.out.println(new String(Character.toChars(codePoint)) +
                        " (U+" + String.format("%04X", codePoint)
                        + ") -- " + count[codePoint]);
            }
            codePoint++;
        }
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
