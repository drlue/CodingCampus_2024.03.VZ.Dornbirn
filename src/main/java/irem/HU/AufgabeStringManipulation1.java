package irem.HU;


public class AufgabeStringManipulation1 {

    public static void main(String[] args) {
        String input = "1234567890 abcdefghijklmnopqrstuvwxyz";


        input = input.replaceAll("[a-c]", "X");
        input = input.replaceAll("[f-z]", "Y");
        input = input.replaceAll("[4-9]", "b");
        input = input.replaceAll("[1-5]", "a");

        System.out.println(input);
    }
}

