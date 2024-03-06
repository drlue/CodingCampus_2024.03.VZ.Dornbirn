package aki.week02;

import java.util.Scanner;

public class InputUe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please down write your name, age and your current Salary: ");

        String name = scan.nextLine();
        System.out.print("age: ");
        int age = scan.nextInt();
        System.out.print("salary");
        double salary = scan.nextDouble();

        System.out.println(name + ", you are " + age + " Years old and your current Salary is €" + salary);
    }
}
