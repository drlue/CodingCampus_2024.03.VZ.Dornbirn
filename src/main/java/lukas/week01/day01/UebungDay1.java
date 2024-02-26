package lukas.week01.day01;

public class UebungDay1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hallo12313föäasödlfkjasdfasdffasdkfj123");
        System.out.println("     /--\\");
        System.out.println("    / /\\ \\");
        System.out.println("   / /  \\ \\");
        System.out.println("  / /    \\ \\");
        System.out.println(" /  ======  \\");
        System.out.println("/ /        \\ \\");

        //Zählen 1a
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //Zählen 1b
        int j = 0;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        //Zählen 2
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //Zählen 3a
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Zählen 3b
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        //Zählen 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }


}

