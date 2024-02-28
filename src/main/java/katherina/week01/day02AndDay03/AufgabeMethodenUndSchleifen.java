package katherina.week01.day02AndDay03;

public class AufgabeMethodenUndSchleifen {
    public static void main(String[] args) {
        System.out.println("\nprintChars");
        printChars("X", 10);
        System.out.println("\nprintSquare");
        printSquare("X", 10);
        System.out.println("\nprintRectangle");
        printRectangle("x", 10, 3);
        System.out.println("\nprintTriangleBottomLeft");
        printTriangleBottomLeft("x", 4);
        System.out.println("\nprintTriangleTopLeft");
        printTriangleTopLeft("x", 5);
        System.out.println("\nprintTriangleTopRight");
        printTriangleTopRight("x ", 5);
        System.out.println("\nprintTriangleBottomRight");
        printTriangleBottomRight("x ", 5);

    }
//Vor dem Schlaf und nach der Methodendefinition Semikolon nicht vergessen!

    //Ich erzeuge einen "kontrollierten" Buchstabenstring
    public static void printChars(String text, int size) {
        int i = 0;
        while (i < size) {
            System.out.print(text);
            ++i;
        }
    }

    //Ich erzeuge ein "Quadrat" (gleichviele Zeilen und Zeichen, naja, theoretisch)
    public static void printSquare(String text, int size) {
        for (int reihe = 0; reihe < size; reihe++) {
            for (int buchstabe = 0; buchstabe < size; buchstabe++) {
                System.out.print(text);
            }
            System.out.println();
        }
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
    }
//Merke: Aufpassen! Was soll denn größer als was sein? In diesem Fall: Die Zahl der Reihen kleiner gleich der int Variable (also maximal vier).
    //Und ab der ersten Reihe nach der nullten Reihe soll immer ein Buchstabe hinzukommen. Also erst ab buchstabe = eins wird was hinzugefügt.

    //Ich erzeuge noch ein Dreieck, aber andersherum
    public static void printTriangleTopLeft(String text, int size) {
        for (int reihe = 0; size > reihe; reihe++) {
            for (int buchstabe = size - 1; reihe <= buchstabe; buchstabe--) {
                System.out.print(text);
            }
            System.out.println();
        }
    }
    //Merke: Wenn du subtrahieren willst (aber statt Zahlen Text ausgibst), musst du dem Affen Zucker geben (also ein paar Zahlen zum Aufessen. In diesem Fall: Die Zahl, die eh schon definiert ist)

    //Und nun soll das gleiche Dreieck erzeugt werden, aber ... gespiegelt.

    public static void printTriangleTopRight(String text, int size) {
        for (int reihe = 0; size > reihe; reihe++) {
            for (int buchstabe = 0; buchstabe < reihe; buchstabe++) {
                System.out.print(". ");
            }
            for (int buchstabe = reihe + 1; buchstabe < size; buchstabe++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

//Letztes Dreieck! Das entstand eigentlich an Tag 03, aber ich will alle Dreiecke in einer Datei, um die Codes vergleichen zu können!

    public static void printTriangleBottomRight(String text, int size) {
        for (int reihe = 0; size > reihe; reihe++) {
            for (int buchstabe = reihe + 1; buchstabe < size; buchstabe++) {
                System.out.print(". ");
            }
            for (int buchstabe = 0; buchstabe < reihe; buchstabe++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }
}
//Merke: Ich kann auf zwei Weisen steuern, welches Zeichen zuerst gedruckt wird. Erstens, indem ich festlege, welche Schleife was druckt.
//Zweitens, indem ich festlege, welche der For-Schleifen zuerst ausgeführt wird. Alle Dreiecke sollen genau darauf angeschaut werden.


