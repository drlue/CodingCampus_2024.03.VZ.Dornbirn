package franco.week04;
import java.util.Random;

public class ReverseString {
    public static Random random= new Random();
    public static void main(String[] args) {

      String greeting="world";
        System.out.println(greeting);
        System.out.println(reverseWord(greeting));
        System.out.println(randomize(greeting));

    }
    public static String reverseWord(String word){

        //Convert string to char
        char[]charArray=word.toCharArray();
        //get the first index
        int start=0;
        //get the last index
        int end=word.length()-1;
        //while to reverse the word till they join in the middle of the word
        while(start<end){
            char temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }
        return new String(charArray);
   }

   public static String randomize(String text){
        char[]charArray = text.toCharArray();
       for (int i = 0; i < text.length(); i++) {
           int randomInd= random.nextInt(charArray.length);
           char temp = charArray[i];
           charArray[i]=charArray[randomInd];
           charArray[randomInd]= temp;

       }
        return new String(charArray);
   }
}
