package irem.HU;
//nicht fertig
public class AufgabenMethoden2 {

    public static void main(String[] args) {
        printRowStipple("X", 3);
    }

    public static void printRowStipple(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println();
            for (int j = 0; j < count; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
