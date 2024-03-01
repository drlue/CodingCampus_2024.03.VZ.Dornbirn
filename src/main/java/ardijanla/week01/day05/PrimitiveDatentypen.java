package ardijanla.week01.day05;

public class PrimitiveDatentypen {
    public static void main(String[] args) {
        System.out.println(Fakul(10));
    }


    public static long Fakul(int num){
        int n = 0;
        for (int i = 0; i < num; i++) {
            n += n * i + 1;

        }
        return  n;
    }

}
