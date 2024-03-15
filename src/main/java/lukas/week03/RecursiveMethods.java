package lukas.week03;

public class RecursiveMethods {
    public static int value;
    public static int counter = 0;
    public static int counter2 = 0;

    public static void main(String[] args) {
        int n = 2;
        System.out.println("Methode test");
        System.out.println("============");
        System.out.printf("2 ^ %d = %d\n", n, test(n));
        System.out.println("Counter = " + counter);
        System.out.println("Counter2 = " + counter2);
        System.out.println();

        //Counter zurückstellen
//        counter = 0;
//        counter2 = 0;
//        n = 5;
//        int k = 3;
//        System.out.println("Methode binomCoeff");
//        System.out.println("============");
//        System.out.printf("%d über %d = %d\n", n, k, binomCoeff(n, k));
//        System.out.println("Counter = " + counter);
//        System.out.println("Counter2 = " + counter2);
    }

    public static int test(int n) {
        counter++;
        if (n <= 0) {
            counter2++;
            return 1;
        } else {
            return test(n - 1) + test(n - 1);
        }
    }


    public static int binomCoeff(int n, int k) {
        counter++;
        if (k == 0 || k == n) {
            counter2++;
            value = 1;
        } else {
            value = binomCoeff(n - 1, k - 1) + binomCoeff(n - 1, k);

        }
        return value;
    }

}
