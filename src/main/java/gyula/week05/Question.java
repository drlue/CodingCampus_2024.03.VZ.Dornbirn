package gyula.week05;

public class Question {
    public static void main(String[] args) {
        boolean b = true;

        if (b){
            System.out.println("Wahr");
        } else {
            System.out.println("Falsch");
        }

        System.out.println(b?"Wahr":"Falsch");
    }
}
