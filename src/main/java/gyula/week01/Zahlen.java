package gyula.week01;

public class Zahlen {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        double b2 = 3.0;

        System.out.println( a / b);
        System.out.println( a / (double)b);
        System.out.println( a / b2);


        int prozent = 567;
        System.out.println(prozent / 100.0 + "%");

        System.out.println(Integer.toString(b));
        System.out.println(Double.toString(b2));

        String text = "123";
        try {
            int num = Integer.parseInt(text);
            System.out.println(num + 1);
        } catch (NumberFormatException nfe) {
            System.out.println("Die Konvertierung ist nicht möglich");
        }

    }
}
