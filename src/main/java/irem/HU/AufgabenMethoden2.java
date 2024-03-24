package irem.HU;


public class AufgabenMethoden2 {

    public static void main(String[] args) {

            printRowStipple("X", 3);
        }
        public static void printRowStipple (String text,int repetitions){
            for (int i = 0; i < repetitions; i++) {
                System.out.println(text); // Gibt den Text aus
                System.out.println(); // Fügt einen Zeilenumbruch hinzu
            }
        }
    }
