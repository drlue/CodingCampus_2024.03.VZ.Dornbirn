package lukas.week01;

public class Ue04PrimitiveDatentypen {

    public static void main(String[] args) {

        System.out.println("1! = ");
        System.out.println(fakt(10));

        System.out.println("Faktorielle 1! bis 20!");
        printFakt(1, 20);

        System.out.println("Faktorielle 1! bis 20! besser formatiert");
        printfFakt(1, 20);


    }

    public static long fakt(int value) {
        long result = 1;
        for (int i = 1; i <= value; i++) {
            result = i * result;
        }
        return result;
    }

    public static void printFakt(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(fakt(i));
        }
    }

    public static void printfFakt(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%25.3f %n", (float) fakt(i));
        }
    }


}
