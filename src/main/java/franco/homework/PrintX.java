package franco.homework;

public class PrintX {
    public static void main(String[] args) {

        printX("X",3);
    }

    public static void printX(String sym,int size){
        for (int i = 0; i < size; i++) {
            System.out.println(i+"X");
            for (int j = 0; j < size; j++) {
                if(j%2!=0) {
                    System.out.println(j);
                }
            }
        }

    }
}
