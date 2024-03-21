package luki.week04;

public class StringConcatenation {
    public static void main(String[] args) {
        measure(() -> {
            String a = "";
            for (int i = 0; i < 300000; i++) {
                a += "a";
            }
            a = a.toLowerCase();
            System.out.println(a.length());
        });
        measure(() -> {
            StringBuilder a = new StringBuilder();
            for (int i = 0; i < 300000; i++) {
                a.append("a");
            }
            String result = a.toString().toLowerCase();
            System.out.println(result.length());
        });
    }

    private static void measure(Runnable run) {
        long start = System.currentTimeMillis();
        run.run();
        long end = System.currentTimeMillis();
        System.out.println("Took: " + (end - start) + "ms");
    }
}
