package gyula.week02;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class DoubleParser {
    public static void main(String[] args) {
        System.out.println(parseDouble("1234.66", Locale.US));
        System.out.println(parseDouble("1234,66", Locale.GERMANY));
    }

    public static double parseDouble(String text, Locale l){
        NumberFormat df = DecimalFormat.getInstance(l);
        try {
            return df.parse(text).doubleValue();
        } catch (ParseException pe){
            pe.printStackTrace();
        }
        return 0;
    }
}
