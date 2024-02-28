package irem.Print;

public class Characters {
    public static void main(String[] args) {
        System.out.println("\nprintChars()");
        printChars("X", 10);

    }
    //System.out.println("\nprintSquare()");
    //    printSquare("X ", 10);


public static void printChars(String text, int size) {
    int x = 0;
    while (x < size) {
        System.out.print(text);
        ++x;

    }
    System.out.println();
}
/*
    public static void printSquare(String Text, int size){
}
*/
}
