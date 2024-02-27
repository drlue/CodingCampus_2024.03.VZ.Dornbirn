package ardijanla.week01.day01;

public class MethodenUndSchleifen {

    public static void main(String[] args) {

        printChars("A", 10);
        printSquare("B", 5);
        printRect("C", 2, 5);
        printTriangleBottomLeft("T",5);
        printTriangleTopLeft("X",5);
        printTriangleTopRight("S",5);

    }

    public static String printChars(String character, int number) {

        String output = "";
        for (int i = 0; i <= number; i++) {
            output += character;

        }
        System.out.println(output);
        return output;
    }

    public static void printSquare(String character, int number) {
        System.out.println("Print Square");

        String Output = printChars(character, number);

        for (int i = 0; i < number; i++) {
            System.out.println(Output);
        }
    }

    public static void printRect(String character, int length, int height) {
        System.out.println("Print Rectangle");

        String Output = printChars(character, length);

        for (int i = 0; i < height; i++) {
            System.out.println(Output);
        }
    }

    public static void printTriangleBottomLeft(String character,int length){
        System.out.println("Print Triangle (1)");

        String Output = "";

        for (int i = 0; i < length; i++) {
            Output += character;
            System.out.println(Output);
        }
    }

    public static void printTriangleTopLeft(String character, int length){
        System.out.println("Print Triangle (2)");


        for (int i = length; i >= 0; i--) {

            printChars(character,i);
        }
    }

    public static void printTriangleTopRight(String character,int length){
        System.out.println("Print Triangle (3)");


        int counter = 0;

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < i; j++) {
                System.out.println(" ");
            }
            for (int j = 0; j < length - i ; j++) {
                System.out.println(character);
            }
            System.out.println(" ");
        }

        
    }

}









