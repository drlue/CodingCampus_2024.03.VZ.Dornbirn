package christian.week01.day01;

public class Loops {
    public static void main(String[] args) {

        //Aufgabe Zählen for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //Aufgabe Zählen while
        int index = 0;
        while (index < 10) {
            index++;
        }
        //Aufgabe Zählen mit Trick
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("UnsereZahl:"+i);
            }
        }
        //Aufgabe Rewind
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println(ZweitePotenz(5));
    }

    public static int  ZweitePotenz(int a) {
        return a * a;
    }
}
