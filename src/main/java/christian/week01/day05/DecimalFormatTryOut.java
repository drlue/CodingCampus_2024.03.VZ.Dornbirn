package christian.week01.day05;

import java.text.DecimalFormat;
import java.util.Random;

public class DecimalFormatTryOut {
    public static void main(String[] args) {
DezimalFormatTryOutMethod();
    }
    public static void DezimalFormatTryOutMethod(){
        DecimalFormat decimalFormat = new DecimalFormat("###.#####");
        double d = 25312352.84701;
        System.out.println(decimalFormat.format(d));
        long l = 1051;
        System.out.println(decimalFormat.format(l/Math.pow(10,2)));
    }
    public static void RandomNumberZeroToHundred(){
        Random random = new Random();
    }
}
