package irem.HU;

public class AufgabeStringManipulation2 {

    public static void main(String[] args) {
        String regex = "[a-z]{3,}[1-9]\\d{2}[A-Z]+";

        // Durchführung der Tests
        System.out.println("abc100A".matches(regex));
        System.out.println("Abc100A".matches(regex));
        System.out.println("luke010A".matches(regex));
        System.out.println("test101ABCDE".matches(regex));
        System.out.println("test1ABCDE".matches(regex));
    }
}
