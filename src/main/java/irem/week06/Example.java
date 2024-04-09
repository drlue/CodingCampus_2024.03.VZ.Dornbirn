package irem.week06;

import gyula.week06.example1.Participant;
import gyula.week06.example1.Workshop;

public class Example {

    public static void main(String[] args) {
        Boolean b = true;
        gyula.week06.example1.Workshop software = new gyula.week06.example1.Workshop("Software Developer VZ");
        gyula.week06.example1.Workshop toepfer = new Workshop("Pottery", 10, 100);

        toepfer.setName("       ");
        software.setName("Software Developer BB");

        System.out.println(software.getName());
        System.out.println(software);


        gyula.week06.example1.Participant lukas = new gyula.week06.example1.Participant("Lukas");
        gyula.week06.example1.Participant christian = new Participant("Christian");

        lukas.setWorkshop(software);
        christian.setWorkshop(software);

        System.out.println(lukas);
        System.out.println(christian);

        software.setName("Kochkurs für Anfänger");

        System.out.println(lukas);
        System.out.println(christian);


    }
}
