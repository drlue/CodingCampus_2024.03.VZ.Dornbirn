package irem.week02;

public class Faktorielle1 {
    public static void main(String[] args) {
        System.out.println("\n Faktorielle1 nummer");
        System.out.println(faktorielle1(4));

    }

    public static long faktorielle1(int zahl) {
        if (zahl <= 1) {
            return 1;
        } else {
            return zahl * faktorielle1(zahl - 1);
        }
    }
}
