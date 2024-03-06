package katherina.week01.day04;

public class AufgabeStrukturierteProgrammierungTag04 {
    public static void main(String[] args) {
        System.out.println("\nprintRhombus");
        printRhombus("x ", 7);

    }

    public static void printRhombus(String text, int size) {
        for (int reihe = 0; size > reihe; reihe++) {
            for (int spalte = 0; spalte < size; spalte++) {
                if (((reihe + spalte) == size / 2) ||
                        ((reihe + spalte) == size + 2) ||
                        (reihe == size - 2 && spalte == size - reihe) ||
                        (spalte == size - 2 && reihe == (size - spalte)) ||
                        ((reihe + spalte == size - 2) && reihe != 0 && spalte != 0 && reihe != size - 4 && spalte != size - 4)) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
//Rhombus und andere Dinge bitte daheim fertig machen! (Ich werde soooo viel Spaß haben!)
    //Matritze:
    /*
    0| | | |X| | | |
    1| | |X| |X| | |
    2| |X| | | |X| |
    3|X| | | | | |X|
    4| |X| | | |X| |
    5| | |X| |X| | |
    6| | | |X| | | |
     |0|1|2|3|4|5|6

Koordinaten, bei denen ein X geschrieben werden muss:
4-1;
1-4
     */
}
