package christian.week02.day04;

import java.util.Scanner;

public class YesOrNo {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
YesOrNo();
    }

    public static boolean YesOrNo() {
        System.out.println("Möchtest du weitermachen (y) oder das Programm beenden (n)?");
        String answer;
        while (true) {
            answer = sc.nextLine();
            if (answer.equals("y")) {
                return true;
            } else if (answer.equals("n")) {
                return false;
            }
            else {
                System.out.println("Bitte gib entweder \"y\" oder \"n\" ein!");
            }
        }
    }
}
