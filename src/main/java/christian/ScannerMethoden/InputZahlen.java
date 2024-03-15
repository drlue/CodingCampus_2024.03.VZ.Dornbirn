package christian.ScannerMethoden;
public class InputZahlen {

    public static int getIntFromInputMessageMinMax(String message, int min, int max) {

        int result = Integer.MIN_VALUE;
        System.out.println(message);
        while (result < min || result > max) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            while (sc.hasNextInt() == false) {
                System.out.printf("Bitte gib eine positive Ganzzahl zwischen %d und %d ein: ", min, max);
                sc.nextLine();
            }
            result = sc.nextInt();
            sc.nextLine();
            if (result < min || result > max) {
                System.out.printf("Bitte gib eine positive Ganzzahl zwischen %d und %d ein: ", min, max);
            }
        }
        return result;
    }
}
