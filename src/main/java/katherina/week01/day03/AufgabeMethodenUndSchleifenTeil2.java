package katherina.week01.day03;

public class AufgabeMethodenUndSchleifenTeil2 {
    public static void main(String[] args) {
        System.out.println("\nprintEmptySquare");
        printemptySquare("*", 10);

    }

    public static void printemptySquare(String text, int size) {
        for (int reihe = 0; reihe < size; reihe++) {
            for (int buchstabe = 0; buchstabe < size; buchstabe++) {
                System.out.print(text);
                if (buchstabe == 0 || reihe == 0 || reihe == size - 1 || buchstabe == size - 1) {
                    System.out.print(text);
                } else {
                    System.out.print("L");
                }
            }
            System.out.println();
        }
    }
}

