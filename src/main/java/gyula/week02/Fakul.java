package gyula.week02;

public class Fakul {

    public static void main(String[] args) {
        fakul1FromArdijanla(20);

        System.out.println("\n===========================\n");
        fakul(20);
    }

    public static long fakul(int num){
        long n = 1;
        for (int i = 1; i <= num; i++) {
            n = (n * i);
            System.out.printf("%2d! = %19d\n", i, n);
        }
        return n;
    }

    public static long fakul1FromArdijanla(int num) {
        long n = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(n);
            n = (n * i);
        }
        return n;
    }
}
