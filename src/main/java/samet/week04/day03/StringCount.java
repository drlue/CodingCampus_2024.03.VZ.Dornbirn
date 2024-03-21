package samet.week04.day03;


public class StringCount {

    public static void main(String[] args) {

        String text = "Hallo ich heisse Samet und komme aus Vorarlberg";


        String completed = "";
        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            for (int j = i; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;

                }

            }
            String s = String.valueOf(text.charAt(i));
            if (!completed.contains(s)) {
                completed = completed + text.charAt(i);

            }
            System.out.println("Total number of count of occurance of " + text.charAt(i) + " is" + count);


        }
    }
}














