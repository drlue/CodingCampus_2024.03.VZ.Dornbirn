package gyula.week02;

import java.util.Random;

public class Debugger {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int x = rand.nextInt(101);

        System.out.println("X: " + x);
        x = rand.nextInt(50);
        System.out.printf("X: %d\n", x);
        x = rand.nextInt(20);

        aki.week01.day01.AufgabeChar.printTriangleBottomRight("A", x);
        System.out.println("Good bye!");
    }
}
