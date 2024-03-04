package ardijanla.week01.day05;

public class PrimitiveDatentypen {
    public static void main(String[] args) {
        System.out.println("Fakul");
        System.out.println(fakul(10));
        System.out.println("Fakul1");
        fakul1(10);

    }


    public static long fakul(int num) {
        long n = 1;
        for (int i = 1; i <= num; i++) {
            n = (n * i);
        }
        return n;
    }
    public static long Fakul1(int num) {
        long n = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(n);
            n = (n * i);
        }
        return n;
    }

    public static void fakul1(int num) {
        for (int i = 1; i < num; i++) {
            System.out.println(fakul(i));
        }
    }
//
//    public static void Fakul2(int num){
//
//            System.out.printf("%14d",Fakul1(10));
//    }

}
