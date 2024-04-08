package gyula.week06.example1;

public class Example1 {
    public static void main(String[] args) {
        Workshop software = new Workshop("Software Developer VZ");
        Workshop toepfer = new Workshop("Pottery", 10, 100);

        toepfer.setName("       ");
        software.setName("Software Developer BB");

        System.out.println(software.getName());
        System.out.println(software);


        Participant lukas = new Participant("Lukas");
        Participant christian = new Participant("Christian");

        lukas.setWorkshop(software);
        christian.setWorkshop(software);

        System.out.println(lukas);
        System.out.println(christian);

        software.setName("Kochkurs für Anfänger");

        System.out.println(lukas);
        System.out.println(christian);


    }
}
