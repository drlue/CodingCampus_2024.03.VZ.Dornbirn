package gyula.week04;

public class FomratExample {
    public static void main(String[] args) {
        String text = String.format("abc\n");
        System.out.print(text);

        System.out.printf("abc\n");
        System.out.printf("%d\n", 10);
        System.out.printf("%d Stk. Apfel\n", 10);
        System.out.printf("| %6d |\n", 10);
        System.out.printf("| %6X |\n", 10);
        System.out.printf("| %06X |\n", 10);

        System.out.printf("| %20s |\n", "Gyula");
        System.out.printf("| %-20s |\n", "Gyula");

        System.out.printf("| %6d | %6X | %06X | %-20s |\n", 10, 10, 10, "Gyula");
        System.out.printf("| %1$6d | %1$6X | %1$06X | %2$-20s |\n", 10, "Gyula");
        System.out.printf("Ich kann auch ein %% drücken.\n");
        System.out.printf("Zeilenumbruch durch %%n%nsieht so aus\n");
    }
}
