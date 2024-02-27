package katherina.week01.day02;

public class AufgabePrintChars {
    public static void main(String[] args) {
        printChars("X", 10);
        printSquare("X", 10);
        printRectangle("x", 10, 3);
        printTriangleBottomLeft("x", 4);
        printTriangleTopLeft("x", 5);
        printTriangleTopRight("x", 5);
    }
//Vor dem Schlaf und nach der Methodendefinition Semikolon nicht vergessen!

    //Ich erzeuge einen "kontrollierten" Buchstabenstring
    public static void printChars(String text, int size) {
        int i = 0;
        while (i < size) {
            System.out.print(text);
            ++i;
        }
        System.out.println();
        System.out.println();
    }

    //Ich erzeuge ein "Quadrat" (gleichviele Zeilen und Zeichen, naja, theoretisch)
    public static void printSquare(String text, int size) {
        for (int reihe = 0; reihe < size; reihe++) {
            for (int buchstabe = 0; buchstabe <= 10; buchstabe++) {
                System.out.print(text);
            }
            System.out.println(text);
        }
        System.out.println();
        System.out.println();
    }


//Wichtig: Ich darf Variablen (hier Size) wiederverwenden, wenn ich zwei mal bis zur gleichen Zahl "zählen" will.
//Merkzettel: Ich muss Java sagen, dass ich den !!!Text!!! printe(l)n will, sonst checkt Java das nicht!

    //Ich erzeuge ein Rechteck mit zwei verschiedenen "Kantenlängen"
    public static void printRectangle(String text, int size, int size2) {
        for (int reihe = 0; reihe < size2; reihe++) {
            for (int buchstabe = 0; buchstabe < size; buchstabe++) {
                System.out.print(text);
            }
            System.out.println(text);
        }
        System.out.println();
        System.out.println();
    }
    //Merksatz: Klammern sind Freunde! Kein Futter! (Nicht aufessen, sondern setzen!)

    //Ich erzeuge ein Dreieck.

    public static void printTriangleBottomLeft(String text, int number) {
        for (int reihe = 0; reihe <= number; reihe++) {
            for (int buchstabe = 1; buchstabe <= reihe; buchstabe++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
//Merke: Aufpassen! Was soll denn größer als was sein? In diesem Fall: Die Zahl der Reihen kleiner gleich der int Variable (also maximal vier).
    //Und ab der ersten Reihe nach der nullten Reihe soll immer ein Buchstabe hinzukommen. Also erst ab buchstabe = eins wird was hinzugefügt.

    //Ich erzeuge noch ein Dreieck, aber andersherum
    public static void printTriangleTopLeft(String text, int number) {
        for (int reihe = 0; number > reihe; reihe++) {
            for (int buchstabe = 4; reihe <= buchstabe; buchstabe--) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    //Merke: Wenn du subtrahieren willst (aber statt Zahlen Text ausgibst), musst du dem Affen Zucker geben (also ein paar Zahlen zum Aufessen.)

    //Und nun soll das gleiche Dreieck erzeugt werden, aber ... gespiegelt.

    public static void printTriangleTopRight(String text, int number) {
        for (int reihe = 0; number > reihe; reihe++) {
            for (int buchstabe = 4; reihe <= buchstabe; buchstabe--) {
                System.out.print(text);
                for (int leerzeichen = 1; buchstabe <= reihe; leerzeichen++) {
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
