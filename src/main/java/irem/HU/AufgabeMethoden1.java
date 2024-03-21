package irem.HU;

public class AufgabeMethoden1 {

    public static void main(String[] args) {
        printLineStipple("X", 10);
    }

    public static void printLineStipple(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}


