package gyula.week09;


public class NumberOverflow {
    public static void main(String[] args) {
        byte b = 0;

        for (int i = 0; i < 300; i++) {
            String s = "0".repeat(8).concat(Integer.toBinaryString(b & 0xFF));
            s = s.substring(s.length() - 8);
            System.out.printf("%4d ~ %8s%n", b, s);
            ++b;
        }


    }
}
