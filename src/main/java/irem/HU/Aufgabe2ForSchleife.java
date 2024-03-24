package irem.HU;

public class Aufgabe2ForSchleife {

    public static void main(String[] args) {
        printRowStipple("X", 3);

        }
        public static void printRowStipple (String text,int repetitions){
            for (int i = 0; i < repetitions; i++) {
                System.out.println(text);
                if (i < repetitions - 1) {
                    System.out.println();
                }
            }
        }
    }




