package samet.week09;

import ardijanla.ConsoleColors;

public class Direktor {

    private String name;


    public Direktor(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    //Methode alle Schüler die zu spät sind müssen zum direktor

    public void schimpfen(Student student){
        System.out.println(ConsoleColors.CYAN_BOLD + name + ConsoleColors.RESET + " schimpft mit " + student.getName() + " und ermahnt ihn in Zukunft pünklicht zu sein.");

    }
}
