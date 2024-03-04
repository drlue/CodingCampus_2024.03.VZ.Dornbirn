package franco.week01.day02;
import java.text.DecimalFormat;


public class PrimtiveDataTypes {

    //reformat number into 2 decimal place
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {
       

//        System.out.print(" 10! =");
//        System.out.println(factorialNumber(10));
//        printFactorial(1, 20);
//        printIncrement(0,100);
        divideAndConquer(1,20);
    }

    public static long factorialNumber(int value) {
        long result = 1;
        for (int i = 1; i <= value; i++) {
            result = i * result;
        }
        return result;
    }

    public static void printFactorial(int startNum, int endNum) {
        for (int i = startNum; i <= endNum; i++) {
            System.out.printf("%19d%n", factorialNumber(i));
        }
    }
    public static void printIncrement(int start, int end) {

        for (double i = 0; i <= end; i += 0.1) {

            System.out.println(decfor.format(i));
        }
    }
    public static void divideAndConquer(int start,int end){
        for (int i = start; i <= end; i++) {
           // System.out.print(i);
            System.out.print(i/5);
            System.out.print(i/5.0);
        }
    }


}
