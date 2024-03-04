package samet.week01.day05;

public class PrimitiveDatenTypen {


    public static void main(String[] args) {
        System.out.println(faktiiorelle1(10));


    }


    public static long faktiiorelle1 (long value) {
        long result = 1;
        for (int i = 1; i <= value; i++)
            result = i * value;

        return result;

    }








}






